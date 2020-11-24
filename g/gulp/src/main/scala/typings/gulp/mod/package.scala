package typings.gulp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Globs = java.lang.String | js.Array[java.lang.String]
  
  /**
    * @deprecated - Now use `TaskFunction`.
    */
  type TaskCallback = typings.gulp.mod.TaskFunction
  
  type TaskFunction = typings.undertaker.mod.TaskFunction
}
