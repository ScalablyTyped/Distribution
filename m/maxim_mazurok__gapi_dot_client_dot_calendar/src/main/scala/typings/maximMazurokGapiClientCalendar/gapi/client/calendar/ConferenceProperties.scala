package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceProperties extends js.Object {
  
  /**
    * The types of conference solutions that are supported for this calendar.
    * The possible values are:
    * - "eventHangout"
    * - "eventNamedHangout"
    * - "hangoutsMeet"  Optional.
    */
  var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
}
object ConferenceProperties {
  
  @scala.inline
  def apply(): ConferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProperties]
  }
  
  @scala.inline
  implicit class ConferencePropertiesOps[Self <: ConferenceProperties] (val x: Self) extends AnyVal {
    
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
    def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = this.set("allowedConferenceSolutionTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = this.set("allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedConferenceSolutionTypes: Self = this.set("allowedConferenceSolutionTypes", js.undefined)
  }
}
