package typings
package atJupyterlabDocmanagerLib.libWidgetmanagerMod.DocumentWidgetManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document widget manager.
  */
trait IOptions extends js.Object {
  /**
    * A document registry instance.
    */
  var registry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry
}

object IOptions {
  @scala.inline
  def apply(registry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry): IOptions = {
    val __obj = js.Dynamic.literal(registry = registry)
  
    __obj.asInstanceOf[IOptions]
  }
}

