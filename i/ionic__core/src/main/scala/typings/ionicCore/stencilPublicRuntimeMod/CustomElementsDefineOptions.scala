package typings.ionicCore.stencilPublicRuntimeMod

import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomElementsDefineOptions extends StObject {
  
  var ael: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.native
  
  var ce: js.UndefOr[
    js.Function2[/* eventName */ String, /* opts */ js.UndefOr[js.Any], CustomEvent[_]]
  ] = js.native
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var jmp: js.UndefOr[js.Function1[/* c */ js.Function, _]] = js.native
  
  var raf: js.UndefOr[js.Function1[/* c */ FrameRequestCallback, Double]] = js.native
  
  var rel: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.native
  
  var resourcesUrl: js.UndefOr[String] = js.native
  
  var syncQueue: js.UndefOr[Boolean] = js.native
  
  var transformTagName: js.UndefOr[js.Function1[/* tagName */ String, String]] = js.native
}
object CustomElementsDefineOptions {
  
  @scala.inline
  def apply(): CustomElementsDefineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomElementsDefineOptions]
  }
  
  @scala.inline
  implicit class CustomElementsDefineOptionsMutableBuilder[Self <: CustomElementsDefineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit
    ): Self = StObject.set(x, "ael", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAelUndefined: Self = StObject.set(x, "ael", js.undefined)
    
    @scala.inline
    def setCe(value: (/* eventName */ String, /* opts */ js.UndefOr[js.Any]) => CustomEvent[_]): Self = StObject.set(x, "ce", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCeUndefined: Self = StObject.set(x, "ce", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setJmp(value: /* c */ js.Function => _): Self = StObject.set(x, "jmp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJmpUndefined: Self = StObject.set(x, "jmp", js.undefined)
    
    @scala.inline
    def setRaf(value: /* c */ FrameRequestCallback => Double): Self = StObject.set(x, "raf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRafUndefined: Self = StObject.set(x, "raf", js.undefined)
    
    @scala.inline
    def setRel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit
    ): Self = StObject.set(x, "rel", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setResourcesUrl(value: String): Self = StObject.set(x, "resourcesUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUrlUndefined: Self = StObject.set(x, "resourcesUrl", js.undefined)
    
    @scala.inline
    def setSyncQueue(value: Boolean): Self = StObject.set(x, "syncQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncQueueUndefined: Self = StObject.set(x, "syncQueue", js.undefined)
    
    @scala.inline
    def setTransformTagName(value: /* tagName */ String => String): Self = StObject.set(x, "transformTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformTagNameUndefined: Self = StObject.set(x, "transformTagName", js.undefined)
  }
}
