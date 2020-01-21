package typings.jupyterlabServices

import typings.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdsValues extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IWorkspace]
}

object AnonIdsValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IWorkspace]): AnonIdsValues = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdsValues]
  }
}

