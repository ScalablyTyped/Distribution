package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLabelsResponse extends StObject {
  
  /**
    * List of labels.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
}
object SchemaListLabelsResponse {
  
  inline def apply(): SchemaListLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLabelsResponse]
  }
  
  extension [Self <: SchemaListLabelsResponse](x: Self) {
    
    inline def setLabels(value: js.Array[SchemaLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
