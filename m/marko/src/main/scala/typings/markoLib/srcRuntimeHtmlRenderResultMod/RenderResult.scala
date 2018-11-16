package typings
package markoLib.srcRuntimeHtmlRenderResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderResult
  extends markoLib.srcRuntimeDomElementMod.DomElement {
  var document: stdLib.Document | markoLib.markoLibNumbers.`false` = js.native
  def apply(out: js.Any): this.type = js.native
  def afterInsert(doc: stdLib.Document): this.type = js.native
  def getComponent(): markoLib.srcComponentsComponentMod.Component = js.native
  def getComponents(): js.Array[markoLib.srcComponentsComponentMod.Component] = js.native
  def getComponents(selector: js.Any): js.Array[markoLib.srcComponentsComponentMod.Component] = js.native
  def getNode(doc: stdLib.Document): stdLib.Node = js.native
  def getOutput(): js.Any = js.native
}

