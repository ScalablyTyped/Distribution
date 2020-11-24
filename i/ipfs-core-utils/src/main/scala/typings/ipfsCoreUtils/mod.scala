package typings.ipfsCoreUtils

import typings.cids.mod.^
import typings.ipfsCoreUtils.anon.Base
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core-utils/dist/src/cid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cidToString(input: String): String = js.native
  def cidToString(input: String, options: Base): String = js.native
  def cidToString(input: ^): String = js.native
  def cidToString(input: ^, options: Base): String = js.native
  def cidToString(input: Uint8Array): String = js.native
  def cidToString(input: Uint8Array, options: Base): String = js.native
}
