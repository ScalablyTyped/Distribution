package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeGroupAssignment extends StObject {
  
  /** ID of the creative group to be assigned. */
  var creativeGroupId: js.UndefOr[String] = js.native
  
  /** Creative group number of the creative group assignment. */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}
object CreativeGroupAssignment {
  
  @scala.inline
  def apply(): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
  
  @scala.inline
  implicit class CreativeGroupAssignmentMutableBuilder[Self <: CreativeGroupAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeGroupId(value: String): Self = StObject.set(x, "creativeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupIdUndefined: Self = StObject.set(x, "creativeGroupId", js.undefined)
    
    @scala.inline
    def setCreativeGroupNumber(value: String): Self = StObject.set(x, "creativeGroupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupNumberUndefined: Self = StObject.set(x, "creativeGroupNumber", js.undefined)
  }
}
