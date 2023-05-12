package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsibleOptions extends StObject {
  
  /**
    * If accordion versus collapsible.
    * @default true
    */
  var accordion: Boolean
  
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Callback function called after collapsible is closed.
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  
  /**
    * Callback function called before collapsible is closed.
    * @default null
    */
  def onCloseStart(el: Element): Unit
  
  /**
    * Callback function called after collapsible is opened.
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  
  /**
    * Callback function called before collapsible is opened.
    * @default null
    */
  def onOpenStart(el: Element): Unit
  
  /**
    * Transition out duration in milliseconds.
    * @default 300
    */
  var outDuration: Double
}
object CollapsibleOptions {
  
  inline def apply(
    accordion: Boolean,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsibleOptions] (val x: Self) extends AnyVal {
    
    inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    inline def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    inline def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    inline def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
