package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reporter
trait ReporterOnStartOptions extends js.Object {
  var estimatedTime: Double
  var showStatus: Boolean
}

object ReporterOnStartOptions {
  @scala.inline
  def apply(estimatedTime: Double, showStatus: Boolean): ReporterOnStartOptions = {
    val __obj = js.Dynamic.literal(estimatedTime = estimatedTime, showStatus = showStatus)
  
    __obj.asInstanceOf[ReporterOnStartOptions]
  }
}

