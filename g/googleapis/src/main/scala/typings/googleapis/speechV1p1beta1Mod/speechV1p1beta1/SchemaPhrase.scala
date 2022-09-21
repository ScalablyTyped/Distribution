package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhrase extends StObject {
  
  /**
    * Hint Boost. Overrides the boost set at the phrase set level. Positive value will increase the probability that a specific phrase will be recognized over other similar sounding phrases. The higher the boost, the higher the chance of false positive recognition as well. Negative boost will simply be ignored. Though `boost` can accept a wide range of positive values, most use cases are best served with values between 0 and 20. We recommend using a binary search approach to finding the optimal value for your use case. Speech recognition will skip PhraseSets with a boost value of 0.
    */
  var boost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The phrase itself.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhrase {
  
  inline def apply(): SchemaPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhrase]
  }
  
  extension [Self <: SchemaPhrase](x: Self) {
    
    inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostNull: Self = StObject.set(x, "boost", null)
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
