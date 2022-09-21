package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubordinateConfigChain extends StObject {
  
  /**
    * Required. Expected to be in leaf-to-root order according to RFC 5246.
    */
  var pemCertificates: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSubordinateConfigChain {
  
  inline def apply(): SchemaSubordinateConfigChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubordinateConfigChain]
  }
  
  extension [Self <: SchemaSubordinateConfigChain](x: Self) {
    
    inline def setPemCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCertificates", value.asInstanceOf[js.Any])
    
    inline def setPemCertificatesNull: Self = StObject.set(x, "pemCertificates", null)
    
    inline def setPemCertificatesUndefined: Self = StObject.set(x, "pemCertificates", js.undefined)
    
    inline def setPemCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCertificates", js.Array(value*))
  }
}
