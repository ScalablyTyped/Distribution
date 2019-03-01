package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsAccessEntityObject extends _RouteOptionsAccessObject {
  var entity: RouteOptionsAccessEntity
}

object RouteOptionsAccessEntityObject {
  @scala.inline
  def apply(entity: RouteOptionsAccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity)
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
}

