package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.Element.GenericAttributes
import typings.jointjs.mod.dia.Graph.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "shapes.standard.Cylinder")
@js.native
class Cylinder () extends Element {
  def this(attributes: GenericAttributes[CylinderSelectors]) = this()
  def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
  def this(attributes: GenericAttributes[CylinderSelectors], opt: Options) = this()
  
  def topRy(): String | Double = js.native
  def topRy(t: String): this.type = js.native
  def topRy(t: String, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
  def topRy(t: Double): this.type = js.native
  def topRy(t: Double, opt: typings.jointjs.mod.dia.Cell.Options): this.type = js.native
}
