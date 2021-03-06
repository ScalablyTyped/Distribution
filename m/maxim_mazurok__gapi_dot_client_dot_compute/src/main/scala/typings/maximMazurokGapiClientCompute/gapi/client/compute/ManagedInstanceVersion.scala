package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedInstanceVersion extends StObject {
  
  /** [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }. */
  var instanceTemplate: js.UndefOr[String] = js.native
  
  /** [Output Only] Name of the version. */
  var name: js.UndefOr[String] = js.native
}
object ManagedInstanceVersion {
  
  @scala.inline
  def apply(): ManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceVersion]
  }
  
  @scala.inline
  implicit class ManagedInstanceVersionMutableBuilder[Self <: ManagedInstanceVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
