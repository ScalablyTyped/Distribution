package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelLoadingData extends js.Object {
  var level: Double
  var url: String
}

object levelLoadingData {
  @scala.inline
  def apply(level: Double, url: String): levelLoadingData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[levelLoadingData]
  }
}

