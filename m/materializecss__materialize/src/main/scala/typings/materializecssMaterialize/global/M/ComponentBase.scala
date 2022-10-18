package typings.materializecssMaterialize.global.M

import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("M.ComponentBase")
@js.native
open class ComponentBase[TOptions] ()
  extends StObject
     with typings.materializecssMaterialize.M.ComponentBase[TOptions] {
  def this(options: Partial[TOptions]) = this()
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: TOptions = js.native
}
