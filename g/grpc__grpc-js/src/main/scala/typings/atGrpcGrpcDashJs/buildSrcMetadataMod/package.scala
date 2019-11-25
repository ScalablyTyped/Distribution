package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcMetadataMod {
  import typings.node.Buffer
  import typings.std.Map

  type MetadataObject = Map[String, js.Array[MetadataValue]]
  type MetadataValue = String | Buffer
}
