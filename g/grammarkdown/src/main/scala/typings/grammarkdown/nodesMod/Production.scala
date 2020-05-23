package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.ProductionSeperatorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Production")
@js.native
class Production protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.Production] {
  def this(name: Identifier) = this()
  def this(name: Identifier, parameterList: ParameterList) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Token[ProductionSeperatorKind]) = this()
  def this(
    name: Identifier,
    parameterList: ParameterList,
    colonToken: Token[ProductionSeperatorKind],
    body: ProductionBody
  ) = this()
  val body: js.UndefOr[ProductionBody] = js.native
  val colonToken: js.UndefOr[Token[ProductionSeperatorKind]] = js.native
  val name: Identifier = js.native
  val parameterList: js.UndefOr[ParameterList] = js.native
  def update(name: Identifier): Production = js.native
  def update(name: Identifier, parameterList: ParameterList): Production = js.native
  def update(name: Identifier, parameterList: ParameterList, body: ProductionBody): Production = js.native
}

