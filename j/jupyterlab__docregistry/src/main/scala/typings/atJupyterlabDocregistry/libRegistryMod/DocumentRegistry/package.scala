package typings.atJupyterlabDocregistry.libRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentRegistry {
  import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
  import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget

  /**
    * A type alias for a code context.
    */
  type CodeContext = IContext[ICodeModel]
  /**
    * A type alias for a code model factory.
    */
  type CodeModelFactory = IModelFactory[ICodeModel]
  /**
    * A type alias for a context.
    */
  type Context = IContext[IModel]
  /**
    * A type alias for a standard model factory.
    */
  type ModelFactory = IModelFactory[IModel]
  /**
    * A type alias for a standard widget extension.
    */
  type WidgetExtension = IWidgetExtension[Widget, IModel]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = IWidgetFactory[IDocumentWidget[Widget, IModel], IModel]
}
