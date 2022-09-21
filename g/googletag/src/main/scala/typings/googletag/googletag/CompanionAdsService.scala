package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Ads service.
  * This service is used by video ads to show companion ads.
  *
  * **See also**
  * - [Companion ads for video and audio](https://support.google.com/admanager/answer/1191131)
  */
@js.native
trait CompanionAdsService
  extends StObject
     with Service {
  
  /**
    * Sets whether companion slots that have not been filled will be automatically backfilled.
    *
    * This method can be called multiple times during the page's lifetime to turn backfill on and off.
    * Only slots that are also registered with the {@link PubAdsService} will be backfilled.
    * Due to policy restrictions, this method is not designed to fill empty companion slots when an Ad Exchange video is served.
    *
    * **Example**
    * ```
    * googletag.companionAds().setRefreshUnfilledSlots(true);
    * ```
    *
    * @param value `true` to automatically backfill unfilled slots, `false` to leave them unchanged.
    */
  def setRefreshUnfilledSlots(value: Boolean): Unit = js.native
}
