package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerformedMonkeyActions extends StObject {
  
  /**
    * The total number of monkey actions performed during the crawl.
    */
  var totalActions: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPerformedMonkeyActions {
  
  inline def apply(): SchemaPerformedMonkeyActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformedMonkeyActions]
  }
  
  extension [Self <: SchemaPerformedMonkeyActions](x: Self) {
    
    inline def setTotalActions(value: Double): Self = StObject.set(x, "totalActions", value.asInstanceOf[js.Any])
    
    inline def setTotalActionsNull: Self = StObject.set(x, "totalActions", null)
    
    inline def setTotalActionsUndefined: Self = StObject.set(x, "totalActions", js.undefined)
  }
}
