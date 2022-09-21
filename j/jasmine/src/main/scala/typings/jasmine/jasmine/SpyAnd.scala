package typings.jasmine.jasmine

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpyAnd[Fn /* <: Func */] extends StObject {
  
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: Fn): Spy[Fn] = js.native
  
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy[Fn] = js.native
  
  var identity: String = js.native
  
  /** Tell the spy to return a promise rejecting with the specified value when invoked. */
  def rejectWith(): Spy[Fn] = js.native
  def rejectWith(`val`: PromisedRejectType[Fn]): Spy[Fn] = js.native
  
  /** Tell the spy to return a promise resolving to the specified value when invoked. */
  def resolveTo(): Spy[Fn] = js.native
  def resolveTo(`val`: PromisedReturnType[Fn]): Spy[Fn] = js.native
  
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: ReturnType[Fn]): Spy[Fn] = js.native
  
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: ReturnType[Fn]*): Spy[Fn] = js.native
  
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy[Func] = js.native
  
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: String): Spy[Func] = js.native
  def throwError(msg: js.Error): Spy[Func] = js.native
}
