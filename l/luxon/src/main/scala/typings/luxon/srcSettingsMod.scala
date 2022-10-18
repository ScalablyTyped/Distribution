package typings.luxon

import typings.luxon.srcZoneMod.Zone
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
      * The default time zone object currently used to create DateTimes. Does not affect existing instances.
      * The default value is the system's time zone (the one set on the machine that runs this code).
      * Getting this property always returns a Zone object.
      */
    @JSImport("luxon/src/settings", "Settings.defaultZone")
    @js.native
    def defaultZone: Zone | String = js.native
    inline def defaultZone_=(x: Zone | String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultZone")(x.asInstanceOf[js.Any])
    
    /**
      * Reset Luxon's global caches. Should only be necessary in testing scenarios.
      */
    inline def resetCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCaches")().asInstanceOf[Unit]
  }
}
