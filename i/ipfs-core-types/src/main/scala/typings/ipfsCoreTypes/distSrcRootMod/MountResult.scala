package typings.ipfsCoreTypes.distSrcRootMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountResult extends StObject {
  
  var fuseAllowOther: js.UndefOr[Boolean] = js.undefined
  
  var ipfs: js.UndefOr[String] = js.undefined
  
  var ipns: js.UndefOr[String] = js.undefined
}
object MountResult {
  
  inline def apply(): MountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MountResult] (val x: Self) extends AnyVal {
    
    inline def setFuseAllowOther(value: Boolean): Self = StObject.set(x, "fuseAllowOther", value.asInstanceOf[js.Any])
    
    inline def setFuseAllowOtherUndefined: Self = StObject.set(x, "fuseAllowOther", js.undefined)
    
    inline def setIpfs(value: String): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
    
    inline def setIpfsUndefined: Self = StObject.set(x, "ipfs", js.undefined)
    
    inline def setIpns(value: String): Self = StObject.set(x, "ipns", value.asInstanceOf[js.Any])
    
    inline def setIpnsUndefined: Self = StObject.set(x, "ipns", js.undefined)
  }
}
