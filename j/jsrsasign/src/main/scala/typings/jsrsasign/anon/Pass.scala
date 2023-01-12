package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pass extends StObject {
  
  var alg: String
  
  var pass: StringDictionary[String]
}
object Pass {
  
  inline def apply(alg: String, pass: StringDictionary[String]): Pass = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setPass(value: StringDictionary[String]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
