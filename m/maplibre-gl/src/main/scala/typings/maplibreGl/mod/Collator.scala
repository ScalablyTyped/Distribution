package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.`case`
import typings.maplibreGl.maplibreGlStrings.accent
import typings.maplibreGl.maplibreGlStrings.base
import typings.maplibreGl.maplibreGlStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Collator")
@js.native
open class Collator protected ()
  extends StObject
     with _Value {
  def this(caseSensitive: Boolean, diacriticSensitive: Boolean) = this()
  def this(caseSensitive: Boolean, diacriticSensitive: Boolean, locale: String) = this()
  
  var collator: IntlCollator = js.native
  
  def compare(lhs: String, rhs: String): Double = js.native
  
  var locale: String | Null = js.native
  
  def resolvedLocale(): String = js.native
  
  var sensitivity: base | accent | `case` | variant = js.native
}
