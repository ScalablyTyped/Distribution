package typings.graphqlToolsLoad

import typings.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/load-typedefs/load-file", JSImport.Namespace)
@js.native
object loadFileMod extends js.Object {
  def loadFile(pointer: String, options: LoadTypedefsOptionskeystr): js.Promise[Source] = js.native
  def loadFileSync(pointer: String, options: LoadTypedefsOptionskeystr): Source = js.native
}

