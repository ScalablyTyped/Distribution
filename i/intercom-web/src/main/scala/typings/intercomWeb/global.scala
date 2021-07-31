package typings.intercomWeb

import typings.intercomWeb.Intercom.IntercomSettings
import typings.intercomWeb.Intercom.IntercomStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Intercom")
  @js.native
  def Intercom: IntercomStatic = js.native
  @scala.inline
  def Intercom_=(x: IntercomStatic): Unit = js.Dynamic.global.updateDynamic("Intercom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("intercomSettings")
  @js.native
  def intercomSettings: js.UndefOr[IntercomSettings] = js.native
  @scala.inline
  def intercomSettings_=(x: js.UndefOr[IntercomSettings]): Unit = js.Dynamic.global.updateDynamic("intercomSettings")(x.asInstanceOf[js.Any])
}
