package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceTemplateSpec extends StObject {
  
  /**
    * Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
    */
  var spec: js.UndefOr[SchemaInstanceSpec] = js.undefined
}
object SchemaInstanceTemplateSpec {
  
  inline def apply(): SchemaInstanceTemplateSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceTemplateSpec]
  }
  
  extension [Self <: SchemaInstanceTemplateSpec](x: Self) {
    
    inline def setSpec(value: SchemaInstanceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
