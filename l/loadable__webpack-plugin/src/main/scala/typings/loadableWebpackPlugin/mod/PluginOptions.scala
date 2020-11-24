package typings.loadableWebpackPlugin.mod

import typings.loadableWebpackPlugin.anon.Filename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginOptions extends js.Object {
  
  /**
    * The stats filename.
    *
    * @default loadable-stats.json
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * @default true
    */
  var outputAsset: js.UndefOr[Boolean] = js.native
  
  /**
    * Always write stats file to disk.
    *
    * @default false
    */
  var writeToDisk: js.UndefOr[Boolean | Filename] = js.native
}
object PluginOptions {
  
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setOutputAsset(value: Boolean): Self = this.set("outputAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputAsset: Self = this.set("outputAsset", js.undefined)
    
    @scala.inline
    def setWriteToDisk(value: Boolean | Filename): Self = this.set("writeToDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToDisk: Self = this.set("writeToDisk", js.undefined)
  }
}
