package typings.iabVpaid

import typings.iabVpaid.iab.vpaid.EventsNames
import typings.iabVpaid.iab.vpaid.SimpleEvents
import typings.iabVpaid.iab.vpaid.ViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object iabVpaidStrings {
  @js.native
  sealed trait AdClickThru extends EventsNames
  
  @js.native
  sealed trait AdDurationChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdError extends EventsNames
  
  @js.native
  sealed trait AdExpandedChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdImpression
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdInteraction extends EventsNames
  
  @js.native
  sealed trait AdLinearChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdLoaded
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdLog extends EventsNames
  
  @js.native
  sealed trait AdPaused
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdPlaying
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdRemainingTimeChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdSizeChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdSkippableStateChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdSkipped
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdStarted
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdStopped
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdUserAcceptInvitation
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdUserClose
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdUserMinimize
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVideoComplete
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVideoFirstQuartile
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVideoMidPoint
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVideoStart
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVideoThirdQuartile
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait AdVolumeChange
    extends EventsNames
       with SimpleEvents
  
  @js.native
  sealed trait fullscreen extends ViewMode
  
  @js.native
  sealed trait normal extends ViewMode
  
  @js.native
  sealed trait thumbnail extends ViewMode
  
  @scala.inline
  def AdClickThru: AdClickThru = "AdClickThru".asInstanceOf[AdClickThru]
  @scala.inline
  def AdDurationChange: AdDurationChange = "AdDurationChange".asInstanceOf[AdDurationChange]
  @scala.inline
  def AdError: AdError = "AdError".asInstanceOf[AdError]
  @scala.inline
  def AdExpandedChange: AdExpandedChange = "AdExpandedChange".asInstanceOf[AdExpandedChange]
  @scala.inline
  def AdImpression: AdImpression = "AdImpression".asInstanceOf[AdImpression]
  @scala.inline
  def AdInteraction: AdInteraction = "AdInteraction".asInstanceOf[AdInteraction]
  @scala.inline
  def AdLinearChange: AdLinearChange = "AdLinearChange".asInstanceOf[AdLinearChange]
  @scala.inline
  def AdLoaded: AdLoaded = "AdLoaded".asInstanceOf[AdLoaded]
  @scala.inline
  def AdLog: AdLog = "AdLog".asInstanceOf[AdLog]
  @scala.inline
  def AdPaused: AdPaused = "AdPaused".asInstanceOf[AdPaused]
  @scala.inline
  def AdPlaying: AdPlaying = "AdPlaying".asInstanceOf[AdPlaying]
  @scala.inline
  def AdRemainingTimeChange: AdRemainingTimeChange = "AdRemainingTimeChange".asInstanceOf[AdRemainingTimeChange]
  @scala.inline
  def AdSizeChange: AdSizeChange = "AdSizeChange".asInstanceOf[AdSizeChange]
  @scala.inline
  def AdSkippableStateChange: AdSkippableStateChange = "AdSkippableStateChange".asInstanceOf[AdSkippableStateChange]
  @scala.inline
  def AdSkipped: AdSkipped = "AdSkipped".asInstanceOf[AdSkipped]
  @scala.inline
  def AdStarted: AdStarted = "AdStarted".asInstanceOf[AdStarted]
  @scala.inline
  def AdStopped: AdStopped = "AdStopped".asInstanceOf[AdStopped]
  @scala.inline
  def AdUserAcceptInvitation: AdUserAcceptInvitation = "AdUserAcceptInvitation".asInstanceOf[AdUserAcceptInvitation]
  @scala.inline
  def AdUserClose: AdUserClose = "AdUserClose".asInstanceOf[AdUserClose]
  @scala.inline
  def AdUserMinimize: AdUserMinimize = "AdUserMinimize".asInstanceOf[AdUserMinimize]
  @scala.inline
  def AdVideoComplete: AdVideoComplete = "AdVideoComplete".asInstanceOf[AdVideoComplete]
  @scala.inline
  def AdVideoFirstQuartile: AdVideoFirstQuartile = "AdVideoFirstQuartile".asInstanceOf[AdVideoFirstQuartile]
  @scala.inline
  def AdVideoMidPoint: AdVideoMidPoint = "AdVideoMidPoint".asInstanceOf[AdVideoMidPoint]
  @scala.inline
  def AdVideoStart: AdVideoStart = "AdVideoStart".asInstanceOf[AdVideoStart]
  @scala.inline
  def AdVideoThirdQuartile: AdVideoThirdQuartile = "AdVideoThirdQuartile".asInstanceOf[AdVideoThirdQuartile]
  @scala.inline
  def AdVolumeChange: AdVolumeChange = "AdVolumeChange".asInstanceOf[AdVolumeChange]
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def thumbnail: thumbnail = "thumbnail".asInstanceOf[thumbnail]
}

