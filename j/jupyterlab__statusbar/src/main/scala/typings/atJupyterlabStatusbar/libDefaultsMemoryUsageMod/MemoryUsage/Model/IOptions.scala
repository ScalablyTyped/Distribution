package typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsage.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a MemoryUsage model.
  */
trait IOptions extends js.Object {
  /**
    * The refresh rate (in ms) for querying the server.
    */
  var refreshRate: Double
}

object IOptions {
  @scala.inline
  def apply(refreshRate: Double): IOptions = {
    val __obj = js.Dynamic.literal(refreshRate = refreshRate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

