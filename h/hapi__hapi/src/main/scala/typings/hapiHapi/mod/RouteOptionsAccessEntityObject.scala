package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsAccessEntityObject extends _RouteOptionsAccessObject {
  var entity: AccessEntity
}

object RouteOptionsAccessEntityObject {
  @scala.inline
  def apply(entity: AccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
}

