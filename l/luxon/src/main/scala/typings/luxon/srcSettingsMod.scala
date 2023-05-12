package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSettingsMod {
  
  @JSImport("luxon/src/settings", "Settings")
  @js.native
  open class Settings () extends StObject
  /* static members */
  object Settings {
    
    @JSImport("luxon/src/settings", "Settings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default locale to create DateTimes with. Does not affect existing instances.
      */
    @JSImport("luxon/src/settings", "Settings.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    /**
      * The default numbering system to create DateTimes with. Does not affect existing instances.
      */
    @JSImport("luxon/src/settings", "Settings.defaultNumberingSystem")
    @js.native
    def defaultNumberingSystem: String = js.native
    inline def defaultNumberingSystem_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNumberingSystem")(x.asInstanceOf[js.Any])
    
    /**
      * The default output calendar to create DateTimes with. Does not affect existing instances.
      */
    @JSImport("luxon/src/settings", "Settings.defaultOutputCalendar")
    @js.native
    def defaultOutputCalendar: String = js.native
    inline def defaultOutputCalendar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOutputCalendar")(x.asInstanceOf[js.Any])
    
    /**
      * Reset Luxon's global caches. Should only be necessary in testing scenarios.
      */
    inline def resetCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCaches")().asInstanceOf[Unit]
    
    /**
      * Whether Luxon will throw when it encounters invalid DateTimes, Durations, or Intervals
      *
      * If setting this to true, be sure to opt-out of Luxon's invalid return types.
      * @example
      * Settings.throwOnInvalid = true;
      * declare module 'luxon' {
      *   interface TSSettings {
      *     throwOnInvalid: true;
      *   }
      * }
      */
    @JSImport("luxon/src/settings", "Settings.throwOnInvalid")
    @js.native
    def throwOnInvalid: Boolean = js.native
    inline def throwOnInvalid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwOnInvalid")(x.asInstanceOf[js.Any])
  }
  
  trait TSSettings extends StObject
}
