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
  
  @js.native
  sealed trait DATA
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait FAILED
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait RETRY
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait ROLLBACK
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait SILENT
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait STARTED
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with LogLevels
  
  @js.native
  sealed trait TITLE
    extends StObject
       with LogLevels
}
