package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes the protected range with the given ID.
  */
@js.native
trait SchemaDeleteProtectedRangeRequest extends StObject {
  
  /**
    * The ID of the protected range to delete.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
}
object SchemaDeleteProtectedRangeRequest {
  
  @scala.inline
  def apply(): SchemaDeleteProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteProtectedRangeRequestMutableBuilder[Self <: SchemaDeleteProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedRangeId(value: Double): Self = StObject.set(x, "protectedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeIdUndefined: Self = StObject.set(x, "protectedRangeId", js.undefined)
  }
}
