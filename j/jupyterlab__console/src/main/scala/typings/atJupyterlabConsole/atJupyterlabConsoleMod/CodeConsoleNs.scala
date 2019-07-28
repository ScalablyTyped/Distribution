package typings.atJupyterlabConsole.atJupyterlabConsoleMod

import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IContentFactory
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IModelFactoryOptions
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
    extends typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ContentFactory
  
  /**
    * The default implementation of an `IModelFactory`.
    */
  @js.native
  /**
    * Create a new cell model factory.
    */
  class ModelFactory ()
    extends typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ModelFactory {
    def this(options: IModelFactoryOptions) = this()
  }
  
  /**
    * A default content factory for the code console.
    */
  val defaultContentFactory: IContentFactory = js.native
  /**
    * The default `ModelFactory` instance.
    */
  val defaultModelFactory: typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ModelFactory = js.native
  /**
    * A namespace for the code console content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object
  
}

