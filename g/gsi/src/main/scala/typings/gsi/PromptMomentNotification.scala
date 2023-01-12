package typings.gsi

import typings.gsi.gsiStrings.auto_cancel
import typings.gsi.gsiStrings.browser_not_supported
import typings.gsi.gsiStrings.cancel_called
import typings.gsi.gsiStrings.credential_returned
import typings.gsi.gsiStrings.dismissed
import typings.gsi.gsiStrings.display
import typings.gsi.gsiStrings.flow_restarted
import typings.gsi.gsiStrings.invalid_client
import typings.gsi.gsiStrings.issuing_failed
import typings.gsi.gsiStrings.missing_client_id
import typings.gsi.gsiStrings.opt_out_or_no_session
import typings.gsi.gsiStrings.secure_http_required
import typings.gsi.gsiStrings.skipped
import typings.gsi.gsiStrings.suppressed_by_user
import typings.gsi.gsiStrings.tap_outside
import typings.gsi.gsiStrings.unknown_reason
import typings.gsi.gsiStrings.unregistered_origin
import typings.gsi.gsiStrings.user_cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptMomentNotification extends StObject {
  
  /** The detailed reason for the dismissal. */
  def getDismissedReason(): credential_returned | cancel_called | flow_restarted
  
  /** Return a string for the moment type. */
  def getMomentType(): display | skipped | dismissed
  
  /** The detailed reason why the UI isn't displayed. */
  def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
  
  /** The detailed reason for the skipped moment. */
  def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed
  
  /** Is this notification for a dismissed moment? */
  def isDismissedMoment(): Boolean
  
  /** Is this notification for a display moment? */
  def isDisplayMoment(): Boolean
  
  /** Is this notification for a display moment, and the UI is displayed? */
  def isDisplayed(): Boolean
  
  /** Is this notification for a display moment, and the UI isn't displayed? */
  def isNotDisplayed(): Boolean
  
  /** Is this notification for a skipped moment? */
  def isSkippedMoment(): Boolean
}
object PromptMomentNotification {
  
  inline def apply(
    getDismissedReason: () => credential_returned | cancel_called | flow_restarted,
    getMomentType: () => display | skipped | dismissed,
    getNotDisplayedReason: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason,
    getSkippedReason: () => auto_cancel | user_cancel | tap_outside | issuing_failed,
    isDismissedMoment: () => Boolean,
    isDisplayMoment: () => Boolean,
    isDisplayed: () => Boolean,
    isNotDisplayed: () => Boolean,
    isSkippedMoment: () => Boolean
  ): PromptMomentNotification = {
    val __obj = js.Dynamic.literal(getDismissedReason = js.Any.fromFunction0(getDismissedReason), getMomentType = js.Any.fromFunction0(getMomentType), getNotDisplayedReason = js.Any.fromFunction0(getNotDisplayedReason), getSkippedReason = js.Any.fromFunction0(getSkippedReason), isDismissedMoment = js.Any.fromFunction0(isDismissedMoment), isDisplayMoment = js.Any.fromFunction0(isDisplayMoment), isDisplayed = js.Any.fromFunction0(isDisplayed), isNotDisplayed = js.Any.fromFunction0(isNotDisplayed), isSkippedMoment = js.Any.fromFunction0(isSkippedMoment))
    __obj.asInstanceOf[PromptMomentNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptMomentNotification] (val x: Self) extends AnyVal {
    
    inline def setGetDismissedReason(value: () => credential_returned | cancel_called | flow_restarted): Self = StObject.set(x, "getDismissedReason", js.Any.fromFunction0(value))
    
    inline def setGetMomentType(value: () => display | skipped | dismissed): Self = StObject.set(x, "getMomentType", js.Any.fromFunction0(value))
    
    inline def setGetNotDisplayedReason(
      value: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
    ): Self = StObject.set(x, "getNotDisplayedReason", js.Any.fromFunction0(value))
    
    inline def setGetSkippedReason(value: () => auto_cancel | user_cancel | tap_outside | issuing_failed): Self = StObject.set(x, "getSkippedReason", js.Any.fromFunction0(value))
    
    inline def setIsDismissedMoment(value: () => Boolean): Self = StObject.set(x, "isDismissedMoment", js.Any.fromFunction0(value))
    
    inline def setIsDisplayMoment(value: () => Boolean): Self = StObject.set(x, "isDisplayMoment", js.Any.fromFunction0(value))
    
    inline def setIsDisplayed(value: () => Boolean): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsNotDisplayed(value: () => Boolean): Self = StObject.set(x, "isNotDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsSkippedMoment(value: () => Boolean): Self = StObject.set(x, "isSkippedMoment", js.Any.fromFunction0(value))
  }
}
