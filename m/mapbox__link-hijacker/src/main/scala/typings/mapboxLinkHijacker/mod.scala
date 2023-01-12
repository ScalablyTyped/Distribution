package typings.mapboxLinkHijacker

import typings.mapboxLinkHijacker.anon.FnCall
import typings.std.EventTarget
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/link-hijacker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mapbox/link-hijacker", "hijack")
  @js.native
  def hijack: FnCall = js.native
  inline def hijack(callback: Callback): Unhijack = ^.asInstanceOf[js.Dynamic].applyDynamic("hijack")(callback.asInstanceOf[js.Any]).asInstanceOf[Unhijack]
  inline def hijack(options: Options, callback: Callback): Unhijack = (^.asInstanceOf[js.Dynamic].applyDynamic("hijack")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unhijack]
  inline def hijack_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hijack")(x.asInstanceOf[js.Any])
  
  type Callback = js.Function2[/* link */ HTMLAnchorElement, /* event */ MouseEvent, Unit]
  
  trait Options extends StObject {
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[EventTarget] = js.undefined
    
    var skipDownload: js.UndefOr[Boolean] = js.undefined
    
    var skipExternal: js.UndefOr[Boolean] = js.undefined
    
    var skipFilter: js.UndefOr[js.Function1[/* link */ HTMLAnchorElement, Boolean]] = js.undefined
    
    var skipFragment: js.UndefOr[Boolean] = js.undefined
    
    var skipMailTo: js.UndefOr[Boolean] = js.undefined
    
    var skipModifierKeys: js.UndefOr[Boolean] = js.undefined
    
    var skipOtherOrigin: js.UndefOr[Boolean] = js.undefined
    
    var skipTargetBlank: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setRoot(value: EventTarget): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSkipDownload(value: Boolean): Self = StObject.set(x, "skipDownload", value.asInstanceOf[js.Any])
      
      inline def setSkipDownloadUndefined: Self = StObject.set(x, "skipDownload", js.undefined)
      
      inline def setSkipExternal(value: Boolean): Self = StObject.set(x, "skipExternal", value.asInstanceOf[js.Any])
      
      inline def setSkipExternalUndefined: Self = StObject.set(x, "skipExternal", js.undefined)
      
      inline def setSkipFilter(value: /* link */ HTMLAnchorElement => Boolean): Self = StObject.set(x, "skipFilter", js.Any.fromFunction1(value))
      
      inline def setSkipFilterUndefined: Self = StObject.set(x, "skipFilter", js.undefined)
      
      inline def setSkipFragment(value: Boolean): Self = StObject.set(x, "skipFragment", value.asInstanceOf[js.Any])
      
      inline def setSkipFragmentUndefined: Self = StObject.set(x, "skipFragment", js.undefined)
      
      inline def setSkipMailTo(value: Boolean): Self = StObject.set(x, "skipMailTo", value.asInstanceOf[js.Any])
      
      inline def setSkipMailToUndefined: Self = StObject.set(x, "skipMailTo", js.undefined)
      
      inline def setSkipModifierKeys(value: Boolean): Self = StObject.set(x, "skipModifierKeys", value.asInstanceOf[js.Any])
      
      inline def setSkipModifierKeysUndefined: Self = StObject.set(x, "skipModifierKeys", js.undefined)
      
      inline def setSkipOtherOrigin(value: Boolean): Self = StObject.set(x, "skipOtherOrigin", value.asInstanceOf[js.Any])
      
      inline def setSkipOtherOriginUndefined: Self = StObject.set(x, "skipOtherOrigin", js.undefined)
      
      inline def setSkipTargetBlank(value: Boolean): Self = StObject.set(x, "skipTargetBlank", value.asInstanceOf[js.Any])
      
      inline def setSkipTargetBlankUndefined: Self = StObject.set(x, "skipTargetBlank", js.undefined)
    }
  }
  
  type Unhijack = js.Function0[Unit]
}
