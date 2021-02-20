package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonRefresherContentElement
import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refresherContentMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher-content/refresher-content", "RefresherContent")
  @js.native
  class RefresherContent () extends ComponentInterface {
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRefresherContent(): Unit = js.native
    
    var el: HTMLIonRefresherContentElement = js.native
    
    /**
      * A static icon or a spinner to display when you begin to pull down.
      * A spinner name can be provided to gradually show tick marks
      * when pulling down on iOS devices.
      */
    var pullingIcon: js.UndefOr[SpinnerTypes | String | Null] = js.native
    
    /**
      * The text you want to display when you begin to pull down.
      * `pullingText` can accept either plaintext or HTML as a string.
      * To display characters normally reserved for HTML, they
      * must be escaped. For example `<Ionic>` would become
      * `&lt;Ionic&gt;`
      *
      * For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
      */
    var pullingText: js.UndefOr[String | IonicSafeString] = js.native
    
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
    var refreshingText: js.UndefOr[String | IonicSafeString] = js.native
    
    @JSName("render")
    def render_MRefresherContent(): js.Any = js.native
  }
}
