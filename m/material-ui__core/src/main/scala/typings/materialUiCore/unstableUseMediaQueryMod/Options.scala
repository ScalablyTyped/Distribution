package typings.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var defaultMatches: js.UndefOr[Boolean] = js.native
  
  var noSsr: js.UndefOr[Boolean] = js.native
  
  var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, MuiMediaQueryList]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDefaultMatches(value: Boolean): Self = this.set("defaultMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMatches: Self = this.set("defaultMatches", js.undefined)
    
    @scala.inline
    def setNoSsr(value: Boolean): Self = this.set("noSsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSsr: Self = this.set("noSsr", js.undefined)
    
    @scala.inline
    def setSsrMatchMedia(value: /* query */ String => MuiMediaQueryList): Self = this.set("ssrMatchMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSsrMatchMedia: Self = this.set("ssrMatchMedia", js.undefined)
  }
}
