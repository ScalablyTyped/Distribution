package typings.ipfsCoreUtils

import typings.ipfsUnixfs.distSrcTypesMod.Mtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesFormatMtimeMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/format-mtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatMtime(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMtime")().asInstanceOf[String]
  inline def formatMtime(mtime: Mtime): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMtime")(mtime.asInstanceOf[js.Any]).asInstanceOf[String]
}
