package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePresentationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePresentationsGet {
  
  inline def apply(): ParamsResourcePresentationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsGet]
  }
  
  extension [Self <: ParamsResourcePresentationsGet](x: Self) {
    
    inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
  }
}
