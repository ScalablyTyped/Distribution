package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeConfig extends StObject {
  
  /**
    * Optional. Optional custom container image for the job runtime environment. If not specified, a default container image will be used.
    */
  var containerImage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A mapping of property names to values, which are used to configure workload execution.
    */
  var properties: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Version of the batch runtime.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeConfig {
  
  inline def apply(): SchemaRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeConfig]
  }
  
  extension [Self <: SchemaRuntimeConfig](x: Self) {
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageNull: Self = StObject.set(x, "containerImage", null)
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
