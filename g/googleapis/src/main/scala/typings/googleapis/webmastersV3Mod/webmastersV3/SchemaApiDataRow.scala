package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiDataRow extends StObject {
  
  var clicks: js.UndefOr[Double | Null] = js.undefined
  
  var ctr: js.UndefOr[Double | Null] = js.undefined
  
  var impressions: js.UndefOr[Double | Null] = js.undefined
  
  var keys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var position: js.UndefOr[Double | Null] = js.undefined
}
object SchemaApiDataRow {
  
  inline def apply(): SchemaApiDataRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiDataRow]
  }
  
  extension [Self <: SchemaApiDataRow](x: Self) {
    
    inline def setClicks(value: Double): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setClicksNull: Self = StObject.set(x, "clicks", null)
    
    inline def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    inline def setCtr(value: Double): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
    
    inline def setCtrNull: Self = StObject.set(x, "ctr", null)
    
    inline def setCtrUndefined: Self = StObject.set(x, "ctr", js.undefined)
    
    inline def setImpressions(value: Double): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    inline def setImpressionsNull: Self = StObject.set(x, "impressions", null)
    
    inline def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
