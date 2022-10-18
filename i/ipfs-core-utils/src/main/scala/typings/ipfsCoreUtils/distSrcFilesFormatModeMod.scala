package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilesFormatModeMod {
  
  @JSImport("ipfs-core-utils/dist/src/files/format-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatMode(mode: Double, isDirectory: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMode")(mode.asInstanceOf[js.Any], isDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
}
