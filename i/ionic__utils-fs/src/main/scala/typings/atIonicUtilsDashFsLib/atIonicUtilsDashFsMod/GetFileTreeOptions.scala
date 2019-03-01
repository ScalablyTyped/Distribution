package typings
package atIonicUtilsDashFsLib.atIonicUtilsDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileTreeOptions[RE, DE] extends js.Object {
  /**
    * Called whenever a directory node is added to the tree.
    *
    * Directory nodes can be supplemented by returning a new object from this
    * function.
    */
  val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode with DE]] = js.undefined
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.undefined
  /**
    * Called whenever a file node is added to the tree.
    *
    * File nodes can be supplemented by returning a new object from this
    * function.
    */
  val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode with RE]] = js.undefined
  val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
}

object GetFileTreeOptions {
  @scala.inline
  def apply[RE, DE](
    onDirectoryNode: js.Function1[/* node */ DirectoryNode, DirectoryNode with DE] = null,
    onError: js.Function1[/* err */ nodeLib.Error, scala.Unit] = null,
    onFileNode: js.Function1[/* node */ RegularFileNode, RegularFileNode with RE] = null,
    walkerOptions: WalkerOptions = null
  ): GetFileTreeOptions[RE, DE] = {
    val __obj = js.Dynamic.literal()
    if (onDirectoryNode != null) __obj.updateDynamic("onDirectoryNode")(onDirectoryNode)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFileNode != null) __obj.updateDynamic("onFileNode")(onFileNode)
    if (walkerOptions != null) __obj.updateDynamic("walkerOptions")(walkerOptions)
    __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
  }
}

