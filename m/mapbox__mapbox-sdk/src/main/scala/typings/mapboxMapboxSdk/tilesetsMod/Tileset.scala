package typings.mapboxMapboxSdk.tilesetsMod

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
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tileset]
  }
}

