package typings.ldapjs.mod

import typings.ldapjs.anon.DnAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "ExtensibleFilter")
@js.native
class ExtensibleFilter protected ()
  extends StObject
     with Filter {
  def this(options: DnAttributes) = this()
  
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
