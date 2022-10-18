package typings.ipfsGrpcServer

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsGrpcServer.distSrcTypesMod.Options
import typings.itPushable.mod.Pushable_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsAddMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grpcAdd(ipfs: IPFS[js.Object]): js.Function3[
    /* source */ AsyncIterable[Any], 
    /* sink */ Pushable_[Any], 
    /* metadata */ Any, 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("grpcAdd")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* source */ AsyncIterable[Any], 
    /* sink */ Pushable_[Any], 
    /* metadata */ Any, 
    js.Promise[Unit]
  ]]
  inline def grpcAdd(ipfs: IPFS[js.Object], options: Options): js.Function3[
    /* source */ AsyncIterable[Any], 
    /* sink */ Pushable_[Any], 
    /* metadata */ Any, 
    js.Promise[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("grpcAdd")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* source */ AsyncIterable[Any], 
    /* sink */ Pushable_[Any], 
    /* metadata */ Any, 
    js.Promise[Unit]
  ]]
}
