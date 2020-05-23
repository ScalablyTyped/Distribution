package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import typings.jsmockito.anon.Instantiable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  //
  // Functions that are copied by JsMockito.Integration.importTo() to the global scope are repeated here.
  //
  /**
    * Test if a given variable is a mock
    *
    * @param maybeMock An object
    * @return {boolean} true if the variable is a mock
    */
  def isMock(maybeMock: js.Any): Boolean = js.native
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
  def mock[T](Obj: Instantiable[T]): T = js.native
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
  def mockFunction(funcName: String): js.Function = js.native
  def mockFunction(funcName: String, delegate: js.Function): js.Function = js.native
  /**
    * Test that a invocation never occurred. For example:
    * <pre>
    * verify(mock, never()).method();
    * </pre>
    * @see JsMockito.Verifiers.times(0)
    */
  def never(): Verifier = js.native
  /** Test that no further interactions remain unverified on the mock.  For
    * example:
    * <pre>
    * verify(mock, noMoreInteractions());
    * </pre>
    * @see JsMockito.verifyNoMoreInteractions()
    */
  def noMoreInteractions(): Verifier = js.native
  /**
    * Test that an invocation occurred exactly once. For example:
    * <pre>
    * verify(mock, once()).method();
    * </pre>
    * This is the default verifier.
    * @see JsMockito.Verifiers.times(1)
    */
  def once(): Verifier = js.native
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
  def times(wanted: Double): Verifier = js.native
  /**
    * Verify that a mock object method or mock function was invoked
    *
    * @param mock A mock object or mock anonymous function
    * @param verifier Optional JsMockito.Verifier instance (default: JsMockito.Verifiers.once())
    * @return {T} A verifier on which the method or function to be verified can be invoked
    */
  def verify[T](mock: T): T = js.native
  def verify[T](mock: T, verifier: Verifier): T = js.native
  /**
    * Verify that no mock object method or mock function invocations remain
    * unverified
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  def verifyNoMoreInteractions(mock: js.Any*): Unit = js.native
  /**
    * Verify that no mock object methods or the mock function were ever invoked
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  def verifyZeroInteractions(mock: js.Any*): Unit = js.native
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
  def zeroInteractions(): Verifier = js.native
  @js.native
  object JsMockito extends js.Object {
    @js.native
    class JsMockitoStubBuilder ()
      extends typings.jsmockito.JsMockito.JsMockitoStubBuilder {
      /**
        * Provide functions to be run in place of the mocked method.
        *
        * @param func Functions to be run in order of execution.
        * @return {JsMockitoStubBuilder} Itself for method chaining
        */
      /* CompleteClass */
      override def `then`(func: (js.Function1[/* obj */ js.Any, _])*): typings.jsmockito.JsMockito.JsMockitoStubBuilder = js.native
      /**
        * Provide values to be returned by the mocked function.
        *
        * @param obj Values to be returned in order of execution.
        * @return {JsMockitoStubBuilder} Itself for method chaining
        */
      /* CompleteClass */
      override def thenReturn(obj: js.Any*): typings.jsmockito.JsMockito.JsMockitoStubBuilder = js.native
      /**
        * Provide exceptions to be thrown by the mocked function.
        *
        * @param obj Exceptions to be thrown in order of execution.
        * @return {JsMockitoStubBuilder} Itself for method chaining
        */
      /* CompleteClass */
      override def thenThrow(obj: Error*): typings.jsmockito.JsMockito.JsMockitoStubBuilder = js.native
    }
    
    var version: String = js.native
    def isMock(maybeMock: js.Any): Boolean = js.native
    def mock[T](Obj: Instantiable[T]): T = js.native
    def mockFunction(): js.Function = js.native
    def mockFunction(funcName: String): js.Function = js.native
    def mockFunction(funcName: String, delegate: js.Function): js.Function = js.native
    def spy[T](delegate: T): T = js.native
    def verify[T](mock: T): T = js.native
    def verify[T](mock: T, verifier: Verifier): T = js.native
    def verifyNoMoreInteractions(mock: js.Any*): Unit = js.native
    def verifyZeroInteractions(mock: js.Any*): Unit = js.native
    def when[T](mock: T): T = js.native
    @js.native
    object Integration extends js.Object {
      def JsTestDriver(): Unit = js.native
      def JsUnitTest(): Unit = js.native
      def QUnit(): Unit = js.native
      def YUITest(): Unit = js.native
      def importTo(target: js.Any): Unit = js.native
      def jSpec(): Unit = js.native
      def jsUnity(): Unit = js.native
      def screwunit(): Unit = js.native
    }
    
    @js.native
    object Verifiers extends js.Object {
      def never(): Verifier = js.native
      def noMoreInteractions(): Verifier = js.native
      def once(): Verifier = js.native
      def times(wanted: Double): Verifier = js.native
      def zeroInteractions(): Verifier = js.native
    }
    
  }
  
}

