package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicParameters extends StObject {
  
  var alg: js.UndefOr[String] = js.undefined
  
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.undefined
  
  var kid: js.UndefOr[String] = js.undefined
  
  var use: js.UndefOr[typings.jose.mod.use] = js.undefined
}
object BasicParameters {
  
  @scala.inline
  def apply(): BasicParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicParameters]
  }
  
  @scala.inline
  implicit class BasicParametersMutableBuilder[Self <: BasicParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    @scala.inline
    def setKey_ops(value: js.Array[keyOperation]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
    
    @scala.inline
    def setKey_opsVarargs(value: keyOperation*): Self = StObject.set(x, "key_ops", js.Array(value :_*))
    
    @scala.inline
    def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    @scala.inline
    def setUse(value: use): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
