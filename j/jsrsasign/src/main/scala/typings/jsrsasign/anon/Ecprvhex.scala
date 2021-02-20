package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ecprvhex extends StObject {
  
  var ecprvhex: String = js.native
  
  var ecpubhex: String = js.native
}
object Ecprvhex {
  
  @scala.inline
  def apply(ecprvhex: String, ecpubhex: String): Ecprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecprvhex]
  }
  
  @scala.inline
  implicit class EcprvhexMutableBuilder[Self <: Ecprvhex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcprvhex(value: String): Self = StObject.set(x, "ecprvhex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcpubhex(value: String): Self = StObject.set(x, "ecpubhex", value.asInstanceOf[js.Any])
  }
}
