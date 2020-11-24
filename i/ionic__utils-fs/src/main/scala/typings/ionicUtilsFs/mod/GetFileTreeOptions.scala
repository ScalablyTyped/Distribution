package typings.ionicUtilsFs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileTreeOptions[RE, DE] extends js.Object {
  
  /**
    * Called whenever a directory node is added to the tree.
    *
    * Directory nodes can be supplemented by returning a new object from this
    * function.
    */
  val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode with DE]] = js.native
  
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  
  /**
    * Called whenever a file node is added to the tree.
    *
    * File nodes can be supplemented by returning a new object from this
    * function.
    */
  val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode with RE]] = js.native
  
  val walkerOptions: js.UndefOr[WalkerOptions] = js.native
}
object GetFileTreeOptions {
  
  @scala.inline
  def apply[RE, DE](): GetFileTreeOptions[RE, DE] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
  }
  
  @scala.inline
  implicit class GetFileTreeOptionsOps[Self <: GetFileTreeOptions[_, _], RE, DE] (val x: Self with (GetFileTreeOptions[RE, DE])) extends AnyVal {
    
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
    def setOnDirectoryNode(value: /* node */ DirectoryNode => DirectoryNode with DE): Self = this.set("onDirectoryNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDirectoryNode: Self = this.set("onDirectoryNode", js.undefined)
    
    @scala.inline
    def setOnError(value: /* err */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFileNode(value: /* node */ RegularFileNode => RegularFileNode with RE): Self = this.set("onFileNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFileNode: Self = this.set("onFileNode", js.undefined)
    
    @scala.inline
    def setWalkerOptions(value: WalkerOptions): Self = this.set("walkerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalkerOptions: Self = this.set("walkerOptions", js.undefined)
  }
}
