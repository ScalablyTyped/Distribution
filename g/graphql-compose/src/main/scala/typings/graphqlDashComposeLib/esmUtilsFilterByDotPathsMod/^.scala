package typings
package graphqlDashComposeLib.esmUtilsFilterByDotPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/utils/filterByDotPaths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filterByDotPaths(obj: js.Object): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter, opts: FilterOpts): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: scala.Null, opts: FilterOpts): js.Object = js.native
  def isPresentInDotFilter(name: java.lang.String): scala.Boolean = js.native
  def isPresentInDotFilter(name: java.lang.String, pathsFilter: java.lang.String): scala.Boolean = js.native
  def isPresentInDotFilter(name: java.lang.String, pathsFilter: js.Array[java.lang.String]): scala.Boolean = js.native
  def preparePathsFilter(): js.Array[java.lang.String] | scala.Null = js.native
  def preparePathsFilter(pathsFilter: PathsFilter): js.Array[java.lang.String] | scala.Null = js.native
}

