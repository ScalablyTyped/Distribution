package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonContentElement
import typings.ionicCore.componentsMod.global.HTMLIonFooterElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollAssistMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: Null,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: Null,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: HTMLIonContentElement,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLInputElement,
    contentEl: HTMLIonContentElement,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: Null,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: Null,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: HTMLIonContentElement,
    footerEl: Null,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-assist", "enableScrollAssist")
  @js.native
  def enableScrollAssist(
    componentEl: HTMLElement,
    inputEl: HTMLTextAreaElement,
    contentEl: HTMLIonContentElement,
    footerEl: HTMLIonFooterElement,
    keyboardHeight: Double
  ): js.Function0[Unit] = js.native
  
  @js.native
  trait PointerCoordinates extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object PointerCoordinates {
    
    @scala.inline
    def apply(x: Double, y: Double): PointerCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerCoordinates]
    }
    
    @scala.inline
    implicit class PointerCoordinatesMutableBuilder[Self <: PointerCoordinates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
