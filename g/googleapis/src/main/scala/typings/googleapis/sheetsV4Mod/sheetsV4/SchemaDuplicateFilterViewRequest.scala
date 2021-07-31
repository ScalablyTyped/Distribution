package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Duplicates a particular filter view.
  */
trait SchemaDuplicateFilterViewRequest extends StObject {
  
  /**
    * The ID of the filter being duplicated.
    */
  var filterId: js.UndefOr[Double] = js.undefined
}
object SchemaDuplicateFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaDuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaDuplicateFilterViewRequestMutableBuilder[Self <: SchemaDuplicateFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
