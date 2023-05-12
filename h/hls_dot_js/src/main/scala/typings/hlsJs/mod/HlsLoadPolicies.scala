package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsLoadPolicies extends StObject {
  
  var certLoadPolicy: LoadPolicy
  
  var fragLoadPolicy: LoadPolicy
  
  var keyLoadPolicy: LoadPolicy
  
  var manifestLoadPolicy: LoadPolicy
  
  var playlistLoadPolicy: LoadPolicy
  
  var steeringManifestLoadPolicy: LoadPolicy
}
object HlsLoadPolicies {
  
  inline def apply(
    certLoadPolicy: LoadPolicy,
    fragLoadPolicy: LoadPolicy,
    keyLoadPolicy: LoadPolicy,
    manifestLoadPolicy: LoadPolicy,
    playlistLoadPolicy: LoadPolicy,
    steeringManifestLoadPolicy: LoadPolicy
  ): HlsLoadPolicies = {
    val __obj = js.Dynamic.literal(certLoadPolicy = certLoadPolicy.asInstanceOf[js.Any], fragLoadPolicy = fragLoadPolicy.asInstanceOf[js.Any], keyLoadPolicy = keyLoadPolicy.asInstanceOf[js.Any], manifestLoadPolicy = manifestLoadPolicy.asInstanceOf[js.Any], playlistLoadPolicy = playlistLoadPolicy.asInstanceOf[js.Any], steeringManifestLoadPolicy = steeringManifestLoadPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsLoadPolicies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsLoadPolicies] (val x: Self) extends AnyVal {
    
    inline def setCertLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "certLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setFragLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "fragLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setKeyLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "keyLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "manifestLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setPlaylistLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "playlistLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setSteeringManifestLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "steeringManifestLoadPolicy", value.asInstanceOf[js.Any])
  }
}
