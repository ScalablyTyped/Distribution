package typings.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module schema
object op {
  
  @JSImport("lovefield", "op.and")
  @js.native
  def and(args: Predicate*): Predicate = js.native
  
  @JSImport("lovefield", "op.not")
  @js.native
  def not(operand: Predicate): Predicate = js.native
  
  @JSImport("lovefield", "op.or")
  @js.native
  def or(args: Predicate*): Predicate = js.native
}
