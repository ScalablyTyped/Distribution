package typings.ipfsCli

import typings.ipfsCli.anon.AddAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDaemonMod {
  
  @JSImport("ipfs-cli/dist/src/daemon", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Daemon {
    def this(options: js.Object) = this()
    
    /**
      * Starts the IPFS HTTP server
      *
      * @returns {Promise<Daemon>}
      */
    /* CompleteClass */
    override def start(): js.Promise[Daemon] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[Daemon] = js.native
  }
  
  trait Daemon extends StObject {
    
    var _httpApi: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
      ] = js.undefined
    
    var _httpGateway: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
      ] = js.undefined
    
    var _ipfs: js.UndefOr[AddAll] = js.undefined
    
    /**
      * Starts the IPFS HTTP server
      *
      * @returns {Promise<Daemon>}
      */
    def start(): js.Promise[Daemon]
    
    def stop(): js.Promise[Daemon]
  }
  object Daemon {
    
    inline def apply(start: () => js.Promise[Daemon], stop: () => js.Promise[Daemon]): Daemon = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Daemon]
    }
    
    extension [Self <: Daemon](x: Self) {
      
      inline def setStart(value: () => js.Promise[Daemon]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => js.Promise[Daemon]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def set_httpApi(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
      ): Self = StObject.set(x, "_httpApi", value.asInstanceOf[js.Any])
      
      inline def set_httpApiUndefined: Self = StObject.set(x, "_httpApi", js.undefined)
      
      inline def set_httpGateway(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
      ): Self = StObject.set(x, "_httpGateway", value.asInstanceOf[js.Any])
      
      inline def set_httpGatewayUndefined: Self = StObject.set(x, "_httpGateway", js.undefined)
      
      inline def set_ipfs(value: AddAll): Self = StObject.set(x, "_ipfs", value.asInstanceOf[js.Any])
      
      inline def set_ipfsUndefined: Self = StObject.set(x, "_ipfs", js.undefined)
    }
  }
}
