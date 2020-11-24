package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Moves one or more rows or columns.
  */
@js.native
trait SchemaMoveDimensionRequest extends js.Object {
  
  /**
    * The zero-based start index of where to move the source data to, based on
    * the coordinates *before* the source data is removed from the grid.
    * Existing data will be shifted down or right (depending on the dimension)
    * to make room for the moved dimensions. The source dimensions are removed
    * from the grid, so the the data may end up in a different index than
    * specified.  For example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to
    * move `&quot;1&quot;` and `&quot;2&quot;` to between `&quot;3&quot;` and
    * `&quot;4&quot;`, the source would be `ROWS [1..3)`,and the destination
    * index would be `&quot;4&quot;` (the zero-based index of row 5). The end
    * result would be `A1..A5` of `0, 3, 1, 2, 4`.
    */
  var destinationIndex: js.UndefOr[Double] = js.native
  
  /**
    * The source dimensions to move.
    */
  var source: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaMoveDimensionRequest {
  
  @scala.inline
  def apply(): SchemaMoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveDimensionRequest]
  }
  
  @scala.inline
  implicit class SchemaMoveDimensionRequestOps[Self <: SchemaMoveDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationIndex(value: Double): Self = this.set("destinationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIndex: Self = this.set("destinationIndex", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaDimensionRange): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
