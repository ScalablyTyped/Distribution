package typings.libp2pBootstrap

import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery_
import typings.libp2pInterfacePeerStore.mod.PeerStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bootstrap(init: BootstrapInit): js.Function1[/* components */ BootstrapComponents, PeerDiscovery_] = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ BootstrapComponents, PeerDiscovery_]]
  
  trait BootstrapComponents extends StObject {
    
    var peerStore: PeerStore
  }
  object BootstrapComponents {
    
    inline def apply(peerStore: PeerStore): BootstrapComponents = {
      val __obj = js.Dynamic.literal(peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapComponents] (val x: Self) extends AnyVal {
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait BootstrapInit extends StObject {
    
    /**
      * The list of peer addresses in multi-address format
      */
    var list: js.Array[String]
    
    /**
      * Tag a bootstrap peer with this name before "discovering" it (default: 'bootstrap')
      */
    var tagName: js.UndefOr[String] = js.undefined
    
    /**
      * Cause the bootstrap peer tag to be removed after this number of ms (default: 2 minutes)
      */
    var tagTTL: js.UndefOr[Double] = js.undefined
    
    /**
      * The bootstrap peer tag will have this value (default: 50)
      */
    var tagValue: js.UndefOr[Double] = js.undefined
    
    /**
      * How long to wait before discovering bootstrap nodes
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BootstrapInit {
    
    inline def apply(list: js.Array[String]): BootstrapInit = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BootstrapInit] (val x: Self) extends AnyVal {
      
      inline def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTagTTL(value: Double): Self = StObject.set(x, "tagTTL", value.asInstanceOf[js.Any])
      
      inline def setTagTTLUndefined: Self = StObject.set(x, "tagTTL", js.undefined)
      
      inline def setTagValue(value: Double): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
      
      inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
