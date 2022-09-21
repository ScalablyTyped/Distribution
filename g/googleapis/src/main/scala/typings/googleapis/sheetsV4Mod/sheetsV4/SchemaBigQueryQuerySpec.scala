package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryQuerySpec extends StObject {
  
  /**
    * The raw query string.
    */
  var rawQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaBigQueryQuerySpec {
  
  inline def apply(): SchemaBigQueryQuerySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryQuerySpec]
  }
  
  extension [Self <: SchemaBigQueryQuerySpec](x: Self) {
    
    inline def setRawQuery(value: String): Self = StObject.set(x, "rawQuery", value.asInstanceOf[js.Any])
    
    inline def setRawQueryNull: Self = StObject.set(x, "rawQuery", null)
    
    inline def setRawQueryUndefined: Self = StObject.set(x, "rawQuery", js.undefined)
  }
}
