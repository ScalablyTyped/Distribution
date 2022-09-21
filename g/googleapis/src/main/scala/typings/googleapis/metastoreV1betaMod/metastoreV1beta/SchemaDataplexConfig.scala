package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataplexConfig extends StObject {
  
  /**
    * A reference to the Lake resources that this metastore service is attached to. The key is the lake resource name. Example: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}.
    */
  var lakeResources: js.UndefOr[StringDictionary[SchemaLake] | Null] = js.undefined
}
object SchemaDataplexConfig {
  
  inline def apply(): SchemaDataplexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataplexConfig]
  }
  
  extension [Self <: SchemaDataplexConfig](x: Self) {
    
    inline def setLakeResources(value: StringDictionary[SchemaLake]): Self = StObject.set(x, "lakeResources", value.asInstanceOf[js.Any])
    
    inline def setLakeResourcesNull: Self = StObject.set(x, "lakeResources", null)
    
    inline def setLakeResourcesUndefined: Self = StObject.set(x, "lakeResources", js.undefined)
  }
}
