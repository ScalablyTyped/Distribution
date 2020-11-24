package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.DownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessViewStatus extends js.Object {
  
  /**
    * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE or NONE. (In LITE
    * projection.)
    */
  var accessViewStatus: js.UndefOr[String] = js.native
  
  /** The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.native
  
  /** Information about a volume's download license access restrictions. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.native
  
  /** URL to the Google Drive viewer if this volume is uploaded by the user by selecting the file from Google Drive. */
  var driveImportedContentLink: js.UndefOr[String] = js.native
  
  /** Whether this volume can be embedded in a viewport using the Embedded Viewer API. */
  var embeddable: js.UndefOr[Boolean] = js.native
  
  /** Information about epub content. (In LITE projection.) */
  var epub: js.UndefOr[AcsTokenLink] = js.native
  
  /**
    * Whether this volume requires that the client explicitly request offline download license rather than have it done automatically when loading the content, if the client supports
    * it.
    */
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.native
  
  /** Information about pdf content. (In LITE projection.) */
  var pdf: js.UndefOr[AcsTokenLink] = js.native
  
  /** Whether or not this book is public domain in the country listed above. */
  var publicDomain: js.UndefOr[Boolean] = js.native
  
  /** Whether quote sharing is allowed for this volume. */
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.native
  
  /** Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED. */
  var textToSpeechPermission: js.UndefOr[String] = js.native
  
  /** For ordered but not yet processed orders, we give a URL that can be used to go to the appropriate Google Wallet page. */
  var viewOrderUrl: js.UndefOr[String] = js.native
  
  /**
    * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of PARTIAL means that the
    * publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as non-eBooks. Public domain books will always have a
    * value of ALL_PAGES.
    */
  var viewability: js.UndefOr[String] = js.native
  
  /** URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes. */
  var webReaderLink: js.UndefOr[String] = js.native
}
object AccessViewStatus {
  
  @scala.inline
  def apply(): AccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessViewStatus]
  }
  
  @scala.inline
  implicit class AccessViewStatusOps[Self <: AccessViewStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessViewStatus(value: String): Self = this.set("accessViewStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessViewStatus: Self = this.set("accessViewStatus", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDownloadAccess(value: DownloadAccessRestriction): Self = this.set("downloadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadAccess: Self = this.set("downloadAccess", js.undefined)
    
    @scala.inline
    def setDriveImportedContentLink(value: String): Self = this.set("driveImportedContentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveImportedContentLink: Self = this.set("driveImportedContentLink", js.undefined)
    
    @scala.inline
    def setEmbeddable(value: Boolean): Self = this.set("embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddable: Self = this.set("embeddable", js.undefined)
    
    @scala.inline
    def setEpub(value: AcsTokenLink): Self = this.set("epub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpub: Self = this.set("epub", js.undefined)
    
    @scala.inline
    def setExplicitOfflineLicenseManagement(value: Boolean): Self = this.set("explicitOfflineLicenseManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitOfflineLicenseManagement: Self = this.set("explicitOfflineLicenseManagement", js.undefined)
    
    @scala.inline
    def setPdf(value: AcsTokenLink): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPublicDomain(value: Boolean): Self = this.set("publicDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDomain: Self = this.set("publicDomain", js.undefined)
    
    @scala.inline
    def setQuoteSharingAllowed(value: Boolean): Self = this.set("quoteSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteSharingAllowed: Self = this.set("quoteSharingAllowed", js.undefined)
    
    @scala.inline
    def setTextToSpeechPermission(value: String): Self = this.set("textToSpeechPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToSpeechPermission: Self = this.set("textToSpeechPermission", js.undefined)
    
    @scala.inline
    def setViewOrderUrl(value: String): Self = this.set("viewOrderUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOrderUrl: Self = this.set("viewOrderUrl", js.undefined)
    
    @scala.inline
    def setViewability(value: String): Self = this.set("viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewability: Self = this.set("viewability", js.undefined)
    
    @scala.inline
    def setWebReaderLink(value: String): Self = this.set("webReaderLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebReaderLink: Self = this.set("webReaderLink", js.undefined)
  }
}
