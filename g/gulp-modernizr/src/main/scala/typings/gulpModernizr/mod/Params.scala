package typings.gulpModernizr.mod

import typings.gulpModernizr.anon.ClassPrefix
import typings.gulpModernizr.anon.Src
import typings.gulpModernizr.gulpModernizrBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  /**
    * Avoid unnecessary builds (see Caching section below)
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, will crawl your project for references to Modernizr tests
    * Set to false to disable
    */
  var crawl: js.UndefOr[Boolean] = js.native
  
  /**
    * Have custom Modernizr tests? Add them here.
    */
  var customTests: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Path to save out the built file
    */
  var dest: js.UndefOr[String | `false`] = js.native
  
  /**
    * Path to the build you're using for development.
    */
  var devFile: js.UndefOr[String | `false`] = js.native
  
  /**
    * Useful for excluding any tests that this tool will match
    * e.g. you use .notification class for notification elements,
    * but don’t want the test for Notification API
    */
  var excludeTests: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * By default, this task will crawl all *.js, *.css, *.scss files.
    */
  var files: js.UndefOr[Src] = js.native
  
  /**
    * Based on default settings on http://modernizr.com/download/
    */
  var options: js.UndefOr[ClassPrefix] = js.native
  
  /**
    * Define any tests you want to explicitly include
    */
  var tests: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * By default, source is uglified before saving
    */
  var uglify: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to pass in buffers via the "files" parameter below
    */
  var useBuffers: js.UndefOr[Boolean] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCrawl(value: Boolean): Self = this.set("crawl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawl: Self = this.set("crawl", js.undefined)
    
    @scala.inline
    def setCustomTestsVarargs(value: String*): Self = this.set("customTests", js.Array(value :_*))
    
    @scala.inline
    def setCustomTests(value: js.Array[String]): Self = this.set("customTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTests: Self = this.set("customTests", js.undefined)
    
    @scala.inline
    def setDest(value: String | `false`): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setDevFile(value: String | `false`): Self = this.set("devFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevFile: Self = this.set("devFile", js.undefined)
    
    @scala.inline
    def setExcludeTestsVarargs(value: String*): Self = this.set("excludeTests", js.Array(value :_*))
    
    @scala.inline
    def setExcludeTests(value: js.Array[String]): Self = this.set("excludeTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTests: Self = this.set("excludeTests", js.undefined)
    
    @scala.inline
    def setFiles(value: Src): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setOptions(value: ClassPrefix): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: String*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[String]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
    
    @scala.inline
    def setUglify(value: Boolean): Self = this.set("uglify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUglify: Self = this.set("uglify", js.undefined)
    
    @scala.inline
    def setUseBuffers(value: Boolean): Self = this.set("useBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBuffers: Self = this.set("useBuffers", js.undefined)
  }
}
