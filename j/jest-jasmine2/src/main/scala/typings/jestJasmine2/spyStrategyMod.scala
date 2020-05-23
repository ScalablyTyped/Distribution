package typings.jestJasmine2

import typings.jestJasmine2.anon.Fn
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/SpyStrategy", JSImport.Namespace)
@js.native
object spyStrategyMod extends js.Object {
  @js.native
  trait SpyStrategy extends js.Object {
    def callFake(fn: js.Function): js.Any = js.native
    def callThrough(): js.Any = js.native
    def exec(args: js.Any*): js.Any = js.native
    def identity(): String = js.native
    def returnValue(value: js.Any): js.Any = js.native
    def returnValues(): js.Any = js.native
    def stub(fn: js.Function): js.Any = js.native
    def throwError(something: String): js.Any = js.native
    def throwError(something: Error): js.Any = js.native
  }
  
  @js.native
  class default () extends SpyStrategy {
    def this(hasNameFnGetSpy: Fn) = this()
  }
  
}

