package typings.atJupyterlabConsole.libWidgetMod.CodeConsole

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console widget.
  */
trait IOptions extends js.Object {
  /**
    * The content factory for the console widget.
    */
  var contentFactory: IContentFactory
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.undefined
  /**
    * The mime renderer for the console widget.
    */
  var rendermime: IRenderMimeRegistry
  /**
    * The client session for the console widget.
    */
  var session: IClientSession
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any,
    rendermime: IRenderMimeRegistry,
    session: IClientSession,
    modelFactory: IModelFactory = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory, mimeTypeService = mimeTypeService, rendermime = rendermime, session = session)
    if (modelFactory != null) __obj.updateDynamic("modelFactory")(modelFactory)
    __obj.asInstanceOf[IOptions]
  }
}

