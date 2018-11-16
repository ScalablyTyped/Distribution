package typings
package jestDashWhenLib.jestDashWhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait When extends js.Object {
  def apply[T](fn: jestLib.jestNs.Mock[T]): When = js.native
  def apply[T](fn: jestLib.jestNs.Mocked[T]): When = js.native
  // due to no-unnecessary-generics lint rule, the generics have been replaced with 'any'
  // calledWith<T>(...matchers: any[]): PartialMockInstance<T>;
  // expectCalledWith<T>(...matchers: any[]): PartialMockInstance<T>;
  def calledWith(matchers: js.Any*): PartialMockInstance[_] = js.native
  def expectCalledWith(matchers: js.Any*): PartialMockInstance[_] = js.native
}

