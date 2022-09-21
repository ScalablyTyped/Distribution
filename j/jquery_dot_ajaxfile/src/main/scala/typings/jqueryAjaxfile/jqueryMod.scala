package typings.jqueryAjaxfile

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jqueryMod extends Shortcut {
  
  @JSImport("jquery", JSImport.Namespace)
  @js.native
  val ^ : JQueryStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jquery", "Event")
  @js.native
  open class Event protected ()
    extends StObject
       with JQueryEventObject {
    def this(name: String) = this()
    def this(name: String, eventProperties: Any) = this()
  }
  
  type _To = JQueryStatic
  
  /* This means you don't have to write `^`, but can instead just say `jqueryMod.foo` */
  override def _to: JQueryStatic = ^
}
