package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.properties_
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.mod.ExpressionSpecification
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
  
  extension [Self <: Casesensitive](x: Self) {
    
    inline def `setCase-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "case-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setCase-sensitiveUndefined`: Self = StObject.set(x, "case-sensitive", js.undefined)
    
    inline def `setCase-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "case-sensitive", js.Array(value*))
    
    inline def `setDiacritic-sensitive`(value: Boolean | ExpressionSpecification): Self = StObject.set(x, "diacritic-sensitive", value.asInstanceOf[js.Any])
    
    inline def `setDiacritic-sensitiveUndefined`: Self = StObject.set(x, "diacritic-sensitive", js.undefined)
    
    inline def `setDiacritic-sensitiveVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "diacritic-sensitive", js.Array(value*))
    
    inline def setLocale(value: String | ExpressionSpecification): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocaleVarargs(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties_ | typings.maplibreGl.maplibreGlStrings.ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "locale", js.Array(value*))
  }
}
