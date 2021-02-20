package typings.ipfsCoreUtils

import typings.cids.mod.^
import typings.ipfsCoreUtils.anon.Cid
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toCidAndPathMod {
  
  /**
    * @param {string|Uint8Array|CID} string
    * @returns {{cid:CID, path?:string}}
    */
  @JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
  @js.native
  def apply(string: String): Cid = js.native
  @JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
  @js.native
  def apply(string: ^): Cid = js.native
  @JSImport("ipfs-core-utils/dist/src/to-cid-and-path", JSImport.Namespace)
  @js.native
  def apply(string: Uint8Array): Cid = js.native
}
