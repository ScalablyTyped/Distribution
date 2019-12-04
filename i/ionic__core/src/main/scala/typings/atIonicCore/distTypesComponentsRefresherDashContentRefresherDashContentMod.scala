package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/refresher-content/refresher-content", JSImport.Namespace)
@js.native
object distTypesComponentsRefresherDashContentRefresherDashContentMod extends js.Object {
  @js.native
  class RefresherContent () extends ComponentInterface {
    /**
      * A static icon to display when you begin to pull down
      */
    var pullingIcon: js.UndefOr[String | Null] = js.native
    /**
      * The text you want to display when you begin to pull down.
      * `pullingText` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var pullingText: js.UndefOr[String] = js.native
    /**
      * An animated SVG spinner that shows when refreshing begins
      */
    var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
    /**
      * The text you want to display when performing a refresh.
      * `refreshingText` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var refreshingText: js.UndefOr[String] = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MRefresherContent(): Unit = js.native
    @JSName("render")
    def render_MRefresherContent(): js.Any = js.native
  }
  
}

