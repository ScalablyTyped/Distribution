package typings.atLoadableServer.atLoadableServerMod

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
    val __obj = js.Dynamic.literal(chunk = chunk, filename = filename, linkType = linkType, path = path, scriptType = scriptType, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Chunk]
  }
}

