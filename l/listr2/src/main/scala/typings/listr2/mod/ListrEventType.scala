package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrEventType extends StObject
/**
  * Events that are triggered by Listr.
  *
  * These are stateful and singleton events by being attached to the main Listr class and propagating to the subtasks.
  *
  * @see {@link https://listr2.kilic.dev/listr/events.html}
  */
@JSImport("listr2", "ListrEventType")
@js.native
object ListrEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrEventType & String] = js.native
  
  /** Indicates that underlying renderer should refresh the current render. */
  @js.native
  sealed trait SHOULD_REFRESH_RENDER
    extends StObject
       with ListrEventType
  /* "SHOUD_REFRESH_RENDER" */ val SHOULD_REFRESH_RENDER: typings.listr2.mod.ListrEventType.SHOULD_REFRESH_RENDER & String = js.native
}
