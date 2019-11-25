package typings.atJupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager

import typings.atJupyterlabDocregistry.libMod.DocumentRegistry
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
  var registry: DocumentRegistry
}

object IOptions {
  @scala.inline
  def apply(registry: DocumentRegistry): IOptions = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

