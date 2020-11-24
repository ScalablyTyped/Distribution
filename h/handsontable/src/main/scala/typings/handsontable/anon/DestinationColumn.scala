package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationColumn extends js.Object {
  
  var destinationColumn: Double = js.native
  
  var destinationRow: Double = js.native
  
  var forceNumeric: js.UndefOr[Boolean] = js.native
  
  var ranges: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var reversedRowCoords: js.UndefOr[Boolean] = js.native
  
  var roundFloat: js.UndefOr[Boolean] = js.native
  
  var sourceColumn: js.UndefOr[Double] = js.native
  
  var suppressDataTypeErrors: js.UndefOr[Boolean] = js.native
}
object DestinationColumn {
  
  @scala.inline
  def apply(destinationColumn: Double, destinationRow: Double): DestinationColumn = {
    val __obj = js.Dynamic.literal(destinationColumn = destinationColumn.asInstanceOf[js.Any], destinationRow = destinationRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationColumn]
  }
  
  @scala.inline
  implicit class DestinationColumnOps[Self <: DestinationColumn] (val x: Self) extends AnyVal {
    
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
    def setDestinationColumn(value: Double): Self = this.set("destinationColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRow(value: Double): Self = this.set("destinationRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceNumeric(value: Boolean): Self = this.set("forceNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceNumeric: Self = this.set("forceNumeric", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: js.Array[Double]*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[js.Array[Double]]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setReversedRowCoords(value: Boolean): Self = this.set("reversedRowCoords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversedRowCoords: Self = this.set("reversedRowCoords", js.undefined)
    
    @scala.inline
    def setRoundFloat(value: Boolean): Self = this.set("roundFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundFloat: Self = this.set("roundFloat", js.undefined)
    
    @scala.inline
    def setSourceColumn(value: Double): Self = this.set("sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceColumn: Self = this.set("sourceColumn", js.undefined)
    
    @scala.inline
    def setSuppressDataTypeErrors(value: Boolean): Self = this.set("suppressDataTypeErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressDataTypeErrors: Self = this.set("suppressDataTypeErrors", js.undefined)
  }
}
