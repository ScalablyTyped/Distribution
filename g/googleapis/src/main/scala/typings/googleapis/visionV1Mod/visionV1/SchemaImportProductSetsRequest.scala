package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `ImportProductSets` method.
  */
trait SchemaImportProductSetsRequest extends StObject {
  
  /**
    * The input content for the list of requests.
    */
  var inputConfig: js.UndefOr[SchemaImportProductSetsInputConfig] = js.undefined
}
object SchemaImportProductSetsRequest {
  
  @scala.inline
  def apply(): SchemaImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsRequest]
  }
  
  @scala.inline
  implicit class SchemaImportProductSetsRequestMutableBuilder[Self <: SchemaImportProductSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfig(value: SchemaImportProductSetsInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
