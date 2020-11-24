package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePattern extends js.Object {
  
  /**
    * @default true
    * @description Should the files be included in the browser using <script> tag? Use false if you want to
    * load them manually, eg. using Require.js.
    */
  var included: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    * @description Should the files be served from disk on each request by Karma's webserver?
    */
  var nocache: js.UndefOr[Boolean] = js.native
  
  /**
    * The pattern to use for matching.
    */
  var pattern: String = js.native
  
  /**
    * @default true
    * @description Should the files be served by Karma's webserver?
    */
  var served: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose the type to use when including a file
    * @default 'js'
    * @description  The type determines the mechanism for including the file.
    * The css and html types create link elements; the js, dart, and module elements create script elements.
    * The dom type includes the file content in the page, used, for example, to test components combining HTML and JS.
    */
  var `type`: js.UndefOr[FilePatternTypes] = js.native
  
  /**
    * @default true
    * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
    * for changes.
    */
  var watched: js.UndefOr[Boolean] = js.native
}
object FilePattern {
  
  @scala.inline
  def apply(pattern: String): FilePattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePattern]
  }
  
  @scala.inline
  implicit class FilePatternOps[Self <: FilePattern] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    
    @scala.inline
    def setNocache(value: Boolean): Self = this.set("nocache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocache: Self = this.set("nocache", js.undefined)
    
    @scala.inline
    def setServed(value: Boolean): Self = this.set("served", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServed: Self = this.set("served", js.undefined)
    
    @scala.inline
    def setType(value: FilePatternTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWatched(value: Boolean): Self = this.set("watched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatched: Self = this.set("watched", js.undefined)
  }
}
