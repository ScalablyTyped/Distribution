package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UncolorizeOptions extends js.Object {
  
  /**
    * Disables the uncolorize format for `info.level` if set to `false`.
    */
  var level: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables the uncolorize format for `info.message` if set to `false`.
    */
  var message: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables the uncolorize format for `info[MESSAGE]` if set to `false`.
    */
  var raw: js.UndefOr[Boolean] = js.native
}
object UncolorizeOptions {
  
  @scala.inline
  def apply(): UncolorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UncolorizeOptions]
  }
  
  @scala.inline
  implicit class UncolorizeOptionsOps[Self <: UncolorizeOptions] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: Boolean): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMessage(value: Boolean): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
