package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
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
  var loadingText: js.UndefOr[String] = js.undefined
}

object IonInfiniteScrollContent {
  @scala.inline
  def apply(loadingSpinner: SpinnerTypes = null, loadingText: String = null): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    if (loadingSpinner != null) __obj.updateDynamic("loadingSpinner")(loadingSpinner.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
}

