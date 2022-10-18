package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.`case`
import typings.maplibreGl.maplibreGlStrings.accent
import typings.maplibreGl.maplibreGlStrings.base
import typings.maplibreGl.maplibreGlStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collator
  extends StObject
     with _Value {
  
  var collator: IntlCollator
  
  def compare(lhs: String, rhs: String): Double
  
  var locale: String | Null
  
  def resolvedLocale(): String
  
  var sensitivity: base | accent | `case` | variant
}
object Collator {
  
  inline def apply(
    collator: IntlCollator,
    compare: (String, String) => Double,
    resolvedLocale: () => String,
    sensitivity: base | accent | `case` | variant
  ): Collator = {
    val __obj = js.Dynamic.literal(collator = collator.asInstanceOf[js.Any], compare = js.Any.fromFunction2(compare), resolvedLocale = js.Any.fromFunction0(resolvedLocale), sensitivity = sensitivity.asInstanceOf[js.Any], locale = null)
    __obj.asInstanceOf[Collator]
  }
  
  extension [Self <: Collator](x: Self) {
    
    inline def setCollator(value: IntlCollator): Self = StObject.set(x, "collator", value.asInstanceOf[js.Any])
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setResolvedLocale(value: () => String): Self = StObject.set(x, "resolvedLocale", js.Any.fromFunction0(value))
    
    inline def setSensitivity(value: base | accent | `case` | variant): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
  }
}
