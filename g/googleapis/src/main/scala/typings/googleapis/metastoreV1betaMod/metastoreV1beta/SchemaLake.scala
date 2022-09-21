package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLake extends StObject {
  
  /**
    * The Lake resource name. Example: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaLake {
  
  inline def apply(): SchemaLake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLake]
  }
  
  extension [Self <: SchemaLake](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
