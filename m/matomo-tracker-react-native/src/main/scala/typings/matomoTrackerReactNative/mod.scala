package typings.matomoTrackerReactNative

import typings.matomoTrackerReactNative.anon.Cid
import typings.matomoTrackerReactNative.anon.TrackAction
import typings.matomoTrackerReactNative.anon.Uid
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matomo-tracker-react-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matomo-tracker-react-native", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MatomoTracker {
    def this(props: InstanceProps) = this()
    
    /* CompleteClass */
    override def trackAction(params: Action): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackAppStart(params: AppStart): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackDownload(params: Download): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackEvent(params: Event): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackLink(params: Link): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackScreenView(params: Action): js.Promise[Response] = js.native
    
    /* CompleteClass */
    override def trackSiteSearch(params: SiteSearch): js.Promise[Response] = js.native
  }
  
  @JSImport("matomo-tracker-react-native", "MatomoContext")
  @js.native
  val MatomoContext: Context[js.Object] = js.native
  
  inline def MatomoProvider(props: MatomoProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MatomoProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMatomo(): TrackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatomo")().asInstanceOf[TrackAction]
  
  trait Action extends StObject {
    
    var name: String
    
    var userInfo: js.UndefOr[Uid] = js.undefined
  }
  object Action {
    
    inline def apply(name: String): Action = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: Uid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    }
  }
  
  trait AppStart extends StObject {
    
    var userInfo: js.UndefOr[Cid] = js.undefined
  }
  object AppStart {
    
    inline def apply(): AppStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppStart]
    }
    
    extension [Self <: AppStart](x: Self) {
      
      inline def setUserInfo(value: Cid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    }
  }
  
  trait Download extends StObject {
    
    var download: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var userInfo: js.UndefOr[Uid] = js.undefined
  }
  object Download {
    
    inline def apply(download: String): Download = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any])
      __obj.asInstanceOf[Download]
    }
    
    extension [Self <: Download](x: Self) {
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUserInfo(value: Uid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var action: String
    
    var category: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var userInfo: js.UndefOr[Uid] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Event {
    
    inline def apply(action: String, category: String): Event = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUserInfo(value: Uid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InstanceProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var siteId: Double
    
    var trackerUrl: js.UndefOr[String] = js.undefined
    
    var urlBase: String
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object InstanceProps {
    
    inline def apply(siteId: Double, urlBase: String): InstanceProps = {
      val __obj = js.Dynamic.literal(siteId = siteId.asInstanceOf[js.Any], urlBase = urlBase.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceProps]
    }
    
    extension [Self <: InstanceProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setSiteId(value: Double): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
      
      inline def setTrackerUrl(value: String): Self = StObject.set(x, "trackerUrl", value.asInstanceOf[js.Any])
      
      inline def setTrackerUrlUndefined: Self = StObject.set(x, "trackerUrl", js.undefined)
      
      inline def setUrlBase(value: String): Self = StObject.set(x, "urlBase", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait Link extends StObject {
    
    var link: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var userInfo: js.UndefOr[Uid] = js.undefined
  }
  object Link {
    
    inline def apply(link: String): Link = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUserInfo(value: Uid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    }
  }
  
  trait MatomoProviderProps extends StObject {
    
    var children: ReactElement
    
    var instance: MatomoTracker
  }
  object MatomoProviderProps {
    
    inline def apply(children: ReactElement, instance: MatomoTracker): MatomoProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatomoProviderProps]
    }
    
    extension [Self <: MatomoProviderProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: MatomoTracker): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatomoTracker extends StObject {
    
    def trackAction(params: Action): js.Promise[Response]
    
    def trackAppStart(params: AppStart): js.Promise[Response]
    
    def trackDownload(params: Download): js.Promise[Response]
    
    def trackEvent(params: Event): js.Promise[Response]
    
    def trackLink(params: Link): js.Promise[Response]
    
    def trackScreenView(params: Action): js.Promise[Response]
    
    def trackSiteSearch(params: SiteSearch): js.Promise[Response]
  }
  object MatomoTracker {
    
    inline def apply(
      trackAction: Action => js.Promise[Response],
      trackAppStart: AppStart => js.Promise[Response],
      trackDownload: Download => js.Promise[Response],
      trackEvent: Event => js.Promise[Response],
      trackLink: Link => js.Promise[Response],
      trackScreenView: Action => js.Promise[Response],
      trackSiteSearch: SiteSearch => js.Promise[Response]
    ): MatomoTracker = {
      val __obj = js.Dynamic.literal(trackAction = js.Any.fromFunction1(trackAction), trackAppStart = js.Any.fromFunction1(trackAppStart), trackDownload = js.Any.fromFunction1(trackDownload), trackEvent = js.Any.fromFunction1(trackEvent), trackLink = js.Any.fromFunction1(trackLink), trackScreenView = js.Any.fromFunction1(trackScreenView), trackSiteSearch = js.Any.fromFunction1(trackSiteSearch))
      __obj.asInstanceOf[MatomoTracker]
    }
    
    extension [Self <: MatomoTracker](x: Self) {
      
      inline def setTrackAction(value: Action => js.Promise[Response]): Self = StObject.set(x, "trackAction", js.Any.fromFunction1(value))
      
      inline def setTrackAppStart(value: AppStart => js.Promise[Response]): Self = StObject.set(x, "trackAppStart", js.Any.fromFunction1(value))
      
      inline def setTrackDownload(value: Download => js.Promise[Response]): Self = StObject.set(x, "trackDownload", js.Any.fromFunction1(value))
      
      inline def setTrackEvent(value: Event => js.Promise[Response]): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1(value))
      
      inline def setTrackLink(value: Link => js.Promise[Response]): Self = StObject.set(x, "trackLink", js.Any.fromFunction1(value))
      
      inline def setTrackScreenView(value: Action => js.Promise[Response]): Self = StObject.set(x, "trackScreenView", js.Any.fromFunction1(value))
      
      inline def setTrackSiteSearch(value: SiteSearch => js.Promise[Response]): Self = StObject.set(x, "trackSiteSearch", js.Any.fromFunction1(value))
    }
  }
  
  trait SiteSearch extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var keyword: String
    
    var userInfo: js.UndefOr[Uid] = js.undefined
  }
  object SiteSearch {
    
    inline def apply(keyword: String): SiteSearch = {
      val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiteSearch]
    }
    
    extension [Self <: SiteSearch](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: Uid): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    }
  }
}
