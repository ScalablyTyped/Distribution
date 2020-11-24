package typings.handlebars.Handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsTemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeOptions extends js.Object {
  
  var allowCallsToHelperMissing: js.UndefOr[Boolean] = js.native
  
  var allowProtoMethodsByDefault: js.UndefOr[Boolean] = js.native
  
  var allowProtoPropertiesByDefault: js.UndefOr[Boolean] = js.native
  
  var allowedProtoMethods: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var allowedProtoProperties: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var blockParams: js.UndefOr[js.Array[_]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var decorators: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var depths: js.UndefOr[js.Array[_]] = js.native
  
  var helpers: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var partial: js.UndefOr[Boolean] = js.native
  
  var partials: js.UndefOr[StringDictionary[HandlebarsTemplateDelegate[_]]] = js.native
}
object RuntimeOptions {
  
  @scala.inline
  def apply(): RuntimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeOptions]
  }
  
  @scala.inline
  implicit class RuntimeOptionsOps[Self <: RuntimeOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowCallsToHelperMissing(value: Boolean): Self = this.set("allowCallsToHelperMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCallsToHelperMissing: Self = this.set("allowCallsToHelperMissing", js.undefined)
    
    @scala.inline
    def setAllowProtoMethodsByDefault(value: Boolean): Self = this.set("allowProtoMethodsByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowProtoMethodsByDefault: Self = this.set("allowProtoMethodsByDefault", js.undefined)
    
    @scala.inline
    def setAllowProtoPropertiesByDefault(value: Boolean): Self = this.set("allowProtoPropertiesByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowProtoPropertiesByDefault: Self = this.set("allowProtoPropertiesByDefault", js.undefined)
    
    @scala.inline
    def setAllowedProtoMethods(value: StringDictionary[Boolean]): Self = this.set("allowedProtoMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedProtoMethods: Self = this.set("allowedProtoMethods", js.undefined)
    
    @scala.inline
    def setAllowedProtoProperties(value: StringDictionary[Boolean]): Self = this.set("allowedProtoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedProtoProperties: Self = this.set("allowedProtoProperties", js.undefined)
    
    @scala.inline
    def setBlockParamsVarargs(value: js.Any*): Self = this.set("blockParams", js.Array(value :_*))
    
    @scala.inline
    def setBlockParams(value: js.Array[_]): Self = this.set("blockParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockParams: Self = this.set("blockParams", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDecorators(value: StringDictionary[js.Function]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setDepthsVarargs(value: js.Any*): Self = this.set("depths", js.Array(value :_*))
    
    @scala.inline
    def setDepths(value: js.Array[_]): Self = this.set("depths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepths: Self = this.set("depths", js.undefined)
    
    @scala.inline
    def setHelpers(value: StringDictionary[js.Function]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    
    @scala.inline
    def setPartials(value: StringDictionary[HandlebarsTemplateDelegate[_]]): Self = this.set("partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartials: Self = this.set("partials", js.undefined)
  }
}
