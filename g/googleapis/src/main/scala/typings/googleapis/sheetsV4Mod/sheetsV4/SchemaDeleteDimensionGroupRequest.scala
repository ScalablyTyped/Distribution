package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a group over the specified range by decrementing the depth of the
  * dimensions in the range.  For example, assume the sheet has a depth-1 group
  * over B:E and a depth-2 group over C:D. Deleting a group over D:E leaves the
  * sheet with a depth-1 group over B:D and a depth-2 group over C:C.
  */
trait SchemaDeleteDimensionGroupRequest extends StObject {
  
  /**
    * The range of the group to be deleted.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaDeleteDimensionGroupRequest {
  
  @scala.inline
  def apply(): SchemaDeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteDimensionGroupRequestMutableBuilder[Self <: SchemaDeleteDimensionGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
