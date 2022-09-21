package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironment extends StObject {
  
  var customValues: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setCustomValues(value: StringDictionary[String]): Self = StObject.set(x, "customValues", value.asInstanceOf[js.Any])
    
    inline def setCustomValuesNull: Self = StObject.set(x, "customValues", null)
    
    inline def setCustomValuesUndefined: Self = StObject.set(x, "customValues", js.undefined)
  }
}
