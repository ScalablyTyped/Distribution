package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitswapAny extends js.Object {
  
  var bitswap: js.Any = js.native
}
object BitswapAny {
  
  @scala.inline
  def apply(bitswap: js.Any): BitswapAny = {
    val __obj = js.Dynamic.literal(bitswap = bitswap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitswapAny]
  }
  
  @scala.inline
  implicit class BitswapAnyOps[Self <: BitswapAny] (val x: Self) extends AnyVal {
    
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
    def setBitswap(value: js.Any): Self = this.set("bitswap", value.asInstanceOf[js.Any])
  }
}
