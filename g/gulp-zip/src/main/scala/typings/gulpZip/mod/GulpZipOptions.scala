package typings.gulpZip.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GulpZipOptions extends js.Object {
  
  /**
    * Compress
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.native
  
  /**
    * Overrides the modification timestamp for all files added to the archive.
    *
    * Tip: Setting it to the same value across executions enables you to create stable archives
    * that change only when the contents of their entries change, regardless of whether those
    * entries were "touched" or regenerated.
    *
    * @default undefined
    */
  var modifiedTime: js.UndefOr[Date] = js.native
}
object GulpZipOptions {
  
  @scala.inline
  def apply(): GulpZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GulpZipOptions]
  }
  
  @scala.inline
  implicit class GulpZipOptionsOps[Self <: GulpZipOptions] (val x: Self) extends AnyVal {
    
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
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: Date): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
  }
}
