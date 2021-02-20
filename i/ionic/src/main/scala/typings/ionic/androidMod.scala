package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidMod {
  
  @JSImport("ionic/lib/integrations/cordova/android", "getAndroidSdkToolsVersion")
  @js.native
  def getAndroidSdkToolsVersion(): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/android", "locateSDKHome")
  @js.native
  def locateSDKHome(): js.Promise[js.UndefOr[String]] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/android", "parseSDKVersion")
  @js.native
  def parseSDKVersion(contents: String): js.Promise[js.UndefOr[String]] = js.native
}
