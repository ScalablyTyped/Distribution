package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for Istio addon.
  */
@js.native
trait SchemaIstioConfig extends js.Object {
  
  /**
    * The specified Istio auth mode, either none, or mutual TLS.
    */
  var auth: js.UndefOr[String] = js.native
  
  /**
    * Whether Istio is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}
object SchemaIstioConfig {
  
  @scala.inline
  def apply(): SchemaIstioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIstioConfig]
  }
  
  @scala.inline
  implicit class SchemaIstioConfigOps[Self <: SchemaIstioConfig] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
}
