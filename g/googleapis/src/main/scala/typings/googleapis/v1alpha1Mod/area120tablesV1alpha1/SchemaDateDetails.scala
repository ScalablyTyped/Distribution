package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateDetails extends StObject {
  
  /**
    * Whether the date column includes time.
    */
  var hasTime: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDateDetails {
  
  inline def apply(): SchemaDateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateDetails]
  }
  
  extension [Self <: SchemaDateDetails](x: Self) {
    
    inline def setHasTime(value: Boolean): Self = StObject.set(x, "hasTime", value.asInstanceOf[js.Any])
    
    inline def setHasTimeNull: Self = StObject.set(x, "hasTime", null)
    
    inline def setHasTimeUndefined: Self = StObject.set(x, "hasTime", js.undefined)
  }
}
