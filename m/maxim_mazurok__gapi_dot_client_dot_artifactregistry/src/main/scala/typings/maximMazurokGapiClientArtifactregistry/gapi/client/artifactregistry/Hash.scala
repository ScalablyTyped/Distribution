package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  /** The algorithm used to compute the hash value. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The hash value. */
  var value: js.UndefOr[String] = js.undefined
}
object Hash {
  
  inline def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
