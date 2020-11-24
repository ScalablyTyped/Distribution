package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsdocOptions extends js.Object {
  
  /**
    * The path to the jsdoc configuration file.
    *  Default: path/to/jsdoc/conf.json.
    */
  var configure: js.UndefOr[String] = js.native
  
  /**
    * One or more filenames to process.
    * Accepts globs (e.g. *.js). Either files, source or data must be supplied.
    */
  var files: String | js.Array[String] = js.native
  
  /**
    * By default results are cached to speed up repeat invocations.
    * Set to true to disable this.
    */
  var noCache: js.UndefOr[Boolean] = js.native
  
  /**
    * A string containing source code to process.
    * Either files, source or data must be supplied.
    */
  var source: js.UndefOr[String] = js.native
}
object JsdocOptions {
  
  @scala.inline
  def apply(files: String | js.Array[String]): JsdocOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsdocOptions]
  }
  
  @scala.inline
  implicit class JsdocOptionsOps[Self <: JsdocOptions] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigure(value: String): Self = this.set("configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
