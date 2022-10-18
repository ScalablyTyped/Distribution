package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.ConstraintFunction
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import typings.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxConstraintHelpersMod {
  
  @JSImport("inversify/lib/syntax/constraint_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def namedConstraint(value: Any): ConstraintFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("namedConstraint")(value.asInstanceOf[js.Any]).asInstanceOf[ConstraintFunction]
  
  inline def taggedConstraint(key: String): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  inline def taggedConstraint(key: js.Symbol): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  inline def taggedConstraint(key: Double): js.Function1[/* value */ Any, ConstraintFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("taggedConstraint")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, ConstraintFunction]]
  
  inline def traverseAncerstors(request: Request, constraint: ConstraintFunction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseAncerstors")(request.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def typeConstraint(`type`: String): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
  inline def typeConstraint(`type`: NewableFunction): js.Function1[/* request */ Request | Null, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeConstraint")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request | Null, Boolean]]
}
