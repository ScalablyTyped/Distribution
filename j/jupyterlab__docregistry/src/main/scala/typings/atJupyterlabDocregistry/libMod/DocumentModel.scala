package typings.atJupyterlabDocregistry.libMod

import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel ()
  extends typings.atJupyterlabDocregistry.libDefaultMod.DocumentModel {
  def this(languagePreference: String) = this()
  def this(languagePreference: String, modelDB: IModelDB) = this()
}

