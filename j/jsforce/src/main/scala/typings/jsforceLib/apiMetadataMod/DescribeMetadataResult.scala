package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMetadataResult extends js.Object {
  var metadataObjects: js.Array[MetadataObject]
  var organizationNamespace: java.lang.String
  var partialSaveAllowed: scala.Boolean
  var testRequired: scala.Boolean
}

object DescribeMetadataResult {
  @scala.inline
  def apply(
    metadataObjects: js.Array[MetadataObject],
    organizationNamespace: java.lang.String,
    partialSaveAllowed: scala.Boolean,
    testRequired: scala.Boolean
  ): DescribeMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadataObjects")(metadataObjects)
    __obj.updateDynamic("organizationNamespace")(organizationNamespace)
    __obj.updateDynamic("partialSaveAllowed")(partialSaveAllowed)
    __obj.updateDynamic("testRequired")(testRequired)
    __obj.asInstanceOf[DescribeMetadataResult]
  }
}

