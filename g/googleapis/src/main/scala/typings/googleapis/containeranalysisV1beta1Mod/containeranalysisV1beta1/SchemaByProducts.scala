package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaByProducts extends StObject {
  
  var customValues: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaByProducts {
  
  inline def apply(): SchemaByProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaByProducts]
  }
  
  extension [Self <: SchemaByProducts](x: Self) {
    
    inline def setCustomValues(value: StringDictionary[String]): Self = StObject.set(x, "customValues", value.asInstanceOf[js.Any])
    
    inline def setCustomValuesNull: Self = StObject.set(x, "customValues", null)
    
    inline def setCustomValuesUndefined: Self = StObject.set(x, "customValues", js.undefined)
  }
}
