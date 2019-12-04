package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/infinite-scroll-content/infinite-scroll-content", JSImport.Namespace)
@js.native
object distTypesComponentsInfiniteDashScrollDashContentInfiniteDashScrollDashContentMod extends js.Object {
  @js.native
  class InfiniteScrollContent () extends ComponentInterface {
    /**
      * An animated SVG spinner that shows while loading.
      */
    var loadingSpinner: js.UndefOr[SpinnerTypes | Null] = js.native
    /**
      * Optional text to display while loading.
      * `loadingText` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var loadingText: js.UndefOr[String] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MInfiniteScrollContent(): Unit = js.native
    @JSName("render")
    def render_MInfiniteScrollContent(): js.Any = js.native
  }
  
}

