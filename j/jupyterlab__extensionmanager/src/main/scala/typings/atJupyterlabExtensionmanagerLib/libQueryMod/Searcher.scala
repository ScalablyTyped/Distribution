package typings
package atJupyterlabExtensionmanagerLib.libQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/extensionmanager/lib/query", "Searcher")
@js.native
/**
  * Create a Searcher object.
  *
  * @param repoUri The URI of the NPM registry to use.
  * @param cdnUri The URI of the CDN to use for fetching full package data.
  */
class Searcher () extends js.Object {
  def this(repoUri: java.lang.String) = this()
  def this(repoUri: java.lang.String, cdnUri: java.lang.String) = this()
  /**
    * The URI of the CDN to use for fetching full package data.
    */
  var cdnUri: java.lang.String = js.native
  /**
    * The URI of the NPM registry to use.
    */
  var repoUri: java.lang.String = js.native
  /**
    * Fetch package.json of a package
    *
    * @param name The package name.
    * @param version The version of the package to fetch.
    */
  def fetchPackageData(name: java.lang.String, version: java.lang.String): js.Promise[
    atJupyterlabExtensionmanagerLib.libCompanionsMod.IJupyterLabPackageData | scala.Null
  ] = js.native
  /**
    * Search for a jupyterlab extension.
    *
    * @param query The query to send. `keywords:"jupyterlab-extension"` will be appended to the query.
    * @param page The page of results to fetch.
    * @param pageination The pagination size to use. See registry API documentation for acceptable values.
    */
  def searchExtensions(query: java.lang.String): js.Promise[ISearchResult] = js.native
  def searchExtensions(query: java.lang.String, page: scala.Double): js.Promise[ISearchResult] = js.native
  def searchExtensions(query: java.lang.String, page: scala.Double, pageination: scala.Double): js.Promise[ISearchResult] = js.native
}

