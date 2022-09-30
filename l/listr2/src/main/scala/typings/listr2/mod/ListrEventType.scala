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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrEventType & String] = js.native
  
  @js.native
  sealed trait DATA
    extends StObject
       with ListrEventType
  /* "DATA" */ val DATA: typings.listr2.mod.ListrEventType.DATA & String = js.native
  
  @js.native
  sealed trait ENABLED
    extends StObject
       with ListrEventType
  /* "ENABLED" */ val ENABLED: typings.listr2.mod.ListrEventType.ENABLED & String = js.native
  
  @js.native
  sealed trait MESSAGE
    extends StObject
       with ListrEventType
  /* "MESSAGE" */ val MESSAGE: typings.listr2.mod.ListrEventType.MESSAGE & String = js.native
  
  @js.native
  sealed trait STATE
    extends StObject
       with ListrEventType
  /* "STATE" */ val STATE: typings.listr2.mod.ListrEventType.STATE & String = js.native
  
  @js.native
  sealed trait SUBTASK
    extends StObject
       with ListrEventType
  /* "SUBTASK" */ val SUBTASK: typings.listr2.mod.ListrEventType.SUBTASK & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with ListrEventType
  /* "TITLE" */ val TITLE: typings.listr2.mod.ListrEventType.TITLE & String = js.native
}
