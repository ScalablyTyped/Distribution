package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig
  extends atIonicCliDashFrameworkLib.atIonicCliDashFrameworkMod.BaseConfig[ConfigFile] {
  def getAPIUrl(): java.lang.String = js.native
  def getDashUrl(): java.lang.String = js.native
  def getGitHost(): java.lang.String = js.native
  def getGitPort(): scala.Double = js.native
  def getHTTPConfig(): CreateRequestOptions = js.native
}

