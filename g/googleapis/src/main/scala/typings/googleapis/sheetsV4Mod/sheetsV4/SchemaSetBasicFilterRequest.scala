package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sets the basic filter associated with a sheet.
  */
@js.native
trait SchemaSetBasicFilterRequest extends StObject {
  
  /**
    * The filter to set.
    */
  var filter: js.UndefOr[SchemaBasicFilter] = js.native
}
object SchemaSetBasicFilterRequest {
  
  @scala.inline
  def apply(): SchemaSetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetBasicFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaSetBasicFilterRequestMutableBuilder[Self <: SchemaSetBasicFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: SchemaBasicFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
