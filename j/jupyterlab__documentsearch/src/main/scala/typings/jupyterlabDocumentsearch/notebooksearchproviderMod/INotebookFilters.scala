package typings.jupyterlabDocumentsearch.notebooksearchproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookFilters extends js.Object {
  /**
    * Should cell output be searched?
    */
  var output: Boolean
}

object INotebookFilters {
  @scala.inline
  def apply(output: Boolean): INotebookFilters = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookFilters]
  }
}

