package typings.atJupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager

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
  var registry: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry */ js.Any
}

object IOptions {
  @scala.inline
  def apply(
    registry: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry */ js.Any
  ): IOptions = {
    val __obj = js.Dynamic.literal(registry = registry)
  
    __obj.asInstanceOf[IOptions]
  }
}

