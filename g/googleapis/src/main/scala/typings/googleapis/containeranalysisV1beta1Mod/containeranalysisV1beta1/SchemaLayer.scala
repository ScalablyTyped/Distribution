package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer holds metadata specific to a layer of a Docker image.
  */
@js.native
trait SchemaLayer extends js.Object {
  
  /**
    * The recovered arguments to the Dockerfile directive.
    */
  var arguments: js.UndefOr[String] = js.native
  
  /**
    * Required. The recovered Dockerfile directive used to construct this
    * layer.
    */
  var directive: js.UndefOr[String] = js.native
}
object SchemaLayer {
  
  @scala.inline
  def apply(): SchemaLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayer]
  }
  
  @scala.inline
  implicit class SchemaLayerOps[Self <: SchemaLayer] (val x: Self) extends AnyVal {
    
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
    def setArguments(value: String): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setDirective(value: String): Self = this.set("directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirective: Self = this.set("directive", js.undefined)
  }
}
