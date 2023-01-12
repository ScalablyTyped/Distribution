package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetastoreConfig extends StObject {
  
  /** Required. Resource name of an existing Dataproc Metastore service.Example: projects/[project_id]/locations/[dataproc_region]/services/[service-name] */
  var dataprocMetastoreService: js.UndefOr[String] = js.undefined
}
object MetastoreConfig {
  
  inline def apply(): MetastoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetastoreConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetastoreConfig] (val x: Self) extends AnyVal {
    
    inline def setDataprocMetastoreService(value: String): Self = StObject.set(x, "dataprocMetastoreService", value.asInstanceOf[js.Any])
    
    inline def setDataprocMetastoreServiceUndefined: Self = StObject.set(x, "dataprocMetastoreService", js.undefined)
  }
}
