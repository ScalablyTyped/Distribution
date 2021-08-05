package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes the protected range with the given ID.
  */
trait SchemaDeleteProtectedRangeRequest extends StObject {
  
  /**
    * The ID of the protected range to delete.
    */
  var protectedRangeId: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteProtectedRangeRequest {
  
  inline def apply(): SchemaDeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteProtectedRangeRequest]
  }
  
  extension [Self <: SchemaDeleteProtectedRangeRequest](x: Self) {
    
    inline def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
    
    inline def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
  }
}
