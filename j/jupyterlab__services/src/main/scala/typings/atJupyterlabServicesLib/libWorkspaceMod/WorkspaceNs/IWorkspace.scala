package typings
package atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs

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
  var data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject
  /**
    * The metadata for a workspace.
    */
  var metadata: atJupyterlabServicesLib.Anon_Id
}

object IWorkspace {
  @scala.inline
  def apply(
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    metadata: atJupyterlabServicesLib.Anon_Id
  ): IWorkspace = {
    val __obj = js.Dynamic.literal(data = data, metadata = metadata)
  
    __obj.asInstanceOf[IWorkspace]
  }
}

