package typings.jqueryPjax

import typings.jquery.JQuery.AjaxSettings
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PjaxSettings
  extends StObject
     with AjaxSettings[js.Any] {
  
  /**
    * A jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * If it is not defined, the `data-pjax` attribute of the link will be treated as container.
    * If such an attribute is not defined too, the context will be treated as container.
    */
  var container: js.UndefOr[String] = js.undefined
  
  /**
    * CSS selector for the fragment to extract from ajax response.
    */
  var fragment: js.UndefOr[String] = js.undefined
  
  /**
    * How many requests to cache. Defaults to 20.
    */
  var maxCacheLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to pushState the URL. Defaults to true.
    */
  var push: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to replaceState the URL. Defaults to false.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical position to scroll to after navigation.
    * To avoid changing scroll position, pass false.
    */
  var scrollTo: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
    * Eventually the relatedTarget value for pjax events.
    */
  var target: js.UndefOr[EventTarget] = js.undefined
  
  /**
    * A string or function returning the current pjax version
    */
  var version: js.UndefOr[String | js.Function0[String]] = js.undefined
}
object PjaxSettings {
  
  @scala.inline
  def apply(): PjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PjaxSettings]
  }
  
  @scala.inline
  implicit class PjaxSettingsMutableBuilder[Self <: PjaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    @scala.inline
    def setMaxCacheLength(value: Double): Self = StObject.set(x, "maxCacheLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCacheLengthUndefined: Self = StObject.set(x, "maxCacheLength", js.undefined)
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setScrollTo(value: Double | Boolean): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
    
    @scala.inline
    def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setVersion(value: String | js.Function0[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionFunction0(value: () => String): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
