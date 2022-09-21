package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpellResult extends StObject {
  
  /**
    * The suggested spelling of the query.
    */
  var suggestedQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpellResult {
  
  inline def apply(): SchemaSpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellResult]
  }
  
  extension [Self <: SchemaSpellResult](x: Self) {
    
    inline def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    inline def setSuggestedQueryNull: Self = StObject.set(x, "suggestedQuery", null)
    
    inline def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
