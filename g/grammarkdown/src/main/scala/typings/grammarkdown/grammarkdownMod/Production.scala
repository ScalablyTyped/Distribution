package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Production")
@js.native
class Production protected ()
  extends Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.Production] {
  def this(name: Identifier) = this()
  def this(name: Identifier, parameterList: ParameterList) = this()
  def this(
    name: Identifier,
    parameterList: js.UndefOr[scala.Nothing],
    colonToken: Token[ProductionSeperatorKind]
  ) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Token[ProductionSeperatorKind]) = this()
  def this(
    name: Identifier,
    parameterList: js.UndefOr[scala.Nothing],
    colonToken: js.UndefOr[scala.Nothing],
    body: ProductionBody
  ) = this()
  def this(
    name: Identifier,
    parameterList: js.UndefOr[scala.Nothing],
    colonToken: Token[ProductionSeperatorKind],
    body: ProductionBody
  ) = this()
  def this(
    name: Identifier,
    parameterList: ParameterList,
    colonToken: js.UndefOr[scala.Nothing],
    body: ProductionBody
  ) = this()
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
  def update(name: Identifier, parameterList: js.UndefOr[scala.Nothing], body: ProductionBody): Production = js.native
  def update(name: Identifier, parameterList: ParameterList): Production = js.native
  def update(name: Identifier, parameterList: ParameterList, body: ProductionBody): Production = js.native
}
