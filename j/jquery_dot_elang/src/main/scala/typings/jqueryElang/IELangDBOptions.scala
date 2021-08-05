package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELang database (LocalStorage) functionality with Singleton instance
trait IELangDBOptions extends StObject {
  
  var autocompleteRows: Double
}
object IELangDBOptions {
  
  inline def apply(autocompleteRows: Double): IELangDBOptions = {
    val __obj = js.Dynamic.literal(autocompleteRows = autocompleteRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBOptions]
  }
  
  extension [Self <: IELangDBOptions](x: Self) {
    
    inline def setAutocompleteRows(value: Double): Self = StObject.set(x, "autocompleteRows", value.asInstanceOf[js.Any])
  }
}
