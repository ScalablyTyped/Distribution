package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for App Access Collections Resource object in Directory API.
  */
@js.native
trait SchemaAppAccessCollections extends js.Object {
  /**
    * List of blocked api access buckets.
    */
  var blockedApiAccessBuckets: js.UndefOr[js.Array[String]] = js.native
  /**
    * Boolean to indicate whether to enforce app access settings on Android
    * Drive or not.
    */
  var enforceSettingsForAndroidDrive: js.UndefOr[Boolean] = js.native
  /**
    * Error message provided by the Admin that will be shown to the user when
    * an app is blocked.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as an app access collection. Value:
    * admin#directory#appaccesscollection
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Unique ID of app access collection. (Readonly)
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Resource name given by the customer while creating/updating. Should be
    * unique under given customer.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Boolean that indicates whether to trust domain owned apps.
    */
  var trustDomainOwnedApps: js.UndefOr[Boolean] = js.native
}

object SchemaAppAccessCollections {
  @scala.inline
  def apply(): SchemaAppAccessCollections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppAccessCollections]
  }
  @scala.inline
  implicit class SchemaAppAccessCollectionsOps[Self <: SchemaAppAccessCollections] (val x: Self) extends AnyVal {
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
    def setBlockedApiAccessBucketsVarargs(value: String*): Self = this.set("blockedApiAccessBuckets", js.Array(value :_*))
    @scala.inline
    def setBlockedApiAccessBuckets(value: js.Array[String]): Self = this.set("blockedApiAccessBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockedApiAccessBuckets: Self = this.set("blockedApiAccessBuckets", js.undefined)
    @scala.inline
    def setEnforceSettingsForAndroidDrive(value: Boolean): Self = this.set("enforceSettingsForAndroidDrive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceSettingsForAndroidDrive: Self = this.set("enforceSettingsForAndroidDrive", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setTrustDomainOwnedApps(value: Boolean): Self = this.set("trustDomainOwnedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustDomainOwnedApps: Self = this.set("trustDomainOwnedApps", js.undefined)
  }
  
}

