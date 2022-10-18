package typings.libp2pBootstrap

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/bootstrap", "Bootstrap")
  @js.native
  open class Bootstrap ()
    extends PeerDiscovery
       with Initializable {
    def this(options: BootstrapOptions) = this()
    
    /**
      * Emit each address in the list as a PeerInfo
      */
    def _discoverBootstrapPeers(): js.Promise[Unit] = js.native
    
    /* private */ val _init: Any = js.native
    
    /* private */ var components: Any = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    /* private */ val list: Any = js.native
    
    /**
      * Start emitting events
      */
    def start(): Unit = js.native
    
    /**
      * Stop emitting events
      */
    def stop(): Unit = js.native
    
    /* private */ val timeout: Any = js.native
    
    /* private */ var timer: Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Bootstrap: js.Function0[String] = js.native
  }
  /* static members */
  object Bootstrap {
    
    @JSImport("@libp2p/bootstrap", "Bootstrap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/bootstrap", "Bootstrap.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  trait BootstrapOptions extends StObject {
    
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
  object BootstrapOptions {
    
    inline def apply(list: js.Array[String]): BootstrapOptions = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapOptions]
    }
    
    extension [Self <: BootstrapOptions](x: Self) {
      
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
