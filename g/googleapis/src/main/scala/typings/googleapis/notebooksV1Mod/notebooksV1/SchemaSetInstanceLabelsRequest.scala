package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetInstanceLabelsRequest extends StObject {
  
  /**
    * Labels to apply to this instance. These can be later modified by the setLabels method
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaSetInstanceLabelsRequest {
  
  inline def apply(): SchemaSetInstanceLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetInstanceLabelsRequest]
  }
  
  extension [Self <: SchemaSetInstanceLabelsRequest](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
