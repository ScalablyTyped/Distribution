package typings.libp2pUtils

import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pUtils.libp2pUtilsInts.`-1`
import typings.libp2pUtils.libp2pUtilsInts.`0`
import typings.libp2pUtils.libp2pUtilsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAddressSortMod {
  
  @JSImport("@libp2p/utils/dist/src/address-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publicAddressesFirst(a: Address, b: Address): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("publicAddressesFirst")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  inline def something(): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("something")().asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
