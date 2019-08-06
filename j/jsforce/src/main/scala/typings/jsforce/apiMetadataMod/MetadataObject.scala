package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataObject extends js.Object {
  var childXmlNames: js.UndefOr[js.Array[String]] = js.undefined
  var directoryName: js.UndefOr[String] = js.undefined
  var inFolder: js.UndefOr[Boolean] = js.undefined
  var metaFile: js.UndefOr[Boolean] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var xmlName: String
}

object MetadataObject {
  @scala.inline
  def apply(
    xmlName: String,
    childXmlNames: js.Array[String] = null,
    directoryName: String = null,
    inFolder: js.UndefOr[Boolean] = js.undefined,
    metaFile: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null
  ): MetadataObject = {
    val __obj = js.Dynamic.literal(xmlName = xmlName)
    if (childXmlNames != null) __obj.updateDynamic("childXmlNames")(childXmlNames)
    if (directoryName != null) __obj.updateDynamic("directoryName")(directoryName)
    if (!js.isUndefined(inFolder)) __obj.updateDynamic("inFolder")(inFolder)
    if (!js.isUndefined(metaFile)) __obj.updateDynamic("metaFile")(metaFile)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[MetadataObject]
  }
}

