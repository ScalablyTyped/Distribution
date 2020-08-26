package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextArgs extends js.Object {
  var avoidConstraints: Boolean = js.native
  var isMultiInject: Boolean = js.native
  var key: js.UndefOr[String | Double | js.Symbol] = js.native
  var serviceIdentifier: ServiceIdentifier[_] = js.native
  var targetType: TargetType = js.native
  var value: js.UndefOr[js.Any] = js.native
  def contextInterceptor(contexts: Context): Context = js.native
}

object NextArgs {
  @scala.inline
  def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => Context,
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[_],
    targetType: TargetType
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints.asInstanceOf[js.Any], contextInterceptor = js.Any.fromFunction1(contextInterceptor), isMultiInject = isMultiInject.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArgs]
  }
  @scala.inline
  implicit class NextArgsOps[Self <: NextArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvoidConstraints(value: Boolean): Self = this.set("avoidConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextInterceptor(value: Context => Context): Self = this.set("contextInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def setIsMultiInject(value: Boolean): Self = this.set("isMultiInject", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceIdentifier(value: ServiceIdentifier[_]): Self = this.set("serviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetType(value: TargetType): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String | Double | js.Symbol): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

