package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDescription extends StObject {
  
  /**
    * Data type of the column Supported types are auto_id, boolean, boolean_list, creator, create_timestamp, date, dropdown, location, integer, integer_list, number, number_list, person,
    * person_list, tags, check_list, text, text_list, update_timestamp, updater, relationship, file_attachment_list. These types directly map to the column types supported on Tables
    * website.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /** Internal id for a column. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Range of labeled values for the column. Some columns like tags and drop-downs limit the values to a set of possible values. We return the range of values in such cases to
    * help clients implement better user data validation.
    */
  var labels: js.UndefOr[js.Array[LabeledItem]] = js.undefined
  
  /**
    * Optional. Indicates that this is a lookup column whose value is derived from the relationship column specified in the details. Lookup columns can not be updated directly. To change
    * the value you must update the associated relationship column.
    */
  var lookupDetails: js.UndefOr[LookupDetails] = js.undefined
  
  /** column name */
  var name: js.UndefOr[String] = js.undefined
  
  /** Optional. Additional details about a relationship column. Specified when data_type is relationship. */
  var relationshipDetails: js.UndefOr[RelationshipDetails] = js.undefined
}
object ColumnDescription {
  
  @scala.inline
  def apply(): ColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDescription]
  }
  
  @scala.inline
  implicit class ColumnDescriptionMutableBuilder[Self <: ColumnDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[LabeledItem]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabeledItem*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLookupDetails(value: LookupDetails): Self = StObject.set(x, "lookupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupDetailsUndefined: Self = StObject.set(x, "lookupDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRelationshipDetails(value: RelationshipDetails): Self = StObject.set(x, "relationshipDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipDetailsUndefined: Self = StObject.set(x, "relationshipDetails", js.undefined)
  }
}
