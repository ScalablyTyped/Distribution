package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStopBackfillJobResponse extends StObject {
  
  /**
    * The stream object resource the backfill job was stopped for.
    */
  var `object`: js.UndefOr[SchemaStreamObject] = js.undefined
}
object SchemaStopBackfillJobResponse {
  
  inline def apply(): SchemaStopBackfillJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStopBackfillJobResponse]
  }
  
  extension [Self <: SchemaStopBackfillJobResponse](x: Self) {
    
    inline def setObject(value: SchemaStreamObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
