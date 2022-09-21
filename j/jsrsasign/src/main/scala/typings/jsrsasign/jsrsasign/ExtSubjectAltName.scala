package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.subjectAltName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtSubjectAltName
  extends StObject
     with ExtParam {
  
  var array: js.Array[GeneralName]
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: subjectAltName
}
object ExtSubjectAltName {
  
  inline def apply(array: js.Array[GeneralName]): ExtSubjectAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "subjectAltName")
    __obj.asInstanceOf[ExtSubjectAltName]
  }
  
  extension [Self <: ExtSubjectAltName](x: Self) {
    
    inline def setArray(value: js.Array[GeneralName]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: GeneralName*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: subjectAltName): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
