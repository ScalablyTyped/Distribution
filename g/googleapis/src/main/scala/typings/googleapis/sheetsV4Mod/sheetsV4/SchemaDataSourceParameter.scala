package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceParameter extends StObject {
  
  /**
    * Named parameter. Must be a legitimate identifier for the DataSource that supports it. For example, [BigQuery identifier](https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical#identifiers).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of a NamedRange. Its size must be 1x1.
    */
  var namedRangeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A range that contains the value of the parameter. Its size must be 1x1.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaDataSourceParameter {
  
  inline def apply(): SchemaDataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceParameter]
  }
  
  extension [Self <: SchemaDataSourceParameter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdNull: Self = StObject.set(x, "namedRangeId", null)
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
