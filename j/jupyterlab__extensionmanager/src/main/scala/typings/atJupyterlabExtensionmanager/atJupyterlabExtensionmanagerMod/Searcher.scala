package typings.atJupyterlabExtensionmanager.atJupyterlabExtensionmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager", "Searcher")
@js.native
/**
  * Create a Searcher object.
  *
  * @param repoUri The URI of the NPM registry to use.
  * @param cdnUri The URI of the CDN to use for fetching full package data.
  */
class Searcher ()
  extends typings.atJupyterlabExtensionmanager.libQueryMod.Searcher {
  def this(repoUri: String) = this()
  def this(repoUri: String, cdnUri: String) = this()
}

