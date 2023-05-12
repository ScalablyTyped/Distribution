package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListrLogLevels extends StObject
/** Default ListrLogLevels for the logger */
@JSImport("listr2", "ListrLogLevels")
@js.native
object ListrLogLevels extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListrLogLevels & String] = js.native
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ListrLogLevels
  /* "COMPLETED" */ val COMPLETED: typings.listr2.mod.ListrLogLevels.COMPLETED & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ListrLogLevels
  /* "FAILED" */ val FAILED: typings.listr2.mod.ListrLogLevels.FAILED & String = js.native
  
  @js.native
  sealed trait OUTPUT
    extends StObject
       with ListrLogLevels
  /* "OUTPUT" */ val OUTPUT: typings.listr2.mod.ListrLogLevels.OUTPUT & String = js.native
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with ListrLogLevels
  /* "PAUSED" */ val PAUSED: typings.listr2.mod.ListrLogLevels.PAUSED & String = js.native
  
  @js.native
  sealed trait PROMPT
    extends StObject
       with ListrLogLevels
  /* "PROMPT" */ val PROMPT: typings.listr2.mod.ListrLogLevels.PROMPT & String = js.native
  
  @js.native
  sealed trait RETRY
    extends StObject
       with ListrLogLevels
  /* "RETRY" */ val RETRY: typings.listr2.mod.ListrLogLevels.RETRY & String = js.native
  
  @js.native
  sealed trait ROLLBACK
    extends StObject
       with ListrLogLevels
  /* "ROLLBACK" */ val ROLLBACK: typings.listr2.mod.ListrLogLevels.ROLLBACK & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with ListrLogLevels
  /* "SKIPPED" */ val SKIPPED: typings.listr2.mod.ListrLogLevels.SKIPPED & String = js.native
  
  @js.native
  sealed trait STARTED
    extends StObject
       with ListrLogLevels
  /* "STARTED" */ val STARTED: typings.listr2.mod.ListrLogLevels.STARTED & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with ListrLogLevels
  /* "TITLE" */ val TITLE: typings.listr2.mod.ListrLogLevels.TITLE & String = js.native
}
