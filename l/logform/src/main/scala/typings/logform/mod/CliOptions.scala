package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliOptions
  extends ColorizeOptions
     with PadLevelsOptions

object CliOptions {
  @scala.inline
  def apply(): CliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliOptions]
  }
}

