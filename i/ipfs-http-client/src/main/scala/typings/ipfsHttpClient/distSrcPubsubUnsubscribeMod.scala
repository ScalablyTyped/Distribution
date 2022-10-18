package typings.ipfsHttpClient

import typings.ipfsHttpClient.distSrcPubsubSubscriptionTrackerMod.SubscriptionTracker
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfaces.distSrcEventsMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubUnsubscribeMod {
  
  @JSImport("ipfs-http-client/dist/src/pubsub/unsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUnsubscribe(options: Options, subsTracker: SubscriptionTracker): js.Function2[
    /* topic */ String, 
    /* handler */ js.UndefOr[EventHandler[Message]], 
    js.Promise[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnsubscribe")(options.asInstanceOf[js.Any], subsTracker.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* topic */ String, 
    /* handler */ js.UndefOr[EventHandler[Message]], 
    js.Promise[Unit]
  ]]
  
  type HTTPClientExtraOptions = typings.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
  
  type Options = typings.ipfsHttpClient.distSrcTypesMod.Options
  
  type PubsubAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_pubsub.API<HTTPClientExtraOptions> */ Any
}
