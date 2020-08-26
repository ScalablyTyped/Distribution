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
  def apply(): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneContext]
  }
  @scala.inline
  implicit class SchemaCloneContextOps[Self <: SchemaCloneContext] (val x: Self) extends AnyVal {
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
    def setBinLogCoordinates(value: SchemaBinLogCoordinates): Self = this.set("binLogCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinLogCoordinates: Self = this.set("binLogCoordinates", js.undefined)
    @scala.inline
    def setDestinationInstanceName(value: String): Self = this.set("destinationInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationInstanceName: Self = this.set("destinationInstanceName", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPitrTimestampMs(value: String): Self = this.set("pitrTimestampMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitrTimestampMs: Self = this.set("pitrTimestampMs", js.undefined)
  }
  
}

