package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrvKeyObj_ extends StObject {
  
  var prvKeyObj: RSAKey
  
  var pubKeyObj: RSAKey
}
object PrvKeyObj_ {
  
  @scala.inline
  def apply(prvKeyObj: RSAKey, pubKeyObj: RSAKey): PrvKeyObj_ = {
    val __obj = js.Dynamic.literal(prvKeyObj = prvKeyObj.asInstanceOf[js.Any], pubKeyObj = pubKeyObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrvKeyObj_]
  }
  
  @scala.inline
  implicit class PrvKeyObj_MutableBuilder[Self <: PrvKeyObj_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrvKeyObj(value: RSAKey): Self = StObject.set(x, "prvKeyObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubKeyObj(value: RSAKey): Self = StObject.set(x, "pubKeyObj", value.asInstanceOf[js.Any])
  }
}
