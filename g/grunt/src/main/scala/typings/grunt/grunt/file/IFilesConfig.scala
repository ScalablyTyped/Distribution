package typings.grunt.grunt.file

import typings.grunt.minimatch.IMinimatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link http://gruntjs.com/configuring-tasks#files}
  */
@js.native
trait IFilesConfig extends IMinimatchOptions {
  
  /**
    * Patterns will be matched relative to this path, and all returned filepaths will
    * also be relative to this path.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * Destination path prefix.
    */
  var dest: js.UndefOr[String] = js.native
  
  /**
    * Process a dynamic src-dest file mapping,
    * @see {@link http://gruntjs.com/configuring-tasks#building-the-files-object-dynamically for more information.
    */
  var expand: js.UndefOr[Boolean] = js.native
  
   // = false
  /**
    * Either a valid fs.Stats method name:
    * - isFile
    * - isDirectory
    * - isBlockDevice
    * - isCharacterDevice
    * - isSymbolicLink
    * - isFIFO
    * - isSocket
    *
    * or a function that is passed the matched src filepath and returns true or false.
    *
    * string
    * (src: string) => boolean
    */
  // filter?: string
  // filter?: (src: string) => boolean
  var filter: js.UndefOr[js.Any] = js.native
  
  /**
    * Pattern(s) to match, relative to the {@link IExpandedFilesConfig.cwd}.
    */
  var src: js.UndefOr[js.Array[String]] = js.native
}
object IFilesConfig {
  
  @scala.inline
  def apply(): IFilesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilesConfig]
  }
  
  @scala.inline
  implicit class IFilesConfigOps[Self <: IFilesConfig] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
