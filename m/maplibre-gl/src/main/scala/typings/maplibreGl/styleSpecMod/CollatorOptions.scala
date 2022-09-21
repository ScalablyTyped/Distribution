package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.maplibreGlStrings.`best fit`
import typings.maplibreGl.maplibreGlStrings.`case`
import typings.maplibreGl.maplibreGlStrings.`false`
import typings.maplibreGl.maplibreGlStrings.accent
import typings.maplibreGl.maplibreGlStrings.base
import typings.maplibreGl.maplibreGlStrings.lookup
import typings.maplibreGl.maplibreGlStrings.lower
import typings.maplibreGl.maplibreGlStrings.search
import typings.maplibreGl.maplibreGlStrings.sort
import typings.maplibreGl.maplibreGlStrings.upper
import typings.maplibreGl.maplibreGlStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollatorOptions extends StObject {
  
  var caseFirst: js.UndefOr[upper | lower | `false`] = js.undefined
  
  var ignorePunctuation: js.UndefOr[Boolean] = js.undefined
  
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var sensitivity: js.UndefOr[base | accent | `case` | variant] = js.undefined
  
  var usage: js.UndefOr[sort | search] = js.undefined
}
object CollatorOptions {
  
  inline def apply(): CollatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollatorOptions]
  }
  
  extension [Self <: CollatorOptions](x: Self) {
    
    inline def setCaseFirst(value: upper | lower | `false`): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
    
    inline def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
    
    inline def setIgnorePunctuation(value: Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
    
    inline def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
    
    inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setSensitivity(value: base | accent | `case` | variant): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setUsage(value: sort | search): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
