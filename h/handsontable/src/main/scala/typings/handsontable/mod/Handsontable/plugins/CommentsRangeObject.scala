package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.wot.CellCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsRangeObject extends StObject {
  
  var from: CellCoords = js.native
  
  var to: js.UndefOr[CellCoords] = js.native
}
object CommentsRangeObject {
  
  @scala.inline
  def apply(from: CellCoords): CommentsRangeObject = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsRangeObject]
  }
  
  @scala.inline
  implicit class CommentsRangeObjectMutableBuilder[Self <: CommentsRangeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: CellCoords): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: CellCoords): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
