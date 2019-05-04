package typings
package atJupyterlabDocregistryLib.libDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/docregistry/lib/default", "TextModelFactory")
@js.native
class TextModelFactory () extends js.Object {
  var _isDisposed: js.Any = js.native
  /**
    * The type of the file.
    *
    * #### Notes
    * This is a read-only property.
    */
  val contentType: atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType = js.native
  /**
    * The format of the file.
    *
    * This is a read-only property.
    */
  val fileFormat: atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat = js.native
  /**
    * Get whether the model factory has been disposed.
    */
  val isDisposed: scala.Boolean = js.native
  /**
    * The name of the model type.
    *
    * #### Notes
    * This is a read-only property.
    */
  val name: java.lang.String = js.native
  /**
    * Create a new model.
    *
    * @param languagePreference - An optional kernel language preference.
    *
    * @returns A new document model.
    */
  def createNew(): js.Any = js.native
  def createNew(languagePreference: java.lang.String): js.Any = js.native
  def createNew(languagePreference: java.lang.String, modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB): js.Any = js.native
  /**
    * Dispose of the resources held by the model factory.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Get the preferred kernel language given a file path.
    */
  def preferredLanguage(path: java.lang.String): java.lang.String = js.native
}

