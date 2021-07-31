package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeFieldAssignment extends StObject {
  
  /** ID of the creative field. */
  var creativeFieldId: js.UndefOr[String] = js.undefined
  
  /** ID of the creative field value. */
  var creativeFieldValueId: js.UndefOr[String] = js.undefined
}
object CreativeFieldAssignment {
  
  @scala.inline
  def apply(): CreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldAssignment]
  }
  
  @scala.inline
  implicit class CreativeFieldAssignmentMutableBuilder[Self <: CreativeFieldAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFieldId(value: String): Self = StObject.set(x, "creativeFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldIdUndefined: Self = StObject.set(x, "creativeFieldId", js.undefined)
    
    @scala.inline
    def setCreativeFieldValueId(value: String): Self = StObject.set(x, "creativeFieldValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldValueIdUndefined: Self = StObject.set(x, "creativeFieldValueId", js.undefined)
  }
}
