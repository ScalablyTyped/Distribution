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
    val __obj = js.Dynamic.literal(Error = Error, Height = Height, Type = Type, Vector = Vector, Width = Width)
  
    __obj.asInstanceOf[ImageUploadResponse]
  }
}

