package typings
package atIonicCoreLib.distTypesGlobalConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/global/config", "Config")
@js.native
class Config () extends js.Object {
  var m: js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, fallback: js.Any): js.Any = js.native
  def getBoolean(key: java.lang.String): scala.Boolean = js.native
  def getBoolean(key: java.lang.String, fallback: scala.Boolean): scala.Boolean = js.native
  def getNumber(key: java.lang.String): scala.Double = js.native
  def getNumber(key: java.lang.String, fallback: scala.Double): scala.Double = js.native
  def reset(
    configObj: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IonicConfig */ js.Any
  ): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
}

