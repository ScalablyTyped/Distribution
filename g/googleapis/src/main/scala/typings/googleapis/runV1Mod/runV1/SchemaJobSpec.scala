package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobSpec extends StObject {
  
  /**
    * Optional. Describes the execution that will be created when running a job.
    */
  var template: js.UndefOr[SchemaExecutionTemplateSpec] = js.undefined
}
object SchemaJobSpec {
  
  inline def apply(): SchemaJobSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobSpec]
  }
  
  extension [Self <: SchemaJobSpec](x: Self) {
    
    inline def setTemplate(value: SchemaExecutionTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
