package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAllTextResponse extends StObject {
  
  /**
    * The number of occurrences changed by replacing all text.
    */
  var occurrencesChanged: js.UndefOr[Double | Null] = js.undefined
}
object SchemaReplaceAllTextResponse {
  
  inline def apply(): SchemaReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextResponse]
  }
  
  extension [Self <: SchemaReplaceAllTextResponse](x: Self) {
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedNull: Self = StObject.set(x, "occurrencesChanged", null)
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
