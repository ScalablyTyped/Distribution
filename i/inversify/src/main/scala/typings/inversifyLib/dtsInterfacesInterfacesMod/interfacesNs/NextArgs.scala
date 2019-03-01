package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextArgs extends js.Object {
  var avoidConstraints: scala.Boolean
  var isMultiInject: scala.Boolean
  var key: js.UndefOr[java.lang.String | scala.Double | js.Symbol] = js.undefined
  var serviceIdentifier: ServiceIdentifier[_]
  var targetType: TargetType
  var value: js.UndefOr[js.Any] = js.undefined
  def contextInterceptor(contexts: Context): Context
}

object NextArgs {
  @scala.inline
  def apply(
    avoidConstraints: scala.Boolean,
    contextInterceptor: js.Function1[Context, Context],
    isMultiInject: scala.Boolean,
    serviceIdentifier: ServiceIdentifier[_],
    targetType: TargetType,
    key: java.lang.String | scala.Double | js.Symbol = null,
    value: js.Any = null
  ): NextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avoidConstraints")(avoidConstraints)
    __obj.updateDynamic("contextInterceptor")(contextInterceptor)
    __obj.updateDynamic("isMultiInject")(isMultiInject)
    __obj.updateDynamic("serviceIdentifier")(serviceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("targetType")(targetType)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NextArgs]
  }
}

