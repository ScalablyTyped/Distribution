package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The notebook content.
  */
trait INotebookContent extends JSONObject {
  var cells: js.Array[ICell]
  var metadata: INotebookMetadata
  var nbformat: Double
  var nbformat_minor: Double
}

object INotebookContent {
  @scala.inline
  def apply(cells: js.Array[ICell], metadata: INotebookMetadata, nbformat: Double, nbformat_minor: Double): INotebookContent = {
    val __obj = js.Dynamic.literal(cells = cells, metadata = metadata, nbformat = nbformat, nbformat_minor = nbformat_minor)
  
    __obj.asInstanceOf[INotebookContent]
  }
}

