package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Register extends js.Object {
  
  /*Registers a callback to be called when a particular file is completely loaded and processed. (The callback is
    * called when the file makes its MathJax.Ajax.loadComplete() call.) The file should be the complete file name,
    * e.g., "[MathJax]/config/default.js".
    */
  def LoadHook(file: String, callBack: js.Function): Unit = js.native
  
  /*Registers a listener for a particular message being sent to the hub processing signal (where PreProcessing,
    * Processing, and New Math messages are sent). When the message equals the type, the callback will be called
    * with the message as its parameter.
    */
  def MessageHook(`type`: String, callBack: js.Any): Unit = js.native
  
  /*Used by preprocessors to register themselves with MathJax so that they will be called during the
    * MathJax.Hub.PreProcess() action.
    */
  def PreProcessor(callBack: js.Any): Unit = js.native
  
  /*Registers a listener for a particular message being sent to the startup signal (where initialization and
    * component startup messages are sent). When the message equals the type, the callback will be called with the
    * message as its parameter. See the Using Signals documentation for more details.
    */
  def StartupHook(`type`: String, callBack: js.Any): Unit = js.native
}
object Register {
  
  @scala.inline
  def apply(
    LoadHook: (String, js.Function) => Unit,
    MessageHook: (String, js.Any) => Unit,
    PreProcessor: js.Any => Unit,
    StartupHook: (String, js.Any) => Unit
  ): Register = {
    val __obj = js.Dynamic.literal(LoadHook = js.Any.fromFunction2(LoadHook), MessageHook = js.Any.fromFunction2(MessageHook), PreProcessor = js.Any.fromFunction1(PreProcessor), StartupHook = js.Any.fromFunction2(StartupHook))
    __obj.asInstanceOf[Register]
  }
  
  @scala.inline
  implicit class RegisterOps[Self <: Register] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadHook(value: (String, js.Function) => Unit): Self = this.set("LoadHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMessageHook(value: (String, js.Any) => Unit): Self = this.set("MessageHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreProcessor(value: js.Any => Unit): Self = this.set("PreProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartupHook(value: (String, js.Any) => Unit): Self = this.set("StartupHook", js.Any.fromFunction2(value))
  }
}
