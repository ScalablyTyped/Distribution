package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List triggers response.
  */
@js.native
trait SchemaListTriggersResponse extends StObject {
  
  /**
    * All GTM Triggers of a GTM Container.
    */
  var triggers: js.UndefOr[js.Array[SchemaTrigger]] = js.native
}
object SchemaListTriggersResponse {
  
  @scala.inline
  def apply(): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
  
  @scala.inline
  implicit class SchemaListTriggersResponseMutableBuilder[Self <: SchemaListTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggers(value: js.Array[SchemaTrigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    @scala.inline
    def setTriggersVarargs(value: SchemaTrigger*): Self = StObject.set(x, "triggers", js.Array(value :_*))
  }
}
