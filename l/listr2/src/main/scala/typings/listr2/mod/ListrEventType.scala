package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrEventType extends StObject
/** Type of listr internal events. */
@JSImport("listr2", "ListrEventType")
@js.native
object ListrEventType extends StObject {
  
  @js.native
  sealed trait DATA
    extends StObject
       with ListrEventType
  
  @js.native
  sealed trait ENABLED
    extends StObject
       with ListrEventType
  
  @js.native
  sealed trait MESSAGE
    extends StObject
       with ListrEventType
  
  @js.native
  sealed trait STATE
    extends StObject
       with ListrEventType
  
  @js.native
  sealed trait SUBTASK
    extends StObject
       with ListrEventType
  
  @js.native
  sealed trait TITLE
    extends StObject
       with ListrEventType
}
