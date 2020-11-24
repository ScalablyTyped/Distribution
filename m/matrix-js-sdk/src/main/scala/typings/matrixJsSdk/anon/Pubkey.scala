package typings.matrixJsSdk.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pubkey extends js.Object {
  
  var pubkey: Uint8Array = js.native
}
object Pubkey {
  
  @scala.inline
  def apply(pubkey: Uint8Array): Pubkey = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pubkey]
  }
  
  @scala.inline
  implicit class PubkeyOps[Self <: Pubkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPubkey(value: Uint8Array): Self = this.set("pubkey", value.asInstanceOf[js.Any])
  }
}
