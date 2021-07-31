package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for Istio addon.
  */
trait SchemaIstioConfig extends StObject {
  
  /**
    * The specified Istio auth mode, either none, or mutual TLS.
    */
  var auth: js.UndefOr[String] = js.undefined
  
  /**
    * Whether Istio is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaIstioConfig {
  
  @scala.inline
  def apply(): SchemaIstioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIstioConfig]
  }
  
  @scala.inline
  implicit class SchemaIstioConfigMutableBuilder[Self <: SchemaIstioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
