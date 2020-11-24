package typings.materialUiLab.treeViewTreeViewMod

import typings.materialUiLab.materialUiLabBooleans.`true`
import typings.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectTreeViewProps
  extends TreeViewPropsBase
     with TreeViewProps {
  
  /**
    * Selected node ids. (Uncontrolled)
    * When `multiSelect` is true this takes an array of strings; when false (default) a string.
    */
  var defaultSelected: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true `ctrl` and `shift` will trigger multiselect.
    */
  var multiSelect: js.UndefOr[`true`] = js.native
  
  /**
    * Callback fired when tree items are selected/unselected.
    *
    * @param {object} event The event source of the callback
    * @param {(array|string)} value of the selected nodes. When `multiSelect` is true
    * this is an array of strings; when false (default) a string.
    */
  var onNodeSelect: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[js.Object], /* nodeIds */ js.Array[String], Unit]
  ] = js.native
  
  /**
    * Selected node ids. (Controlled)
    * When `multiSelect` is true this takes an array of strings; when false (default) a string.
    */
  var selected: js.UndefOr[js.Array[String]] = js.native
}
object MultiSelectTreeViewProps {
  
  @scala.inline
  def apply(): MultiSelectTreeViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectTreeViewProps]
  }
  
  @scala.inline
  implicit class MultiSelectTreeViewPropsOps[Self <: MultiSelectTreeViewProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultSelectedVarargs(value: String*): Self = this.set("defaultSelected", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelected(value: js.Array[String]): Self = this.set("defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelected: Self = this.set("defaultSelected", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: `true`): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setOnNodeSelect(value: (/* event */ ChangeEvent[js.Object], /* nodeIds */ js.Array[String]) => Unit): Self = this.set("onNodeSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnNodeSelect: Self = this.set("onNodeSelect", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: String*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[String]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
