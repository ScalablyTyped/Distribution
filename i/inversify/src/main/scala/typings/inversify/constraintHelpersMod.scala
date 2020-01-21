package typings.inversify

import typings.inversify.interfacesMod.interfaces.ConstraintFunction
import typings.inversify.interfacesMod.interfaces.Request
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/constraint_helpers", JSImport.Namespace)
@js.native
object constraintHelpersMod extends js.Object {
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
}

