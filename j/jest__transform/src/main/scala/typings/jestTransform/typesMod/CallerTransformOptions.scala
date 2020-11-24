package typings.jestTransform.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallerTransformOptions extends js.Object {
  
  var supportsDynamicImport: js.UndefOr[Boolean] = js.native
  
  var supportsExportNamespaceFrom: js.UndefOr[Boolean] = js.native
  
  var supportsStaticESM: js.UndefOr[Boolean] = js.native
  
  var supportsTopLevelAwait: js.UndefOr[Boolean] = js.native
}
object CallerTransformOptions {
  
  @scala.inline
  def apply(): CallerTransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallerTransformOptions]
  }
  
  @scala.inline
  implicit class CallerTransformOptionsOps[Self <: CallerTransformOptions] (val x: Self) extends AnyVal {
    
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
    def setSupportsDynamicImport(value: Boolean): Self = this.set("supportsDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsDynamicImport: Self = this.set("supportsDynamicImport", js.undefined)
    
    @scala.inline
    def setSupportsExportNamespaceFrom(value: Boolean): Self = this.set("supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsExportNamespaceFrom: Self = this.set("supportsExportNamespaceFrom", js.undefined)
    
    @scala.inline
    def setSupportsStaticESM(value: Boolean): Self = this.set("supportsStaticESM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsStaticESM: Self = this.set("supportsStaticESM", js.undefined)
    
    @scala.inline
    def setSupportsTopLevelAwait(value: Boolean): Self = this.set("supportsTopLevelAwait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTopLevelAwait: Self = this.set("supportsTopLevelAwait", js.undefined)
  }
}
