package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevels extends StObject
/** Default loglevels for the logger */
@JSImport("listr2", "LogLevels")
@js.native
object LogLevels extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogLevels & String] = js.native
  
  @js.native
  sealed trait DATA
    extends StObject
       with LogLevels
  /* "DATA" */ val DATA: typings.listr2.mod.LogLevels.DATA & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with LogLevels
  /* "FAILED" */ val FAILED: typings.listr2.mod.LogLevels.FAILED & String = js.native
  
  @js.native
  sealed trait RETRY
    extends StObject
       with LogLevels
  /* "RETRY" */ val RETRY: typings.listr2.mod.LogLevels.RETRY & String = js.native
  
  @js.native
  sealed trait ROLLBACK
    extends StObject
       with LogLevels
  /* "ROLLBACK" */ val ROLLBACK: typings.listr2.mod.LogLevels.ROLLBACK & String = js.native
  
  @js.native
  sealed trait SILENT
    extends StObject
       with LogLevels
  /* "SILENT" */ val SILENT: typings.listr2.mod.LogLevels.SILENT & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with LogLevels
  /* "SKIPPED" */ val SKIPPED: typings.listr2.mod.LogLevels.SKIPPED & String = js.native
  
  @js.native
  sealed trait STARTED
    extends StObject
       with LogLevels
  /* "STARTED" */ val STARTED: typings.listr2.mod.LogLevels.STARTED & String = js.native
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with LogLevels
  /* "SUCCESS" */ val SUCCESS: typings.listr2.mod.LogLevels.SUCCESS & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with LogLevels
  /* "TITLE" */ val TITLE: typings.listr2.mod.LogLevels.TITLE & String = js.native
}
