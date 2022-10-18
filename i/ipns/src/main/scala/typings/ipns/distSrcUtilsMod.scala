package typings.ipns

import typings.ipns.distSrcPbIpnsMod.IpnsEntry
import typings.ipns.distSrcPbIpnsMod.IpnsEntry.ValidityType
import typings.ipns.mod.IPNSEntry
import typings.ipns.mod.IPNSEntryData
import typings.libp2pInterfaceKeys.mod.PublicKey
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("ipns/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCborData(
    value: js.typedarray.Uint8Array,
    validity: js.typedarray.Uint8Array,
    validityType: String,
    sequence: js.BigInt,
    ttl: js.BigInt
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createCborData")(value.asInstanceOf[js.Any], validity.asInstanceOf[js.Any], validityType.asInstanceOf[js.Any], sequence.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def extractPublicKey(peerId: PeerId, entry: IpnsEntry): js.Promise[PublicKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPublicKey")(peerId.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PublicKey]]
  
  inline def ipnsEntryDataForV1Sig(value: js.typedarray.Uint8Array, validityType: ValidityType, validity: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ipnsEntryDataForV1Sig")(value.asInstanceOf[js.Any], validityType.asInstanceOf[js.Any], validity.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ipnsEntryDataForV2Sig(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("ipnsEntryDataForV2Sig")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def marshal(obj: IPNSEntry): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("marshal")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parseCborData(buf: js.typedarray.Uint8Array): IPNSEntryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCborData")(buf.asInstanceOf[js.Any]).asInstanceOf[IPNSEntryData]
  
  inline def parseRFC3339(time: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRFC3339")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def peerIdFromRoutingKey(key: js.typedarray.Uint8Array): PeerId = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdFromRoutingKey")(key.asInstanceOf[js.Any]).asInstanceOf[PeerId]
  
  inline def peerIdToRoutingKey(peerId: PeerId): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdToRoutingKey")(peerId.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toRFC3339(time: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRFC3339")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unmarshal(buf: js.typedarray.Uint8Array): IPNSEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshal")(buf.asInstanceOf[js.Any]).asInstanceOf[IPNSEntry]
}
