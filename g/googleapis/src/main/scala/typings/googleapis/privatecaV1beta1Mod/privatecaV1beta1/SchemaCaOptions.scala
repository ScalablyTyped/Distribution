package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCaOptions extends StObject {
  
  /**
    * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
    */
  var isCa: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
    */
  var maxIssuerPathLength: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCaOptions {
  
  inline def apply(): SchemaCaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaOptions]
  }
  
  extension [Self <: SchemaCaOptions](x: Self) {
    
    inline def setIsCa(value: Boolean): Self = StObject.set(x, "isCa", value.asInstanceOf[js.Any])
    
    inline def setIsCaNull: Self = StObject.set(x, "isCa", null)
    
    inline def setIsCaUndefined: Self = StObject.set(x, "isCa", js.undefined)
    
    inline def setMaxIssuerPathLength(value: Double): Self = StObject.set(x, "maxIssuerPathLength", value.asInstanceOf[js.Any])
    
    inline def setMaxIssuerPathLengthNull: Self = StObject.set(x, "maxIssuerPathLength", null)
    
    inline def setMaxIssuerPathLengthUndefined: Self = StObject.set(x, "maxIssuerPathLength", js.undefined)
  }
}
