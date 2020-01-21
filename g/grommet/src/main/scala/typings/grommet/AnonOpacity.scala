package typings.grommet

import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  var opacity: OpacityType
}

object AnonOpacity {
  @scala.inline
  def apply(opacity: OpacityType): AnonOpacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpacity]
  }
}

