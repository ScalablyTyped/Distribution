package typings.maximMazurokGapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationName extends js.Object {
  
  /** Application name to which the event belongs. For possible values see the list of applications above in applicationName. */
  var applicationName: js.UndefOr[String] = js.native
  
  /** The unique identifier for a G suite account. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Time of occurrence of the activity. This is in UNIX epoch time in seconds. */
  var time: js.UndefOr[String] = js.native
  
  /** Unique qualifier if multiple events have the same time. */
  var uniqueQualifier: js.UndefOr[String] = js.native
}
object ApplicationName {
  
  @scala.inline
  def apply(): ApplicationName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationName]
  }
  
  @scala.inline
  implicit class ApplicationNameOps[Self <: ApplicationName] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setUniqueQualifier(value: String): Self = this.set("uniqueQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueQualifier: Self = this.set("uniqueQualifier", js.undefined)
  }
}
