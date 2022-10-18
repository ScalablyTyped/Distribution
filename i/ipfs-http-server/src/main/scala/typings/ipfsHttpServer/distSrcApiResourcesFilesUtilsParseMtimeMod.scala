package typings.ipfsHttpServer

import typings.ipfsHttpServer.anon.Nsecs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesFilesUtilsParseMtimeMod {
  
  @JSImport("ipfs-http-server/dist/src/api/resources/files/utils/parse-mtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseMtime(): js.UndefOr[Nsecs] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMtime")().asInstanceOf[js.UndefOr[Nsecs]]
  inline def parseMtime(secs: Double): js.UndefOr[Nsecs] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMtime")(secs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Nsecs]]
  inline def parseMtime(secs: Double, nsecs: Double): js.UndefOr[Nsecs] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMtime")(secs.asInstanceOf[js.Any], nsecs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Nsecs]]
  inline def parseMtime(secs: Unit, nsecs: Double): js.UndefOr[Nsecs] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMtime")(secs.asInstanceOf[js.Any], nsecs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Nsecs]]
}
