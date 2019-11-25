package typings.log4js.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppenderModule extends js.Object {
  var configure: js.Function
}

object AppenderModule {
  @scala.inline
  def apply(configure: js.Function): AppenderModule = {
    val __obj = js.Dynamic.literal(configure = configure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppenderModule]
  }
}

