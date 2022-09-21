package typings.jpm.anon

import typings.jpm.FFAddonSDK.FrameEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var onAttach: js.UndefOr[js.Function1[/* event */ FrameEvent, Any]] = js.undefined
  
  var onDetach: js.UndefOr[js.Function1[/* event */ FrameEvent, Any]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* event */ FrameEvent, Any]] = js.undefined
  
  var onMessage: js.UndefOr[js.Function1[/* message */ FrameEvent, Any]] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* event */ FrameEvent, Any]] = js.undefined
  
  var url: String
}
object Name {
  
  inline def apply(url: String): Name = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnAttach(value: /* event */ FrameEvent => Any): Self = StObject.set(x, "onAttach", js.Any.fromFunction1(value))
    
    inline def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
    
    inline def setOnDetach(value: /* event */ FrameEvent => Any): Self = StObject.set(x, "onDetach", js.Any.fromFunction1(value))
    
    inline def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    
    inline def setOnLoad(value: /* event */ FrameEvent => Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnMessage(value: /* message */ FrameEvent => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
    
    inline def setOnReady(value: /* event */ FrameEvent => Any): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
