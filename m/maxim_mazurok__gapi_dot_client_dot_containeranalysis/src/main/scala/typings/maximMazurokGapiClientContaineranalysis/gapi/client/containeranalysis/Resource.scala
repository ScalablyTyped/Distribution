package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /** Deprecated, do not use. Use uri instead. The hash of the resource content. For example, the Docker digest. */
  var contentHash: js.UndefOr[Hash] = js.undefined
  
  /** Deprecated, do not use. Use uri instead. The name of the resource. For example, the name of a Docker image - "Debian". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The unique URI of the resource. For example, `https://gcr.io/project/image@sha256:foo` for a Docker image. */
  var uri: js.UndefOr[String] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setContentHash(value: Hash): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
