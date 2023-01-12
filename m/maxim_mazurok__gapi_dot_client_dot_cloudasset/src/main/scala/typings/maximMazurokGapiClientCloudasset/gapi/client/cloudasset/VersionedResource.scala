package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedResource extends StObject {
  
  /**
    * JSON representation of the resource as defined by the corresponding service providing this resource. Example: If the resource is an instance provided by Compute Engine, this field
    * will contain the JSON representation of the instance as defined by Compute Engine: `https://cloud.google.com/compute/docs/reference/rest/v1/instances`. You can find the resource
    * definition for each supported resource type in this table: `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
    */
  var resource: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * API version of the resource. Example: If the resource is an instance provided by Compute Engine v1 API as defined in
    * `https://cloud.google.com/compute/docs/reference/rest/v1/instances`, version will be "v1".
    */
  var version: js.UndefOr[String] = js.undefined
}
object VersionedResource {
  
  inline def apply(): VersionedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionedResource] (val x: Self) extends AnyVal {
    
    inline def setResource(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
