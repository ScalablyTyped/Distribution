package typings.graphqlToolsLoad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/utils/custom-loader", JSImport.Namespace)
@js.native
object customLoaderMod extends js.Object {
  def getCustomLoaderByPath(path: String, cwd: String): js.Any = js.native
  def useCustomLoader(loaderPointer: js.Any, cwd: String): js.Promise[_] = js.native
  def useCustomLoaderSync(loaderPointer: js.Any, cwd: String): js.Any = js.native
}

