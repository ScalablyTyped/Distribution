package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldScore extends StObject {
  
  var fieldScore: PlaceName
  
  var queryScore: Double
}
object FieldScore {
  
  inline def apply(fieldScore: PlaceName, queryScore: Double): FieldScore = {
    val __obj = js.Dynamic.literal(fieldScore = fieldScore.asInstanceOf[js.Any], queryScore = queryScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScore]
  }
  
  extension [Self <: FieldScore](x: Self) {
    
    inline def setFieldScore(value: PlaceName): Self = StObject.set(x, "fieldScore", value.asInstanceOf[js.Any])
    
    inline def setQueryScore(value: Double): Self = StObject.set(x, "queryScore", value.asInstanceOf[js.Any])
  }
}
