package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'stdout' | 'stderr', listr2.listr2.ProcessOutputStream> */
trait ProcessOutputStreamMap extends StObject {
  
  var stderr: ProcessOutputStream
  
  var stdout: ProcessOutputStream
}
object ProcessOutputStreamMap {
  
  inline def apply(stderr: ProcessOutputStream, stdout: ProcessOutputStream): ProcessOutputStreamMap = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOutputStreamMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessOutputStreamMap] (val x: Self) extends AnyVal {
    
    inline def setStderr(value: ProcessOutputStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: ProcessOutputStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
