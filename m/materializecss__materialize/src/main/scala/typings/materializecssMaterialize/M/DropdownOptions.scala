package typings.materializecssMaterialize.M

import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownOptions extends StObject {
  
  /**
    * Defines the edge the menu is aligned to
    * @default 'left'
    */
  var alignment: left | right
  
  /**
    * If true, automatically focus dropdown el for keyboard
    * @default true
    */
  var autoTrigger: Boolean
  
  /**
    * If true, close dropdown on item click
    * @default true
    */
  var closeOnClick: Boolean
  
  /**
    * If true, constrainWidth to the size of the dropdown activator
    * @default true
    */
  var constrainWidth: Boolean
  
  /**
    * Provide an element that will be the bounding container of the dropdown
    * @default null
    */
  var container: Element
  
  /**
    * If false, the dropdown will show below the trigger
    * @default true
    */
  var coverTrigger: Boolean
  
  /**
    * If true, the dropdown will open on hover
    * @default false
    */
  var hover: Boolean
  
  /**
    * The duration of the transition enter in milliseconds
    * @default 150
    */
  var inDuration: Double
  
  /**
    * Function called when dropdown finishes exiting
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(el: Element): Unit
  
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(el: Element): Unit
  
  /**
    * The duration of the transition out in milliseconds
    * @default 250
    */
  var outDuration: Double
}
object DropdownOptions {
  
  inline def apply(
    alignment: left | right,
    autoTrigger: Boolean,
    closeOnClick: Boolean,
    constrainWidth: Boolean,
    container: Element,
    coverTrigger: Boolean,
    hover: Boolean,
    inDuration: Double,
    onCloseEnd: Element => Unit,
    onCloseStart: Element => Unit,
    onOpenEnd: Element => Unit,
    onOpenStart: Element => Unit,
    outDuration: Double
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoTrigger = autoTrigger.asInstanceOf[js.Any], closeOnClick = closeOnClick.asInstanceOf[js.Any], constrainWidth = constrainWidth.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], coverTrigger = coverTrigger.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1(onCloseEnd), onCloseStart = js.Any.fromFunction1(onCloseStart), onOpenEnd = js.Any.fromFunction1(onOpenEnd), onOpenStart = js.Any.fromFunction1(onOpenStart), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOptions]
  }
  
  extension [Self <: DropdownOptions](x: Self) {
    
    inline def setAlignment(value: left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAutoTrigger(value: Boolean): Self = StObject.set(x, "autoTrigger", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setConstrainWidth(value: Boolean): Self = StObject.set(x, "constrainWidth", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCoverTrigger(value: Boolean): Self = StObject.set(x, "coverTrigger", value.asInstanceOf[js.Any])
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    inline def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    inline def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    inline def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
