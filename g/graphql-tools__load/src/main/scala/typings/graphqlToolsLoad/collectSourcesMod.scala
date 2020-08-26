package typings.graphqlToolsLoad

import typings.graphqlToolsLoad.anon.Options
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/load-typedefs/collect-sources", JSImport.Namespace)
@js.native
object collectSourcesMod extends js.Object {
  def collectSources[TOptions](hasPointerOptionMapOptions: Options[TOptions]): js.Promise[js.Array[Source]] = js.native
  def collectSourcesSync[TOptions](hasPointerOptionMapOptions: Options[TOptions]): js.Array[Source] = js.native
}

