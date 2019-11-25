package typings.grunt.grunt.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @note When result is coerced to a string, the value is stdout if the exit code
  *       was zero, the fallback if the exit code was non-zero and a fallback was
  *       specified, or stderr if the exit code was non-zero and a fallback was
  *       not specified.
  */
trait ISpawnResult extends js.Object {
  var code: Double
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object ISpawnResult {
  @scala.inline
  def apply(code: Double, stderr: java.lang.String, stdout: java.lang.String): ISpawnResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpawnResult]
  }
}

