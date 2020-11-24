package typings.jupyterlabNotebook.mod

import typings.jupyterlabNotebook.widgetMod.Notebook.IContentFactory
import typings.jupyterlabNotebook.widgetMod.Notebook.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  val defaultContentFactory: IContentFactory = js.native
  
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
  /**
    * A namespace for the notebook content factory.
    */
  @js.native
  object ContentFactory extends js.Object
}
