package typings.jupyterlabDocregistry.registryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentRegistry {
  /**
    * A type alias for a code context.
    */
  type CodeContext = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a code model factory.
    */
  type CodeModelFactory = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a context.
    */
  type Context = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard model factory.
    */
  type ModelFactory = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard widget extension.
    */
  type WidgetExtension = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetExtension[
    typings.luminoWidgets.mod.Widget, 
    typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory[
    typings.jupyterlabDocregistry.registryMod.IDocumentWidget[
      typings.luminoWidgets.mod.Widget, 
      typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
    ], 
    typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
}
