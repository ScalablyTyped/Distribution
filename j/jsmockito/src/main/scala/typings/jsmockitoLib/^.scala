package typings
package jsmockitoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  //
  // Functions that are copied by JsMockito.Integration.importTo() to the global scope are repeated here.
  //
  /**
    * Test if a given variable is a mock
    *
    * @param maybeMock An object
    * @return {boolean} true if the variable is a mock
    */
  def isMock(maybeMock: js.Any): scala.Boolean = js.native
  /**
    * Create a mockable and stubbable objects.
    *
    * <p>A mock is created with the constructor for an object as an argument.
    * Once created, the mock object will have all the same methods as the source
    * object which, when invoked, will return undefined by default.</p>
    *
    * <p>Stub declarations may then be made for these methods to have them return
    * useful values or perform actions when invoked.</p>
    *
    * <pre>
    * MyObject = function() {
    *   this.add = function(a, b) { return a + b }
    * };
    *
    * var mockObj = JsMockito.mock(MyObject);
    * mockObj.add(5, 4); // result is undefined
    *
    * JsMockito.when(mockFunc).add(1, 2).thenReturn(6);
    * mockObj.add(1, 2); // result is 6
    *
    * JsMockito.verify(mockObj).add(1, greaterThan(2)); // ok
    * JsMockito.verify(mockObj).add(1, equalTo(2)); // ok
    * JsMockito.verify(mockObj).add(1, 4); // will throw an exception
    * </pre>
    *
    * @param Obj {function} the constructor for the object to be mocked
    * @return {object} a mock object
    */
  def mock[T](Obj: jsmockitoLib.Anon_T[T]): T = js.native
  /**
    * Create a mockable and stubbable anonymous function.
    *
    * <p>Once created, the function can be invoked and will return undefined for
    * any interactions that do not match stub declarations.</p>
    *
    * <pre>
    * var mockFunc = JsMockito.mockFunction();
    * JsMockito.when(mockFunc).call(anything(), 1, 5).thenReturn(6);
    * mockFunc(1, 5); // result is 6
    * JsMockito.verify(mockFunc)(1, greaterThan(2));
    * </pre>
    *
    * @param funcName The name of the mock function to use in messages (defaults to 'func')
    * @param delegate The function to delegate unstubbed calls to (optional)
    * @return {T} an anonymous function
    */
  def mockFunction(): js.Function = js.native
  def mockFunction(funcName: java.lang.String): js.Function = js.native
  def mockFunction(funcName: java.lang.String, delegate: js.Function): js.Function = js.native
  /**
    * Test that a invocation never occurred. For example:
    * <pre>
    * verify(mock, never()).method();
    * </pre>
    * @see JsMockito.Verifiers.times(0)
    */
  def never(): jsmockitoLib.JsMockitoNs.Verifier = js.native
  /** Test that no further interactions remain unverified on the mock.  For
    * example:
    * <pre>
    * verify(mock, noMoreInteractions());
    * </pre>
    * @see JsMockito.verifyNoMoreInteractions()
    */
  def noMoreInteractions(): jsmockitoLib.JsMockitoNs.Verifier = js.native
  /**
    * Test that an invocation occurred exactly once. For example:
    * <pre>
    * verify(mock, once()).method();
    * </pre>
    * This is the default verifier.
    * @see JsMockito.Verifiers.times(1)
    */
  def once(): jsmockitoLib.JsMockitoNs.Verifier = js.native
  /**
    * Create a mock that proxies a real function or object.  All un-stubbed
    * invocations will be passed through to the real implementation, but can
    * still be verified.
    *
    * @param delegate A 'real' (concrete) object or function that the mock will delegate unstubbed invocations to
    * @return {T} A mock object (as per mock) or mock function (as per mockFunction)
    */
  def spy[T](delegate: T): T = js.native
  /**
    * Test that an invocation occurred a specific number of times. For example:
    * <pre>
    * verify(mock, times(2)).method();
    * </pre>
    *
    * @param wanted The number of desired invocations
    */
  def times(wanted: scala.Double): jsmockitoLib.JsMockitoNs.Verifier = js.native
  /**
    * Verify that a mock object method or mock function was invoked
    *
    * @param mock A mock object or mock anonymous function
    * @param verifier Optional JsMockito.Verifier instance (default: JsMockito.Verifiers.once())
    * @return {T} A verifier on which the method or function to be verified can be invoked
    */
  def verify[T](mock: T): T = js.native
  def verify[T](mock: T, verifier: jsmockitoLib.JsMockitoNs.Verifier): T = js.native
  /**
    * Verify that no mock object method or mock function invocations remain
    * unverified
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  def verifyNoMoreInteractions(mock: js.Any*): scala.Unit = js.native
  /**
    * Verify that no mock object methods or the mock function were ever invoked
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  def verifyZeroInteractions(mock: js.Any*): scala.Unit = js.native
  /**
    * Add a stub for a mock object method or mock function
    *
    * @param mock A mock object or mock anonymous function
    * @return {T} A stub builder on which the method or function to be stubbed can be invoked
    */
  def when[T](mock: T): T = js.native
  /** Test that no interaction were made on the mock.  For example:
    * <pre>
    * verify(mock, zeroInteractions());
    * </pre>
    * @see JsMockito.verifyZeroInteractions()
    */
  def zeroInteractions(): jsmockitoLib.JsMockitoNs.Verifier = js.native
}

