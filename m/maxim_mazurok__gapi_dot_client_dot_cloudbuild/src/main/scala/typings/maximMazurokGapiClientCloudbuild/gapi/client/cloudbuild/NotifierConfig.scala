package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierConfig extends js.Object {
  
  /** The API version of this configuration format. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** The type of notifier to use (e.g. SMTPNotifier). */
  var kind: js.UndefOr[String] = js.native
  
  /** Metadata for referring to/handling/deploying this notifier. */
  var metadata: js.UndefOr[NotifierMetadata] = js.native
  
  /** The actual configuration for this notifier. */
  var spec: js.UndefOr[NotifierSpec] = js.native
}
object NotifierConfig {
  
  @scala.inline
  def apply(): NotifierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierConfig]
  }
  
  @scala.inline
  implicit class NotifierConfigOps[Self <: NotifierConfig] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: NotifierMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: NotifierSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
