package typings
package atJupyterlabApputilsLib.libInstancetrackerMod.InstanceTrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for an instance tracker.
  */
trait IOptions extends js.Object {
  /**
    * A namespace for all tracked widgets, (e.g., `notebook`).
    */
  var namespace: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(namespace: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal(namespace = namespace)
  
    __obj.asInstanceOf[IOptions]
  }
}

