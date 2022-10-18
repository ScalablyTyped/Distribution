package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOptions
  extends StObject
     with AbortOptions {
  
  var ipfsPath: js.UndefOr[String] = js.undefined
  
  var ipnsPath: js.UndefOr[String] = js.undefined
}
object MountOptions {
  
  inline def apply(): MountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountOptions]
  }
  
  extension [Self <: MountOptions](x: Self) {
    
    inline def setIpfsPath(value: String): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    inline def setIpfsPathUndefined: Self = StObject.set(x, "ipfsPath", js.undefined)
    
    inline def setIpnsPath(value: String): Self = StObject.set(x, "ipnsPath", value.asInstanceOf[js.Any])
    
    inline def setIpnsPathUndefined: Self = StObject.set(x, "ipnsPath", js.undefined)
  }
}
