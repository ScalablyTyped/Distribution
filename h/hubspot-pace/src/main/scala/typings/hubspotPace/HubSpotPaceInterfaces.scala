package typings.hubspotPace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HubSpotPaceInterfaces {
  
  @js.native
  sealed trait PaceEvent extends StObject
  @JSGlobal("HubSpotPaceInterfaces.PaceEvent")
  @js.native
  object PaceEvent extends StObject {
    
    @js.native
    sealed trait done
      extends StObject
         with PaceEvent
    
    @js.native
    sealed trait hide
      extends StObject
         with PaceEvent
    
    @js.native
    sealed trait restart
      extends StObject
         with PaceEvent
    
    @js.native
    sealed trait start
      extends StObject
         with PaceEvent
    
    @js.native
    sealed trait stop
      extends StObject
         with PaceEvent
  }
  
  @js.native
  trait Pace extends StObject {
    
    def ignore(fn: js.Function0[Unit], args: Any*): Unit = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def on(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def on(event: String, handler: js.Function1[/* repeated */ Any, Unit], context: Any): Unit = js.native
    
    def once(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def once(event: String, handler: js.Function1[/* repeated */ Any, Unit], context: Any): Unit = js.native
    
    var options: PaceOptions = js.native
    
    def restart(): Unit = js.native
    
    def start(): Unit = js.native
    def start(options: PaceOptions): Unit = js.native
    
    def stop(): Unit = js.native
    
    def track(fn: js.Function0[Unit], args: Any*): Unit = js.native
  }
  
  trait PaceAjaxOptions extends StObject {
    
    /**
      * A list of regular expressions or substrings of URLS we should ignore (for both tracking and restarting)
      */
    var ignoreURLs: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
      * Which HTTP methods should we track?
      */
    var trackMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Should we track web socket connections?
      */
    var trackWebSockets: js.UndefOr[Boolean] = js.undefined
  }
  object PaceAjaxOptions {
    
    inline def apply(): PaceAjaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaceAjaxOptions]
    }
    
    extension [Self <: PaceAjaxOptions](x: Self) {
      
      inline def setIgnoreURLs(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreURLs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreURLsUndefined: Self = StObject.set(x, "ignoreURLs", js.undefined)
      
      inline def setIgnoreURLsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreURLs", js.Array(value*))
      
      inline def setTrackMethods(value: js.Array[String]): Self = StObject.set(x, "trackMethods", value.asInstanceOf[js.Any])
      
      inline def setTrackMethodsUndefined: Self = StObject.set(x, "trackMethods", js.undefined)
      
      inline def setTrackMethodsVarargs(value: String*): Self = StObject.set(x, "trackMethods", js.Array(value*))
      
      inline def setTrackWebSockets(value: Boolean): Self = StObject.set(x, "trackWebSockets", value.asInstanceOf[js.Any])
      
      inline def setTrackWebSocketsUndefined: Self = StObject.set(x, "trackWebSockets", js.undefined)
    }
  }
  
  trait PaceElementsOptions extends StObject {
    
    /**
      * How frequently in ms should we check for the elements being tested for using the element monitor?
      */
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * What elements should we wait for before deciding the page is fully loaded (not required)
      */
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PaceElementsOptions {
    
    inline def apply(): PaceElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaceElementsOptions]
    }
    
    extension [Self <: PaceElementsOptions](x: Self) {
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    }
  }
  
  trait PaceEventLagOptions extends StObject {
    
    /**
      * Above how many ms of lag is the CPU considered busy?
      */
    var lagThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * When we first start measuring event lag, not much is going on in the browser yet, so it's not uncommon for the numbers to be abnormally low for the first few samples. This configures how many samples we need before we consider a low number to mean completion.
      */
    var minSamples: js.UndefOr[Double] = js.undefined
    
    /**
      * How many samples should we average to decide what the current lag is?
      */
    var sampleCount: js.UndefOr[Double] = js.undefined
  }
  object PaceEventLagOptions {
    
    inline def apply(): PaceEventLagOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaceEventLagOptions]
    }
    
    extension [Self <: PaceEventLagOptions](x: Self) {
      
      inline def setLagThreshold(value: Double): Self = StObject.set(x, "lagThreshold", value.asInstanceOf[js.Any])
      
      inline def setLagThresholdUndefined: Self = StObject.set(x, "lagThreshold", js.undefined)
      
      inline def setMinSamples(value: Double): Self = StObject.set(x, "minSamples", value.asInstanceOf[js.Any])
      
      inline def setMinSamplesUndefined: Self = StObject.set(x, "minSamples", js.undefined)
      
      inline def setSampleCount(value: Double): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
      
      inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    }
  }
  
  trait PaceOptions extends StObject {
    
    var ajax: js.UndefOr[Boolean | PaceAjaxOptions] = js.undefined
    
    /**
      * How long should it take for the bar to animate to a new point after receiving it
      */
    var catchupTime: js.UndefOr[Double] = js.undefined
    
    var document: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * This tweaks the animation easing
      */
    var easeFactor: js.UndefOr[Double] = js.undefined
    
    var elements: js.UndefOr[Boolean | PaceElementsOptions] = js.undefined
    
    var eventLag: js.UndefOr[Boolean | PaceEventLagOptions] = js.undefined
    
    /**
      * What is the minimum amount of time the bar should sit after the last update before disappearing
      */
    var ghostTime: js.UndefOr[Double] = js.undefined
    
    /**
      * How quickly should the bar be moving before it has any progress info from a new source in %/ms
      */
    var initialRate: js.UndefOr[Double] = js.undefined
    
    /**
      * Its easy for a bunch of the bar to be eaten in the first few frames before we know how much there is to load. This limits how much of the bar can be used per frame
      */
    var maxProgressPerFrame: js.UndefOr[Double] = js.undefined
    
    /**
      * What is the minimum amount of time the bar should be on the screen. Irrespective of this number, the bar will always be on screen for 33 * (100 / maxProgressPerFrame) + ghostTime ms.
      */
    var minTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Should we restart the browser when pushState or replaceState is called?  (Generally means ajax navigation has occured)
      */
    var restartOnPushState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should we show the progress bar for every ajax request (not just regular or ajax-y page navigation)? Set to false to disable. If so, how many ms does the request have to be running for before we show the progress?
      */
    var restartOnRequestAfter: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Should pace automatically start when the page is loaded, or should it wait for `start` to be called? Always false if pace is loaded with AMD or CommonJS.
      */
    var startOnPageLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What element should the pace element be appended to on the page?
      */
    var target: js.UndefOr[String] = js.undefined
  }
  object PaceOptions {
    
    inline def apply(): PaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaceOptions]
    }
    
    extension [Self <: PaceOptions](x: Self) {
      
      inline def setAjax(value: Boolean | PaceAjaxOptions): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setCatchupTime(value: Double): Self = StObject.set(x, "catchupTime", value.asInstanceOf[js.Any])
      
      inline def setCatchupTimeUndefined: Self = StObject.set(x, "catchupTime", js.undefined)
      
      inline def setDocument(value: Boolean | String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setEaseFactor(value: Double): Self = StObject.set(x, "easeFactor", value.asInstanceOf[js.Any])
      
      inline def setEaseFactorUndefined: Self = StObject.set(x, "easeFactor", js.undefined)
      
      inline def setElements(value: Boolean | PaceElementsOptions): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setEventLag(value: Boolean | PaceEventLagOptions): Self = StObject.set(x, "eventLag", value.asInstanceOf[js.Any])
      
      inline def setEventLagUndefined: Self = StObject.set(x, "eventLag", js.undefined)
      
      inline def setGhostTime(value: Double): Self = StObject.set(x, "ghostTime", value.asInstanceOf[js.Any])
      
      inline def setGhostTimeUndefined: Self = StObject.set(x, "ghostTime", js.undefined)
      
      inline def setInitialRate(value: Double): Self = StObject.set(x, "initialRate", value.asInstanceOf[js.Any])
      
      inline def setInitialRateUndefined: Self = StObject.set(x, "initialRate", js.undefined)
      
      inline def setMaxProgressPerFrame(value: Double): Self = StObject.set(x, "maxProgressPerFrame", value.asInstanceOf[js.Any])
      
      inline def setMaxProgressPerFrameUndefined: Self = StObject.set(x, "maxProgressPerFrame", js.undefined)
      
      inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setRestartOnPushState(value: Boolean): Self = StObject.set(x, "restartOnPushState", value.asInstanceOf[js.Any])
      
      inline def setRestartOnPushStateUndefined: Self = StObject.set(x, "restartOnPushState", js.undefined)
      
      inline def setRestartOnRequestAfter(value: Boolean | Double): Self = StObject.set(x, "restartOnRequestAfter", value.asInstanceOf[js.Any])
      
      inline def setRestartOnRequestAfterUndefined: Self = StObject.set(x, "restartOnRequestAfter", js.undefined)
      
      inline def setStartOnPageLoad(value: Boolean): Self = StObject.set(x, "startOnPageLoad", value.asInstanceOf[js.Any])
      
      inline def setStartOnPageLoadUndefined: Self = StObject.set(x, "startOnPageLoad", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
