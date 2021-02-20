package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cps extends StObject {
  
  var cps: String = js.native
  
  var id: String = js.native
  
  var unotice: String = js.native
}
object Cps {
  
  @scala.inline
  def apply(cps: String, id: String, unotice: String): Cps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
  
  @scala.inline
  implicit class CpsMutableBuilder[Self <: Cps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCps(value: String): Self = StObject.set(x, "cps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnotice(value: String): Self = StObject.set(x, "unotice", value.asInstanceOf[js.Any])
  }
}
