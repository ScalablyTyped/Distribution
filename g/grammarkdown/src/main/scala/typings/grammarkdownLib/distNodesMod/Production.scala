package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Production")
@js.native
class Production protected ()
  extends SourceElementBase[grammarkdownLib.distTokensMod.SyntaxKind.Production] {
  def this(name: Identifier) = this()
  def this(name: Identifier, parameterList: ParameterList) = this()
  def this(name: Identifier, parameterList: js.UndefOr[scala.Nothing], colonToken: Token[grammarkdownLib.distTokensMod.ProductionSeperatorKind]) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Token[grammarkdownLib.distTokensMod.ProductionSeperatorKind]) = this()
  def this(name: Identifier, parameterList: js.UndefOr[scala.Nothing], colonToken: js.UndefOr[scala.Nothing], body: ProductionBody) = this()
  def this(name: Identifier, parameterList: js.UndefOr[scala.Nothing], colonToken: Token[grammarkdownLib.distTokensMod.ProductionSeperatorKind], body: ProductionBody) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: js.UndefOr[scala.Nothing], body: ProductionBody) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Token[grammarkdownLib.distTokensMod.ProductionSeperatorKind], body: ProductionBody) = this()
  val body: js.UndefOr[ProductionBody] = js.native
  val colonToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.ProductionSeperatorKind]] = js.native
  val name: Identifier = js.native
  val parameterList: js.UndefOr[ParameterList] = js.native
  def update(name: Identifier): Production = js.native
  def update(name: Identifier, parameterList: js.UndefOr[scala.Nothing], body: ProductionBody): Production = js.native
  def update(name: Identifier, parameterList: ParameterList): Production = js.native
  def update(name: Identifier, parameterList: ParameterList, body: ProductionBody): Production = js.native
}

