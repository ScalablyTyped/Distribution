package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncMatchers[T, U] extends js.Object {
  
  /**
    * Invert the matcher following this expect.
    */
  var not: AsyncMatchers[T, U] = js.native
  
  /**
    * Expect a promise to be pending, i.e. the promise is neither resolved nor rejected.
    * @param expectationFailOutput
    */
  def toBePending(): js.Thenable[Unit] = js.native
  def toBePending(expectationFailOutput: js.Any): js.Thenable[Unit] = js.native
  
  /**
    * Expect a promise to be rejected.
    * @param expectationFailOutput
    */
  def toBeRejected(): js.Thenable[Unit] = js.native
  def toBeRejected(expectationFailOutput: js.Any): js.Thenable[Unit] = js.native
  
  /**
    * Expect a promise to be rejected with a value equal to the expected, using deep equality comparison.
    * @param expected Value that the promise is expected to be rejected with.
    */
  def toBeRejectedWith(expected: Expected[U]): js.Thenable[Unit] = js.native
  
  /**
    * Expect a promise to be rejected with a value matched to the expected.
    * @param expected Error constructor the object that was thrown needs to be an instance of. If not provided, Error will be used.
    * @param message The message that should be set on the thrown Error.
    */
  def toBeRejectedWithError(): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(expected: js.UndefOr[scala.Nothing], message: String): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(expected: js.UndefOr[scala.Nothing], message: RegExp): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ js.Any, Error]): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ js.Any, Error], message: String): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ js.Any, Error], message: RegExp): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(message: String): js.Thenable[Unit] = js.native
  def toBeRejectedWithError(message: RegExp): js.Thenable[Unit] = js.native
  
  /**
    * Expect a promise to be resolved.
    * @param expectationFailOutput
    */
  def toBeResolved(): js.Thenable[Unit] = js.native
  def toBeResolved(expectationFailOutput: js.Any): js.Thenable[Unit] = js.native
  
  /**
    * Expect a promise to be resolved to a value equal to the expected, using deep equality comparison.
    * @param expected Value that the promise is expected to resolve to.
    */
  def toBeResolvedTo(expected: Expected[T]): js.Thenable[Unit] = js.native
  
  /**
    * Add some context for an expect.
    * @param message Additional context to show when the matcher fails.
    */
  def withContext(message: String): AsyncMatchers[T, U] = js.native
}
