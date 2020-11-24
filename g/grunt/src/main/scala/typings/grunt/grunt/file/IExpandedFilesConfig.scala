package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These are valid for compact-format
  */
@js.native
trait IExpandedFilesConfig extends IFilesConfig {
  
  /**
    * Replace any existing extension with this value in generated {@link IExpandedFilesConfig.dest} paths.
    */
  var ext: js.UndefOr[String] = js.native
  
  /**
    * Remove all path parts from generated {@link IExpandedFilesConfig.dest} paths.
    */
  var flatten: js.UndefOr[Boolean] = js.native
  
  /**
    * This function is called for each matched src file, (after extension renaming and flattening).
    * The {@link IExpandedFilesConfig.dest} and matched {@link IExpandedFilesConfig.src} path are passed in,
    * and this function must return a new dest value.
    * If the same dest is returned more than once, each src which used it will be added to an array of sources for it.
    */
  var rename: js.UndefOr[js.Function] = js.native
}
object IExpandedFilesConfig {
  
  @scala.inline
  def apply(): IExpandedFilesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandedFilesConfig]
  }
  
  @scala.inline
  implicit class IExpandedFilesConfigOps[Self <: IExpandedFilesConfig] (val x: Self) extends AnyVal {
    
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
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setRename(value: js.Function): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
  }
}
