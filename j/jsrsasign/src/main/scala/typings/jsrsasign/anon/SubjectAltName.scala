package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubjectAltName extends StObject {
  
  var subjectAltName: ArrayParam[Dns] = js.native
}
object SubjectAltName {
  
  @scala.inline
  def apply(subjectAltName: ArrayParam[Dns]): SubjectAltName = {
    val __obj = js.Dynamic.literal(subjectAltName = subjectAltName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAltName]
  }
  
  @scala.inline
  implicit class SubjectAltNameMutableBuilder[Self <: SubjectAltName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubjectAltName(value: ArrayParam[Dns]): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
  }
}
