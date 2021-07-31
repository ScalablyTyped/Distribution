package typings.ipfsCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatModeMod {
  
  /**
    *
    * @param {Mode} mode
    * @param {boolean} isDirectory
    * @returns {string}
    */
  @scala.inline
  def apply(mode: Mode, isDirectory: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(mode.asInstanceOf[js.Any], isDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ipfs-core-utils/dist/src/files/format-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Mode = Double
}
