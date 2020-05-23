package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.ArgumentOperatorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Argument")
@js.native
class Argument ()
  extends typings.grammarkdown.nodesMod.Argument {
  def this(operatorToken: typings.grammarkdown.nodesMod.Token[ArgumentOperatorKind]) = this()
  def this(
    operatorToken: typings.grammarkdown.nodesMod.Token[ArgumentOperatorKind],
    name: typings.grammarkdown.nodesMod.Identifier
  ) = this()
}

