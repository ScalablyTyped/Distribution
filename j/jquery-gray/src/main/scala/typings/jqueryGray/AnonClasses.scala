package typings.jqueryGray

import typings.jqueryGray.mod.Classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClasses extends js.Object {
  var classes: Classes
  var fade: Boolean
}

object AnonClasses {
  @scala.inline
  def apply(classes: Classes, fade: Boolean): AnonClasses = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], fade = fade.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClasses]
  }
}

