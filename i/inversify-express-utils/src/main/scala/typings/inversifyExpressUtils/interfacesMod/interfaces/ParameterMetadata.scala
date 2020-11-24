package typings.inversifyExpressUtils.interfacesMod.interfaces

import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterMetadata extends js.Object {
  
  var index: Double = js.native
  
  var injectRoot: Boolean = js.native
  
  var parameterName: js.UndefOr[String] = js.native
  
  var `type`: PARAMETER_TYPE = js.native
}
object ParameterMetadata {
  
  @scala.inline
  def apply(index: Double, injectRoot: Boolean, `type`: PARAMETER_TYPE): ParameterMetadata = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], injectRoot = injectRoot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMetadata]
  }
  
  @scala.inline
  implicit class ParameterMetadataOps[Self <: ParameterMetadata] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectRoot(value: Boolean): Self = this.set("injectRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PARAMETER_TYPE): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("parameterName", js.undefined)
  }
}
