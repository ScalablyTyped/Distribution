package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextConfig extends StObject {
  
  /**
    * The transformations to apply to the detected data.
    */
  var transformations: js.UndefOr[js.Array[SchemaInfoTypeTransformation]] = js.undefined
}
object SchemaTextConfig {
  
  @scala.inline
  def apply(): SchemaTextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextConfig]
  }
  
  @scala.inline
  implicit class SchemaTextConfigMutableBuilder[Self <: SchemaTextConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformations(value: js.Array[SchemaInfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    @scala.inline
    def setTransformationsVarargs(value: SchemaInfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
  }
}
