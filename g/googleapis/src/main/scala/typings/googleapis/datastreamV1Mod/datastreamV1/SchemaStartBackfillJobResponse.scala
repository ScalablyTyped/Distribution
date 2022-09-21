package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartBackfillJobResponse extends StObject {
  
  /**
    * The stream object resource a backfill job was started for.
    */
  var `object`: js.UndefOr[SchemaStreamObject] = js.undefined
}
object SchemaStartBackfillJobResponse {
  
  inline def apply(): SchemaStartBackfillJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartBackfillJobResponse]
  }
  
  extension [Self <: SchemaStartBackfillJobResponse](x: Self) {
    
    inline def setObject(value: SchemaStreamObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
