package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.interfacesMod.AddrInfo
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.messageCacheMod.MessageCache
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub.GossipInputOptions> */
@js.native
trait PartialGossipInputOptions extends js.Object {
  
  var D: js.UndefOr[Double] = js.native
  
  var Dhi: js.UndefOr[Double] = js.native
  
  var Dlazy: js.UndefOr[Double] = js.native
  
  var Dlo: js.UndefOr[Double] = js.native
  
  var Dout: js.UndefOr[Double] = js.native
  
  var Dscore: js.UndefOr[Double] = js.native
  
  var directPeers: js.UndefOr[js.Array[AddrInfo]] = js.native
  
  var doPX: js.UndefOr[Boolean] = js.native
  
  var emitSelf: js.UndefOr[Boolean] = js.native
  
  var fallbackToFloodsub: js.UndefOr[Boolean] = js.native
  
  var floodPublish: js.UndefOr[Boolean] = js.native
  
  var globalSignaturePolicy: js.UndefOr[String] = js.native
  
  var gossipIncoming: js.UndefOr[Boolean] = js.native
  
  var messageCache: js.UndefOr[MessageCache] = js.native
  
  var msgIdFn: js.UndefOr[MessageIdFunction] = js.native
  
  var scoreParams: js.UndefOr[PartialPeerScoreParams] = js.native
  
  var scoreThresholds: js.UndefOr[PartialPeerScoreThreshold] = js.native
}
object PartialGossipInputOptions {
  
  @scala.inline
  def apply(): PartialGossipInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGossipInputOptions]
  }
  
  @scala.inline
  implicit class PartialGossipInputOptionsOps[Self <: PartialGossipInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setD(value: Double): Self = this.set("D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("D", js.undefined)
    
    @scala.inline
    def setDhi(value: Double): Self = this.set("Dhi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhi: Self = this.set("Dhi", js.undefined)
    
    @scala.inline
    def setDlazy(value: Double): Self = this.set("Dlazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlazy: Self = this.set("Dlazy", js.undefined)
    
    @scala.inline
    def setDlo(value: Double): Self = this.set("Dlo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlo: Self = this.set("Dlo", js.undefined)
    
    @scala.inline
    def setDout(value: Double): Self = this.set("Dout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDout: Self = this.set("Dout", js.undefined)
    
    @scala.inline
    def setDscore(value: Double): Self = this.set("Dscore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDscore: Self = this.set("Dscore", js.undefined)
    
    @scala.inline
    def setDirectPeersVarargs(value: AddrInfo*): Self = this.set("directPeers", js.Array(value :_*))
    
    @scala.inline
    def setDirectPeers(value: js.Array[AddrInfo]): Self = this.set("directPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectPeers: Self = this.set("directPeers", js.undefined)
    
    @scala.inline
    def setDoPX(value: Boolean): Self = this.set("doPX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoPX: Self = this.set("doPX", js.undefined)
    
    @scala.inline
    def setEmitSelf(value: Boolean): Self = this.set("emitSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitSelf: Self = this.set("emitSelf", js.undefined)
    
    @scala.inline
    def setFallbackToFloodsub(value: Boolean): Self = this.set("fallbackToFloodsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackToFloodsub: Self = this.set("fallbackToFloodsub", js.undefined)
    
    @scala.inline
    def setFloodPublish(value: Boolean): Self = this.set("floodPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodPublish: Self = this.set("floodPublish", js.undefined)
    
    @scala.inline
    def setGlobalSignaturePolicy(value: String): Self = this.set("globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSignaturePolicy: Self = this.set("globalSignaturePolicy", js.undefined)
    
    @scala.inline
    def setGossipIncoming(value: Boolean): Self = this.set("gossipIncoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGossipIncoming: Self = this.set("gossipIncoming", js.undefined)
    
    @scala.inline
    def setMessageCache(value: MessageCache): Self = this.set("messageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageCache: Self = this.set("messageCache", js.undefined)
    
    @scala.inline
    def setMsgIdFn(value: /* msg */ InMessage => Uint8Array): Self = this.set("msgIdFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMsgIdFn: Self = this.set("msgIdFn", js.undefined)
    
    @scala.inline
    def setScoreParams(value: PartialPeerScoreParams): Self = this.set("scoreParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreParams: Self = this.set("scoreParams", js.undefined)
    
    @scala.inline
    def setScoreThresholds(value: PartialPeerScoreThreshold): Self = this.set("scoreThresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreThresholds: Self = this.set("scoreThresholds", js.undefined)
  }
}
