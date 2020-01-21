package typings.lodashDecorators

import typings.lodashDecorators.commonMod.BiTypedMethodDecorator1
import typings.lodashDecorators.sharedMod.MemoizeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/memoize", JSImport.Namespace)
@js.native
object memoizeMod extends js.Object {
  @JSName("Memoize")
  val Memoize_ : BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val default: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
  val memoize: BiTypedMethodDecorator1[String | js.Function | (MemoizeConfig[js.Any, js.Any])] = js.native
}

