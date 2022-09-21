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
