package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidMod {
  
  @JSImport("ionic/lib/integrations/cordova/android", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAndroidSdkToolsVersion(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidSdkToolsVersion")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def locateSDKHome(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("locateSDKHome")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def parseSDKVersion(contents: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSDKVersion")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
