package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/android", JSImport.Namespace)
@js.native
object androidMod extends js.Object {
  def getAndroidSdkToolsVersion(): js.Promise[js.UndefOr[String]] = js.native
  def locateSDKHome(): js.Promise[js.UndefOr[String]] = js.native
  def parseSDKVersion(contents: String): js.Promise[js.UndefOr[String]] = js.native
}

