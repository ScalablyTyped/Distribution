package typings.httpErrors.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("http-errors", "406")
@js.native
open class `406` ()
  extends StObject
     with HttpError[typings.httpErrors.httpErrorsInts.`406`] {
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
  var status: typings.httpErrors.httpErrorsInts.`406` = js.native
  
  /* CompleteClass */
  var statusCode: typings.httpErrors.httpErrorsInts.`406` = js.native
}
object `406` {
  
  @JSImport("http-errors", "406")
  @js.native
  def apply(): HttpError[typings.httpErrors.httpErrorsInts.`406`] = js.native
  @JSImport("http-errors", "406")
  @js.native
  def apply(msg: String): HttpError[typings.httpErrors.httpErrorsInts.`406`] = js.native
}
