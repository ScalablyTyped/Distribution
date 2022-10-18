package typings.ipfsGrpcServer

import typings.ipfsCoreTypes.mod.IPFS
import typings.ipfsGrpcServer.distSrcTypesMod.Options
import typings.itPushable.mod.Pushable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEndpointsMfsLsMod {
  
  @JSImport("ipfs-grpc-server/dist/src/endpoints/mfs/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grpcMfsLs(ipfs: IPFS[js.Object]): js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("grpcMfsLs")(ipfs.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]]]
  inline def grpcMfsLs(ipfs: IPFS[js.Object], options: Options): js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("grpcMfsLs")(ipfs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* request */ Any, /* sink */ Pushable_[Any], /* metadata */ Any, js.Promise[Unit]]]
}
