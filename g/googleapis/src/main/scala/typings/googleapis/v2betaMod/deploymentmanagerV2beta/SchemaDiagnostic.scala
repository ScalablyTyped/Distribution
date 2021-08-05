package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiagnostic extends StObject {
  
  /**
    * JsonPath expression on the resource that if non empty, indicates that
    * this field needs to be extracted as a diagnostic.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Level to record this diagnostic.
    */
  var level: js.UndefOr[String] = js.undefined
}
object SchemaDiagnostic {
  
  inline def apply(): SchemaDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostic]
  }
  
  extension [Self <: SchemaDiagnostic](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
