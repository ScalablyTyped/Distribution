package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Caissuer extends StObject {
  
  var caissuer: js.Array[String] = js.native
  
  var ocsp: js.Array[String] = js.native
}
object Caissuer {
  
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): Caissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caissuer]
  }
  
  @scala.inline
  implicit class CaissuerMutableBuilder[Self <: Caissuer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaissuer(value: js.Array[String]): Self = StObject.set(x, "caissuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaissuerVarargs(value: String*): Self = StObject.set(x, "caissuer", js.Array(value :_*))
    
    @scala.inline
    def setOcsp(value: js.Array[String]): Self = StObject.set(x, "ocsp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcspVarargs(value: String*): Self = StObject.set(x, "ocsp", js.Array(value :_*))
  }
}
