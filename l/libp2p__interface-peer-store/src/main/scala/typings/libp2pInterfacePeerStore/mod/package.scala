package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`-1`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`0`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`1`
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddressFilter = js.Function2[/* peerId */ PeerId, /* multiaddr */ Multiaddr_, js.Promise[Boolean]]

type AddressSorter = js.Function2[/* a */ Address, /* b */ Address, `-1` | `0` | `1`]
