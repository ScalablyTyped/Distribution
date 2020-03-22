package typings.jupyterlabLauncher.mod.ILauncher

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a launcher item.
  */
trait IItemOptions extends js.Object {
  /**
    * The arguments given to the command for
    * creating the launcher item.
    *
    * ### Notes
    * The launcher will also add the current working
    * directory of the filebrowser in the `cwd` field
    * of the args, which a command may use to create
    * the activity with respect to the right directory.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The category for the launcher item.
    *
    * The default value is the an empty string.
    */
  var category: js.UndefOr[String] = js.undefined
  /**
    * The command ID for the launcher item.
    *
    * #### Notes
    * If the command's `execute` method returns a `Widget` or
    * a promise that resolves with a `Widget`, then that widget will
    * replace the launcher in the same location of the application
    * shell. If the `execute` method does something else
    * (i.e., create a modal dialog), then the launcher will not be
    * disposed.
    */
  var command: String
  /**
    * For items that have a kernel associated with them, the URL of the kernel
    * icon.
    *
    * This is not a CSS class, but the URL that points to the icon in the kernel
    * spec.
    */
  var kernelIconUrl: js.UndefOr[String] = js.undefined
  /**
    * Metadata about the item.  This can be used by the launcher to
    * affect how the item is displayed.
    */
  var metadata: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The rank for the launcher item.
    *
    * The rank is used when ordering launcher items for display. After grouping
    * into categories, items are sorted in the following order:
    *   1. Rank (lower is better)
    *   3. Display Name (locale order)
    *
    * The default rank is `Infinity`.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IItemOptions {
  @scala.inline
  def apply(
    command: String,
    args: ReadonlyJSONObject = null,
    category: String = null,
    kernelIconUrl: String = null,
    metadata: ReadonlyJSONObject = null,
    rank: Int | Double = null
  ): IItemOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (kernelIconUrl != null) __obj.updateDynamic("kernelIconUrl")(kernelIconUrl.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
}

