package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`geometry-type`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`heatmap-density`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`line-progress`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.accumulated
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.id
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ln2
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.pi
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.properties
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.zoom
import typings.maplibreMaplibreGlStyleSpec.mod.ExpressionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Casesensitive extends StObject {
  
  var `case-sensitive`: js.UndefOr[Boolean | ExpressionSpecification] = js.undefined
  
  var `diacritic-sensitive`: js.UndefOr[Boolean | ExpressionSpecification] = js.undefined
  
  var locale: js.UndefOr[String | ExpressionSpecification] = js.undefined
}
object Casesensitive {
  
  inline def apply(): Casesensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Casesensitive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Casesensitive] (val x: Self) extends AnyVal {
    
    inline def `setCase-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "case-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setCase-sensitiveUndefined`: Self = StObject.set(x, "case-sensitive", js.undefined)
    
    inline def `setCase-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "case-sensitive", js.Array(value*))
    
    inline def `setDiacritic-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "diacritic-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setDiacritic-sensitiveUndefined`: Self = StObject.set(x, "diacritic-sensitive", js.undefined)
    
    inline def `setDiacritic-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "diacritic-sensitive", js.Array(value*))
    
    inline def setLocale(value: String | ExpressionSpecification): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocaleVarargs(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "locale", js.Array(value*))
  }
}
