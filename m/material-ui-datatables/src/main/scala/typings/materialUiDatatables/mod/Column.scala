package typings.materialUiDatatables.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /** Align right */
  var alignRight: js.UndefOr[Boolean] = js.native
  
  /** Class name to use */
  var className: js.UndefOr[String] = js.native
  
  /** The element key */
  var key: js.UndefOr[String] = js.native
  
  /** Label */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Render function. Given the value extracted
    * from the row; and the row also. Can return JSX content.
    * @param value - the extracted value from data
    * @param row - the data object representing this row
    * @returns Any react node (JSX compatible return)
    */
  var render: js.UndefOr[js.Function2[/* value */ js.Any, /* row */ js.Any, _]] = js.native
  
  /** If the column is sortable */
  var sortable: js.UndefOr[Boolean] = js.native
  
  /** Style for column */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /** Cell tooltip */
  var tooltip: js.UndefOr[String] = js.native
}
object Column {
  
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setAlignRight(value: Boolean): Self = this.set("alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignRight: Self = this.set("alignRight", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRender(value: (/* value */ js.Any, /* row */ js.Any) => _): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
