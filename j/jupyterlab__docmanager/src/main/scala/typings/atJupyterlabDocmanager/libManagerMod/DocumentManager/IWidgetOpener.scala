package typings.atJupyterlabDocmanager.libManagerMod.DocumentManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a widget opener.
  */
@js.native
trait IWidgetOpener extends js.Object {
  /**
    * Open the given widget.
    */
  def open(
    widget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget */ js.Any
  ): Unit = js.native
  def open(
    widget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentWidget */ js.Any,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IOpenOptions */ js.Any
  ): Unit = js.native
}

