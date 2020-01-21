package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataCompositeMedia extends js.Object {
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.native
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.native
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.native
}

object SchemaGdataCompositeMedia {
  @scala.inline
  def apply(
    blobRef: String = null,
    blobstore2Info: SchemaGdataBlobstore2Info = null,
    cosmoBinaryReference: String = null,
    crc32cHash: Int | Double = null,
    `inline`: String = null,
    length: String = null,
    md5Hash: String = null,
    objectId: SchemaGdataObjectId = null,
    path: String = null,
    referenceType: String = null,
    sha1Hash: String = null
  ): SchemaGdataCompositeMedia = {
    val __obj = js.Dynamic.literal()
    if (blobRef != null) __obj.updateDynamic("blobRef")(blobRef.asInstanceOf[js.Any])
    if (blobstore2Info != null) __obj.updateDynamic("blobstore2Info")(blobstore2Info.asInstanceOf[js.Any])
    if (cosmoBinaryReference != null) __obj.updateDynamic("cosmoBinaryReference")(cosmoBinaryReference.asInstanceOf[js.Any])
    if (crc32cHash != null) __obj.updateDynamic("crc32cHash")(crc32cHash.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType.asInstanceOf[js.Any])
    if (sha1Hash != null) __obj.updateDynamic("sha1Hash")(sha1Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGdataCompositeMedia]
  }
}

