package typings.handlebarsHelpers.mod

import typings.handlebarsHelpers.anon.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var handlebars: js.UndefOr[TypeofHandlebars] = js.native
  
  var hbs: js.UndefOr[TypeofHandlebars] = js.native
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
    def setHandlebars(value: TypeofHandlebars): Self = this.set("handlebars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlebars: Self = this.set("handlebars", js.undefined)
    
    @scala.inline
    def setHbs(value: TypeofHandlebars): Self = this.set("hbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHbs: Self = this.set("hbs", js.undefined)
  }
}
