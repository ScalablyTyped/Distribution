package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import typings.jsmockito.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsMockito {
    
    @JSGlobal("JsMockito")
    @js.native
    val ^ : js.Any = js.native
    
    object Integration {
      
      @JSGlobal("JsMockito.Integration.JsTestDriver")
      @js.native
      def JsTestDriver(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.JsUnitTest")
      @js.native
      def JsUnitTest(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.QUnit")
      @js.native
      def QUnit(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.YUITest")
      @js.native
      def YUITest(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.importTo")
      @js.native
      def importTo(target: js.Any): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.jSpec")
      @js.native
      def jSpec(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.jsUnity")
      @js.native
      def jsUnity(): Unit = js.native
      
      @JSGlobal("JsMockito.Integration.screwunit")
      @js.native
      def screwunit(): Unit = js.native
    }
    
    @JSGlobal("JsMockito.JsMockitoStubBuilder")
    @js.native
    class JsMockitoStubBuilder ()
      extends typings.jsmockito.JsMockito.JsMockitoStubBuilder
    
    object Verifiers {
      
      @JSGlobal("JsMockito.Verifiers.never")
      @js.native
      def never(): Verifier = js.native
      
      @JSGlobal("JsMockito.Verifiers.noMoreInteractions")
      @js.native
      def noMoreInteractions(): Verifier = js.native
      
      @JSGlobal("JsMockito.Verifiers.once")
      @js.native
      def once(): Verifier = js.native
      
      @JSGlobal("JsMockito.Verifiers.times")
      @js.native
      def times(wanted: Double): Verifier = js.native
      
      @JSGlobal("JsMockito.Verifiers.zeroInteractions")
      @js.native
      def zeroInteractions(): Verifier = js.native
    }
    
    @JSGlobal("JsMockito.isMock")
    @js.native
    def isMock(maybeMock: js.Any): Boolean = js.native
    
    @JSGlobal("JsMockito.mock")
    @js.native
    def mock[T](Obj: Instantiable[T]): T = js.native
    
    @JSGlobal("JsMockito.mockFunction")
    @js.native
    def mockFunction(): js.Function = js.native
    @JSGlobal("JsMockito.mockFunction")
    @js.native
    def mockFunction(funcName: String): js.Function = js.native
    @JSGlobal("JsMockito.mockFunction")
    @js.native
    def mockFunction(funcName: String, delegate: js.Function): js.Function = js.native
    
    @JSGlobal("JsMockito.spy")
    @js.native
    def spy[T](delegate: T): T = js.native
    
    @JSGlobal("JsMockito.verify")
    @js.native
    def verify[T](mock: T): T = js.native
    @JSGlobal("JsMockito.verify")
    @js.native
    def verify[T](mock: T, verifier: Verifier): T = js.native
    
    @JSGlobal("JsMockito.verifyNoMoreInteractions")
    @js.native
    def verifyNoMoreInteractions(mock: js.Any*): Unit = js.native
    
    @JSGlobal("JsMockito.verifyZeroInteractions")
    @js.native
    def verifyZeroInteractions(mock: js.Any*): Unit = js.native
    
    @JSGlobal("JsMockito.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    @JSGlobal("JsMockito.when")
    @js.native
    def when[T](mock: T): T = js.native
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
  @JSGlobal("isMock")
  @js.native
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
  @JSGlobal("mock")
  @js.native
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
  @JSGlobal("mockFunction")
  @js.native
  def mockFunction(): js.Function = js.native
  @JSGlobal("mockFunction")
  @js.native
  def mockFunction(funcName: String): js.Function = js.native
  @JSGlobal("mockFunction")
  @js.native
  def mockFunction(funcName: String, delegate: js.Function): js.Function = js.native
  
  /**
    * Test that a invocation never occurred. For example:
    * <pre>
    * verify(mock, never()).method();
    * </pre>
    * @see JsMockito.Verifiers.times(0)
    */
  @JSGlobal("never")
  @js.native
  def never(): Verifier = js.native
  
  /** Test that no further interactions remain unverified on the mock.  For
    * example:
    * <pre>
    * verify(mock, noMoreInteractions());
    * </pre>
    * @see JsMockito.verifyNoMoreInteractions()
    */
  @JSGlobal("noMoreInteractions")
  @js.native
  def noMoreInteractions(): Verifier = js.native
  
  /**
    * Test that an invocation occurred exactly once. For example:
    * <pre>
    * verify(mock, once()).method();
    * </pre>
    * This is the default verifier.
    * @see JsMockito.Verifiers.times(1)
    */
  @JSGlobal("once")
  @js.native
  def once(): Verifier = js.native
  
  /**
    * Create a mock that proxies a real function or object.  All un-stubbed
    * invocations will be passed through to the real implementation, but can
    * still be verified.
    *
    * @param delegate A 'real' (concrete) object or function that the mock will delegate unstubbed invocations to
    * @return {T} A mock object (as per mock) or mock function (as per mockFunction)
    */
  @JSGlobal("spy")
  @js.native
  def spy[T](delegate: T): T = js.native
  
  /**
    * Test that an invocation occurred a specific number of times. For example:
    * <pre>
    * verify(mock, times(2)).method();
    * </pre>
    *
    * @param wanted The number of desired invocations
    */
  @JSGlobal("times")
  @js.native
  def times(wanted: Double): Verifier = js.native
  
  /**
    * Verify that a mock object method or mock function was invoked
    *
    * @param mock A mock object or mock anonymous function
    * @param verifier Optional JsMockito.Verifier instance (default: JsMockito.Verifiers.once())
    * @return {T} A verifier on which the method or function to be verified can be invoked
    */
  @JSGlobal("verify")
  @js.native
  def verify[T](mock: T): T = js.native
  @JSGlobal("verify")
  @js.native
  def verify[T](mock: T, verifier: Verifier): T = js.native
  
  /**
    * Verify that no mock object method or mock function invocations remain
    * unverified
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  @JSGlobal("verifyNoMoreInteractions")
  @js.native
  def verifyNoMoreInteractions(mock: js.Any*): Unit = js.native
  
  /**
    * Verify that no mock object methods or the mock function were ever invoked
    *
    * @param mock A mock object or mock anonymous function (multiple accepted)
    */
  @JSGlobal("verifyZeroInteractions")
  @js.native
  def verifyZeroInteractions(mock: js.Any*): Unit = js.native
  
  /**
    * Add a stub for a mock object method or mock function
    *
    * @param mock A mock object or mock anonymous function
    * @return {T} A stub builder on which the method or function to be stubbed can be invoked
    */
  @JSGlobal("when")
  @js.native
  def when[T](mock: T): T = js.native
  
  /** Test that no interaction were made on the mock.  For example:
    * <pre>
    * verify(mock, zeroInteractions());
    * </pre>
    * @see JsMockito.verifyZeroInteractions()
    */
  @JSGlobal("zeroInteractions")
  @js.native
  def zeroInteractions(): Verifier = js.native
}
