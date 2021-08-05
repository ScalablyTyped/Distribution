package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number format of a cell.
  */
trait SchemaNumberFormat extends StObject {
  
  /**
    * Pattern string used for formatting.  If not set, a default pattern based
    * on the user&#39;s locale will be used if necessary for the given type.
    * See the [Date and Number Formats guide](/sheets/api/guides/formats) for
    * more information about the supported patterns.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the number format. When writing, this field must be set.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaNumberFormat {
  
  inline def apply(): SchemaNumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumberFormat]
  }
  
  extension [Self <: SchemaNumberFormat](x: Self) {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
