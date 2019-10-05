package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base cell interface.
  */
trait IBaseCell extends JSONObject {
  /**
    * String identifying the type of cell.
    */
  var cell_type: String
  /**
    * Cell-level metadata.
    */
  var metadata: Partial[ICellMetadata]
  /**
    * Contents of the cell, represented as an array of lines.
    */
  var source: MultilineString
}

object IBaseCell {
  @scala.inline
  def apply(cell_type: String, metadata: Partial[ICellMetadata], source: MultilineString): IBaseCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type, metadata = metadata, source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBaseCell]
  }
}

