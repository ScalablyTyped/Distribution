package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoLiteActivityDefaultOptions extends js.Object {
  
  var activityClass: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var inactiveClass: js.UndefOr[String] = js.native
}
object KoLiteActivityDefaultOptions {
  
  @scala.inline
  def apply(): KoLiteActivityDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KoLiteActivityDefaultOptions]
  }
  
  @scala.inline
  implicit class KoLiteActivityDefaultOptionsOps[Self <: KoLiteActivityDefaultOptions] (val x: Self) extends AnyVal {
    
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
    def setActivityClass(value: String): Self = this.set("activityClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityClass: Self = this.set("activityClass", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setInactiveClass(value: String): Self = this.set("inactiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveClass: Self = this.set("inactiveClass", js.undefined)
  }
}
