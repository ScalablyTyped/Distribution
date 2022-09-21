package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module schema
object op {
  
  @JSImport("lovefield", "op")
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(args: Predicate*): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Predicate]
  
  inline def not(operand: Predicate): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(operand.asInstanceOf[js.Any]).asInstanceOf[Predicate]
  
  inline def or(args: Predicate*): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Predicate]
}
