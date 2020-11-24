package typings.grayMatter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrayMatterOption extends js.Object {
  
  var delims: String = js.native
  
  var eval: js.UndefOr[Boolean] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var parser: js.UndefOr[js.Function] = js.native
}
object GrayMatterOption {
  
  @scala.inline
  def apply(delims: String): GrayMatterOption = {
    val __obj = js.Dynamic.literal(delims = delims.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrayMatterOption]
  }
  
  @scala.inline
  implicit class GrayMatterOptionOps[Self <: GrayMatterOption] (val x: Self) extends AnyVal {
    
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
    def setDelims(value: String): Self = this.set("delims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEval(value: Boolean): Self = this.set("eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setParser(value: js.Function): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
  }
}
