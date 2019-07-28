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
    val __obj = js.Dynamic.literal(level = level, url = url)
  
    __obj.asInstanceOf[levelLoadingData]
  }
}

