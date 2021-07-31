package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prov extends StObject {
  
  var alg: js.UndefOr[String] = js.undefined
  
  var prov: js.UndefOr[String] = js.undefined
}
object Prov {
  
  @scala.inline
  def apply(): Prov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prov]
  }
  
  @scala.inline
  implicit class ProvMutableBuilder[Self <: Prov] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    @scala.inline
    def setProv(value: String): Self = StObject.set(x, "prov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvUndefined: Self = StObject.set(x, "prov", js.undefined)
  }
}
