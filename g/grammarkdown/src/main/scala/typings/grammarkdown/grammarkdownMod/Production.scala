package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Production")
@js.native
class Production protected ()
  extends SourceElementBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.Production] {
  def this(name: Identifier) = this()
  def this(name: Identifier, parameterList: ParameterList) = this()
  def this(name: Identifier, parameterList: Unit, colonToken: Token[ProductionSeperatorKind]) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Token[ProductionSeperatorKind]) = this()
  def this(name: Identifier, parameterList: Unit, colonToken: Unit, body: ProductionBody) = this()
  def this(
    name: Identifier,
    parameterList: Unit,
    colonToken: Token[ProductionSeperatorKind],
    body: ProductionBody
  ) = this()
  def this(name: Identifier, parameterList: ParameterList, colonToken: Unit, body: ProductionBody) = this()
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
  def update(name: Identifier, parameterList: Unit, body: ProductionBody): Production = js.native
  def update(name: Identifier, parameterList: ParameterList): Production = js.native
  def update(name: Identifier, parameterList: ParameterList, body: ProductionBody): Production = js.native
}
