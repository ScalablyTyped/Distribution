package typings.atMapboxMapboxDashSdk.servicesTilesetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tileset extends js.Object {
  var center: js.Array[Double]
  var created: String
  var description: String
  var filesize: Double
  var id: String
  var modified: String
  var name: String
  var status: String
  var `type`: String
  var visibility: String
}

object Tileset {
  @scala.inline
  def apply(
    center: js.Array[Double],
    created: String,
    description: String,
    filesize: Double,
    id: String,
    modified: String,
    name: String,
    status: String,
    `type`: String,
    visibility: String
  ): Tileset = {
    val __obj = js.Dynamic.literal(center = center, created = created, description = description, filesize = filesize, id = id, modified = modified, name = name, status = status, visibility = visibility)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tileset]
  }
}

