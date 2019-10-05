package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextArgs extends js.Object {
  var avoidConstraints: Boolean
  var isMultiInject: Boolean
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  var serviceIdentifier: ServiceIdentifier[_]
  var targetType: TargetType
  var value: js.UndefOr[js.Any] = js.undefined
  def contextInterceptor(contexts: Context): Context
}

object NextArgs {
  @scala.inline
  def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => Context,
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[_],
    targetType: TargetType,
    key: String | Double | js.Symbol = null,
    value: js.Any = null
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints, contextInterceptor = js.Any.fromFunction1(contextInterceptor), isMultiInject = isMultiInject, serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NextArgs]
  }
}

