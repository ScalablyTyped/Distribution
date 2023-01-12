package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactJWSHeaderParameters
  extends StObject
     with JWSHeaderParameters {
  
  @JSName("alg")
  var alg_CompactJWSHeaderParameters: String
}
object CompactJWSHeaderParameters {
  
  inline def apply(alg: String): CompactJWSHeaderParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactJWSHeaderParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompactJWSHeaderParameters] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
  }
}
