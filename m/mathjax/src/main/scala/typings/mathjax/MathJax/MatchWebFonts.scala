package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchWebFonts extends js.Object {
  
  /*Initial delay before the first check for web fonts (in milliseconds).*/
  var fontCheckDelay: js.UndefOr[Double] = js.native
  
  /*How long to keep looking for fonts (in milliseconds).*/
  var fontCheckTimeout: js.UndefOr[Double] = js.native
  
  /*This block controls whether to apply font size matching for each output mode.*/
  var matchFor: js.UndefOr[MatchFor] = js.native
}
object MatchWebFonts {
  
  @scala.inline
  def apply(): MatchWebFonts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchWebFonts]
  }
  
  @scala.inline
  implicit class MatchWebFontsOps[Self <: MatchWebFonts] (val x: Self) extends AnyVal {
    
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
    def setFontCheckDelay(value: Double): Self = this.set("fontCheckDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontCheckDelay: Self = this.set("fontCheckDelay", js.undefined)
    
    @scala.inline
    def setFontCheckTimeout(value: Double): Self = this.set("fontCheckTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontCheckTimeout: Self = this.set("fontCheckTimeout", js.undefined)
    
    @scala.inline
    def setMatchFor(value: MatchFor): Self = this.set("matchFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFor: Self = this.set("matchFor", js.undefined)
  }
}
