package typings.atJupyterlabDocmanager.libPathstatusMod.PathStatus

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating the PathStatus widget.
  */
trait IOptions extends js.Object {
  /**
    * The application document manager.
    */
  var docManager: IDocumentManager
}

object IOptions {
  @scala.inline
  def apply(docManager: IDocumentManager): IOptions = {
    val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

