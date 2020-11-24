package typings.logrocket.mod.LR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICaptureOptions extends js.Object {
  
  var extra: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  
  var tags: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
}
object ICaptureOptions {
  
  @scala.inline
  def apply(): ICaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICaptureOptions]
  }
  
  @scala.inline
  implicit class ICaptureOptionsOps[Self <: ICaptureOptions] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: StringDictionary[String | Double | Boolean]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String | Double | Boolean]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
