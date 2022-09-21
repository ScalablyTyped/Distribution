package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeLabels extends StObject {
  
  /**
    * Map of node label keys and node label values.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaNodeLabels {
  
  inline def apply(): SchemaNodeLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeLabels]
  }
  
  extension [Self <: SchemaNodeLabels](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
