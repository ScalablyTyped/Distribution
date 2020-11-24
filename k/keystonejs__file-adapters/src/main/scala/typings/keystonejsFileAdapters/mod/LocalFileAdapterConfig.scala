package typings.keystonejsFileAdapters.mod

import typings.keystonejsFileAdapters.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalFileAdapterConfig extends js.Object {
  
  var getFilename: js.UndefOr[js.Function1[/* options */ Id, String]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var src: String = js.native
}
object LocalFileAdapterConfig {
  
  @scala.inline
  def apply(src: String): LocalFileAdapterConfig = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalFileAdapterConfig]
  }
  
  @scala.inline
  implicit class LocalFileAdapterConfigOps[Self <: LocalFileAdapterConfig] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilename(value: /* options */ Id => String): Self = this.set("getFilename", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFilename: Self = this.set("getFilename", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
