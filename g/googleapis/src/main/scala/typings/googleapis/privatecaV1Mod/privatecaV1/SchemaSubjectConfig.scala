package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubjectConfig extends StObject {
  
  /**
    * Required. Contains distinguished name fields such as the common name, location and organization.
    */
  var subject: js.UndefOr[SchemaSubject] = js.undefined
  
  /**
    * Optional. The subject alternative name fields.
    */
  var subjectAltName: js.UndefOr[SchemaSubjectAltNames] = js.undefined
}
object SchemaSubjectConfig {
  
  inline def apply(): SchemaSubjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubjectConfig]
  }
  
  extension [Self <: SchemaSubjectConfig](x: Self) {
    
    inline def setSubject(value: SchemaSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltName(value: SchemaSubjectAltNames): Self = StObject.set(x, "subjectAltName", value.asInstanceOf[js.Any])
    
    inline def setSubjectAltNameUndefined: Self = StObject.set(x, "subjectAltName", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
