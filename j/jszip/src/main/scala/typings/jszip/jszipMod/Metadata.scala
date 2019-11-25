package typings.jszip.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var currentFile: String
  var percent: Double
}

object Metadata {
  @scala.inline
  def apply(currentFile: String, percent: Double): Metadata = {
    val __obj = js.Dynamic.literal(currentFile = currentFile.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

