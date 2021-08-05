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
  
  inline def apply(): SchemaIstioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIstioConfig]
  }
  
  extension [Self <: SchemaIstioConfig](x: Self) {
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
