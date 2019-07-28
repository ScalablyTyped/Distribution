package typings.atJupyterlabDocumentsearch.libProvidersCodemirrorsearchproviderMod

import typings.codemirror.codemirrorMod.Position
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider", "SearchState")
@js.native
class SearchState () extends js.Object {
  var lastQuery: String = js.native
  var posFrom: Position = js.native
  var posTo: Position = js.native
  var query: RegExp = js.native
}

