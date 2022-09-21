package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZoneOffsetTransition")
@js.native
/* private */ open class ZoneOffsetTransition ()
  extends typings.jsJodaCore.mod.ZoneOffsetTransition
/* static members */
object ZoneOffsetTransition {
  
  @JSGlobal("JSJoda.ZoneOffsetTransition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(
    transition: typings.jsJodaCore.mod.LocalDateTime,
    offsetBefore: typings.jsJodaCore.mod.ZoneOffset,
    offsetAfter: typings.jsJodaCore.mod.ZoneOffset
  ): typings.jsJodaCore.mod.ZoneOffsetTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(transition.asInstanceOf[js.Any], offsetBefore.asInstanceOf[js.Any], offsetAfter.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.ZoneOffsetTransition]
}
