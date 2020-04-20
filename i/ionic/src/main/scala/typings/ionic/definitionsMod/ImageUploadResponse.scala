package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageUploadResponse extends js.Object {
  var Error: String
  var Height: Double
  var Type: String
  var Vector: Boolean
  var Width: Double
}

object ImageUploadResponse {
  @scala.inline
  def apply(Error: String, Height: Double, Type: String, Vector: Boolean, Width: Double): ImageUploadResponse = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Vector = Vector.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUploadResponse]
  }
}

