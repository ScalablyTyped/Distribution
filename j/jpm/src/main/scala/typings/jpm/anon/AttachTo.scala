package typings.jpm.anon

import typings.jpm.FFAddonSDK.ContentWorker
import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.jpm.sdkPageModMod.attachmentMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachTo extends StObject {
  
  var attachTo: js.UndefOr[attachmentMode | js.Array[attachmentMode]] = js.undefined
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptOptions: js.UndefOr[Any] = js.undefined
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  
  var contentStyle: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentStyleFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var include: String | (js.Array[js.RegExp | String]) | js.RegExp
  
  var onAttach: js.UndefOr[js.Function1[/* worker */ ContentWorker, Any]] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
}
object AttachTo {
  
  inline def apply(include: String | (js.Array[js.RegExp | String]) | js.RegExp): AttachTo = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachTo]
  }
  
  extension [Self <: AttachTo](x: Self) {
    
    inline def setAttachTo(value: attachmentMode | js.Array[attachmentMode]): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
    
    inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
    
    inline def setAttachToVarargs(value: attachmentMode*): Self = StObject.set(x, "attachTo", js.Array(value*))
    
    inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
    
    inline def setContentScriptOptions(value: Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    inline def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
    
    inline def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    inline def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    inline def setContentStyle(value: String | js.Array[String]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleFile(value: String | js.Array[String]): Self = StObject.set(x, "contentStyleFile", value.asInstanceOf[js.Any])
    
    inline def setContentStyleFileUndefined: Self = StObject.set(x, "contentStyleFile", js.undefined)
    
    inline def setContentStyleFileVarargs(value: String*): Self = StObject.set(x, "contentStyleFile", js.Array(value*))
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setContentStyleVarargs(value: String*): Self = StObject.set(x, "contentStyle", js.Array(value*))
    
    inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setOnAttach(value: /* worker */ ContentWorker => Any): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    inline def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
