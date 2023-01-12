package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.ReadingPosition
import typings.maximMazurokGapiClientBooks.gapi.client.books.Review
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquiredTime extends StObject {
  
  /** Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family sharing, etc. */
  var acquiredTime: js.UndefOr[String] = js.undefined
  
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[Double] = js.undefined
  
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[LimitType] = js.undefined
  
  /** Whether this volume is purchased, sample, pd download etc. */
  var entitlementType: js.UndefOr[Double] = js.undefined
  
  /** Information on the ability to share with the family. */
  var familySharing: js.UndefOr[FamilyRole] = js.undefined
  
  /** Whether or not the user shared this volume with the family. */
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the user received this volume through family sharing. */
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not this volume is currently in "my books." */
  var isInMyBooks: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.) */
  var isPreordered: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.) */
  var isPurchased: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not this volume was user uploaded. */
  var isUploaded: js.UndefOr[Boolean] = js.undefined
  
  /** The user's current reading position in the volume, if one is available. (In LITE projection.) */
  var readingPosition: js.UndefOr[ReadingPosition] = js.undefined
  
  /** Period during this book is/was a valid rental. */
  var rentalPeriod: js.UndefOr[EndUtcSec] = js.undefined
  
  /** Whether this book is an active or an expired rental. */
  var rentalState: js.UndefOr[String] = js.undefined
  
  /** This user's review of this volume, if one exists. */
  var review: js.UndefOr[Review] = js.undefined
  
  /** Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  
  var userUploadedVolumeInfo: js.UndefOr[ProcessingState] = js.undefined
}
object AcquiredTime {
  
  inline def apply(): AcquiredTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquiredTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcquiredTime] (val x: Self) extends AnyVal {
    
    inline def setAcquiredTime(value: String): Self = StObject.set(x, "acquiredTime", value.asInstanceOf[js.Any])
    
    inline def setAcquiredTimeUndefined: Self = StObject.set(x, "acquiredTime", js.undefined)
    
    inline def setAcquisitionType(value: Double): Self = StObject.set(x, "acquisitionType", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionTypeUndefined: Self = StObject.set(x, "acquisitionType", js.undefined)
    
    inline def setCopy(value: LimitType): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setEntitlementType(value: Double): Self = StObject.set(x, "entitlementType", value.asInstanceOf[js.Any])
    
    inline def setEntitlementTypeUndefined: Self = StObject.set(x, "entitlementType", js.undefined)
    
    inline def setFamilySharing(value: FamilyRole): Self = StObject.set(x, "familySharing", value.asInstanceOf[js.Any])
    
    inline def setFamilySharingUndefined: Self = StObject.set(x, "familySharing", js.undefined)
    
    inline def setIsFamilySharedFromUser(value: Boolean): Self = StObject.set(x, "isFamilySharedFromUser", value.asInstanceOf[js.Any])
    
    inline def setIsFamilySharedFromUserUndefined: Self = StObject.set(x, "isFamilySharedFromUser", js.undefined)
    
    inline def setIsFamilySharedToUser(value: Boolean): Self = StObject.set(x, "isFamilySharedToUser", value.asInstanceOf[js.Any])
    
    inline def setIsFamilySharedToUserUndefined: Self = StObject.set(x, "isFamilySharedToUser", js.undefined)
    
    inline def setIsFamilySharingAllowed(value: Boolean): Self = StObject.set(x, "isFamilySharingAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsFamilySharingAllowedUndefined: Self = StObject.set(x, "isFamilySharingAllowed", js.undefined)
    
    inline def setIsFamilySharingDisabledByFop(value: Boolean): Self = StObject.set(x, "isFamilySharingDisabledByFop", value.asInstanceOf[js.Any])
    
    inline def setIsFamilySharingDisabledByFopUndefined: Self = StObject.set(x, "isFamilySharingDisabledByFop", js.undefined)
    
    inline def setIsInMyBooks(value: Boolean): Self = StObject.set(x, "isInMyBooks", value.asInstanceOf[js.Any])
    
    inline def setIsInMyBooksUndefined: Self = StObject.set(x, "isInMyBooks", js.undefined)
    
    inline def setIsPreordered(value: Boolean): Self = StObject.set(x, "isPreordered", value.asInstanceOf[js.Any])
    
    inline def setIsPreorderedUndefined: Self = StObject.set(x, "isPreordered", js.undefined)
    
    inline def setIsPurchased(value: Boolean): Self = StObject.set(x, "isPurchased", value.asInstanceOf[js.Any])
    
    inline def setIsPurchasedUndefined: Self = StObject.set(x, "isPurchased", js.undefined)
    
    inline def setIsUploaded(value: Boolean): Self = StObject.set(x, "isUploaded", value.asInstanceOf[js.Any])
    
    inline def setIsUploadedUndefined: Self = StObject.set(x, "isUploaded", js.undefined)
    
    inline def setReadingPosition(value: ReadingPosition): Self = StObject.set(x, "readingPosition", value.asInstanceOf[js.Any])
    
    inline def setReadingPositionUndefined: Self = StObject.set(x, "readingPosition", js.undefined)
    
    inline def setRentalPeriod(value: EndUtcSec): Self = StObject.set(x, "rentalPeriod", value.asInstanceOf[js.Any])
    
    inline def setRentalPeriodUndefined: Self = StObject.set(x, "rentalPeriod", js.undefined)
    
    inline def setRentalState(value: String): Self = StObject.set(x, "rentalState", value.asInstanceOf[js.Any])
    
    inline def setRentalStateUndefined: Self = StObject.set(x, "rentalState", js.undefined)
    
    inline def setReview(value: Review): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUserUploadedVolumeInfo(value: ProcessingState): Self = StObject.set(x, "userUploadedVolumeInfo", value.asInstanceOf[js.Any])
    
    inline def setUserUploadedVolumeInfoUndefined: Self = StObject.set(x, "userUploadedVolumeInfo", js.undefined)
  }
}
