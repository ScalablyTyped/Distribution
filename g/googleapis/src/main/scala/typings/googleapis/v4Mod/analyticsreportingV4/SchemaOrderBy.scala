package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the sorting options.
  */
@js.native
trait SchemaOrderBy extends js.Object {
  
  /**
    * The field which to sort by. The default sort order is ascending. Example:
    * `ga:browser`. Note, that you can only specify one field for sort here.
    * For example, `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * The order type. The default orderType is `VALUE`.
    */
  var orderType: js.UndefOr[String] = js.native
  
  /**
    * The sorting order for the field.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object SchemaOrderBy {
  
  @scala.inline
  def apply(): SchemaOrderBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderBy]
  }
  
  @scala.inline
  implicit class SchemaOrderByOps[Self <: SchemaOrderBy] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setOrderType(value: String): Self = this.set("orderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderType: Self = this.set("orderType", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
