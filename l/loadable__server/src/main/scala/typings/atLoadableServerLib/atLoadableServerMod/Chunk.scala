package typings
package atLoadableServerLib.atLoadableServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunk: java.lang.String
  var filename: java.lang.String
  var linkType: java.lang.String
  var path: java.lang.String
  var scriptType: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object Chunk {
  @scala.inline
  def apply(
    chunk: java.lang.String,
    filename: java.lang.String,
    linkType: java.lang.String,
    path: java.lang.String,
    scriptType: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk, filename = filename, linkType = linkType, path = path, scriptType = scriptType, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Chunk]
  }
}

