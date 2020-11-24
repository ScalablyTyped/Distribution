package typings.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvePartialOptions extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var name: String = js.native
  
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
}
object ResolvePartialOptions {
  
  @scala.inline
  def apply(name: String): ResolvePartialOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvePartialOptions]
  }
  
  @scala.inline
  implicit class ResolvePartialOptionsOps[Self <: ResolvePartialOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDecorators(value: StringDictionary[js.Function]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setHelpers(value: StringDictionary[js.Function]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    
    @scala.inline
    def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = this.set("partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartials: Self = this.set("partials", js.undefined)
  }
}
