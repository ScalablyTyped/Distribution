package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLastModifiedInfo extends StObject {
  
  /**
    * Timestamp of the last change in milliseconds since epoch.
    */
  var time: js.UndefOr[String | Null] = js.undefined
}
object SchemaLastModifiedInfo {
  
  inline def apply(): SchemaLastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLastModifiedInfo]
  }
  
  extension [Self <: SchemaLastModifiedInfo](x: Self) {
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
