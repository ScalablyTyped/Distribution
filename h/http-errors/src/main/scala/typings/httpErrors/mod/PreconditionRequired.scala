package typings.httpErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("http-errors", "PreconditionRequired")
@js.native
open class PreconditionRequired ()
  extends StObject
     with HttpError[typings.httpErrors.httpErrorsInts.`428`] {
  def this(msg: String) = this()
  
  /* CompleteClass */
  var expose: Boolean = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var status: typings.httpErrors.httpErrorsInts.`428` = js.native
  
  /* CompleteClass */
  var statusCode: typings.httpErrors.httpErrorsInts.`428` = js.native
}
object PreconditionRequired {
  
  @JSImport("http-errors", "PreconditionRequired")
  @js.native
  def apply(): HttpError[typings.httpErrors.httpErrorsInts.`428`] = js.native
  @JSImport("http-errors", "PreconditionRequired")
  @js.native
  def apply(msg: String): HttpError[typings.httpErrors.httpErrorsInts.`428`] = js.native
}
