package typings.handlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOptions extends StObject {
  
  var assumeObjects: js.UndefOr[Boolean] = js.undefined
  
  var compat: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[Boolean] = js.undefined
  
  var explicitPartialContext: js.UndefOr[Boolean] = js.undefined
  
  var ignoreStandalone: js.UndefOr[Boolean] = js.undefined
  
  var knownHelpers: js.UndefOr[KnownHelpers] = js.undefined
  
  var knownHelpersOnly: js.UndefOr[Boolean] = js.undefined
  
  var noEscape: js.UndefOr[Boolean] = js.undefined
  
  var preventIndent: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object CompileOptions {
  
  inline def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  extension [Self <: CompileOptions](x: Self) {
    
    inline def setAssumeObjects(value: Boolean): Self = StObject.set(x, "assumeObjects", value.asInstanceOf[js.Any])
    
    inline def setAssumeObjectsUndefined: Self = StObject.set(x, "assumeObjects", js.undefined)
    
    inline def setCompat(value: Boolean): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
    
    inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExplicitPartialContext(value: Boolean): Self = StObject.set(x, "explicitPartialContext", value.asInstanceOf[js.Any])
    
    inline def setExplicitPartialContextUndefined: Self = StObject.set(x, "explicitPartialContext", js.undefined)
    
    inline def setIgnoreStandalone(value: Boolean): Self = StObject.set(x, "ignoreStandalone", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStandaloneUndefined: Self = StObject.set(x, "ignoreStandalone", js.undefined)
    
    inline def setKnownHelpers(value: KnownHelpers): Self = StObject.set(x, "knownHelpers", value.asInstanceOf[js.Any])
    
    inline def setKnownHelpersOnly(value: Boolean): Self = StObject.set(x, "knownHelpersOnly", value.asInstanceOf[js.Any])
    
    inline def setKnownHelpersOnlyUndefined: Self = StObject.set(x, "knownHelpersOnly", js.undefined)
    
    inline def setKnownHelpersUndefined: Self = StObject.set(x, "knownHelpers", js.undefined)
    
    inline def setNoEscape(value: Boolean): Self = StObject.set(x, "noEscape", value.asInstanceOf[js.Any])
    
    inline def setNoEscapeUndefined: Self = StObject.set(x, "noEscape", js.undefined)
    
    inline def setPreventIndent(value: Boolean): Self = StObject.set(x, "preventIndent", value.asInstanceOf[js.Any])
    
    inline def setPreventIndentUndefined: Self = StObject.set(x, "preventIndent", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
