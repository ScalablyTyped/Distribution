package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageUploadResponse extends js.Object {
  var Error: java.lang.String
  var Height: scala.Double
  var Type: java.lang.String
  var Vector: scala.Boolean
  var Width: scala.Double
}

object ImageUploadResponse {
  @scala.inline
  def apply(
    Error: java.lang.String,
    Height: scala.Double,
    Type: java.lang.String,
    Vector: scala.Boolean,
    Width: scala.Double
  ): ImageUploadResponse = {
    val __obj = js.Dynamic.literal(Error = Error, Height = Height, Type = Type, Vector = Vector, Width = Width)
  
    __obj.asInstanceOf[ImageUploadResponse]
  }
}

