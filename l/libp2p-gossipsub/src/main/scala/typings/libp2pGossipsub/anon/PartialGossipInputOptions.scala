package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.interfacesMod.AddrInfo
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.messageCacheMod.MessageCache
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub.GossipInputOptions> */
trait PartialGossipInputOptions extends StObject {
  
  var D: js.UndefOr[Double] = js.undefined
  
  var Dhi: js.UndefOr[Double] = js.undefined
  
  var Dlazy: js.UndefOr[Double] = js.undefined
  
  var Dlo: js.UndefOr[Double] = js.undefined
  
  var Dout: js.UndefOr[Double] = js.undefined
  
  var Dscore: js.UndefOr[Double] = js.undefined
  
  var directPeers: js.UndefOr[js.Array[AddrInfo]] = js.undefined
  
  var doPX: js.UndefOr[Boolean] = js.undefined
  
  var emitSelf: js.UndefOr[Boolean] = js.undefined
  
  var fallbackToFloodsub: js.UndefOr[Boolean] = js.undefined
  
  var floodPublish: js.UndefOr[Boolean] = js.undefined
  
  var globalSignaturePolicy: js.UndefOr[String] = js.undefined
  
  var gossipIncoming: js.UndefOr[Boolean] = js.undefined
  
  var messageCache: js.UndefOr[MessageCache] = js.undefined
  
  var msgIdFn: js.UndefOr[MessageIdFunction] = js.undefined
  
  var scoreParams: js.UndefOr[PartialPeerScoreParams] = js.undefined
  
  var scoreThresholds: js.UndefOr[PartialPeerScoreThreshold] = js.undefined
}
object PartialGossipInputOptions {
  
  @scala.inline
  def apply(): PartialGossipInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGossipInputOptions]
  }
  
  @scala.inline
  implicit class PartialGossipInputOptionsMutableBuilder[Self <: PartialGossipInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "D", js.undefined)
    
    @scala.inline
    def setDhi(value: Double): Self = StObject.set(x, "Dhi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhiUndefined: Self = StObject.set(x, "Dhi", js.undefined)
    
    @scala.inline
    def setDirectPeers(value: js.Array[AddrInfo]): Self = StObject.set(x, "directPeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectPeersUndefined: Self = StObject.set(x, "directPeers", js.undefined)
    
    @scala.inline
    def setDirectPeersVarargs(value: AddrInfo*): Self = StObject.set(x, "directPeers", js.Array(value :_*))
    
    @scala.inline
    def setDlazy(value: Double): Self = StObject.set(x, "Dlazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlazyUndefined: Self = StObject.set(x, "Dlazy", js.undefined)
    
    @scala.inline
    def setDlo(value: Double): Self = StObject.set(x, "Dlo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDloUndefined: Self = StObject.set(x, "Dlo", js.undefined)
    
    @scala.inline
    def setDoPX(value: Boolean): Self = StObject.set(x, "doPX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoPXUndefined: Self = StObject.set(x, "doPX", js.undefined)
    
    @scala.inline
    def setDout(value: Double): Self = StObject.set(x, "Dout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoutUndefined: Self = StObject.set(x, "Dout", js.undefined)
    
    @scala.inline
    def setDscore(value: Double): Self = StObject.set(x, "Dscore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDscoreUndefined: Self = StObject.set(x, "Dscore", js.undefined)
    
    @scala.inline
    def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
    
    @scala.inline
    def setFallbackToFloodsub(value: Boolean): Self = StObject.set(x, "fallbackToFloodsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackToFloodsubUndefined: Self = StObject.set(x, "fallbackToFloodsub", js.undefined)
    
    @scala.inline
    def setFloodPublish(value: Boolean): Self = StObject.set(x, "floodPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodPublishUndefined: Self = StObject.set(x, "floodPublish", js.undefined)
    
    @scala.inline
    def setGlobalSignaturePolicy(value: String): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
    
    @scala.inline
    def setGossipIncoming(value: Boolean): Self = StObject.set(x, "gossipIncoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGossipIncomingUndefined: Self = StObject.set(x, "gossipIncoming", js.undefined)
    
    @scala.inline
    def setMessageCache(value: MessageCache): Self = StObject.set(x, "messageCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCacheUndefined: Self = StObject.set(x, "messageCache", js.undefined)
    
    @scala.inline
    def setMsgIdFn(value: /* msg */ InMessage => Uint8Array): Self = StObject.set(x, "msgIdFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsgIdFnUndefined: Self = StObject.set(x, "msgIdFn", js.undefined)
    
    @scala.inline
    def setScoreParams(value: PartialPeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreParamsUndefined: Self = StObject.set(x, "scoreParams", js.undefined)
    
    @scala.inline
    def setScoreThresholds(value: PartialPeerScoreThreshold): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreThresholdsUndefined: Self = StObject.set(x, "scoreThresholds", js.undefined)
  }
}
