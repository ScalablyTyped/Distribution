package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncMatchers[T, U] extends StObject {
  
  /**
    * Fail as soon as possible if the actual is pending. Otherwise evaluate the matcher.
    */
  var already: AsyncMatchers[T, U] = js.native
  
  /**
    * Invert the matcher following this expect.
    */
  var not: AsyncMatchers[T, U] = js.native
  
  /**
    * Expect a promise to be pending, i.e. the promise is neither resolved nor rejected.
    */
  def toBePending(): PromiseLike[Unit] = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBePending(expectationFailOutput: scala.Any): PromiseLike[Unit] = js.native
  
  /**
    * Expect a promise to be rejected.
    */
  def toBeRejected(): PromiseLike[Unit] = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeRejected(expectationFailOutput: scala.Any): PromiseLike[Unit] = js.native
  
  /**
    * Expect a promise to be rejected with a value equal to the expected, using deep equality comparison.
    * @param expected Value that the promise is expected to be rejected with.
    */
  def toBeRejectedWith(expected: Expected[U]): PromiseLike[Unit] = js.native
  
  /**
    * Expect a promise to be rejected with a value matched to the expected.
    * @param expected Error constructor the object that was thrown needs to be an instance of. If not provided, Error will be used.
    * @param message The message that should be set on the thrown Error.
    */
  def toBeRejectedWithError(): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error]): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: String): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(expected: Instantiable1[/* args (repeated) */ scala.Any, js.Error], message: js.RegExp): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(expected: Unit, message: String): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(expected: Unit, message: js.RegExp): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(message: String): PromiseLike[Unit] = js.native
  def toBeRejectedWithError(message: js.RegExp): PromiseLike[Unit] = js.native
  
  /**
    * Expect a promise to be resolved.
    */
  def toBeResolved(): PromiseLike[Unit] = js.native
  /**
    * @deprecated expectationFailOutput is deprecated. Use withContext instead.
    */
  // tslint:disable-next-line unified-signatures
  def toBeResolved(expectationFailOutput: scala.Any): PromiseLike[Unit] = js.native
  
  /**
    * Expect a promise to be resolved to a value equal to the expected, using deep equality comparison.
    * @param expected Value that the promise is expected to resolve to.
    */
  def toBeResolvedTo(expected: Expected[T]): PromiseLike[Unit] = js.native
  
  /**
    * Add some context for an expect.
    * @param message Additional context to show when the matcher fails.
    * @checkReturnValue see https://tsetse.info/check-return-value
    */
  def withContext(message: String): AsyncMatchers[T, U] = js.native
}
