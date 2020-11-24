package typings.ipfsCore.rmMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipfsCore.rmMod.RmSucceess
  - typings.ipfsCore.rmMod.RmFailure
*/
trait RmResult extends js.Object
object RmResult {
  
  @scala.inline
  def RmSucceess(cid: typings.cids.mod.^): RmResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
  
  @scala.inline
  def RmFailure(cid: typings.cids.mod.^, error: Error): RmResult = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmResult]
  }
}
