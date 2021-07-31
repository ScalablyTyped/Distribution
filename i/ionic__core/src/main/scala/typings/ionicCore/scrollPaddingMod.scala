package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollPaddingMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enableScrollPadding(keyboardHeight: Double): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScrollPadding")(keyboardHeight.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
