package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeConfig extends StObject {
  
  /** Optional. Optional custom container image for the job runtime environment. If not specified, a default container image will be used. */
  var containerImage: js.UndefOr[String] = js.undefined
  
  /** Optional. A mapping of property names to values, which are used to configure workload execution. */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Optional. Version of the batch runtime. */
  var version: js.UndefOr[String] = js.undefined
}
object RuntimeConfig {
  
  inline def apply(): RuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfig]
  }
  
  extension [Self <: RuntimeConfig](x: Self) {
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
