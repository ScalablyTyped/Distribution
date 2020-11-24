package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cosign extends js.Object {
  
  var cosign: Boolean = js.native
  
  var pyong: Boolean = js.native
  
  var vote: js.UndefOr[js.Any] = js.native
}
object Cosign {
  
  @scala.inline
  def apply(cosign: Boolean, pyong: Boolean): Cosign = {
    val __obj = js.Dynamic.literal(cosign = cosign.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cosign]
  }
  
  @scala.inline
  implicit class CosignOps[Self <: Cosign] (val x: Self) extends AnyVal {
    
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
    def setCosign(value: Boolean): Self = this.set("cosign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyong(value: Boolean): Self = this.set("pyong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: js.Any): Self = this.set("vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVote: Self = this.set("vote", js.undefined)
  }
}
