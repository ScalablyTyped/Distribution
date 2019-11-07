package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetOptions extends StyleSheetFactoryOptions {
  var Renderer: typings.jss.jssMod.Renderer = js.native
  @JSName("generateId")
  var generateId_Original: GenerateId = js.native
  @JSName("index")
  var index_StyleSheetOptions: Double = js.native
  var insertionPoint: js.UndefOr[InsertionPoint] = js.native
  var jss: Jss = js.native
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule): String = js.native
  @JSName("generateId")
  def generateId_MStyleSheetOptions(rule: Rule, sheet: StyleSheet[String]): String = js.native
}

