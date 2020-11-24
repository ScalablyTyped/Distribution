package typings.materialUiCore.createGenerateClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateClassNameOptions extends js.Object {
  
  var dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.native
  
  var productionPrefix: js.UndefOr[String] = js.native
  
  var seed: js.UndefOr[String] = js.native
}
object GenerateClassNameOptions {
  
  @scala.inline
  def apply(): GenerateClassNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateClassNameOptions]
  }
  
  @scala.inline
  implicit class GenerateClassNameOptionsOps[Self <: GenerateClassNameOptions] (val x: Self) extends AnyVal {
    
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
    def setDangerouslyUseGlobalCSS(value: Boolean): Self = this.set("dangerouslyUseGlobalCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslyUseGlobalCSS: Self = this.set("dangerouslyUseGlobalCSS", js.undefined)
    
    @scala.inline
    def setProductionPrefix(value: String): Self = this.set("productionPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionPrefix: Self = this.set("productionPrefix", js.undefined)
    
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
