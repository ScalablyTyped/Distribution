package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Settings {
  
  @JSImport("luxon", "Settings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("luxon", "Settings.defaultLocale")
  @js.native
  def defaultLocale: String = js.native
  @scala.inline
  def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("luxon", "Settings.defaultNumberingSystem")
  @js.native
  def defaultNumberingSystem: String = js.native
  @scala.inline
  def defaultNumberingSystem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNumberingSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("luxon", "Settings.defaultOutputCalendar")
  @js.native
  def defaultOutputCalendar: String = js.native
  @scala.inline
  def defaultOutputCalendar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOutputCalendar")(x.asInstanceOf[js.Any])
  
  @JSImport("luxon", "Settings.defaultZone")
  @js.native
  val defaultZone: Zone = js.native
  
  @JSImport("luxon", "Settings.defaultZoneName")
  @js.native
  def defaultZoneName: String = js.native
  @scala.inline
  def defaultZoneName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultZoneName")(x.asInstanceOf[js.Any])
  
  @JSImport("luxon", "Settings.now")
  @js.native
  def now(): Double = js.native
  
  @JSImport("luxon", "Settings.resetCaches")
  @js.native
  def resetCaches(): Unit = js.native
  
  @JSImport("luxon", "Settings.throwOnInvalid")
  @js.native
  def throwOnInvalid: Boolean = js.native
  @scala.inline
  def throwOnInvalid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwOnInvalid")(x.asInstanceOf[js.Any])
}
