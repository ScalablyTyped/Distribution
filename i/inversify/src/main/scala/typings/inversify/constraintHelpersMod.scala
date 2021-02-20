package typings.inversify

import typings.inversify.interfacesMod.interfaces.ConstraintFunction
import typings.inversify.interfacesMod.interfaces.Request
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraintHelpersMod {
  
  @JSImport("inversify/dts/syntax/constraint_helpers", "namedConstraint")
  @js.native
  def namedConstraint(value: js.Any): ConstraintFunction = js.native
  
  @JSImport("inversify/dts/syntax/constraint_helpers", "taggedConstraint")
  @js.native
  def taggedConstraint(key: PropertyKey): js.Function1[/* value */ js.Any, ConstraintFunction] = js.native
  
  @JSImport("inversify/dts/syntax/constraint_helpers", "traverseAncerstors")
  @js.native
  def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = js.native
  
  @JSImport("inversify/dts/syntax/constraint_helpers", "typeConstraint")
  @js.native
  def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = js.native
  @JSImport("inversify/dts/syntax/constraint_helpers", "typeConstraint")
  @js.native
  def typeConstraint(`type`: js.Function): js.Function1[/* request */ Request | Null, Boolean] = js.native
}
