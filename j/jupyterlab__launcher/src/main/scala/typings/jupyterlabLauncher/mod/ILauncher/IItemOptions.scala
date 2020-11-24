package typings.jupyterlabLauncher.mod.ILauncher

import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a launcher item.
  */
@js.native
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
  var args: js.UndefOr[ReadonlyJSONObject] = js.native
  
  /**
    * The category for the launcher item.
    *
    * The default value is the an empty string.
    */
  var category: js.UndefOr[String] = js.native
  
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
  var command: String = js.native
  
  /**
    * For items that have a kernel associated with them, the URL of the kernel
    * icon.
    *
    * This is not a CSS class, but the URL that points to the icon in the kernel
    * spec.
    */
  var kernelIconUrl: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the item.  This can be used by the launcher to
    * affect how the item is displayed.
    */
  var metadata: js.UndefOr[ReadonlyJSONObject] = js.native
  
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
  var rank: js.UndefOr[Double] = js.native
}
object IItemOptions {
  
  @scala.inline
  def apply(command: String): IItemOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
  
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: ReadonlyJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setKernelIconUrl(value: String): Self = this.set("kernelIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelIconUrl: Self = this.set("kernelIconUrl", js.undefined)
    
    @scala.inline
    def setMetadata(value: ReadonlyJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
  }
}
