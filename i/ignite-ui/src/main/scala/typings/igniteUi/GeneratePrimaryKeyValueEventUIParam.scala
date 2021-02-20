package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratePrimaryKeyValueEventUIParam extends StObject {
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the auto-generated primary key (the number of records in the data source + 1) or set a custom unique primary key for the new row.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object GeneratePrimaryKeyValueEventUIParam {
  
  @scala.inline
  def apply(): GeneratePrimaryKeyValueEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratePrimaryKeyValueEventUIParam]
  }
  
  @scala.inline
  implicit class GeneratePrimaryKeyValueEventUIParamMutableBuilder[Self <: GeneratePrimaryKeyValueEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
