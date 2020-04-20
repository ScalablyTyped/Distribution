package typings.jupyterlabCsvviewer.parseMod.IParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results from a parser.
  */
trait IResults extends js.Object {
  /**
    * The number of columns parsed, or 0 if only row offsets are returned.
    */
  var ncols: Double
  /**
    * The number of rows parsed.
    */
  var nrows: Double
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
  var offsets: js.Array[Double]
}

object IResults {
  @scala.inline
  def apply(ncols: Double, nrows: Double, offsets: js.Array[Double]): IResults = {
    val __obj = js.Dynamic.literal(ncols = ncols.asInstanceOf[js.Any], nrows = nrows.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResults]
  }
}

