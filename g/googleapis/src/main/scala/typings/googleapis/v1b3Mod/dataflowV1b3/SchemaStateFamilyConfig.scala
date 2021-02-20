package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * State family configuration.
  */
@js.native
trait SchemaStateFamilyConfig extends StObject {
  
  /**
    * If true, this family corresponds to a read operation.
    */
  var isRead: js.UndefOr[Boolean] = js.native
  
  /**
    * The state family value.
    */
  var stateFamily: js.UndefOr[String] = js.native
}
object SchemaStateFamilyConfig {
  
  @scala.inline
  def apply(): SchemaStateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateFamilyConfig]
  }
  
  @scala.inline
  implicit class SchemaStateFamilyConfigMutableBuilder[Self <: SchemaStateFamilyConfig] (val x: Self) extends AnyVal {
    
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
