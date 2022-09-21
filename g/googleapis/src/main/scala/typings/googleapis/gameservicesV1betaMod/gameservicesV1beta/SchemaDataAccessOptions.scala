package typings.googleapis.gameservicesV1betaMod.gameservicesV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataAccessOptions extends StObject {
  
  var logMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataAccessOptions {
  
  inline def apply(): SchemaDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataAccessOptions]
  }
  
  extension [Self <: SchemaDataAccessOptions](x: Self) {
    
    inline def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    inline def setLogModeNull: Self = StObject.set(x, "logMode", null)
    
    inline def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
