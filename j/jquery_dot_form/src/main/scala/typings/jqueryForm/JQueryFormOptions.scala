package typings.jqueryForm

import typings.jquery.JQuery.AjaxSettings
import typings.std.EventTarget
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFormOptions
  extends StObject
     with AjaxSettings[Any] {
  
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ this.type, Boolean]] = js.undefined
  
  var beforeSubmit: js.UndefOr[
    js.Function3[/* formData */ js.Array[Any], /* $form */ JQuery, /* options */ this.type, Boolean]
  ] = js.undefined
  
  var clearForm: js.UndefOr[Boolean] = js.undefined
  
  var forceSync: js.UndefOr[Boolean] = js.undefined
  
  var iframe: js.UndefOr[Boolean] = js.undefined
  
  var iframeSrc: js.UndefOr[String] = js.undefined
  
  var iframeTarget: js.UndefOr[Any] = js.undefined
  
  var replaceTarget: js.UndefOr[Boolean] = js.undefined
  
  var resetForm: js.UndefOr[Boolean] = js.undefined
  
  var semantic: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[Any] = js.undefined
  
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent[EventTarget], 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.undefined
}
object JQueryFormOptions {
  
  inline def apply(): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFormOptions]
  }
  
  extension [Self <: JQueryFormOptions](x: Self) {
    
    inline def setBeforeSerialize(value: (/* $form */ JQuery, JQueryFormOptions) => Boolean): Self = StObject.set(x, "beforeSerialize", js.Any.fromFunction2(value))
    
    inline def setBeforeSerializeUndefined: Self = StObject.set(x, "beforeSerialize", js.undefined)
    
    inline def setBeforeSubmit(value: (/* formData */ js.Array[Any], /* $form */ JQuery, JQueryFormOptions) => Boolean): Self = StObject.set(x, "beforeSubmit", js.Any.fromFunction3(value))
    
    inline def setBeforeSubmitUndefined: Self = StObject.set(x, "beforeSubmit", js.undefined)
    
    inline def setClearForm(value: Boolean): Self = StObject.set(x, "clearForm", value.asInstanceOf[js.Any])
    
    inline def setClearFormUndefined: Self = StObject.set(x, "clearForm", js.undefined)
    
    inline def setForceSync(value: Boolean): Self = StObject.set(x, "forceSync", value.asInstanceOf[js.Any])
    
    inline def setForceSyncUndefined: Self = StObject.set(x, "forceSync", js.undefined)
    
    inline def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    inline def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
    
    inline def setIframeSrcUndefined: Self = StObject.set(x, "iframeSrc", js.undefined)
    
    inline def setIframeTarget(value: Any): Self = StObject.set(x, "iframeTarget", value.asInstanceOf[js.Any])
    
    inline def setIframeTargetUndefined: Self = StObject.set(x, "iframeTarget", js.undefined)
    
    inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    inline def setReplaceTarget(value: Boolean): Self = StObject.set(x, "replaceTarget", value.asInstanceOf[js.Any])
    
    inline def setReplaceTargetUndefined: Self = StObject.set(x, "replaceTarget", js.undefined)
    
    inline def setResetForm(value: Boolean): Self = StObject.set(x, "resetForm", value.asInstanceOf[js.Any])
    
    inline def setResetFormUndefined: Self = StObject.set(x, "resetForm", js.undefined)
    
    inline def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    inline def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUploadProgress(
      value: (/* event */ ProgressEvent[EventTarget], /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Unit
    ): Self = StObject.set(x, "uploadProgress", js.Any.fromFunction4(value))
    
    inline def setUploadProgressUndefined: Self = StObject.set(x, "uploadProgress", js.undefined)
  }
}
