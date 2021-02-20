package typings.jsrsasign.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pass extends StObject {
  
  var alg: String = js.native
  
  var pass: StringDictionary[String] = js.native
}
object Pass {
  
  @scala.inline
  def apply(alg: String, pass: StringDictionary[String]): Pass = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit class PassMutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: StringDictionary[String]): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
