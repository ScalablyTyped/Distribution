package typings.listr2.mod

import typings.listr2.listr2Strings.stderr
import typings.listr2.listr2Strings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Customize the behavior of the ProcessOutput.
  */
trait ProcessOutputOptions extends StObject {
  
  /**
    * After the `ProcessOutput.release()` which streams should be dumped.
    *
    * @defaultValue `[ 'stdout', 'stderr' ]`
    */
  var dump: js.UndefOr[js.Array[stdout | stderr]] = js.undefined
  
  /**
    * After the `ProcessOutput.release()` whether to leave empty line or not.
    *
    * @defaultValue `true`
    */
  var leaveEmptyLine: js.UndefOr[Boolean] = js.undefined
}
object ProcessOutputOptions {
  
  inline def apply(): ProcessOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOutputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessOutputOptions] (val x: Self) extends AnyVal {
    
    inline def setDump(value: js.Array[stdout | stderr]): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
    
    inline def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
    
    inline def setDumpVarargs(value: (stdout | stderr)*): Self = StObject.set(x, "dump", js.Array(value*))
    
    inline def setLeaveEmptyLine(value: Boolean): Self = StObject.set(x, "leaveEmptyLine", value.asInstanceOf[js.Any])
    
    inline def setLeaveEmptyLineUndefined: Self = StObject.set(x, "leaveEmptyLine", js.undefined)
  }
}
