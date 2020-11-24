package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalDialogGroupColumnEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the current groupedColumns.
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ModalDialogGroupColumnEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogGroupColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogGroupColumnEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogGroupColumnEventUIParamOps[Self <: ModalDialogGroupColumnEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setGroupedColumnsVarargs(value: js.Any*): Self = this.set("groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = this.set("groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedColumns: Self = this.set("groupedColumns", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
