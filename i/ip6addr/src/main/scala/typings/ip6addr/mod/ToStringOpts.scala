package typings.ip6addr.mod

import typings.ip6addr.ip6addrStrings.`v4-mapped`
import typings.ip6addr.ip6addrStrings.auto
import typings.ip6addr.ip6addrStrings.v4
import typings.ip6addr.ip6addrStrings.v6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToStringOpts extends js.Object {
  
  var format: js.UndefOr[auto | v4 | `v4-mapped` | v6] = js.native
  
  var zeroElide: js.UndefOr[Boolean] = js.native
  
  var zeroPad: js.UndefOr[Boolean] = js.native
}
object ToStringOpts {
  
  @scala.inline
  def apply(): ToStringOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToStringOpts]
  }
  
  @scala.inline
  implicit class ToStringOptsOps[Self <: ToStringOpts] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: auto | v4 | `v4-mapped` | v6): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setZeroElide(value: Boolean): Self = this.set("zeroElide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroElide: Self = this.set("zeroElide", js.undefined)
    
    @scala.inline
    def setZeroPad(value: Boolean): Self = this.set("zeroPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroPad: Self = this.set("zeroPad", js.undefined)
  }
}
