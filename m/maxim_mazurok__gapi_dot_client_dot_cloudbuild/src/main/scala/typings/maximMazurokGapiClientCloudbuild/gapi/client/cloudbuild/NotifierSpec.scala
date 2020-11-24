package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierSpec extends js.Object {
  
  /** The configuration of this particular notifier. */
  var notification: js.UndefOr[Notification] = js.native
  
  /** Configurations for secret resources used by this particular notifier. */
  var secrets: js.UndefOr[js.Array[NotifierSecret]] = js.native
}
object NotifierSpec {
  
  @scala.inline
  def apply(): NotifierSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSpec]
  }
  
  @scala.inline
  implicit class NotifierSpecOps[Self <: NotifierSpec] (val x: Self) extends AnyVal {
    
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
    def setNotification(value: Notification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: NotifierSecret*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[NotifierSecret]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecrets: Self = this.set("secrets", js.undefined)
  }
}
