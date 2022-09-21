package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMatcher extends StObject {
  
  /**
    * If specified, at least one of the values in the list must match the value specified.
    */
  var oneOf: js.UndefOr[SchemaValueMatcher] = js.undefined
}
object SchemaListMatcher {
  
  inline def apply(): SchemaListMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMatcher]
  }
  
  extension [Self <: SchemaListMatcher](x: Self) {
    
    inline def setOneOf(value: SchemaValueMatcher): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
  }
}
