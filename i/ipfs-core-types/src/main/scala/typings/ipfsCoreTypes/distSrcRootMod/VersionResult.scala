package typings.ipfsCoreTypes.distSrcRootMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionResult extends StObject {
  
  var commit: js.UndefOr[String] = js.undefined
  
  var golang: js.UndefOr[String] = js.undefined
  
  var `interface-ipfs-core`: js.UndefOr[String] = js.undefined
  
  var `ipfs-core`: js.UndefOr[String] = js.undefined
  
  var `ipfs-http-client`: js.UndefOr[String] = js.undefined
  
  var repo: js.UndefOr[String] = js.undefined
  
  var system: js.UndefOr[String] = js.undefined
  
  var version: String
}
object VersionResult {
  
  inline def apply(version: String): VersionResult = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionResult] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setGolang(value: String): Self = StObject.set(x, "golang", value.asInstanceOf[js.Any])
    
    inline def setGolangUndefined: Self = StObject.set(x, "golang", js.undefined)
    
    inline def `setInterface-ipfs-core`(value: String): Self = StObject.set(x, "interface-ipfs-core", value.asInstanceOf[js.Any])
    
    inline def `setInterface-ipfs-coreUndefined`: Self = StObject.set(x, "interface-ipfs-core", js.undefined)
    
    inline def `setIpfs-core`(value: String): Self = StObject.set(x, "ipfs-core", value.asInstanceOf[js.Any])
    
    inline def `setIpfs-coreUndefined`: Self = StObject.set(x, "ipfs-core", js.undefined)
    
    inline def `setIpfs-http-client`(value: String): Self = StObject.set(x, "ipfs-http-client", value.asInstanceOf[js.Any])
    
    inline def `setIpfs-http-clientUndefined`: Self = StObject.set(x, "ipfs-http-client", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
