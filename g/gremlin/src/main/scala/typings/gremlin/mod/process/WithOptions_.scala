package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithOptions_ extends StObject {
  
  var all: Double
  
  var ids: Double
  
  var indexer: String
  
  var keys: Double
  
  var labels: Double
  
  var list: Double
  
  var map: Double
  
  var none: Double
  
  var tokens: String
  
  var values: Double
}
object WithOptions_ {
  
  inline def apply(
    all: Double,
    ids: Double,
    indexer: String,
    keys: Double,
    labels: Double,
    list: Double,
    map: Double,
    none: Double,
    tokens: String,
    values: Double
  ): WithOptions_ = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithOptions_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithOptions_] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setIds(value: Double): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIndexer(value: String): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Double): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Double): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setList(value: Double): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Double): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: String): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
