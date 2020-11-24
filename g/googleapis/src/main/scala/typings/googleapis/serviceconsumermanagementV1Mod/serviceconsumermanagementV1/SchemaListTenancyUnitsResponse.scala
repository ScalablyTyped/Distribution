package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the list request.
  */
@js.native
trait SchemaListTenancyUnitsResponse extends js.Object {
  
  /**
    * Pagination token for large results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Tenancy units matching the request.
    */
  var tenancyUnits: js.UndefOr[js.Array[SchemaTenancyUnit]] = js.native
}
object SchemaListTenancyUnitsResponse {
  
  @scala.inline
  def apply(): SchemaListTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTenancyUnitsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTenancyUnitsResponseOps[Self <: SchemaListTenancyUnitsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTenancyUnitsVarargs(value: SchemaTenancyUnit*): Self = this.set("tenancyUnits", js.Array(value :_*))
    
    @scala.inline
    def setTenancyUnits(value: js.Array[SchemaTenancyUnit]): Self = this.set("tenancyUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancyUnits: Self = this.set("tenancyUnits", js.undefined)
  }
}
