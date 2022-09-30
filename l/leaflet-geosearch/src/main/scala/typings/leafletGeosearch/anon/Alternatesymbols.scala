package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternatesymbols extends StObject {
  
  var alternate_symbols: js.Array[String]
  
  var decimal_mark: String
  
  var html_entity: String
  
  var iso_code: String
  
  var iso_numeric: String
  
  var name: String
  
  var smallest_denomination: Double
  
  var subunit: String
  
  var subunit_to_unit: Double
  
  var symbol: String
  
  var symbol_first: Double
  
  var thousands_separator: String
}
object Alternatesymbols {
  
  inline def apply(
    alternate_symbols: js.Array[String],
    decimal_mark: String,
    html_entity: String,
    iso_code: String,
    iso_numeric: String,
    name: String,
    smallest_denomination: Double,
    subunit: String,
    subunit_to_unit: Double,
    symbol: String,
    symbol_first: Double,
    thousands_separator: String
  ): Alternatesymbols = {
    val __obj = js.Dynamic.literal(alternate_symbols = alternate_symbols.asInstanceOf[js.Any], decimal_mark = decimal_mark.asInstanceOf[js.Any], html_entity = html_entity.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], iso_numeric = iso_numeric.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], smallest_denomination = smallest_denomination.asInstanceOf[js.Any], subunit = subunit.asInstanceOf[js.Any], subunit_to_unit = subunit_to_unit.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbol_first = symbol_first.asInstanceOf[js.Any], thousands_separator = thousands_separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatesymbols]
  }
  
  extension [Self <: Alternatesymbols](x: Self) {
    
    inline def setAlternate_symbols(value: js.Array[String]): Self = StObject.set(x, "alternate_symbols", value.asInstanceOf[js.Any])
    
    inline def setAlternate_symbolsVarargs(value: String*): Self = StObject.set(x, "alternate_symbols", js.Array(value*))
    
    inline def setDecimal_mark(value: String): Self = StObject.set(x, "decimal_mark", value.asInstanceOf[js.Any])
    
    inline def setHtml_entity(value: String): Self = StObject.set(x, "html_entity", value.asInstanceOf[js.Any])
    
    inline def setIso_code(value: String): Self = StObject.set(x, "iso_code", value.asInstanceOf[js.Any])
    
    inline def setIso_numeric(value: String): Self = StObject.set(x, "iso_numeric", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSmallest_denomination(value: Double): Self = StObject.set(x, "smallest_denomination", value.asInstanceOf[js.Any])
    
    inline def setSubunit(value: String): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunit_to_unit(value: Double): Self = StObject.set(x, "subunit_to_unit", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol_first(value: Double): Self = StObject.set(x, "symbol_first", value.asInstanceOf[js.Any])
    
    inline def setThousands_separator(value: String): Self = StObject.set(x, "thousands_separator", value.asInstanceOf[js.Any])
  }
}
