package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInfoTypeConfig extends StObject {
  
  var evaluateList: js.UndefOr[SchemaFilterList] = js.undefined
  
  var ignoreList: js.UndefOr[SchemaFilterList] = js.undefined
  
  /**
    * If `TRUE`, infoTypes described by `filter` are used for evaluation. Otherwise, infoTypes are not considered for evaluation. For example: * Annotated text: "Toronto is a location" * Finding 1: `{"infoType": "PERSON", "quote": "Toronto", "start": 0, "end": 7\}` * Finding 2: `{"infoType": "CITY", "quote": "Toronto", "start": 0, "end": 7\}` * Finding 3: `{\}` * Ground truth: `{"infoType": "LOCATION", "quote": "Toronto", "start": 0, "end": 7\}` When `strict_matching` is `TRUE`: * Finding 1: 1 false positive * Finding 2: 1 false positive * Finding 3: 1 false negative When `strict_matching` is `FALSE`: * Finding 1: 1 true positive * Finding 2: 1 true positive * Finding 3: 1 false negative
    */
  var strictMatching: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInfoTypeConfig {
  
  inline def apply(): SchemaInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInfoTypeConfig]
  }
  
  extension [Self <: SchemaInfoTypeConfig](x: Self) {
    
    inline def setEvaluateList(value: SchemaFilterList): Self = StObject.set(x, "evaluateList", value.asInstanceOf[js.Any])
    
    inline def setEvaluateListUndefined: Self = StObject.set(x, "evaluateList", js.undefined)
    
    inline def setIgnoreList(value: SchemaFilterList): Self = StObject.set(x, "ignoreList", value.asInstanceOf[js.Any])
    
    inline def setIgnoreListUndefined: Self = StObject.set(x, "ignoreList", js.undefined)
    
    inline def setStrictMatching(value: Boolean): Self = StObject.set(x, "strictMatching", value.asInstanceOf[js.Any])
    
    inline def setStrictMatchingNull: Self = StObject.set(x, "strictMatching", null)
    
    inline def setStrictMatchingUndefined: Self = StObject.set(x, "strictMatching", js.undefined)
  }
}
