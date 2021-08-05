package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonIcon")
@js.native
class IonIcon protected ()
  extends StObject
     with typings.ionicons.componentsMod.Components.IonIcon {
  def this(c: ChangeDetectorRef, r: ElementRef[js.Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
    */
  /* CompleteClass */
  var `lazy`: Boolean = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  /* CompleteClass */
  var mode: String = js.native
  
  /**
    * When set to `false`, SVG content that is HTTP fetched will not be checked if the response SVG content has any `<script>` elements, or any attributes that start with `on`, such as `onclick`.
    * @default true
    */
  /* CompleteClass */
  var sanitize: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
