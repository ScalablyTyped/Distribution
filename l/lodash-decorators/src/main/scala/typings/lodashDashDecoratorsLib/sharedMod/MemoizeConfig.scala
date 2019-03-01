package typings
package lodashDashDecoratorsLib.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoizeConfig[T, U] extends js.Object {
  var cache: js.UndefOr[MemoizeMap[T, U]] = js.undefined
  var resolver: js.UndefOr[lodashDashDecoratorsLib.factoryCommonMod.ResolvableFunction] = js.undefined
  var `type`: js.UndefOr[lodashDashDecoratorsLib.Anon_Args[T, U]] = js.undefined
}

object MemoizeConfig {
  @scala.inline
  def apply[T, U](
    cache: MemoizeMap[T, U] = null,
    resolver: lodashDashDecoratorsLib.factoryCommonMod.ResolvableFunction = null,
    `type`: lodashDashDecoratorsLib.Anon_Args[T, U] = null
  ): MemoizeConfig[T, U] = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MemoizeConfig[T, U]]
  }
}

