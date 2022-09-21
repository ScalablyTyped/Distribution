package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInAppPurchasesFound extends StObject {
  
  /**
    * The total number of in-app purchases flows explored: how many times the robo tries to buy a SKU.
    */
  var inAppPurchasesFlowsExplored: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of in-app purchases flows started.
    */
  var inAppPurchasesFlowsStarted: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInAppPurchasesFound {
  
  inline def apply(): SchemaInAppPurchasesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInAppPurchasesFound]
  }
  
  extension [Self <: SchemaInAppPurchasesFound](x: Self) {
    
    inline def setInAppPurchasesFlowsExplored(value: Double): Self = StObject.set(x, "inAppPurchasesFlowsExplored", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchasesFlowsExploredNull: Self = StObject.set(x, "inAppPurchasesFlowsExplored", null)
    
    inline def setInAppPurchasesFlowsExploredUndefined: Self = StObject.set(x, "inAppPurchasesFlowsExplored", js.undefined)
    
    inline def setInAppPurchasesFlowsStarted(value: Double): Self = StObject.set(x, "inAppPurchasesFlowsStarted", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchasesFlowsStartedNull: Self = StObject.set(x, "inAppPurchasesFlowsStarted", null)
    
    inline def setInAppPurchasesFlowsStartedUndefined: Self = StObject.set(x, "inAppPurchasesFlowsStarted", js.undefined)
  }
}
