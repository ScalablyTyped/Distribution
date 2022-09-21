package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.UserNotice
import typings.jsrsasign.jsrsasign._PolicyQualifierInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unotice
  extends StObject
     with _PolicyQualifierInfo {
  
  var unotice: UserNotice
}
object Unotice {
  
  inline def apply(unotice: UserNotice): Unotice = {
    val __obj = js.Dynamic.literal(unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unotice]
  }
  
  extension [Self <: Unotice](x: Self) {
    
    inline def setUnotice(value: UserNotice): Self = StObject.set(x, "unotice", value.asInstanceOf[js.Any])
  }
}
