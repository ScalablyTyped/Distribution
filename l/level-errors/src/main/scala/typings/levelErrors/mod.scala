package typings.levelErrors

import typings.levelErrors.levelErrorsBooleans.`true`
import typings.levelErrors.levelErrorsInts.`404`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("level-errors", "EncodingError")
  @js.native
  open class EncodingError () extends LevelUPError
  
  @JSImport("level-errors", "InitializationError")
  @js.native
  open class InitializationError () extends LevelUPError
  
  @JSImport("level-errors", "LevelUPError")
  @js.native
  open class LevelUPError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("level-errors", "NotFoundError")
  @js.native
  open class NotFoundError () extends LevelUPError {
    
    val notFound: `true` = js.native
    
    val status: `404` = js.native
  }
  
  @JSImport("level-errors", "OpenError")
  @js.native
  open class OpenError () extends LevelUPError
  
  @JSImport("level-errors", "ReadError")
  @js.native
  open class ReadError () extends LevelUPError
  
  @JSImport("level-errors", "WriteError")
  @js.native
  open class WriteError () extends LevelUPError
}
