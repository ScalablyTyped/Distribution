package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateFamilyConfig extends StObject {
  
  /** If true, this family corresponds to a read operation. */
  var isRead: js.UndefOr[Boolean] = js.undefined
  
  /** The state family value. */
  var stateFamily: js.UndefOr[String] = js.undefined
}
object StateFamilyConfig {
  
  @scala.inline
  def apply(): StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateFamilyConfig]
  }
  
  @scala.inline
  implicit class StateFamilyConfigMutableBuilder[Self <: StateFamilyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRead(value: Boolean): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadUndefined: Self = StObject.set(x, "isRead", js.undefined)
    
    @scala.inline
    def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
  }
}
