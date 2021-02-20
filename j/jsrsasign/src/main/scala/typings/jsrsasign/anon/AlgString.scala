package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgString extends StObject {
  
  var alg: String = js.native
}
object AlgString {
  
  @scala.inline
  def apply(alg: String): AlgString = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgString]
  }
  
  @scala.inline
  implicit class AlgStringMutableBuilder[Self <: AlgString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
  }
}
