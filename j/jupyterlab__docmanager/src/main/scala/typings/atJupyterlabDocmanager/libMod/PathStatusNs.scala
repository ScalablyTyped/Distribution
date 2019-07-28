package typings.atJupyterlabDocmanager.libMod

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib", "PathStatus")
@js.native
object PathStatusNs extends js.Object {
  /**
    * A VDomModel for rendering the PathStatus status item.
    */
  @js.native
  class Model protected ()
    extends typings.atJupyterlabDocmanager.libPathstatusMod.PathStatusNs.Model {
    /**
      * Construct a new model.
      *
      * @param docManager: the application document manager. Used to check
      *   whether the current widget is a document.
      */
    def this(docManager: IDocumentManager) = this()
  }
  
}

