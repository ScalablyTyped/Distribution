package typings.ionicCore.componentsMod.Components

import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.typesMod.IonicSafeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInfiniteScrollContent extends js.Object {
  /**
    * An animated SVG spinner that shows while loading.
    */
  var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  /**
    * Optional text to display while loading. `loadingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var loadingText: js.UndefOr[String | IonicSafeString] = js.undefined
}

object IonInfiniteScrollContent {
  @scala.inline
  def apply(
    loadingSpinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    loadingText: String | IonicSafeString = null
  ): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loadingSpinner)) __obj.updateDynamic("loadingSpinner")(loadingSpinner.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
}

