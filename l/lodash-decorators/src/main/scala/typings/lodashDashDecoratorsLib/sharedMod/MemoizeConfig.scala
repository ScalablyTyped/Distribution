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

