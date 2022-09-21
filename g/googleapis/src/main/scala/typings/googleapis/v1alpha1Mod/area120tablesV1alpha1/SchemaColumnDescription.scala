package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColumnDescription extends StObject {
  
  /**
    * Data type of the column Supported types are auto_id, boolean, boolean_list, creator, create_timestamp, date, dropdown, location, integer, integer_list, number, number_list, person, person_list, tags, check_list, text, text_list, update_timestamp, updater, relationship, file_attachment_list. These types directly map to the column types supported on Tables website.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Additional details about a date column.
    */
  var dateDetails: js.UndefOr[SchemaDateDetails] = js.undefined
  
  /**
    * Internal id for a column.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Range of labeled values for the column. Some columns like tags and drop-downs limit the values to a set of possible values. We return the range of values in such cases to help clients implement better user data validation.
    */
  var labels: js.UndefOr[js.Array[SchemaLabeledItem]] = js.undefined
  
  /**
    * Optional. Indicates that this is a lookup column whose value is derived from the relationship column specified in the details. Lookup columns can not be updated directly. To change the value you must update the associated relationship column.
    */
  var lookupDetails: js.UndefOr[SchemaLookupDetails] = js.undefined
  
  /**
    * Optional. Indicates whether or not multiple values are allowed for array types where such a restriction is possible.
    */
  var multipleValuesDisallowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * column name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates that values for the column cannot be set by the user.
    */
  var readonly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Additional details about a relationship column. Specified when data_type is relationship.
    */
  var relationshipDetails: js.UndefOr[SchemaRelationshipDetails] = js.undefined
}
object SchemaColumnDescription {
  
  inline def apply(): SchemaColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumnDescription]
  }
  
  extension [Self <: SchemaColumnDescription](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDateDetails(value: SchemaDateDetails): Self = StObject.set(x, "dateDetails", value.asInstanceOf[js.Any])
    
    inline def setDateDetailsUndefined: Self = StObject.set(x, "dateDetails", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaLabeledItem]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabeledItem*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLookupDetails(value: SchemaLookupDetails): Self = StObject.set(x, "lookupDetails", value.asInstanceOf[js.Any])
    
    inline def setLookupDetailsUndefined: Self = StObject.set(x, "lookupDetails", js.undefined)
    
    inline def setMultipleValuesDisallowed(value: Boolean): Self = StObject.set(x, "multipleValuesDisallowed", value.asInstanceOf[js.Any])
    
    inline def setMultipleValuesDisallowedNull: Self = StObject.set(x, "multipleValuesDisallowed", null)
    
    inline def setMultipleValuesDisallowedUndefined: Self = StObject.set(x, "multipleValuesDisallowed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRelationshipDetails(value: SchemaRelationshipDetails): Self = StObject.set(x, "relationshipDetails", value.asInstanceOf[js.Any])
    
    inline def setRelationshipDetailsUndefined: Self = StObject.set(x, "relationshipDetails", js.undefined)
  }
}
