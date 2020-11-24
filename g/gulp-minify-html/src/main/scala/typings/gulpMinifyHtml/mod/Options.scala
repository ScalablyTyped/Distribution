package typings.gulpMinifyHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Options from https://github.com/Swaagie/minimize#options
@js.native
trait Options extends js.Object {
  
  // Do not strip CDATA from scripts
  var cdata: js.UndefOr[Boolean] = js.native
  
  // Do not remove comments
  var comments: js.UndefOr[Boolean] = js.native
  
  // Do not remove conditional internet explorer comments
  var conditionals: js.UndefOr[Boolean] = js.native
  
  // Do not remove empty attributes
  var empty: js.UndefOr[Boolean] = js.native
  
  // Preserve one whitespace
  var loose: js.UndefOr[Boolean] = js.native
  
  // Do not remove arbitrary quotes
  var quotes: js.UndefOr[Boolean] = js.native
  
  // Do not remove redundant attributes
  var spare: js.UndefOr[Boolean] = js.native
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
    def setCdata(value: Boolean): Self = this.set("cdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setConditionals(value: Boolean): Self = this.set("conditionals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionals: Self = this.set("conditionals", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
    
    @scala.inline
    def setQuotes(value: Boolean): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    
    @scala.inline
    def setSpare(value: Boolean): Self = this.set("spare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpare: Self = this.set("spare", js.undefined)
  }
}
