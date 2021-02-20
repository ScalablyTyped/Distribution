package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotDiscoverRequestDataOptions extends StObject {
  
  var command: String = js.native
  
  var restrictions: PivotDiscoverRequestRestrictionOptions = js.native
}
object PivotDiscoverRequestDataOptions {
  
  @scala.inline
  def apply(command: String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
  
  @scala.inline
  implicit class PivotDiscoverRequestDataOptionsMutableBuilder[Self <: PivotDiscoverRequestDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictions(value: PivotDiscoverRequestRestrictionOptions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
  }
}
