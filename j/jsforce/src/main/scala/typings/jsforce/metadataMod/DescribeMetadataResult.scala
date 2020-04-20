package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMetadataResult extends js.Object {
  var metadataObjects: js.Array[MetadataObject]
  var organizationNamespace: String
  var partialSaveAllowed: Boolean
  var testRequired: Boolean
}

object DescribeMetadataResult {
  @scala.inline
  def apply(
    metadataObjects: js.Array[MetadataObject],
    organizationNamespace: String,
    partialSaveAllowed: Boolean,
    testRequired: Boolean
  ): DescribeMetadataResult = {
    val __obj = js.Dynamic.literal(metadataObjects = metadataObjects.asInstanceOf[js.Any], organizationNamespace = organizationNamespace.asInstanceOf[js.Any], partialSaveAllowed = partialSaveAllowed.asInstanceOf[js.Any], testRequired = testRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMetadataResult]
  }
}

