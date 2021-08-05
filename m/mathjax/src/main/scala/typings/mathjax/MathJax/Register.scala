package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register extends StObject {
  
  /*Registers a callback to be called when a particular file is completely loaded and processed. (The callback is
    * called when the file makes its MathJax.Ajax.loadComplete() call.) The file should be the complete file name,
    * e.g., "[MathJax]/config/default.js".
    */
  def LoadHook(file: String, callBack: js.Function): Unit
  
  /*Registers a listener for a particular message being sent to the hub processing signal (where PreProcessing,
    * Processing, and New Math messages are sent). When the message equals the type, the callback will be called
    * with the message as its parameter.
    */
  def MessageHook(`type`: String, callBack: js.Any): Unit
  
  /*Used by preprocessors to register themselves with MathJax so that they will be called during the
    * MathJax.Hub.PreProcess() action.
    */
  def PreProcessor(callBack: js.Any): Unit
  
  /*Registers a listener for a particular message being sent to the startup signal (where initialization and
    * component startup messages are sent). When the message equals the type, the callback will be called with the
    * message as its parameter. See the Using Signals documentation for more details.
    */
  def StartupHook(`type`: String, callBack: js.Any): Unit
}
object Register {
  
  inline def apply(
    LoadHook: (String, js.Function) => Unit,
    MessageHook: (String, js.Any) => Unit,
    PreProcessor: js.Any => Unit,
    StartupHook: (String, js.Any) => Unit
  ): Register = {
    val __obj = js.Dynamic.literal(LoadHook = js.Any.fromFunction2(LoadHook), MessageHook = js.Any.fromFunction2(MessageHook), PreProcessor = js.Any.fromFunction1(PreProcessor), StartupHook = js.Any.fromFunction2(StartupHook))
    __obj.asInstanceOf[Register]
  }
  
  extension [Self <: Register](x: Self) {
    
    inline def setLoadHook(value: (String, js.Function) => Unit): Self = StObject.set(x, "LoadHook", js.Any.fromFunction2(value))
    
    inline def setMessageHook(value: (String, js.Any) => Unit): Self = StObject.set(x, "MessageHook", js.Any.fromFunction2(value))
    
    inline def setPreProcessor(value: js.Any => Unit): Self = StObject.set(x, "PreProcessor", js.Any.fromFunction1(value))
    
    inline def setStartupHook(value: (String, js.Any) => Unit): Self = StObject.set(x, "StartupHook", js.Any.fromFunction2(value))
  }
}
