package typings.libp2pKadDht.mod

import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonadd-peer`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColondial-peer`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonfinal-peer`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonpeer-response`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonprovider`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonquery-error`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonsend-query`
import typings.libp2pKadDht.libp2pKadDhtStrings.`kad-dhtColonqueryColonvalue`
import typings.libp2pKadDht.mod.^
import typings.progressEvents.mod.ProgressEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def kadDHT(): js.Function1[/* components */ KadDHTComponents, DualKadDHT] = ^.asInstanceOf[js.Dynamic].applyDynamic("kadDHT")().asInstanceOf[js.Function1[/* components */ KadDHTComponents, DualKadDHT]]
inline def kadDHT(init: KadDHTInit): js.Function1[/* components */ KadDHTComponents, DualKadDHT] = ^.asInstanceOf[js.Dynamic].applyDynamic("kadDHT")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ KadDHTComponents, DualKadDHT]]

type DHTProgressEvents = ProgressEvent[
`kad-dhtColonqueryColonsend-query` | `kad-dhtColonqueryColonpeer-response` | `kad-dhtColonqueryColonfinal-peer` | `kad-dhtColonqueryColonquery-error` | `kad-dhtColonqueryColonprovider` | `kad-dhtColonqueryColonvalue` | `kad-dhtColonqueryColonadd-peer` | `kad-dhtColonqueryColondial-peer`, 
AddPeerEvent | DialPeerEvent | FinalPeerEvent | PeerResponseEvent | ProviderEvent | QueryErrorEvent | SendQueryEvent | ValueEvent]

type MessageName = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String

type SelectFn = js.Function2[
/* key */ js.typedarray.Uint8Array, 
/* records */ js.Array[js.typedarray.Uint8Array], 
Double]

type Selectors = Record[String, SelectFn]

type ValidateFn = js.Function2[
/* key */ js.typedarray.Uint8Array, 
/* value */ js.typedarray.Uint8Array, 
js.Promise[Unit]]

type Validators = Record[String, ValidateFn]
