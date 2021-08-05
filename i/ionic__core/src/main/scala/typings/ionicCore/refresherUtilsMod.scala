package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonContentElement
import typings.ionicCore.componentsMod.global.HTMLIonRefresherElement
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refresherUtilsMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPullingAnimation(`type`: RefresherAnimationType, pullingSpinner: HTMLElement): Animation = (^.asInstanceOf[js.Dynamic].applyDynamic("createPullingAnimation")(`type`.asInstanceOf[js.Any], pullingSpinner.asInstanceOf[js.Any])).asInstanceOf[Animation]
  
  inline def createSnapBackAnimation(pullingRefresherIcon: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createSnapBackAnimation")(pullingRefresherIcon.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def getRefresherAnimationType(contentEl: HTMLIonContentElement): RefresherAnimationType = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefresherAnimationType")(contentEl.asInstanceOf[js.Any]).asInstanceOf[RefresherAnimationType]
  
  inline def handleScrollWhilePulling(spinner: HTMLElement, ticks: NodeListOf[SVGElement], opacity: Double, currentTickToShow: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleScrollWhilePulling")(spinner.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], currentTickToShow.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleScrollWhileRefreshing(spinner: HTMLElement, lastVelocityY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleScrollWhileRefreshing")(spinner.asInstanceOf[js.Any], lastVelocityY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setSpinnerOpacity(spinner: HTMLElement, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSpinnerOpacity")(spinner.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldUseNativeRefresher(referenceEl: HTMLIonRefresherElement, mode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseNativeRefresher")(referenceEl.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transitionEndAsync(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")().asInstanceOf[js.Promise[js.Any]]
  inline def transitionEndAsync(el: Null, expectedDuration: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any], expectedDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def transitionEndAsync(el: HTMLElement): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def transitionEndAsync(el: HTMLElement, expectedDuration: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionEndAsync")(el.asInstanceOf[js.Any], expectedDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  inline def translateElement(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")().asInstanceOf[js.Promise[js.Any]]
  inline def translateElement(el: Unit, value: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def translateElement(el: HTMLElement): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def translateElement(el: HTMLElement, value: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("translateElement")(el.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.scale
    - typings.ionicCore.ionicCoreStrings.translate
  */
  trait RefresherAnimationType extends StObject
  object RefresherAnimationType {
    
    inline def scale: typings.ionicCore.ionicCoreStrings.scale = "scale".asInstanceOf[typings.ionicCore.ionicCoreStrings.scale]
    
    inline def translate: typings.ionicCore.ionicCoreStrings.translate = "translate".asInstanceOf[typings.ionicCore.ionicCoreStrings.translate]
  }
}
