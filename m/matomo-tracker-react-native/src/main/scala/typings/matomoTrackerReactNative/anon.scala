package typings.matomoTrackerReactNative

import typings.matomoTrackerReactNative.mod.Action
import typings.matomoTrackerReactNative.mod.AppStart
import typings.matomoTrackerReactNative.mod.Download
import typings.matomoTrackerReactNative.mod.Event
import typings.matomoTrackerReactNative.mod.Link
import typings.matomoTrackerReactNative.mod.SiteSearch
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cid extends StObject {
    
    var _idts: js.UndefOr[Double] = js.undefined
    
    var _idvc: js.UndefOr[String] = js.undefined
    
    var _viewts: js.UndefOr[Double] = js.undefined
    
    var cid: js.UndefOr[String] = js.undefined
    
    var cookie: js.UndefOr[Double] = js.undefined
    
    var dimension: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var m: js.UndefOr[Double] = js.undefined
    
    var new_visit: js.UndefOr[Double] = js.undefined
    
    var res: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[Double] = js.undefined
    
    var ua: js.UndefOr[String] = js.undefined
    
    var uadata: js.UndefOr[js.Object] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
    
    var urlref: js.UndefOr[String] = js.undefined
  }
  object Cid {
    
    inline def apply(): Cid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cid]
    }
    
    extension [Self <: Cid](x: Self) {
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setCookie(value: Double): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setNew_visit(value: Double): Self = StObject.set(x, "new_visit", value.asInstanceOf[js.Any])
      
      inline def setNew_visitUndefined: Self = StObject.set(x, "new_visit", js.undefined)
      
      inline def setRes(value: Double): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
      
      inline def setUaUndefined: Self = StObject.set(x, "ua", js.undefined)
      
      inline def setUadata(value: js.Object): Self = StObject.set(x, "uadata", value.asInstanceOf[js.Any])
      
      inline def setUadataUndefined: Self = StObject.set(x, "uadata", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUrlref(value: String): Self = StObject.set(x, "urlref", value.asInstanceOf[js.Any])
      
      inline def setUrlrefUndefined: Self = StObject.set(x, "urlref", js.undefined)
      
      inline def set_idts(value: Double): Self = StObject.set(x, "_idts", value.asInstanceOf[js.Any])
      
      inline def set_idtsUndefined: Self = StObject.set(x, "_idts", js.undefined)
      
      inline def set_idvc(value: String): Self = StObject.set(x, "_idvc", value.asInstanceOf[js.Any])
      
      inline def set_idvcUndefined: Self = StObject.set(x, "_idvc", js.undefined)
      
      inline def set_viewts(value: Double): Self = StObject.set(x, "_viewts", value.asInstanceOf[js.Any])
      
      inline def set_viewtsUndefined: Self = StObject.set(x, "_viewts", js.undefined)
    }
  }
  
  trait TrackAction extends StObject {
    
    def trackAction(params: Action): js.UndefOr[js.Promise[Response]]
    
    def trackAppStart(params: AppStart): js.UndefOr[js.Promise[Response]]
    
    def trackDownload(params: Download): js.UndefOr[js.Promise[Response]]
    
    def trackEvent(params: Event): js.UndefOr[js.Promise[Response]]
    
    def trackLink(params: Link): js.UndefOr[js.Promise[Response]]
    
    def trackScreenView(params: Action): js.UndefOr[js.Promise[Response]]
    
    def trackSiteSearch(params: SiteSearch): js.UndefOr[js.Promise[Response]]
  }
  object TrackAction {
    
    inline def apply(
      trackAction: Action => js.UndefOr[js.Promise[Response]],
      trackAppStart: AppStart => js.UndefOr[js.Promise[Response]],
      trackDownload: Download => js.UndefOr[js.Promise[Response]],
      trackEvent: Event => js.UndefOr[js.Promise[Response]],
      trackLink: Link => js.UndefOr[js.Promise[Response]],
      trackScreenView: Action => js.UndefOr[js.Promise[Response]],
      trackSiteSearch: SiteSearch => js.UndefOr[js.Promise[Response]]
    ): TrackAction = {
      val __obj = js.Dynamic.literal(trackAction = js.Any.fromFunction1(trackAction), trackAppStart = js.Any.fromFunction1(trackAppStart), trackDownload = js.Any.fromFunction1(trackDownload), trackEvent = js.Any.fromFunction1(trackEvent), trackLink = js.Any.fromFunction1(trackLink), trackScreenView = js.Any.fromFunction1(trackScreenView), trackSiteSearch = js.Any.fromFunction1(trackSiteSearch))
      __obj.asInstanceOf[TrackAction]
    }
    
    extension [Self <: TrackAction](x: Self) {
      
      inline def setTrackAction(value: Action => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackAction", js.Any.fromFunction1(value))
      
      inline def setTrackAppStart(value: AppStart => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackAppStart", js.Any.fromFunction1(value))
      
      inline def setTrackDownload(value: Download => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackDownload", js.Any.fromFunction1(value))
      
      inline def setTrackEvent(value: Event => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1(value))
      
      inline def setTrackLink(value: Link => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackLink", js.Any.fromFunction1(value))
      
      inline def setTrackScreenView(value: Action => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackScreenView", js.Any.fromFunction1(value))
      
      inline def setTrackSiteSearch(value: SiteSearch => js.UndefOr[js.Promise[Response]]): Self = StObject.set(x, "trackSiteSearch", js.Any.fromFunction1(value))
    }
  }
  
  trait Uid extends StObject {
    
    var uid: js.UndefOr[String] = js.undefined
  }
  object Uid {
    
    inline def apply(): Uid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uid]
    }
    
    extension [Self <: Uid](x: Self) {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
