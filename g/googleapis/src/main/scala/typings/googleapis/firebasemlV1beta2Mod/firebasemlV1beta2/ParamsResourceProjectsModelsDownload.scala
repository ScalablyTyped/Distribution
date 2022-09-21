package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsDownload
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model to download. The name must have the form `projects/{project\}/models/{model\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsDownload {
  
  inline def apply(): ParamsResourceProjectsModelsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsDownload]
  }
  
  extension [Self <: ParamsResourceProjectsModelsDownload](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
