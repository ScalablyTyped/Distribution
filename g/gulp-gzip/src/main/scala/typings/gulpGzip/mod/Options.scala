package typings.gulpGzip.mod

import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Appends .gz file extension if true.
    * @default true
    */
  var append: js.UndefOr[Boolean] = js.native
  
  /**
    * Appends an arbitrary extension to the filename. Disables append and preExtension options.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * Options object to pass through to zlib.Gzip.
    * See <a href='https://nodejs.org/api/zlib.html#zlib_options'>zlib</a> documentation for more information.
    */
  var gzipOptions: js.UndefOr[ZlibOptions] = js.native
  
  /**
    * Appends an arbitrary pre-extension to the filename. Disables append and extension options.
    */
  var preExtension: js.UndefOr[String] = js.native
  
  /**
    * Minimum size required to compress a file.
    * @default false
    */
  var threshold: js.UndefOr[Double | String | Boolean] = js.native
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setGzipOptions(value: ZlibOptions): Self = this.set("gzipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzipOptions: Self = this.set("gzipOptions", js.undefined)
    
    @scala.inline
    def setPreExtension(value: String): Self = this.set("preExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreExtension: Self = this.set("preExtension", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double | String | Boolean): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
