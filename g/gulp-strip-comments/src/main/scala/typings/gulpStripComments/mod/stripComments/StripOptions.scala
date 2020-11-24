package typings.gulpStripComments.mod.stripComments

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripOptions extends js.Object {
  
  var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var safe: js.UndefOr[Boolean] = js.native
  
  var space: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
}
object StripOptions {
  
  @scala.inline
  def apply(): StripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripOptions]
  }
  
  @scala.inline
  implicit class StripOptionsOps[Self <: StripOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreVarargs(value: RegExp*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: RegExp | js.Array[RegExp]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSpace(value: Boolean): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
