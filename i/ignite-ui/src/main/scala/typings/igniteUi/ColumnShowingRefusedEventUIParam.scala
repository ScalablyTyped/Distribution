package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnShowingRefusedEventUIParam extends js.Object {
  
  /**
    * Array of column keys. Has a value only if the column's key is a string.
    */
  var columnKeys: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ColumnShowingRefusedEventUIParam {
  
  @scala.inline
  def apply(): ColumnShowingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnShowingRefusedEventUIParam]
  }
  
  @scala.inline
  implicit class ColumnShowingRefusedEventUIParamOps[Self <: ColumnShowingRefusedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setColumnKeysVarargs(value: js.Any*): Self = this.set("columnKeys", js.Array(value :_*))
    
    @scala.inline
    def setColumnKeys(value: js.Array[_]): Self = this.set("columnKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnKeys: Self = this.set("columnKeys", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
