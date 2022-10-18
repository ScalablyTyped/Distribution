package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOptions
  extends StObject
     with AbortOptions {
  
  var peerId: js.UndefOr[PeerId] = js.undefined
}
object IDOptions {
  
  inline def apply(): IDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDOptions]
  }
  
  extension [Self <: IDOptions](x: Self) {
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
