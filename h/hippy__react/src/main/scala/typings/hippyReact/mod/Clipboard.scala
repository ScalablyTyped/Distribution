package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clipboard extends StObject {
  
  def getString(): js.Promise[String]
  
  def setString(value: String): Unit
}
object Clipboard {
  
  inline def apply(getString: () => js.Promise[String], setString: String => Unit): Clipboard = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[Clipboard]
  }
  
  extension [Self <: Clipboard](x: Self) {
    
    inline def setGetString(value: () => js.Promise[String]): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
  }
}
