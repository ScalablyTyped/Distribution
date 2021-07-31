package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorSaveAs extends StObject {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var proxyTarget: js.UndefOr[String] = js.undefined
  
  var proxyURL: js.UndefOr[Boolean] = js.undefined
}
object ImageEditorSaveAs {
  
  @scala.inline
  def apply(): ImageEditorSaveAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorSaveAs]
  }
  
  @scala.inline
  implicit class ImageEditorSaveAsMutableBuilder[Self <: ImageEditorSaveAs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    @scala.inline
    def setProxyTarget(value: String): Self = StObject.set(x, "proxyTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyTargetUndefined: Self = StObject.set(x, "proxyTarget", js.undefined)
    
    @scala.inline
    def setProxyURL(value: Boolean): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
  }
}
