package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAccessPolicy extends js.Object {
  
  /** Output only. The time when this row access policy was created, in milliseconds since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Required. A SQL boolean expression that represents the rows defined by this row access policy, similar to the boolean expression in a WHERE clause of a SELECT query on a table.
    * References to other tables, routines, and temporary functions are not supported. Examples: region="EU" date_field = CAST('2019-9-27' as DATE) nullable_field is not NULL
    * numeric_field BETWEEN 1.0 AND 5.0
    */
  var filterPredicate: js.UndefOr[String] = js.native
  
  /** Output only. The time when this row access policy was last modified, in milliseconds since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /** Required. Reference describing the ID of this row access policy. */
  var rowAccessPolicyReference: js.UndefOr[RowAccessPolicyReference] = js.native
}
object RowAccessPolicy {
  
  @scala.inline
  def apply(): RowAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowAccessPolicy]
  }
  
  @scala.inline
  implicit class RowAccessPolicyOps[Self <: RowAccessPolicy] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFilterPredicate(value: String): Self = this.set("filterPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPredicate: Self = this.set("filterPredicate", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setRowAccessPolicyReference(value: RowAccessPolicyReference): Self = this.set("rowAccessPolicyReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowAccessPolicyReference: Self = this.set("rowAccessPolicyReference", js.undefined)
  }
}
