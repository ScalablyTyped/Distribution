package typings.makeupExpander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expander extends js.Object {
  
  def collapse(): Unit = js.native
  
  var collapseOnClickOut: Boolean = js.native
  
  var collapseOnFocusOut: Boolean = js.native
  
  var collapseOnMouseOut: Boolean = js.native
  
  def expand(isKeyboard: Boolean): Unit = js.native
  
  var expandOnClick: Boolean = js.native
  
  var expandOnFocus: Boolean = js.native
  
  var expandOnHover: Boolean = js.native
  
  def isExpanded(): Boolean = js.native
  
  def toggle(): Unit = js.native
}
object Expander {
  
  @scala.inline
  def apply(
    collapse: () => Unit,
    collapseOnClickOut: Boolean,
    collapseOnFocusOut: Boolean,
    collapseOnMouseOut: Boolean,
    expand: Boolean => Unit,
    expandOnClick: Boolean,
    expandOnFocus: Boolean,
    expandOnHover: Boolean,
    isExpanded: () => Boolean,
    toggle: () => Unit
  ): Expander = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), collapseOnClickOut = collapseOnClickOut.asInstanceOf[js.Any], collapseOnFocusOut = collapseOnFocusOut.asInstanceOf[js.Any], collapseOnMouseOut = collapseOnMouseOut.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), expandOnClick = expandOnClick.asInstanceOf[js.Any], expandOnFocus = expandOnFocus.asInstanceOf[js.Any], expandOnHover = expandOnHover.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Expander]
  }
  
  @scala.inline
  implicit class ExpanderOps[Self <: Expander] (val x: Self) extends AnyVal {
    
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
    def setCollapse(value: () => Unit): Self = this.set("collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseOnClickOut(value: Boolean): Self = this.set("collapseOnClickOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseOnFocusOut(value: Boolean): Self = this.set("collapseOnFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseOnMouseOut(value: Boolean): Self = this.set("collapseOnMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: Boolean => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandOnClick(value: Boolean): Self = this.set("expandOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandOnFocus(value: Boolean): Self = this.set("expandOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandOnHover(value: Boolean): Self = this.set("expandOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = this.set("isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
