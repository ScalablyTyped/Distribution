package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentUpdateLabelEntry extends StObject {
  
  /** Key of the label */
  var key: js.UndefOr[String] = js.native
  
  /** Value of the label */
  var value: js.UndefOr[String] = js.native
}
object DeploymentUpdateLabelEntry {
  
  @scala.inline
  def apply(): DeploymentUpdateLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentUpdateLabelEntry]
  }
  
  @scala.inline
  implicit class DeploymentUpdateLabelEntryMutableBuilder[Self <: DeploymentUpdateLabelEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
