package typings.ionic.libIntegrationsCordovaConfigMod

import typings.elementtree.elementtreeMod.ElementTree
import typings.ionic.Anon_IdNameVersion
import typings.ionic.definitionsMod.CordovaPackageJson
import typings.ionic.definitionsMod.ResourcesPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/config", "ConfigConfig")
@js.native
class ConfigConfig protected () extends js.Object {
  def this(configXmlPath: String, packageJsonPath: String) = this()
  var _doc: js.UndefOr[ElementTree] = js.native
  var _pkg: js.UndefOr[CordovaPackageJson] = js.native
  var _sessionid: js.UndefOr[String] = js.native
  val configXmlPath: String = js.native
  val doc: ElementTree = js.native
  val packageJsonPath: String = js.native
  val pkg: CordovaPackageJson = js.native
  var saving: Boolean = js.native
  val sessionid: String = js.native
  def ensurePlatformImages(platform: String, resourcesPlatform: ResourcesPlatform): Unit = js.native
  def ensureSplashScreenPreferences(): Unit = js.native
  def getBundleId(): js.UndefOr[String] = js.native
  def getConfiguredPlatforms(): js.Array[ConfiguredPlatform] = js.native
  def getPreference(prefName: String): js.UndefOr[String] = js.native
  def getProjectInfo(): Anon_IdNameVersion = js.native
  /* protected */ def reload(): js.Promise[Unit] = js.native
  /**
    * Set config.xml src url back to its original url
    */
  def resetContentSrc(): Unit = js.native
  def save(): js.Promise[Unit] = js.native
  def setBundleId(bundleId: String): Unit = js.native
  def setName(name: String): Unit = js.native
  /* protected */ def write(): String = js.native
  /**
    * Update config.xml content src to be a dev server url. As part of this
    * backup the original content src for a reset to occur at a later time.
    */
  def writeContentSrc(newSrc: String): Unit = js.native
}

/* static members */
@JSImport("ionic/lib/integrations/cordova/config", "ConfigConfig")
@js.native
object ConfigConfig extends js.Object {
  def load(configXmlPath: String, packageJsonPath: String): js.Promise[ConfigConfig] = js.native
}

