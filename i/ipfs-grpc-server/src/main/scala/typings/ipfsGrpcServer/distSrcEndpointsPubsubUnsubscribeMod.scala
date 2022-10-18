package typings.ipfsGrpcServer

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsGrpcServer.distSrcTypesMod.Options
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsPubsubUnsubscribeMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/pubsub/unsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grpcPubsubUnsubscribe(ipfs: IPFS[js.Object]): js.Function3[
    /* arg1 */ Any, 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("grpcPubsubUnsubscribe")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ Any, 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ]]
  inline def grpcPubsubUnsubscribe(ipfs: IPFS[js.Object], options: Options): js.Function3[
    /* arg1 */ Any, 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("grpcPubsubUnsubscribe")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* arg1 */ Any, 
    /* arg2 */ Any, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ Any, Unit], 
    Unit
  ]]
}
