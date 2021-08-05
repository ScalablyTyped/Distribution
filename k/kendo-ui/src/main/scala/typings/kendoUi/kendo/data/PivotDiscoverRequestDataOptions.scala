package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDiscoverRequestDataOptions extends StObject {
  
  var command: String
  
  var restrictions: PivotDiscoverRequestRestrictionOptions
}
object PivotDiscoverRequestDataOptions {
  
  inline def apply(command: String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
  
  extension [Self <: PivotDiscoverRequestDataOptions](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: PivotDiscoverRequestRestrictionOptions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
  }
}
