package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataObject extends js.Object {
  var childXmlNames: js.Array[String]
  var directoryName: String
  var inFolder: Boolean
  var metaFile: Boolean
  var suffix: String
  var xmlName: String
}

object MetadataObject {
  @scala.inline
  def apply(
    childXmlNames: js.Array[String],
    directoryName: String,
    inFolder: Boolean,
    metaFile: Boolean,
    suffix: String,
    xmlName: String
  ): MetadataObject = {
    val __obj = js.Dynamic.literal(childXmlNames = childXmlNames, directoryName = directoryName, inFolder = inFolder, metaFile = metaFile, suffix = suffix, xmlName = xmlName)
  
    __obj.asInstanceOf[MetadataObject]
  }
}

