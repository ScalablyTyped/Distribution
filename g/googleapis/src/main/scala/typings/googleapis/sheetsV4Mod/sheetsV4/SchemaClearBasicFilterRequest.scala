package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clears the basic filter, if any exists on the sheet.
  */
@js.native
trait SchemaClearBasicFilterRequest extends StObject {
  
  /**
    * The sheet ID on which the basic filter should be cleared.
    */
  var sheetId: js.UndefOr[Double] = js.native
}
object SchemaClearBasicFilterRequest {
  
  @scala.inline
  def apply(): SchemaClearBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearBasicFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaClearBasicFilterRequestMutableBuilder[Self <: SchemaClearBasicFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
