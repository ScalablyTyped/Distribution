package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentLabelEntry extends StObject {
  
  /** Key of the label */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value of the label */
  var value: js.UndefOr[String] = js.undefined
}
object DeploymentLabelEntry {
  
  @scala.inline
  def apply(): DeploymentLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentLabelEntry]
  }
  
  @scala.inline
  implicit class DeploymentLabelEntryMutableBuilder[Self <: DeploymentLabelEntry] (val x: Self) extends AnyVal {
    
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
