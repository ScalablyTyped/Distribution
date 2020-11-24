package typings.lessMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compress extends js.Object {
  
  var compress: js.UndefOr[String] = js.native
  
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  var yuicompress: js.UndefOr[Boolean] = js.native
}
object Compress {
  
  @scala.inline
  def apply(): Compress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compress]
  }
  
  @scala.inline
  implicit class CompressOps[Self <: Compress] (val x: Self) extends AnyVal {
    
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
    def setCompress(value: String): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setYuicompress(value: Boolean): Self = this.set("yuicompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYuicompress: Self = this.set("yuicompress", js.undefined)
  }
}
