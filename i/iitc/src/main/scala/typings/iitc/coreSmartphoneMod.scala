package typings.iitc

import typings.iitc.anon.SelectedPortalGuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSmartphoneMod {
  
  object global {
    
    /**
      * this check is also used in main.js. Note it should not detect
      * tablets because their display is large enough to use the desktop version.
      *
      * The stock intel site allows forcing mobile/full sites with a vp=m or vp=f
      * parameter - let's support the same. (stock only allows this for some
      * browsers - e.g. android phone/tablet. let's allow it for all, but
      * no promises it'll work right)
      */
    inline def isSmartphone(): Boolean = js.Dynamic.global.applyDynamic("isSmartphone")().asInstanceOf[Boolean]
    
    inline def runOnSmartphonesAfterBoot(): Unit = js.Dynamic.global.applyDynamic("runOnSmartphonesAfterBoot")().asInstanceOf[Unit]
    
    inline def runOnSmartphonesBeforeBoot(): Unit = js.Dynamic.global.applyDynamic("runOnSmartphonesBeforeBoot")().asInstanceOf[Unit]
    
    inline def setAndroidPermalink(): Unit = js.Dynamic.global.applyDynamic("setAndroidPermalink")().asInstanceOf[Unit]
    
    inline def smartphoneInfo(data: SelectedPortalGuid): Unit = js.Dynamic.global.applyDynamic("smartphoneInfo")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def useAndroidPanes(): Unit = js.Dynamic.global.applyDynamic("useAndroidPanes")().asInstanceOf[Unit]
  }
}
