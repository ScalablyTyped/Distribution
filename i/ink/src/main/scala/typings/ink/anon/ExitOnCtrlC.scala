package typings.ink.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitOnCtrlC extends StObject {
  
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
  
  var exitOnCtrlC: Validator[Boolean] = js.native
  
  var onExit: Validator[js.Function1[/* repeated */ _, _]] = js.native
  
  var stderr: Validator[js.Object] = js.native
  
  var stdin: Validator[js.Object] = js.native
  
  var stdout: Validator[js.Object] = js.native
  
  var writeToStderr: Validator[js.Function1[/* repeated */ _, _]] = js.native
  
  var writeToStdout: Validator[js.Function1[/* repeated */ _, _]] = js.native
}
object ExitOnCtrlC {
  
  @scala.inline
  def apply(
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    exitOnCtrlC: Validator[Boolean],
    onExit: Validator[js.Function1[/* repeated */ _, _]],
    stderr: Validator[js.Object],
    stdin: Validator[js.Object],
    stdout: Validator[js.Object],
    writeToStderr: Validator[js.Function1[/* repeated */ _, _]],
    writeToStdout: Validator[js.Function1[/* repeated */ _, _]]
  ): ExitOnCtrlC = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], writeToStderr = writeToStderr.asInstanceOf[js.Any], writeToStdout = writeToStdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitOnCtrlC]
  }
  
  @scala.inline
  implicit class ExitOnCtrlCMutableBuilder[Self <: ExitOnCtrlC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitOnCtrlC(value: Validator[Boolean]): Self = StObject.set(x, "exitOnCtrlC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExit(value: Validator[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: Validator[js.Object]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdin(value: Validator[js.Object]): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: Validator[js.Object]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteToStderr(value: Validator[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "writeToStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteToStdout(value: Validator[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "writeToStdout", value.asInstanceOf[js.Any])
  }
}
