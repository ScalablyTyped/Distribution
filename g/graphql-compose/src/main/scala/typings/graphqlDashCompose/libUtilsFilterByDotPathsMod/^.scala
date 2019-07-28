package typings.graphqlDashCompose.libUtilsFilterByDotPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/filterByDotPaths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filterByDotPaths(obj: js.Object): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: Null, opts: FilterOpts): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter): js.Object = js.native
  def filterByDotPaths(obj: js.Object, pathsFilter: PathsFilter, opts: FilterOpts): js.Object = js.native
  def isPresentInDotFilter(name: String): Boolean = js.native
  def isPresentInDotFilter(name: String, pathsFilter: String): Boolean = js.native
  def isPresentInDotFilter(name: String, pathsFilter: js.Array[String]): Boolean = js.native
  def preparePathsFilter(): js.Array[String] | Null = js.native
  def preparePathsFilter(pathsFilter: PathsFilter): js.Array[String] | Null = js.native
}

