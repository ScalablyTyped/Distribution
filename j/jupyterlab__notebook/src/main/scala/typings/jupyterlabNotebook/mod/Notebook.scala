package typings.jupyterlabNotebook.mod

import typings.jupyterlabNotebook.widgetMod.Notebook.IContentFactory
import typings.jupyterlabNotebook.widgetMod.Notebook.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "Notebook")
@js.native
class Notebook protected ()
  extends typings.jupyterlabNotebook.widgetMod.Notebook {
  /**
    * Construct a notebook widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/notebook", "Notebook")
@js.native
object Notebook extends js.Object {
  /**
    * The default implementation of a notebook content factory..
    *
    * #### Notes
    * Override methods on this class to customize the default notebook factory
    * methods that create notebook content.
    */
  @js.native
  class ContentFactory ()
    extends typings.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory
  
  val defaultContentFactory: IContentFactory = js.native
  /**
    * A namespace for the notebook content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

