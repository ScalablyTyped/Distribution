package typings.atJupyterlabServices

import typings.atJupyterlabServices.libWorkspaceMod.Workspace.IWorkspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdsValues extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IWorkspace]
}

object Anon_IdsValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IWorkspace]): Anon_IdsValues = {
    val __obj = js.Dynamic.literal(ids = ids, values = values)
  
    __obj.asInstanceOf[Anon_IdsValues]
  }
}

