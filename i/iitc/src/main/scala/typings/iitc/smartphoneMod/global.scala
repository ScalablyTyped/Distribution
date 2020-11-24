package typings.iitc.smartphoneMod

import typings.iitc.anon.SelectedPortalGuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * this check is also used in main.js. Note it should not detect
    * tablets because their display is large enough to use the desktop version.
    *
    * The stock intel site allows forcing mobile/full sites with a vp=m or vp=f
    * parameter - let's support the same. (stock only allows this for some
    * browsers - e.g. android phone/tablet. let's allow it for all, but
    * no promises it'll work right)
    */
  def isSmartphone(): Boolean = js.native
  
  def runOnSmartphonesAfterBoot(): Unit = js.native
  
  def runOnSmartphonesBeforeBoot(): Unit = js.native
  
  def setAndroidPermalink(): Unit = js.native
  
  def smartphoneInfo(data: SelectedPortalGuid): Unit = js.native
  
  def useAndroidPanes(): Unit = js.native
}
