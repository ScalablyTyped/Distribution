package typings.atJupyterlabServices.libWorkspaceMod.WorkspaceNs

import typings.atJupyterlabServices.Anon_Id
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface describing a workspace API response.
  */
trait IWorkspace extends js.Object {
  /**
    * The workspace data.
    */
  var data: ReadonlyJSONObject
  /**
    * The metadata for a workspace.
    */
  var metadata: Anon_Id
}

object IWorkspace {
  @scala.inline
  def apply(data: ReadonlyJSONObject, metadata: Anon_Id): IWorkspace = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
  
    __obj.asInstanceOf[IWorkspace]
  }
}

