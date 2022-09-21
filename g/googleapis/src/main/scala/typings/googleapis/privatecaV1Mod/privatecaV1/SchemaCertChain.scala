package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertChain extends StObject {
  
  /**
    * The certificates that form the CA chain, from leaf to root order.
    */
  var certificates: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCertChain {
  
  inline def apply(): SchemaCertChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertChain]
  }
  
  extension [Self <: SchemaCertChain](x: Self) {
    
    inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesNull: Self = StObject.set(x, "certificates", null)
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
