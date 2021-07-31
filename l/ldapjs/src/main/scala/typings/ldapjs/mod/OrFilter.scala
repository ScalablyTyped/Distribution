package typings.ldapjs.mod

import typings.ldapjs.anon.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "OrFilter")
@js.native
class OrFilter protected ()
  extends StObject
     with Filter {
  def this(options: Filters) = this()
  
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
