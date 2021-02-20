package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Executable")
@js.native
class Executable protected () extends StObject {
  def this(spec: ExecutableSpecification) = this()
  
  /** Invoke the function or script. */
  def invoke(): js.Promise[AnyObject[_] | js.Array[_]] = js.native
  def invoke(options: ResultProcessingOptions): js.Promise[AnyObject[_] | js.Array[_]] = js.native
}
