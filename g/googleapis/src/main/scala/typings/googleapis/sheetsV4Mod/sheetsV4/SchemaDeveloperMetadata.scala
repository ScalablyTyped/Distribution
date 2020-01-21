package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Developer metadata associated with a location or object in a spreadsheet.
  * Developer metadata may be used to associate arbitrary data with various
  * parts of a spreadsheet and will remain associated at those locations as
  * they move around and the spreadsheet is edited.  For example, if developer
  * metadata is associated with row 5 and another row is then subsequently
  * inserted above row 5, that original metadata will still be associated with
  * the row it was first associated with (what is now row 6). If the associated
  * object is deleted its metadata is deleted too.
  */
@js.native
trait SchemaDeveloperMetadata extends js.Object {
  /**
    * The location where the metadata is associated.
    */
  var location: js.UndefOr[SchemaDeveloperMetadataLocation] = js.native
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be
    * specified when metadata is created, otherwise one will be randomly
    * generated and assigned. Must be positive.
    */
  var metadataId: js.UndefOr[Double] = js.native
  /**
    * The metadata key. There may be multiple metadata in a spreadsheet with
    * the same key.  Developer metadata must always have a key specified.
    */
  var metadataKey: js.UndefOr[String] = js.native
  /**
    * Data associated with the metadata&#39;s key.
    */
  var metadataValue: js.UndefOr[String] = js.native
  /**
    * The metadata visibility.  Developer metadata must always have a
    * visibility specified.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaDeveloperMetadata {
  @scala.inline
  def apply(
    location: SchemaDeveloperMetadataLocation = null,
    metadataId: Int | Double = null,
    metadataKey: String = null,
    metadataValue: String = null,
    visibility: String = null
  ): SchemaDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (metadataId != null) __obj.updateDynamic("metadataId")(metadataId.asInstanceOf[js.Any])
    if (metadataKey != null) __obj.updateDynamic("metadataKey")(metadataKey.asInstanceOf[js.Any])
    if (metadataValue != null) __obj.updateDynamic("metadataValue")(metadataValue.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeveloperMetadata]
  }
}

