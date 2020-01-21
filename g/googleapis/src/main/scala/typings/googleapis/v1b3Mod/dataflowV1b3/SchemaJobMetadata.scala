package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata available primarily for filtering jobs. Will be included in the
  * ListJob response and Job SUMMARY view.
  */
@js.native
trait SchemaJobMetadata extends js.Object {
  /**
    * Identification of a BigTable source used in the Dataflow job.
    */
  var bigTableDetails: js.UndefOr[js.Array[SchemaBigTableIODetails]] = js.native
  /**
    * Identification of a BigQuery source used in the Dataflow job.
    */
  var bigqueryDetails: js.UndefOr[js.Array[SchemaBigQueryIODetails]] = js.native
  /**
    * Identification of a Datastore source used in the Dataflow job.
    */
  var datastoreDetails: js.UndefOr[js.Array[SchemaDatastoreIODetails]] = js.native
  /**
    * Identification of a File source used in the Dataflow job.
    */
  var fileDetails: js.UndefOr[js.Array[SchemaFileIODetails]] = js.native
  /**
    * Identification of a PubSub source used in the Dataflow job.
    */
  var pubsubDetails: js.UndefOr[js.Array[SchemaPubSubIODetails]] = js.native
  /**
    * The SDK version used to run the job.
    */
  var sdkVersion: js.UndefOr[SchemaSdkVersion] = js.native
  /**
    * Identification of a Spanner source used in the Dataflow job.
    */
  var spannerDetails: js.UndefOr[js.Array[SchemaSpannerIODetails]] = js.native
}

object SchemaJobMetadata {
  @scala.inline
  def apply(
    bigTableDetails: js.Array[SchemaBigTableIODetails] = null,
    bigqueryDetails: js.Array[SchemaBigQueryIODetails] = null,
    datastoreDetails: js.Array[SchemaDatastoreIODetails] = null,
    fileDetails: js.Array[SchemaFileIODetails] = null,
    pubsubDetails: js.Array[SchemaPubSubIODetails] = null,
    sdkVersion: SchemaSdkVersion = null,
    spannerDetails: js.Array[SchemaSpannerIODetails] = null
  ): SchemaJobMetadata = {
    val __obj = js.Dynamic.literal()
    if (bigTableDetails != null) __obj.updateDynamic("bigTableDetails")(bigTableDetails.asInstanceOf[js.Any])
    if (bigqueryDetails != null) __obj.updateDynamic("bigqueryDetails")(bigqueryDetails.asInstanceOf[js.Any])
    if (datastoreDetails != null) __obj.updateDynamic("datastoreDetails")(datastoreDetails.asInstanceOf[js.Any])
    if (fileDetails != null) __obj.updateDynamic("fileDetails")(fileDetails.asInstanceOf[js.Any])
    if (pubsubDetails != null) __obj.updateDynamic("pubsubDetails")(pubsubDetails.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    if (spannerDetails != null) __obj.updateDynamic("spannerDetails")(spannerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobMetadata]
  }
}

