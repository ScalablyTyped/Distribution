package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetastoreConfig extends StObject {
  
  /**
    * Required. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[dataproc_region]/services/[service-name]
    */
  var dataprocMetastoreService: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetastoreConfig {
  
  inline def apply(): SchemaMetastoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetastoreConfig]
  }
  
  extension [Self <: SchemaMetastoreConfig](x: Self) {
    
    inline def setDataprocMetastoreService(value: String): Self = StObject.set(x, "dataprocMetastoreService", value.asInstanceOf[js.Any])
    
    inline def setDataprocMetastoreServiceNull: Self = StObject.set(x, "dataprocMetastoreService", null)
    
    inline def setDataprocMetastoreServiceUndefined: Self = StObject.set(x, "dataprocMetastoreService", js.undefined)
  }
}
