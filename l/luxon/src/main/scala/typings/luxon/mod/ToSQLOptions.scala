package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToSQLOptions extends StObject {
  
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  
  var includeZone: js.UndefOr[Boolean] = js.undefined
}
object ToSQLOptions {
  
  inline def apply(): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToSQLOptions]
  }
  
  extension [Self <: ToSQLOptions](x: Self) {
    
    inline def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    inline def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
    
    inline def setIncludeZone(value: Boolean): Self = StObject.set(x, "includeZone", value.asInstanceOf[js.Any])
    
    inline def setIncludeZoneUndefined: Self = StObject.set(x, "includeZone", js.undefined)
  }
}
