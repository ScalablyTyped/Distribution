package typings.ldapjs.mod

import typings.ldapjs.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "GreaterThanEqualsFilter")
@js.native
open class GreaterThanEqualsFilter protected ()
  extends StObject
     with Filter {
  def this(options: Value) = this()
  
  /* CompleteClass */
  override def matches(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
