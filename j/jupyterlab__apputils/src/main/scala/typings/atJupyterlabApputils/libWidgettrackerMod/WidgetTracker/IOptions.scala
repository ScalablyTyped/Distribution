package typings.atJupyterlabApputils.libWidgettrackerMod.WidgetTracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a widget tracker.
  */
trait IOptions extends js.Object {
  /**
    * A namespace for all tracked widgets, (e.g., `notebook`).
    */
  var namespace: String
}

object IOptions {
  @scala.inline
  def apply(namespace: String): IOptions = {
    val __obj = js.Dynamic.literal(namespace = namespace)
  
    __obj.asInstanceOf[IOptions]
  }
}

