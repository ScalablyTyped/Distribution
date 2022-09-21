package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdUnitAdCode extends StObject {
  
  /**
    * Output only. The code snippet to add to the body of an HTML page.
    */
  var adCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdUnitAdCode {
  
  inline def apply(): SchemaAdUnitAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdUnitAdCode]
  }
  
  extension [Self <: SchemaAdUnitAdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeNull: Self = StObject.set(x, "adCode", null)
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
  }
}
