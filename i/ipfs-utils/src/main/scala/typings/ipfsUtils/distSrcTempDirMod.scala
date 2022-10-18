package typings.ipfsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTempDirMod {
  
  /**
    * Temporary folder
    *
    * @param {(uuid: string) => string} [transform=(p) => p] - Transform function to add prefixes or sufixes to the unique id
    * @returns {string} - Full real path to a temporary folder
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(transform: js.Function1[/* uuid */ String, String]): String = ^.asInstanceOf[js.Dynamic].apply(transform.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ipfs-utils/dist/src/temp-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
