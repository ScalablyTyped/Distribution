package typings.gulpUglify.mod

import typings.uglifyJs.mod.CompressOptions
import typings.uglifyJs.mod.MangleOptions
import typings.uglifyJs.mod.OutputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Pass an object to specify custom compressor options. Pass false to skip compression completely.
    */
  var compress: js.UndefOr[CompressOptions | Boolean] = js.native
  
  /**
    * Pass false to skip mangling names.
    */
  var mangle: js.UndefOr[MangleOptions | Boolean] = js.native
  
  /**
    * Pass if you wish to specify additional output options. The defaults are optimized for best compression.
    */
  var output: js.UndefOr[OutputOptions] = js.native
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
    def setCompress(value: CompressOptions | Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setMangle(value: MangleOptions | Boolean): Self = this.set("mangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMangle: Self = this.set("mangle", js.undefined)
    
    @scala.inline
    def setOutput(value: OutputOptions): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
