package typings.googleapis.v1p5beta1Mod.cloudassetV1p5beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1IngressPolicy extends StObject {
  
  /**
    * Defines the conditions on the source of a request causing this IngressPolicy to apply.
    */
  var ingressFrom: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom] = js.undefined
  
  /**
    * Defines the conditions on the ApiOperation and request destination that cause this IngressPolicy to apply.
    */
  var ingressTo: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1IngressTo] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1IngressPolicy {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1IngressPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1IngressPolicy]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1IngressPolicy](x: Self) {
    
    inline def setIngressFrom(value: SchemaGoogleIdentityAccesscontextmanagerV1IngressFrom): Self = StObject.set(x, "ingressFrom", value.asInstanceOf[js.Any])
    
    inline def setIngressFromUndefined: Self = StObject.set(x, "ingressFrom", js.undefined)
    
    inline def setIngressTo(value: SchemaGoogleIdentityAccesscontextmanagerV1IngressTo): Self = StObject.set(x, "ingressTo", value.asInstanceOf[js.Any])
    
    inline def setIngressToUndefined: Self = StObject.set(x, "ingressTo", js.undefined)
  }
}
