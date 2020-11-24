package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierMetadata extends js.Object {
  
  /** The human-readable and user-given name for the notifier. For example: "repo-merge-email-notifier". */
  var name: js.UndefOr[String] = js.native
  
  /** The string representing the name and version of notifier to deploy. Expected to be of the form of "/:". For example: "gcr.io/my-project/notifiers/smtp:1.2.34". */
  var notifier: js.UndefOr[String] = js.native
}
object NotifierMetadata {
  
  @scala.inline
  def apply(): NotifierMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierMetadata]
  }
  
  @scala.inline
  implicit class NotifierMetadataOps[Self <: NotifierMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotifier(value: String): Self = this.set("notifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifier: Self = this.set("notifier", js.undefined)
  }
}
