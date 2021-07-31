package typings.ldapjs.mod

import typings.ldapjs.anon.Any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "SubstringFilter")
@js.native
class SubstringFilter protected ()
  extends StObject
     with Filter {
  def this(options: Any) = this()
  
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
