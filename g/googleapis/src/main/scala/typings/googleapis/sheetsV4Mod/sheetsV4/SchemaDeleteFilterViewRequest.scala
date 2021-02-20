package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a particular filter view.
  */
@js.native
trait SchemaDeleteFilterViewRequest extends StObject {
  
  /**
    * The ID of the filter to delete.
    */
  var filterId: js.UndefOr[Double] = js.native
}
object SchemaDeleteFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaDeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteFilterViewRequestMutableBuilder[Self <: SchemaDeleteFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
