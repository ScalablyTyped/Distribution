package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonContentElement
import typings.ionicCore.componentsMod.global.HTMLIonRefresherElement
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refresherUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "createPullingAnimation")
  @js.native
  def createPullingAnimation(`type`: RefresherAnimationType, pullingSpinner: HTMLElement): Animation = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "createSnapBackAnimation")
  @js.native
  def createSnapBackAnimation(pullingRefresherIcon: HTMLElement): Animation = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "getRefresherAnimationType")
  @js.native
  def getRefresherAnimationType(contentEl: HTMLIonContentElement): RefresherAnimationType = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "handleScrollWhilePulling")
  @js.native
  def handleScrollWhilePulling(spinner: HTMLElement, ticks: NodeListOf[SVGElement], opacity: Double, currentTickToShow: Double): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "handleScrollWhileRefreshing")
  @js.native
  def handleScrollWhileRefreshing(spinner: HTMLElement, lastVelocityY: Double): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "setSpinnerOpacity")
  @js.native
  def setSpinnerOpacity(spinner: HTMLElement, opacity: Double): Unit = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "shouldUseNativeRefresher")
  @js.native
  def shouldUseNativeRefresher(referenceEl: HTMLIonRefresherElement, mode: String): Boolean = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "transitionEndAsync")
  @js.native
  def transitionEndAsync(): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "transitionEndAsync")
  @js.native
  def transitionEndAsync(el: Null, expectedDuration: Double): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "transitionEndAsync")
  @js.native
  def transitionEndAsync(el: HTMLElement): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "transitionEndAsync")
  @js.native
  def transitionEndAsync(el: HTMLElement, expectedDuration: Double): js.Promise[_] = js.native
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "translateElement")
  @js.native
  def translateElement(): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "translateElement")
  @js.native
  def translateElement(el: js.UndefOr[scala.Nothing], value: String): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "translateElement")
  @js.native
  def translateElement(el: HTMLElement): js.Promise[_] = js.native
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", "translateElement")
  @js.native
  def translateElement(el: HTMLElement, value: String): js.Promise[_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.scale
    - typings.ionicCore.ionicCoreStrings.translate
  */
  trait RefresherAnimationType extends StObject
  object RefresherAnimationType {
    
    @scala.inline
    def scale: typings.ionicCore.ionicCoreStrings.scale = "scale".asInstanceOf[typings.ionicCore.ionicCoreStrings.scale]
    
    @scala.inline
    def translate: typings.ionicCore.ionicCoreStrings.translate = "translate".asInstanceOf[typings.ionicCore.ionicCoreStrings.translate]
  }
}
