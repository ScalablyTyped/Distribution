package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDescription extends js.Object {
  
  /**
    * Data type of the column Supported types are auto_id, boolean, boolean_list, creator, create_timestamp, date, dropdown, location, integer, integer_list, number, number_list, person,
    * person_list, tags, check_list, text, text_list, update_timestamp, updater, relationship, file_attachment_list. These types directly map to the column types supported on Tables
    * website.
    */
  var dataType: js.UndefOr[String] = js.native
  
  /** Internal id for a column. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Optional. Range of labeled values for the column. Some columns like tags and drop-downs limit the values to a set of possible values. We return the range of values in such cases to
    * help clients implement better user data validation.
    */
  var labels: js.UndefOr[js.Array[LabeledItem]] = js.native
  
  /**
    * Optional. Indicates that this is a lookup column whose value is derived from the relationship column specified in the details. Lookup columns can not be updated directly. To change
    * the value you must update the associated relationship column.
    */
  var lookupDetails: js.UndefOr[LookupDetails] = js.native
  
  /** column name */
  var name: js.UndefOr[String] = js.native
  
  /** Optional. Additional details about a relationship column. Specified when data_type is relationship. */
  var relationshipDetails: js.UndefOr[RelationshipDetails] = js.native
}
object ColumnDescription {
  
  @scala.inline
  def apply(): ColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDescription]
  }
  
  @scala.inline
  implicit class ColumnDescriptionOps[Self <: ColumnDescription] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabeledItem*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[LabeledItem]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLookupDetails(value: LookupDetails): Self = this.set("lookupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupDetails: Self = this.set("lookupDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRelationshipDetails(value: RelationshipDetails): Self = this.set("relationshipDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipDetails: Self = this.set("relationshipDetails", js.undefined)
  }
}
