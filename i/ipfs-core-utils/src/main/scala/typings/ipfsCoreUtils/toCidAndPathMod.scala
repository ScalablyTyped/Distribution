package typings.ipfsCoreUtils

import typings.ipfsCoreUtils.anon.Cid
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toCidAndPathMod {
  
  /**
    * @param {string|Uint8Array|CID} string
    * @returns {{cid:CID, path?:string}}
    */
  inline def apply(string: String): Cid = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
  inline def apply(string: typings.cids.mod.^): Cid = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
  inline def apply(string: Uint8Array): Cid = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Cid]
  
  @JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
