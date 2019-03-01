package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataObject extends js.Object {
  var childXmlNames: js.Array[java.lang.String]
  var directoryName: java.lang.String
  var inFolder: scala.Boolean
  var metaFile: scala.Boolean
  var suffix: java.lang.String
  var xmlName: java.lang.String
}

object MetadataObject {
  @scala.inline
  def apply(
    childXmlNames: js.Array[java.lang.String],
    directoryName: java.lang.String,
    inFolder: scala.Boolean,
    metaFile: scala.Boolean,
    suffix: java.lang.String,
    xmlName: java.lang.String
  ): MetadataObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("childXmlNames")(childXmlNames)
    __obj.updateDynamic("directoryName")(directoryName)
    __obj.updateDynamic("inFolder")(inFolder)
    __obj.updateDynamic("metaFile")(metaFile)
    __obj.updateDynamic("suffix")(suffix)
    __obj.updateDynamic("xmlName")(xmlName)
    __obj.asInstanceOf[MetadataObject]
  }
}

