package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentUpdateLabelEntry extends StObject {
  
  /** Key of the label */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value of the label */
  var value: js.UndefOr[String] = js.undefined
}
object DeploymentUpdateLabelEntry {
  
  inline def apply(): DeploymentUpdateLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentUpdateLabelEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentUpdateLabelEntry] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
