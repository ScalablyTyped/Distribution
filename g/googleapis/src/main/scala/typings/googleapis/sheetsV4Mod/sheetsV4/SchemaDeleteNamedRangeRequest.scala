package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes the named range with the given ID from the spreadsheet.
  */
trait SchemaDeleteNamedRangeRequest extends StObject {
  
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.undefined
}
object SchemaDeleteNamedRangeRequest {
  
  @scala.inline
  def apply(): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteNamedRangeRequestMutableBuilder[Self <: SchemaDeleteNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
