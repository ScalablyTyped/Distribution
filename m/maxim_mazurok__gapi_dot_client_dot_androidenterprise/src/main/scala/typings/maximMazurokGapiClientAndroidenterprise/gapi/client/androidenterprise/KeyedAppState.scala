package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedAppState extends js.Object {
  
  /** Additional field intended for machine-readable data. For example, a number or JSON object. To prevent XSS, we recommend removing any HTML from the data before displaying it. */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Key indicating what the app is providing a state for. The content of the key is set by the app's developer. To prevent XSS, we recommend removing any HTML from the key before
    * displaying it. This field will always be present.
    */
  var key: js.UndefOr[String] = js.native
  
  /** Free-form, human-readable message describing the app state. For example, an error message. To prevent XSS, we recommend removing any HTML from the message before displaying it. */
  var message: js.UndefOr[String] = js.native
  
  /** Severity of the app state. This field will always be present. */
  var severity: js.UndefOr[String] = js.native
  
  /** Timestamp of when the app set the state in milliseconds since epoch. This field will always be present. */
  var stateTimestampMillis: js.UndefOr[String] = js.native
}
object KeyedAppState {
  
  @scala.inline
  def apply(): KeyedAppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyedAppState]
  }
  
  @scala.inline
  implicit class KeyedAppStateOps[Self <: KeyedAppState] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setStateTimestampMillis(value: String): Self = this.set("stateTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateTimestampMillis: Self = this.set("stateTimestampMillis", js.undefined)
  }
}
