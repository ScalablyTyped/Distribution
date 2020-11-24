package typings.jestMock.mod

import typings.jestMock.jestMockBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockInstance[T, Y /* <: js.Array[_] */] extends js.Object {
  
  var _isMockFunction: `true` = js.native
  
  var _protoImpl: js.Function = js.native
  
  def getMockImplementation(): js.UndefOr[js.Function] = js.native
  
  def getMockName(): String = js.native
  
  var mock: MockFunctionState[T, Y] = js.native
  
  def mockClear(): this.type = js.native
  
  def mockImplementation(fn: js.Function0[js.Promise[T]]): this.type = js.native
  def mockImplementation(fn: js.Function1[/* args */ Y, T]): this.type = js.native
  
  def mockImplementationOnce(fn: js.Function0[js.Promise[T]]): this.type = js.native
  def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): this.type = js.native
  
  def mockName(name: String): this.type = js.native
  
  def mockRejectedValue(value: T): this.type = js.native
  
  def mockRejectedValueOnce(value: T): this.type = js.native
  
  def mockReset(): this.type = js.native
  
  def mockResolvedValue(value: T): this.type = js.native
  
  def mockResolvedValueOnce(value: T): this.type = js.native
  
  def mockRestore(): Unit = js.native
  
  def mockReturnThis(): this.type = js.native
  
  def mockReturnValue(value: T): this.type = js.native
  
  def mockReturnValueOnce(value: T): this.type = js.native
}
