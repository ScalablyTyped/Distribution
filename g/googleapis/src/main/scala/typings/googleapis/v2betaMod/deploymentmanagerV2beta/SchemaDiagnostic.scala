package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDiagnostic extends StObject {
  
  /**
    * JsonPath expression on the resource that if non empty, indicates that
    * this field needs to be extracted as a diagnostic.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * Level to record this diagnostic.
    */
  var level: js.UndefOr[String] = js.native
}
object SchemaDiagnostic {
  
  @scala.inline
  def apply(): SchemaDiagnostic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostic]
  }
  
  @scala.inline
  implicit class SchemaDiagnosticMutableBuilder[Self <: SchemaDiagnostic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
