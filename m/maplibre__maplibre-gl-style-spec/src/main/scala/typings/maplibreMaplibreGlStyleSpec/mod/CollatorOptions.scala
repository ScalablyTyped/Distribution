package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`best fit`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`case`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.`false`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.accent
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.base
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.lookup
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.lower
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.search
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.sort
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.upper
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.variant
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
    
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
