package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRefresherContent extends js.Object {
  /**
    * A static icon or a spinner to display when you begin to pull down. A spinner name can be provided to gradually show tick marks when pulling down on iOS devices.
    */
  var pullingIcon: js.UndefOr[SpinnerTypes | String | Null] = js.native
  /**
    * The text you want to display when you begin to pull down. `pullingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var pullingText: js.UndefOr[String | IonicSafeString] = js.native
  /**
    * An animated SVG spinner that shows when refreshing begins
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
  /**
    * The text you want to display when performing a refresh. `refreshingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var refreshingText: js.UndefOr[String | IonicSafeString] = js.native
}

object IonRefresherContent {
  @scala.inline
  def apply(): IonRefresherContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresherContent]
  }
  @scala.inline
  implicit class IonRefresherContentOps[Self <: IonRefresherContent] (val x: Self) extends AnyVal {
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
    def setPullingIcon(value: SpinnerTypes | String): Self = this.set("pullingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullingIcon: Self = this.set("pullingIcon", js.undefined)
    @scala.inline
    def setPullingIconNull: Self = this.set("pullingIcon", null)
    @scala.inline
    def setPullingText(value: String | IonicSafeString): Self = this.set("pullingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullingText: Self = this.set("pullingText", js.undefined)
    @scala.inline
    def setRefreshingSpinner(value: SpinnerTypes): Self = this.set("refreshingSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshingSpinner: Self = this.set("refreshingSpinner", js.undefined)
    @scala.inline
    def setRefreshingSpinnerNull: Self = this.set("refreshingSpinner", null)
    @scala.inline
    def setRefreshingText(value: String | IonicSafeString): Self = this.set("refreshingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshingText: Self = this.set("refreshingText", js.undefined)
  }
  
}

