package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  var description: java.lang.String
  var id: scala.Double
  var name: java.lang.String
}

object Topic {
  @scala.inline
  def apply(description: java.lang.String, id: scala.Double, name: java.lang.String): Topic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Topic]
  }
}

