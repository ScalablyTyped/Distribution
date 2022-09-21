package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeArtifactRemote extends StObject {
  
  /**
    * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any of the steps.
    */
  var checksum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol\}://{location\}.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipeArtifactRemote {
  
  inline def apply(): SchemaSoftwareRecipeArtifactRemote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeArtifactRemote]
  }
  
  extension [Self <: SchemaSoftwareRecipeArtifactRemote](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
