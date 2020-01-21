package typings.loadableServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunk: String
  var filename: String
  var linkType: String
  var path: String
  var scriptType: String
  var `type`: String
  var url: String
}

object Chunk {
  @scala.inline
  def apply(
    chunk: String,
    filename: String,
    linkType: String,
    path: String,
    scriptType: String,
    `type`: String,
    url: String
  ): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scriptType = scriptType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

