package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectAltName extends StObject {
  
  var subjectAltName: ArrayParam[Dns]
}
object SubjectAltName {
  
  inline def apply(subjectAltName: ArrayParam[Dns]): SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAltName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectAltName] (val x: Self) extends AnyVal {
    
    inline def setSubjectAltName(value: ArrayParam[Dns]): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
  }
}
