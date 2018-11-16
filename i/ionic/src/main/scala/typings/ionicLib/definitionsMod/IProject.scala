package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProject extends js.Object {
  val config: atIonicCliDashFrameworkLib.cliDashFrameworkMod.BaseConfig[IProjectConfig] = js.native
  val directory: java.lang.String = js.native
  val filePath: java.lang.String = js.native
  val name: js.UndefOr[java.lang.String] = js.native
  val rootDirectory: java.lang.String = js.native
  val `type`: ProjectType = js.native
  def createIntegration(name: IntegrationName): stdLib.Promise[IIntegration] = js.native
  def detected(): stdLib.Promise[scala.Boolean] = js.native
  def getBuildRunner(): stdLib.Promise[js.UndefOr[ionicLib.libBuildMod.BuildRunner[_]]] = js.native
  def getDistDir(): stdLib.Promise[java.lang.String] = js.native
  def getDocsUrl(): stdLib.Promise[java.lang.String] = js.native
  def getGenerateRunner(): stdLib.Promise[js.UndefOr[ionicLib.libGenerateMod.GenerateRunner[_]]] = js.native
  def getInfo(): stdLib.Promise[js.Array[InfoItem]] = js.native
  def getIntegration(name: IntegrationName): js.UndefOr[stdLib.Required[ProjectIntegration]] = js.native
  def getPackageJson(): stdLib.Promise[
    js.Tuple2[
      js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.PackageJson], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  def getPackageJson(pkgName: java.lang.String): stdLib.Promise[
    js.Tuple2[
      js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.PackageJson], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  def getServeRunner(): stdLib.Promise[js.UndefOr[ionicLib.libServeMod.ServeRunner[_]]] = js.native
  def getSourceDir(): stdLib.Promise[java.lang.String] = js.native
  def getSourceDir(sourceRoot: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def personalize(details: ProjectPersonalizationDetails): stdLib.Promise[scala.Unit] = js.native
  def registerAilments(registry: IAilmentRegistry): stdLib.Promise[scala.Unit] = js.native
  def requireBuildRunner(): stdLib.Promise[ionicLib.libBuildMod.BuildRunner[_]] = js.native
  def requireGenerateRunner(): stdLib.Promise[ionicLib.libGenerateMod.GenerateRunner[_]] = js.native
  def requireIntegration(name: IntegrationName): stdLib.Required[ProjectIntegration] = js.native
  def requirePackageJson(): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.PackageJson] = js.native
  def requirePackageJson(pkgName: java.lang.String): stdLib.Promise[atIonicCliDashFrameworkLib.definitionsMod.PackageJson] = js.native
  def requireProId(): stdLib.Promise[java.lang.String] = js.native
  def requireServeRunner(): stdLib.Promise[ionicLib.libServeMod.ServeRunner[_]] = js.native
}

