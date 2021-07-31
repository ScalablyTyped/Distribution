package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapTargetOptions extends StObject {
  
  /**
    * Callback function called when Tap Target is closed
    * @default null
    */
  def onClose(origin: Element): Unit
  
  /**
    * Callback function called when Tap Target is opened
    * @default null
    */
  def onOpen(origin: Element): Unit
}
object TapTargetOptions {
  
  @scala.inline
  def apply(onClose: Element => Unit, onOpen: Element => Unit): TapTargetOptions = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen))
    __obj.asInstanceOf[TapTargetOptions]
  }
  
  @scala.inline
  implicit class TapTargetOptionsMutableBuilder[Self <: TapTargetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClose(value: Element => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpen(value: Element => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
  }
}
