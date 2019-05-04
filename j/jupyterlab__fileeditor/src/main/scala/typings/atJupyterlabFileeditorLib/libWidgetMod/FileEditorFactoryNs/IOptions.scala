package typings
package atJupyterlabFileeditorLib.libWidgetMod.FileEditorFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor services used by the factory.
    */
  var editorServices: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorServices */ js.Any
  /**
    * The factory options associated with the factory.
    */
  var factoryOptions: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atJupyterlabFileeditorLib.libWidgetMod.FileEditor, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ]
}

object IOptions {
  @scala.inline
  def apply(
    editorServices: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorServices */ js.Any,
    factoryOptions: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[
      atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
        atJupyterlabFileeditorLib.libWidgetMod.FileEditor, 
        atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
      ]
    ]
  ): IOptions = {
    val __obj = js.Dynamic.literal(editorServices = editorServices, factoryOptions = factoryOptions)
  
    __obj.asInstanceOf[IOptions]
  }
}

