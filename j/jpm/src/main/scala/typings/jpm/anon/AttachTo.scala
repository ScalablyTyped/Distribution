package typings.jpm.anon

import typings.jpm.FFAddonSDK.ContentWorker
import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.pageModMod.attachmentMode
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachTo extends StObject {
  
  var attachTo: js.UndefOr[attachmentMode | js.Array[attachmentMode]] = js.native
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var include: String | (js.Array[RegExp | String]) | RegExp = js.native
  
  var onAttach: js.UndefOr[js.Function1[/* worker */ ContentWorker, _]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
}
object AttachTo {
  
  @scala.inline
  def apply(include: String | (js.Array[RegExp | String]) | RegExp): AttachTo = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachTo]
  }
  
  @scala.inline
  implicit class AttachToMutableBuilder[Self <: AttachTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTo(value: attachmentMode | js.Array[attachmentMode]): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
    
    @scala.inline
    def setAttachToVarargs(value: attachmentMode*): Self = StObject.set(x, "attachTo", js.Array(value :_*))
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    @scala.inline
    def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    @scala.inline
    def setContentStyle(value: String | js.Array[String]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleFile(value: String | js.Array[String]): Self = StObject.set(x, "contentStyleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleFileUndefined: Self = StObject.set(x, "contentStyleFile", js.undefined)
    
    @scala.inline
    def setContentStyleFileVarargs(value: String*): Self = StObject.set(x, "contentStyleFile", js.Array(value :_*))
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setContentStyleVarargs(value: String*): Self = StObject.set(x, "contentStyle", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | (js.Array[RegExp | String]) | RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVarargs(value: (RegExp | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setOnAttach(value: /* worker */ ContentWorker => _): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
