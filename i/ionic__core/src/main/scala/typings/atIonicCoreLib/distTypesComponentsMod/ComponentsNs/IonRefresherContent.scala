package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRefresherContent extends js.Object {
  /**
    * A static icon to display when you begin to pull down
    */
  var pullingIcon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The text you want to display when you begin to pull down. `pullingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var pullingText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An animated SVG spinner that shows when refreshing begins
    */
  var refreshingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  /**
    * The text you want to display when performing a refresh. `refreshingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var refreshingText: js.UndefOr[java.lang.String] = js.undefined
}

object IonRefresherContent {
  @scala.inline
  def apply(
    pullingIcon: java.lang.String = null,
    pullingText: java.lang.String = null,
    refreshingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    refreshingText: java.lang.String = null
  ): IonRefresherContent = {
    val __obj = js.Dynamic.literal()
    if (pullingIcon != null) __obj.updateDynamic("pullingIcon")(pullingIcon)
    if (pullingText != null) __obj.updateDynamic("pullingText")(pullingText)
    if (refreshingSpinner != null) __obj.updateDynamic("refreshingSpinner")(refreshingSpinner)
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText)
    __obj.asInstanceOf[IonRefresherContent]
  }
}

