package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrTaskEventType extends StObject
/**
  * Internal events that are fired from the Task.
  *
  * @see {@link https://listr2.kilic.dev/task/events.html}
  */
@JSImport("listr2", "ListrTaskEventType")
@js.native
object ListrTaskEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrTaskEventType & String] = js.native
  
  /** The current Task is closed and no further action in expected. */
  @js.native
  sealed trait CLOSED
    extends StObject
       with ListrTaskEventType
  /* "CLOSED" */ val CLOSED: typings.listr2.mod.ListrTaskEventType.CLOSED & String = js.native
  
  /** The current Task has been marked as enabled. */
  @js.native
  sealed trait ENABLED
    extends StObject
       with ListrTaskEventType
  /* "ENABLED" */ val ENABLED: typings.listr2.mod.ListrTaskEventType.ENABLED & String = js.native
  
  /**
    * The current Task is now dumping a message.
    *
    * @see {module:Listr2.ListrTaskMessage}
    */
  @js.native
  sealed trait MESSAGE
    extends StObject
       with ListrTaskEventType
  /* "MESSAGE" */ val MESSAGE: typings.listr2.mod.ListrTaskEventType.MESSAGE & String = js.native
  
  /** The current Task is now dumping output. */
  @js.native
  sealed trait OUTPUT
    extends StObject
       with ListrTaskEventType
  /* "OUTPUT" */ val OUTPUT: typings.listr2.mod.ListrTaskEventType.OUTPUT & String = js.native
  
  /** The current Task is now processing a prompt. */
  @js.native
  sealed trait PROMPT
    extends StObject
       with ListrTaskEventType
  /* "PROMPT" */ val PROMPT: typings.listr2.mod.ListrTaskEventType.PROMPT & String = js.native
  
  /**
    * State has changed for the current Task.
    *
    * @see {@link module:listr2.ListrTaskState}
    */
  @js.native
  sealed trait STATE
    extends StObject
       with ListrTaskEventType
  /* "STATE" */ val STATE: typings.listr2.mod.ListrTaskEventType.STATE & String = js.native
  
  /** The current Task is currently processing subtasks. */
  @js.native
  sealed trait SUBTASK
    extends StObject
       with ListrTaskEventType
  /* "SUBTASK" */ val SUBTASK: typings.listr2.mod.ListrTaskEventType.SUBTASK & String = js.native
  
  /** Title has changed for the current Task. */
  @js.native
  sealed trait TITLE
    extends StObject
       with ListrTaskEventType
  /* "TITLE" */ val TITLE: typings.listr2.mod.ListrTaskEventType.TITLE & String = js.native
}
