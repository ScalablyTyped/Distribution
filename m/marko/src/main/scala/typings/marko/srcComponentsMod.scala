package typings.marko

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/components", JSImport.Namespace)
@js.native
object srcComponentsMod extends js.Object {
  def getRenderedComponents(out: js.Any): js.Any = js.native
  def writeInitComponentsCode(fromOut: js.Any, targetOut: js.Any, shouldIncludeAll: js.Any): Unit = js.native
  type Component = typings.marko.srcComponentsComponentMod.Component
}

