package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingLoggerSettings extends js.Object {
  var activated: js.UndefOr[Boolean] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var constraint: js.UndefOr[Boolean] = js.native
  var dynamicValue: js.UndefOr[Boolean] = js.native
  var factory: js.UndefOr[Boolean] = js.native
  var implementationType: js.UndefOr[Boolean] = js.native
  var onActivation: js.UndefOr[Boolean] = js.native
  var provider: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[Boolean] = js.native
  var serviceIdentifier: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[Boolean] = js.native
}

object BindingLoggerSettings {
  @scala.inline
  def apply(): BindingLoggerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingLoggerSettings]
  }
  @scala.inline
  implicit class BindingLoggerSettingsOps[Self <: BindingLoggerSettings] (val x: Self) extends AnyVal {
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
    def setActivated(value: Boolean): Self = this.set("activated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivated: Self = this.set("activated", js.undefined)
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setConstraint(value: Boolean): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    @scala.inline
    def setDynamicValue(value: Boolean): Self = this.set("dynamicValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicValue: Self = this.set("dynamicValue", js.undefined)
    @scala.inline
    def setFactory(value: Boolean): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactory: Self = this.set("factory", js.undefined)
    @scala.inline
    def setImplementationType(value: Boolean): Self = this.set("implementationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplementationType: Self = this.set("implementationType", js.undefined)
    @scala.inline
    def setOnActivation(value: Boolean): Self = this.set("onActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnActivation: Self = this.set("onActivation", js.undefined)
    @scala.inline
    def setProvider(value: Boolean): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setScope(value: Boolean): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setServiceIdentifier(value: Boolean): Self = this.set("serviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceIdentifier: Self = this.set("serviceIdentifier", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

