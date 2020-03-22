package typings.ionicAngular

import typings.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  @js.native
  class Config () extends js.Object {
    def get(key: String): js.Any = js.native
    def get(key: String, fallback: js.Any): js.Any = js.native
    def getBoolean(key: String): Boolean = js.native
    def getBoolean(key: String, fallback: Boolean): Boolean = js.native
    def getNumber(key: String): Double = js.native
    def getNumber(key: String, fallback: Double): Double = js.native
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
  }
  
  val ConfigToken: InjectionToken[js.Any] = js.native
}

