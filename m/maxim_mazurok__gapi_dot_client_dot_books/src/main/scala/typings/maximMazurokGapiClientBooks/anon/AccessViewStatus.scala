package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.DownloadAccessRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessViewStatus extends StObject {
  
  /**
    * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE or NONE. (In LITE
    * projection.)
    */
  var accessViewStatus: js.UndefOr[String] = js.undefined
  
  /** The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.undefined
  
  /** Information about a volume's download license access restrictions. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.undefined
  
  /** URL to the Google Drive viewer if this volume is uploaded by the user by selecting the file from Google Drive. */
  var driveImportedContentLink: js.UndefOr[String] = js.undefined
  
  /** Whether this volume can be embedded in a viewport using the Embedded Viewer API. */
  var embeddable: js.UndefOr[Boolean] = js.undefined
  
  /** Information about epub content. (In LITE projection.) */
  var epub: js.UndefOr[AcsTokenLink] = js.undefined
  
  /**
    * Whether this volume requires that the client explicitly request offline download license rather than have it done automatically when loading the content, if the client supports
    * it.
    */
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.undefined
  
  /** Information about pdf content. (In LITE projection.) */
  var pdf: js.UndefOr[AcsTokenLink] = js.undefined
  
  /** Whether or not this book is public domain in the country listed above. */
  var publicDomain: js.UndefOr[Boolean] = js.undefined
  
  /** Whether quote sharing is allowed for this volume. */
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED. */
  var textToSpeechPermission: js.UndefOr[String] = js.undefined
  
  /** For ordered but not yet processed orders, we give a URL that can be used to go to the appropriate Google Wallet page. */
  var viewOrderUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of PARTIAL means that the
    * publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as non-eBooks. Public domain books will always have a
    * value of ALL_PAGES.
    */
  var viewability: js.UndefOr[String] = js.undefined
  
  /** URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes. */
  var webReaderLink: js.UndefOr[String] = js.undefined
}
object AccessViewStatus {
  
  inline def apply(): AccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessViewStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessViewStatus] (val x: Self) extends AnyVal {
    
    inline def setAccessViewStatus(value: String): Self = StObject.set(x, "accessViewStatus", value.asInstanceOf[js.Any])
    
    inline def setAccessViewStatusUndefined: Self = StObject.set(x, "accessViewStatus", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDownloadAccess(value: DownloadAccessRestriction): Self = StObject.set(x, "downloadAccess", value.asInstanceOf[js.Any])
    
    inline def setDownloadAccessUndefined: Self = StObject.set(x, "downloadAccess", js.undefined)
    
    inline def setDriveImportedContentLink(value: String): Self = StObject.set(x, "driveImportedContentLink", value.asInstanceOf[js.Any])
    
    inline def setDriveImportedContentLinkUndefined: Self = StObject.set(x, "driveImportedContentLink", js.undefined)
    
    inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    inline def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
    
    inline def setEpub(value: AcsTokenLink): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
    
    inline def setEpubUndefined: Self = StObject.set(x, "epub", js.undefined)
    
    inline def setExplicitOfflineLicenseManagement(value: Boolean): Self = StObject.set(x, "explicitOfflineLicenseManagement", value.asInstanceOf[js.Any])
    
    inline def setExplicitOfflineLicenseManagementUndefined: Self = StObject.set(x, "explicitOfflineLicenseManagement", js.undefined)
    
    inline def setPdf(value: AcsTokenLink): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setPublicDomain(value: Boolean): Self = StObject.set(x, "publicDomain", value.asInstanceOf[js.Any])
    
    inline def setPublicDomainUndefined: Self = StObject.set(x, "publicDomain", js.undefined)
    
    inline def setQuoteSharingAllowed(value: Boolean): Self = StObject.set(x, "quoteSharingAllowed", value.asInstanceOf[js.Any])
    
    inline def setQuoteSharingAllowedUndefined: Self = StObject.set(x, "quoteSharingAllowed", js.undefined)
    
    inline def setTextToSpeechPermission(value: String): Self = StObject.set(x, "textToSpeechPermission", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechPermissionUndefined: Self = StObject.set(x, "textToSpeechPermission", js.undefined)
    
    inline def setViewOrderUrl(value: String): Self = StObject.set(x, "viewOrderUrl", value.asInstanceOf[js.Any])
    
    inline def setViewOrderUrlUndefined: Self = StObject.set(x, "viewOrderUrl", js.undefined)
    
    inline def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    inline def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
    
    inline def setWebReaderLink(value: String): Self = StObject.set(x, "webReaderLink", value.asInstanceOf[js.Any])
    
    inline def setWebReaderLinkUndefined: Self = StObject.set(x, "webReaderLink", js.undefined)
  }
}
