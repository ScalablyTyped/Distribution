package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance clone context.
  */
@js.native
trait SchemaCloneContext extends js.Object {
  /**
    * Binary log coordinates, if specified, identify the position up to which
    * the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordinates.
    */
  var binLogCoordinates: js.UndefOr[SchemaBinLogCoordinates] = js.native
  /**
    * Name of the Cloud SQL instance to be created as a clone.
    */
  var destinationInstanceName: js.UndefOr[String] = js.native
  /**
    * This is always sql#cloneContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Reserved for future use.
    */
  var pitrTimestampMs: js.UndefOr[String] = js.native
}

object SchemaCloneContext {
  @scala.inline
  def apply(
    binLogCoordinates: SchemaBinLogCoordinates = null,
    destinationInstanceName: String = null,
    kind: String = null,
    pitrTimestampMs: String = null
  ): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    if (binLogCoordinates != null) __obj.updateDynamic("binLogCoordinates")(binLogCoordinates.asInstanceOf[js.Any])
    if (destinationInstanceName != null) __obj.updateDynamic("destinationInstanceName")(destinationInstanceName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pitrTimestampMs != null) __obj.updateDynamic("pitrTimestampMs")(pitrTimestampMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloneContext]
  }
}

