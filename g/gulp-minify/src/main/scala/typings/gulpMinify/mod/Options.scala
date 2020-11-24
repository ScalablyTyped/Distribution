package typings.gulpMinify.mod

import typings.gulpMinify.anon.Asciionly
import typings.gulpMinify.anon.Booleans
import typings.gulpMinify.anon.Min
import typings.gulpMinify.gulpMinifyStrings.all
import typings.gulpMinify.gulpMinifyStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[Booleans | Boolean] = js.native
  
  /**
    * Will not minify files in the dirs.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An object that specifies output src and minified file extensions.
    */
  var ext: js.UndefOr[Min] = js.native
  
  /**
    * Will not minify files which matches the pattern.
    */
  var ignoreFiles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, will mangle variable names.
    */
  var mangle: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, will not output the source code in the dest dirs.
    */
  var noSource: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass an object if you wish to specify additional output options.The defaults are optimized for best compression.
    */
  var output: js.UndefOr[Asciionly] = js.native
  
  /**
    * A convenience option for options.output.comments. Defaults to preserving no comments.
    *
    * * **all**: Preserve all comments in code blocks.
    *
    * * **some**: preserve comments that start with a bang(!) or include a Closure Compiler directive(@preserve, @license, @cc_on).
    *
    * * **function**: specify your own comment preservation function. You will be passed the current node and the current comment and are expected to return a boolean.
    */
  var preserveComments: js.UndefOr[
    all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCompress(value: Booleans | Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExt(value: Min): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setIgnoreFilesVarargs(value: String*): Self = this.set("ignoreFiles", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreFiles(value: js.Array[String]): Self = this.set("ignoreFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFiles: Self = this.set("ignoreFiles", js.undefined)
    
    @scala.inline
    def setMangle(value: Boolean): Self = this.set("mangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    
    @scala.inline
    def setNoSource(value: Boolean): Self = this.set("noSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSource: Self = this.set("noSource", js.undefined)
    
    @scala.inline
    def setOutput(value: Asciionly): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPreserveCommentsFunction2(value: (/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any]) => Boolean): Self = this.set("preserveComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPreserveComments(
      value: all | some | (js.Function2[/* node */ js.UndefOr[js.Any], /* comment */ js.UndefOr[js.Any], Boolean])
    ): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
  }
}
