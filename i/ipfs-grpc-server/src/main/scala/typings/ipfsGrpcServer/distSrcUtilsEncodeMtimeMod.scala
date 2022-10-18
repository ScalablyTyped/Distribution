package typings.ipfsGrpcServer

import typings.ipfsGrpcServer.anon.Mtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsEncodeMtimeMod {
  
  @JSImport("ipfs-grpc-server/dist/src/utils/encode-mtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeMtime(): Mtime = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeMtime")().asInstanceOf[Mtime]
  inline def encodeMtime(mtime: typings.ipfsUnixfs.distSrcTypesMod.Mtime): Mtime = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeMtime")(mtime.asInstanceOf[js.Any]).asInstanceOf[Mtime]
}
