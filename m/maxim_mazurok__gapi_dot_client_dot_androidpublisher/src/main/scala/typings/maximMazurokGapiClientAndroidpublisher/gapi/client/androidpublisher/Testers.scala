package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Testers extends js.Object {
  
  /** All testing Google Groups, as email addresses. */
  var googleGroups: js.UndefOr[js.Array[String]] = js.native
}
object Testers {
  
  @scala.inline
  def apply(): Testers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Testers]
  }
  
  @scala.inline
  implicit class TestersOps[Self <: Testers] (val x: Self) extends AnyVal {
    
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
    def setGoogleGroupsVarargs(value: String*): Self = this.set("googleGroups", js.Array(value :_*))
    
    @scala.inline
    def setGoogleGroups(value: js.Array[String]): Self = this.set("googleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleGroups: Self = this.set("googleGroups", js.undefined)
  }
}
