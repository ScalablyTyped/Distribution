package typings
package atJupyterlabDocregistryLib.libMimedocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocumentFactory")
@js.native
class MimeDocumentFactory protected ()
  extends atJupyterlabDocregistryLib.libDefaultMod.ABCWidgetFactory[
      MimeDocument, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any
    ] {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: atJupyterlabDocregistryLib.libMimedocumentMod.MimeDocumentFactoryNs.IOptions[MimeDocument]) = this()
  var _dataType: js.Any = js.native
  var _fileType: js.Any = js.native
  var _renderTimeout: js.Any = js.native
  var _rendermime: js.Any = js.native
  /**
    * Create a new widget given a context.
    */
  /* protected */ def createNewWidget(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context): MimeDocument = js.native
}

