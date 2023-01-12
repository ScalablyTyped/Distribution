package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOptions
  extends StObject
     with CritOption {
  
  /**
    * A list of accepted JWS "alg" (Algorithm) Header Parameter values. By default all "alg"
    * (Algorithm) values applicable for the used key/secret are allowed. Note: "none" is never
    * accepted.
    */
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
}
object VerifyOptions {
  
  inline def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
  }
}
