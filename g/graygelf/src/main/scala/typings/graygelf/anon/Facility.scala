package typings.graygelf.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Facility
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  
  /**
    * Suggested property - facility can be the app name.
    */
  var facility: js.UndefOr[String] = js.native
}
object Facility {
  
  @scala.inline
  def apply(): Facility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facility]
  }
  
  @scala.inline
  implicit class FacilityOps[Self <: Facility] (val x: Self) extends AnyVal {
    
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
    def setFacility(value: String): Self = this.set("facility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacility: Self = this.set("facility", js.undefined)
  }
}
