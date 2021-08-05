package typings.iabVpaid

import typings.iabVpaid.iab.vpaid.EventsNames
import typings.iabVpaid.iab.vpaid.SimpleEvents
import typings.iabVpaid.iab.vpaid.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iabVpaidStrings {
  
  @js.native
  sealed trait AdClickThru
    extends StObject
       with EventsNames
  inline def AdClickThru: AdClickThru = "AdClickThru".asInstanceOf[AdClickThru]
  
  @js.native
  sealed trait AdDurationChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdDurationChange: AdDurationChange = "AdDurationChange".asInstanceOf[AdDurationChange]
  
  @js.native
  sealed trait AdError
    extends StObject
       with EventsNames
  inline def AdError: AdError = "AdError".asInstanceOf[AdError]
  
  @js.native
  sealed trait AdExpandedChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdExpandedChange: AdExpandedChange = "AdExpandedChange".asInstanceOf[AdExpandedChange]
  
  @js.native
  sealed trait AdImpression
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdImpression: AdImpression = "AdImpression".asInstanceOf[AdImpression]
  
  @js.native
  sealed trait AdInteraction
    extends StObject
       with EventsNames
  inline def AdInteraction: AdInteraction = "AdInteraction".asInstanceOf[AdInteraction]
  
  @js.native
  sealed trait AdLinearChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdLinearChange: AdLinearChange = "AdLinearChange".asInstanceOf[AdLinearChange]
  
  @js.native
  sealed trait AdLoaded
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdLoaded: AdLoaded = "AdLoaded".asInstanceOf[AdLoaded]
  
  @js.native
  sealed trait AdLog
    extends StObject
       with EventsNames
  inline def AdLog: AdLog = "AdLog".asInstanceOf[AdLog]
  
  @js.native
  sealed trait AdPaused
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdPaused: AdPaused = "AdPaused".asInstanceOf[AdPaused]
  
  @js.native
  sealed trait AdPlaying
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdPlaying: AdPlaying = "AdPlaying".asInstanceOf[AdPlaying]
  
  @js.native
  sealed trait AdRemainingTimeChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdRemainingTimeChange: AdRemainingTimeChange = "AdRemainingTimeChange".asInstanceOf[AdRemainingTimeChange]
  
  @js.native
  sealed trait AdSizeChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdSizeChange: AdSizeChange = "AdSizeChange".asInstanceOf[AdSizeChange]
  
  @js.native
  sealed trait AdSkippableStateChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdSkippableStateChange: AdSkippableStateChange = "AdSkippableStateChange".asInstanceOf[AdSkippableStateChange]
  
  @js.native
  sealed trait AdSkipped
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdSkipped: AdSkipped = "AdSkipped".asInstanceOf[AdSkipped]
  
  @js.native
  sealed trait AdStarted
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdStarted: AdStarted = "AdStarted".asInstanceOf[AdStarted]
  
  @js.native
  sealed trait AdStopped
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdStopped: AdStopped = "AdStopped".asInstanceOf[AdStopped]
  
  @js.native
  sealed trait AdUserAcceptInvitation
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdUserAcceptInvitation: AdUserAcceptInvitation = "AdUserAcceptInvitation".asInstanceOf[AdUserAcceptInvitation]
  
  @js.native
  sealed trait AdUserClose
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdUserClose: AdUserClose = "AdUserClose".asInstanceOf[AdUserClose]
  
  @js.native
  sealed trait AdUserMinimize
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdUserMinimize: AdUserMinimize = "AdUserMinimize".asInstanceOf[AdUserMinimize]
  
  @js.native
  sealed trait AdVideoComplete
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVideoComplete: AdVideoComplete = "AdVideoComplete".asInstanceOf[AdVideoComplete]
  
  @js.native
  sealed trait AdVideoFirstQuartile
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVideoFirstQuartile: AdVideoFirstQuartile = "AdVideoFirstQuartile".asInstanceOf[AdVideoFirstQuartile]
  
  @js.native
  sealed trait AdVideoMidpoint
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVideoMidpoint: AdVideoMidpoint = "AdVideoMidpoint".asInstanceOf[AdVideoMidpoint]
  
  @js.native
  sealed trait AdVideoStart
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVideoStart: AdVideoStart = "AdVideoStart".asInstanceOf[AdVideoStart]
  
  @js.native
  sealed trait AdVideoThirdQuartile
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVideoThirdQuartile: AdVideoThirdQuartile = "AdVideoThirdQuartile".asInstanceOf[AdVideoThirdQuartile]
  
  @js.native
  sealed trait AdVolumeChange
    extends StObject
       with EventsNames
       with SimpleEvents
  inline def AdVolumeChange: AdVolumeChange = "AdVolumeChange".asInstanceOf[AdVolumeChange]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with ViewMode
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait normal
    extends StObject
       with ViewMode
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait thumbnail
    extends StObject
       with ViewMode
  inline def thumbnail: thumbnail = "thumbnail".asInstanceOf[thumbnail]
}
