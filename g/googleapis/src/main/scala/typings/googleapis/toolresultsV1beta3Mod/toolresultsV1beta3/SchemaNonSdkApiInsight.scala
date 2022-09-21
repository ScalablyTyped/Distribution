package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonSdkApiInsight extends StObject {
  
  /**
    * Optional sample stack traces, for which this insight applies (there should be at least one).
    */
  var exampleTraceMessages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique ID, to be used for determining the effectiveness of this particular insight in the context of a matcher. (required)
    */
  var matcherId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An insight indicating that the hidden API usage originates from a Google-provided library.
    */
  var pendingGoogleUpdateInsight: js.UndefOr[SchemaPendingGoogleUpdateInsight] = js.undefined
  
  /**
    * An insight indicating that the hidden API usage originates from the use of a library that needs to be upgraded.
    */
  var upgradeInsight: js.UndefOr[SchemaUpgradeInsight] = js.undefined
}
object SchemaNonSdkApiInsight {
  
  inline def apply(): SchemaNonSdkApiInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonSdkApiInsight]
  }
  
  extension [Self <: SchemaNonSdkApiInsight](x: Self) {
    
    inline def setExampleTraceMessages(value: js.Array[String]): Self = StObject.set(x, "exampleTraceMessages", value.asInstanceOf[js.Any])
    
    inline def setExampleTraceMessagesNull: Self = StObject.set(x, "exampleTraceMessages", null)
    
    inline def setExampleTraceMessagesUndefined: Self = StObject.set(x, "exampleTraceMessages", js.undefined)
    
    inline def setExampleTraceMessagesVarargs(value: String*): Self = StObject.set(x, "exampleTraceMessages", js.Array(value*))
    
    inline def setMatcherId(value: String): Self = StObject.set(x, "matcherId", value.asInstanceOf[js.Any])
    
    inline def setMatcherIdNull: Self = StObject.set(x, "matcherId", null)
    
    inline def setMatcherIdUndefined: Self = StObject.set(x, "matcherId", js.undefined)
    
    inline def setPendingGoogleUpdateInsight(value: SchemaPendingGoogleUpdateInsight): Self = StObject.set(x, "pendingGoogleUpdateInsight", value.asInstanceOf[js.Any])
    
    inline def setPendingGoogleUpdateInsightUndefined: Self = StObject.set(x, "pendingGoogleUpdateInsight", js.undefined)
    
    inline def setUpgradeInsight(value: SchemaUpgradeInsight): Self = StObject.set(x, "upgradeInsight", value.asInstanceOf[js.Any])
    
    inline def setUpgradeInsightUndefined: Self = StObject.set(x, "upgradeInsight", js.undefined)
  }
}
