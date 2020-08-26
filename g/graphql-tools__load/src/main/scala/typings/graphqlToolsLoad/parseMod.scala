package typings.graphqlToolsLoad

import typings.graphqlToolsLoad.anon.PartialSource
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/load-typedefs/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  @js.native
  trait ParseOptions extends js.Object {
    @JSName("addValidSource")
    var addValidSource_Original: AddValidSource = js.native
    var globOptions: js.Any = js.native
    var options: js.Any = js.native
    var partialSource: PartialSource = js.native
    var pointerOptionMap: js.Any = js.native
    def addValidSource(source: Source): Unit = js.native
  }
  
  def parseSource(hasPartialSourceOptionsGlobOptionsPointerOptionMapAddValidSource: ParseOptions): Unit = js.native
  type AddValidSource = js.Function1[/* source */ Source, Unit]
}

