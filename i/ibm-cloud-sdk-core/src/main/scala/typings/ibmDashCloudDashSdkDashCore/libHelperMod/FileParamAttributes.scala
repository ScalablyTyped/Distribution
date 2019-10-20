package typings.ibmDashCloudDashSdkDashCore.libHelperMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileParamAttributes extends js.Object {
  var contentType: String
  var data: ReadableStream | Buffer | FileObject
  var filename: String
}

object FileParamAttributes {
  @scala.inline
  def apply(contentType: String, data: ReadableStream | Buffer | FileObject, filename: String): FileParamAttributes = {
    val __obj = js.Dynamic.literal(contentType = contentType, data = data.asInstanceOf[js.Any], filename = filename)
  
    __obj.asInstanceOf[FileParamAttributes]
  }
}

