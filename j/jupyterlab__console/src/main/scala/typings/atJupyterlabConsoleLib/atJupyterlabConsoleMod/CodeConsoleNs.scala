package typings
package atJupyterlabConsoleLib.atJupyterlabConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console", "CodeConsole")
@js.native
object CodeConsoleNs extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.ContentFactory
  
  /**
    * The default implementation of an `IModelFactory`.
    */
  @js.native
  /**
    * Create a new cell model factory.
    */
  class ModelFactory ()
    extends atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.ModelFactory {
    def this(options: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IModelFactoryOptions) = this()
  }
  
  /**
    * A default content factory for the code console.
    */
  val defaultContentFactory: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IContentFactory = js.native
  /**
    * The default `ModelFactory` instance.
    */
  val defaultModelFactory: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.ModelFactory = js.native
  /**
    * A namespace for the code console content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

