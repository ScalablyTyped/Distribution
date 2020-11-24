package typings.jointjs.mod.attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGConditionalProcessingAttributes extends js.Object {
  
  var requiredExtensions: js.UndefOr[Boolean] = js.native
  
  var requiredFeatures: js.UndefOr[String] = js.native
  
  var systemLanguage: js.UndefOr[String] = js.native
}
object SVGConditionalProcessingAttributes {
  
  @scala.inline
  def apply(): SVGConditionalProcessingAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGConditionalProcessingAttributes]
  }
  
  @scala.inline
  implicit class SVGConditionalProcessingAttributesOps[Self <: SVGConditionalProcessingAttributes] (val x: Self) extends AnyVal {
    
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
    def setRequiredExtensions(value: Boolean): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredExtensions: Self = this.set("requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: String): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemLanguage: Self = this.set("systemLanguage", js.undefined)
  }
}
