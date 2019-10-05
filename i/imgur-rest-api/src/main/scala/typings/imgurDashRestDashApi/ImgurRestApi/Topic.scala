package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  var description: String
  var id: Double
  var name: String
}

object Topic {
  @scala.inline
  def apply(description: String, id: Double, name: String): Topic = {
    val __obj = js.Dynamic.literal(description = description, id = id, name = name)
  
    __obj.asInstanceOf[Topic]
  }
}

