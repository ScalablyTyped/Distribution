package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for FirebaseRulesService.UpdateReleasePatch.
  */
trait SchemaUpdateReleaseRequest extends StObject {
  
  /**
    * `Release` to update.
    */
  var release: js.UndefOr[SchemaRelease] = js.undefined
  
  /**
    * Specifies which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateReleaseRequest {
  
  inline def apply(): SchemaUpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateReleaseRequest]
  }
  
  extension [Self <: SchemaUpdateReleaseRequest](x: Self) {
    
    inline def setRelease(value: SchemaRelease): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
