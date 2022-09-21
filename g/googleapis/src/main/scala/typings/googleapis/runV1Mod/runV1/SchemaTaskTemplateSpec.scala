package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskTemplateSpec extends StObject {
  
  /**
    * Optional. Specification of the desired behavior of the task. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
    */
  var spec: js.UndefOr[SchemaTaskSpec] = js.undefined
}
object SchemaTaskTemplateSpec {
  
  inline def apply(): SchemaTaskTemplateSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskTemplateSpec]
  }
  
  extension [Self <: SchemaTaskTemplateSpec](x: Self) {
    
    inline def setSpec(value: SchemaTaskSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
