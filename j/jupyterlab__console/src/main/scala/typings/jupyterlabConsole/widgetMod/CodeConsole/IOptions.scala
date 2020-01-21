package typings.jupyterlabConsole.widgetMod.CodeConsole

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
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
  var mimeTypeService: IEditorMimeTypeService
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
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry,
    session: IClientSession,
    modelFactory: IModelFactory = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    if (modelFactory != null) __obj.updateDynamic("modelFactory")(modelFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

