package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownOptions extends StObject {
  
  /**
    * Defines the edge the menu is aligned to
    * @default 'left'
    */
  var alignment: left | right = js.native
  
  /**
    * If true, automatically focus dropdown el for keyboard
    * @default true
    */
  var autoTrigger: Boolean = js.native
  
  /**
    * If true, close dropdown on item click
    * @default true
    */
  var closeOnClick: Boolean = js.native
  
  /**
    * If true, constrainWidth to the size of the dropdown activator
    * @default true
    */
  var constrainWidth: Boolean = js.native
  
  /**
    * Provide an element that will be the bounding container of the dropdown
    * @default null
    */
  var container: Element = js.native
  
  /**
    * If false, the dropdown will show below the trigger
    * @default true
    */
  var coverTrigger: Boolean = js.native
  
  /**
    * If true, the dropdown will open on hover
    * @default false
    */
  var hover: Boolean = js.native
  
  /**
    * The duration of the transition enter in milliseconds
    * @default 150
    */
  var inDuration: Double = js.native
  
  /**
    * Function called when dropdown finishes exiting
    * @default null
    */
  def onCloseEnd(el: Element): Unit = js.native
  
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(el: Element): Unit = js.native
  
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(el: Element): Unit = js.native
  
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(el: Element): Unit = js.native
  
  /**
    * The duration of the transition out in milliseconds
    * @default 250
    */
  var outDuration: Double = js.native
}
object DropdownOptions {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class DropdownOptionsMutableBuilder[Self <: DropdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTrigger(value: Boolean): Self = StObject.set(x, "autoTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainWidth(value: Boolean): Self = StObject.set(x, "constrainWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverTrigger(value: Boolean): Self = StObject.set(x, "coverTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEnd(value: Element => Unit): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseStart(value: Element => Unit): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenEnd(value: Element => Unit): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenStart(value: Element => Unit): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
