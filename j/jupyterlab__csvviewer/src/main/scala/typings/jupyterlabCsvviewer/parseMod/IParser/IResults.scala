package typings.jupyterlabCsvviewer.parseMod.IParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The results from a parser.
  */
@js.native
trait IResults extends js.Object {
  
  /**
    * The number of columns parsed, or 0 if only row offsets are returned.
    */
  var ncols: Double = js.native
  
  /**
    * The number of rows parsed.
    */
  var nrows: Double = js.native
  
  /**
    * The index offsets into the data string for the rows or data items.
    *
    * #### Notes
    * If the columnOffsets argument to the parser is false, the offsets array
    * will be an array of length nrows, where `offsets[r]` is the index of the
    * first character of row r.
    *
    * If the columnOffsets argument to the parser is true, the offsets array
    * will be an array of length `nrows*ncols`, where `offsets[r*ncols + c]` is
    * the index of the first character of the item in row r, column c.
    */
  var offsets: js.Array[Double] = js.native
}
object IResults {
  
  @scala.inline
  def apply(ncols: Double, nrows: Double, offsets: js.Array[Double]): IResults = {
    val __obj = js.Dynamic.literal(ncols = ncols.asInstanceOf[js.Any], nrows = nrows.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResults]
  }
  
  @scala.inline
  implicit class IResultsOps[Self <: IResults] (val x: Self) extends AnyVal {
    
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
    def setNcols(value: Double): Self = this.set("ncols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNrows(value: Double): Self = this.set("nrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetsVarargs(value: Double*): Self = this.set("offsets", js.Array(value :_*))
    
    @scala.inline
    def setOffsets(value: js.Array[Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
  }
}
