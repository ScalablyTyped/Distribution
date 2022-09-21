package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValueMatcher extends StObject {
  
  /**
    * If specified, a match occurs if and only if the target value is a bool value and is equal to this field.
    */
  var boolMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If specified, a match occurs if and only if the target value is a double value and is matched to this field.
    */
  var doubleMatch: js.UndefOr[SchemaDoubleMatcher] = js.undefined
  
  /**
    * If specified, a match occurs if and only if the target value is a list value and is matched to this field.
    */
  var listMatch: js.UndefOr[SchemaListMatcher] = js.undefined
  
  /**
    * If specified, a match occurs if and only if the target value is a NullValue.
    */
  var nullMatch: js.UndefOr[SchemaNullMatch] = js.undefined
  
  /**
    * If specified, value match will be performed based on whether the path is referring to a valid primitive value in the metadata. If the path is referring to a non-primitive value, the result is always not matched.
    */
  var presentMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If specified, a match occurs if and only if the target value is a string value and is matched to this field.
    */
  var stringMatch: js.UndefOr[SchemaStringMatcher] = js.undefined
}
object SchemaValueMatcher {
  
  inline def apply(): SchemaValueMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueMatcher]
  }
  
  extension [Self <: SchemaValueMatcher](x: Self) {
    
    inline def setBoolMatch(value: Boolean): Self = StObject.set(x, "boolMatch", value.asInstanceOf[js.Any])
    
    inline def setBoolMatchNull: Self = StObject.set(x, "boolMatch", null)
    
    inline def setBoolMatchUndefined: Self = StObject.set(x, "boolMatch", js.undefined)
    
    inline def setDoubleMatch(value: SchemaDoubleMatcher): Self = StObject.set(x, "doubleMatch", value.asInstanceOf[js.Any])
    
    inline def setDoubleMatchUndefined: Self = StObject.set(x, "doubleMatch", js.undefined)
    
    inline def setListMatch(value: SchemaListMatcher): Self = StObject.set(x, "listMatch", value.asInstanceOf[js.Any])
    
    inline def setListMatchUndefined: Self = StObject.set(x, "listMatch", js.undefined)
    
    inline def setNullMatch(value: SchemaNullMatch): Self = StObject.set(x, "nullMatch", value.asInstanceOf[js.Any])
    
    inline def setNullMatchUndefined: Self = StObject.set(x, "nullMatch", js.undefined)
    
    inline def setPresentMatch(value: Boolean): Self = StObject.set(x, "presentMatch", value.asInstanceOf[js.Any])
    
    inline def setPresentMatchNull: Self = StObject.set(x, "presentMatch", null)
    
    inline def setPresentMatchUndefined: Self = StObject.set(x, "presentMatch", js.undefined)
    
    inline def setStringMatch(value: SchemaStringMatcher): Self = StObject.set(x, "stringMatch", value.asInstanceOf[js.Any])
    
    inline def setStringMatchUndefined: Self = StObject.set(x, "stringMatch", js.undefined)
  }
}
