package typings.ionicCore

import typings.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicGlobalMod {
  
  @JSImport("@ionic/core/dist/types/global/ionic-global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  @scala.inline
  def getIonMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonMode")().asInstanceOf[Mode]
  @scala.inline
  def getIonMode(ref: js.Any): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonMode")(ref.asInstanceOf[js.Any]).asInstanceOf[Mode]
}
