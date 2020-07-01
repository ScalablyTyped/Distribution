package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a revision to a file.
  */
@js.native
trait SchemaRevision extends js.Object {
  /**
    * Links for exporting Google Docs to specific formats.
    */
  var exportLinks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of the revision.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether to keep this revision forever, even if it is no longer the head
    * revision. If not set, the revision will be automatically purged 30 days
    * after newer content is uploaded. This can be set on a maximum of 200
    * revisions for a file. This field is only applicable to files with binary
    * content in Drive.
    */
  var keepForever: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#revision&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last user to modify this revision.
    */
  var lastModifyingUser: js.UndefOr[SchemaUser] = js.native
  /**
    * The MD5 checksum of the revision&#39;s content. This is only applicable
    * to files with binary content in Drive.
    */
  var md5Checksum: js.UndefOr[String] = js.native
  /**
    * The MIME type of the revision.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The last time the revision was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.native
  /**
    * The original filename used to create this revision. This is only
    * applicable to files with binary content in Drive.
    */
  var originalFilename: js.UndefOr[String] = js.native
  /**
    * Whether subsequent revisions will be automatically republished. This is
    * only applicable to Google Docs.
    */
  var publishAuto: js.UndefOr[Boolean] = js.native
  /**
    * Whether this revision is published. This is only applicable to Google
    * Docs.
    */
  var published: js.UndefOr[Boolean] = js.native
  /**
    * Whether this revision is published outside the domain. This is only
    * applicable to Google Docs.
    */
  var publishedOutsideDomain: js.UndefOr[Boolean] = js.native
  /**
    * The size of the revision&#39;s content in bytes. This is only applicable
    * to files with binary content in Drive.
    */
  var size: js.UndefOr[String] = js.native
}

object SchemaRevision {
  @scala.inline
  def apply(
    exportLinks: StringDictionary[String] = null,
    id: String = null,
    keepForever: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastModifyingUser: SchemaUser = null,
    md5Checksum: String = null,
    mimeType: String = null,
    modifiedTime: String = null,
    originalFilename: String = null,
    publishAuto: js.UndefOr[Boolean] = js.undefined,
    published: js.UndefOr[Boolean] = js.undefined,
    publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined,
    size: String = null
  ): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    if (exportLinks != null) __obj.updateDynamic("exportLinks")(exportLinks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keepForever)) __obj.updateDynamic("keepForever")(keepForever.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifyingUser != null) __obj.updateDynamic("lastModifyingUser")(lastModifyingUser.asInstanceOf[js.Any])
    if (md5Checksum != null) __obj.updateDynamic("md5Checksum")(md5Checksum.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    if (originalFilename != null) __obj.updateDynamic("originalFilename")(originalFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(publishAuto)) __obj.updateDynamic("publishAuto")(publishAuto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publishedOutsideDomain)) __obj.updateDynamic("publishedOutsideDomain")(publishedOutsideDomain.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevision]
  }
}

