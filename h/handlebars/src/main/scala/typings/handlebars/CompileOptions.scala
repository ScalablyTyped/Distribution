package typings.handlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileOptions extends StObject {
  
  var assumeObjects: js.UndefOr[Boolean] = js.native
  
  var compat: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Boolean] = js.native
  
  var explicitPartialContext: js.UndefOr[Boolean] = js.native
  
  var ignoreStandalone: js.UndefOr[Boolean] = js.native
  
  var knownHelpers: js.UndefOr[KnownHelpers] = js.native
  
  var knownHelpersOnly: js.UndefOr[Boolean] = js.native
  
  var noEscape: js.UndefOr[Boolean] = js.native
  
  var preventIndent: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object CompileOptions {
  
  @scala.inline
  def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  @scala.inline
  implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumeObjects(value: Boolean): Self = StObject.set(x, "assumeObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeObjectsUndefined: Self = StObject.set(x, "assumeObjects", js.undefined)
    
    @scala.inline
    def setCompat(value: Boolean): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
    
    @scala.inline
    def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setExplicitPartialContext(value: Boolean): Self = StObject.set(x, "explicitPartialContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitPartialContextUndefined: Self = StObject.set(x, "explicitPartialContext", js.undefined)
    
    @scala.inline
    def setIgnoreStandalone(value: Boolean): Self = StObject.set(x, "ignoreStandalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreStandaloneUndefined: Self = StObject.set(x, "ignoreStandalone", js.undefined)
    
    @scala.inline
    def setKnownHelpers(value: KnownHelpers): Self = StObject.set(x, "knownHelpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownHelpersOnly(value: Boolean): Self = StObject.set(x, "knownHelpersOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownHelpersOnlyUndefined: Self = StObject.set(x, "knownHelpersOnly", js.undefined)
    
    @scala.inline
    def setKnownHelpersUndefined: Self = StObject.set(x, "knownHelpers", js.undefined)
    
    @scala.inline
    def setNoEscape(value: Boolean): Self = StObject.set(x, "noEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEscapeUndefined: Self = StObject.set(x, "noEscape", js.undefined)
    
    @scala.inline
    def setPreventIndent(value: Boolean): Self = StObject.set(x, "preventIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventIndentUndefined: Self = StObject.set(x, "preventIndent", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
