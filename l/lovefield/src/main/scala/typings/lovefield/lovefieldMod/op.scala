package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module schema
@JSImport("lovefield", "op")
@js.native
object op extends js.Object {
  def and(args: Predicate*): Predicate = js.native
  def not(operand: Predicate): Predicate = js.native
  def or(args: Predicate*): Predicate = js.native
}

