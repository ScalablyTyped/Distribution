package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FancytreeSelectMode extends StObject
@JSGlobal("Fancytree.FancytreeSelectMode")
@js.native
object FancytreeSelectMode extends StObject {
  
  @js.native
  sealed trait multi
    extends StObject
       with FancytreeSelectMode
  
  @js.native
  sealed trait mutlti_hier
    extends StObject
       with FancytreeSelectMode
  
  @js.native
  sealed trait single
    extends StObject
       with FancytreeSelectMode
}
