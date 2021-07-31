package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import typings.jsmockito.anon.Instantiable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsMockito {
    
    @JSGlobal("JsMockito")
    @js.native
    val ^ : js.Any = js.native
    
    object Integration {
      
      @JSGlobal("JsMockito.Integration")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def JsTestDriver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsTestDriver")().asInstanceOf[Unit]
      
      @scala.inline
      def JsUnitTest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsUnitTest")().asInstanceOf[Unit]
      
      @scala.inline
      def QUnit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("QUnit")().asInstanceOf[Unit]
      
      @scala.inline
      def YUITest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("YUITest")().asInstanceOf[Unit]
      
      @scala.inline
      def importTo(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("importTo")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @scala.inline
      def jSpec(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jSpec")().asInstanceOf[Unit]
      
      @scala.inline
      def jsUnity(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsUnity")().asInstanceOf[Unit]
      
      @scala.inline
      def screwunit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screwunit")().asInstanceOf[Unit]
    }
    
    @JSGlobal("JsMockito.JsMockitoStubBuilder")
    @js.native
    class JsMockitoStubBuilder ()
      extends StObject
         with typings.jsmockito.JsMockito.JsMockitoStubBuilder {
      
      /**
        * Provide functions to be run in place of the mocked method.
        *
        * @param func Functions to be run in order of execution.
        * @return {JsMockitoStubBuilder} Itself for method chaining
        */
      /* CompleteClass */
      override def `then`(func: (js.Function1[/* obj */ js.Any, js.Any])*): typings.jsmockito.JsMockito.JsMockitoStubBuilder = js.native
      
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
    
    object Verifiers {
      
      @JSGlobal("JsMockito.Verifiers")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def never(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Verifier]
      
      @scala.inline
      def noMoreInteractions(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("noMoreInteractions")().asInstanceOf[Verifier]
      
      @scala.inline
      def once(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("once")().asInstanceOf[Verifier]
      
      @scala.inline
      def times(wanted: Double): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("times")(wanted.asInstanceOf[js.Any]).asInstanceOf[Verifier]
      
      @scala.inline
      def zeroInteractions(): Verifier = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroInteractions")().asInstanceOf[Verifier]
    }
    
    @scala.inline
    def isMock(maybeMock: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMock")(maybeMock.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def mock[T](Obj: Instantiable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(Obj.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def mockFunction(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("mockFunction")().asInstanceOf[js.Function]
    @scala.inline
    def mockFunction(funcName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("mockFunction")(funcName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    @scala.inline
    def mockFunction(funcName: String, delegate: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("mockFunction")(funcName.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    @scala.inline
    def spy[T](delegate: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(delegate.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def verify[T](mock: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(mock.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def verify[T](mock: T, verifier: Verifier): T = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(mock.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def verifyNoMoreInteractions(mock: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyNoMoreInteractions")(mock.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def verifyZeroInteractions(mock: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyZeroInteractions")(mock.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("JsMockito.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def when[T](mock: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(mock.asInstanceOf[js.Any]).asInstanceOf[T]
  }
  
  //
  // Functions that are copied by JsMockito.Integration.importTo() to the global scope are repeated here.
  //
  /**
    * Test if a given variable is a mock
    *
    * @param maybeMock An object
    * @return {boolean} true if the variable is a mock
    */
  @scala.inline
  def isMock(maybeMock: js.Any): Boolean = js.Dynamic.global.applyDynamic("isMock")(maybeMock.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  @scala.inline
  def mock[T](Obj: Instantiable[T]): T = js.Dynamic.global.applyDynamic("mock")(Obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  @scala.inline
  def mockFunction(): js.Function = js.Dynamic.global.applyDynamic("mockFunction")().asInstanceOf[js.Function]
  @scala.inline
  def mockFunction(funcName: String): js.Function = js.Dynamic.global.applyDynamic("mockFunction")(funcName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def mockFunction(funcName: String, delegate: js.Function): js.Function = (js.Dynamic.global.applyDynamic("mockFunction")(funcName.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Test that a invocation never occurred. For example:
    * <pre>
    * verify(mock, never()).method();
    * </pre>
    * @see JsMockito.Verifiers.times(0)
    */
  @scala.inline
  def never(): Verifier = js.Dynamic.global.applyDynamic("never")().asInstanceOf[Verifier]
  
  /** Test that no further interactions remain unverified on the mock.  For
    * example:
    * <pre>
    * verify(mock, noMoreInteractions());
    * </pre>
    * @see JsMockito.verifyNoMoreInteractions()
    */
  @scala.inline
  def noMoreInteractions(): Verifier = js.Dynamic.global.applyDynamic("noMoreInteractions")().asInstanceOf[Verifier]
  
  /**
    * Test that an invocation occurred exactly once. For example:
    * <pre>
    * verify(mock, once()).method();
    * </pre>
    * This is the default verifier.
    * @see JsMockito.Verifiers.times(1)
    */
  @scala.inline
  def once(): Verifier = js.Dynamic.global.applyDynamic("once")().asInstanceOf[Verifier]
  
  /**
    * Create a mock that proxies a real function or object.  All un-stubbed
    * invocations will be passed through to the real implementation, but can
    * still be verified.
    *
    * @param delegate A 'real' (concrete) object or function that the mock will delegate unstubbed invocations to
    * @return {T} A mock object (as per mock) or mock function (as per mockFunction)
    */
  @scala.inline
  def spy[T](delegate: T): T = js.Dynamic.global.applyDynamic("spy")(delegate.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Test that an invocation occurred a specific number of times. For example:
    * <pre>
    * verify(mock, times(2)).method();
    * </pre>
    *
    * @param wanted The number of desired invocations
    */
  @scala.inline
  def times(wanted: Double): Verifier = js.Dynamic.global.applyDynamic("times")(wanted.asInstanceOf[js.Any]).asInstanceOf[Verifier]
  
  /**
    * Verify that a mock object method or mock function was invoked
    *
    * @param mock A mock object or mock anonymous function
    * @param verifier Optional JsMockito.Verifier instance (default: JsMockito.Verifiers.once())
    * @return {T} A verifier on which the method or function to be verified can be invoked
    */
  @scala.inline
  def verify[T](mock: T): T = js.Dynamic.global.applyDynamic("verify")(mock.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def verify[T](mock: T, verifier: Verifier): T = (js.Dynamic.global.applyDynamic("verify")(mock.asInstanceOf[js.Any], verifier.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Verify that no mock object method or mock function invocations remain
    * unverified
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  @scala.inline
  def verifyNoMoreInteractions(mock: js.Any*): Unit = js.Dynamic.global.applyDynamic("verifyNoMoreInteractions")(mock.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Verify that no mock object methods or the mock function were ever invoked
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  @scala.inline
  def verifyZeroInteractions(mock: js.Any*): Unit = js.Dynamic.global.applyDynamic("verifyZeroInteractions")(mock.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add a stub for a mock object method or mock function
    *
    * @param mock A mock object or mock anonymous function
    * @return {T} A stub builder on which the method or function to be stubbed can be invoked
    */
  @scala.inline
  def when[T](mock: T): T = js.Dynamic.global.applyDynamic("when")(mock.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /** Test that no interaction were made on the mock.  For example:
    * <pre>
    * verify(mock, zeroInteractions());
    * </pre>
    * @see JsMockito.verifyZeroInteractions()
    */
  @scala.inline
  def zeroInteractions(): Verifier = js.Dynamic.global.applyDynamic("zeroInteractions")().asInstanceOf[Verifier]
}
