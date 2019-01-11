package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProject extends js.Object {
  val config: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkMod.BaseConfig[IProjectConfig] = js.native
  val details: ionicLib.libProjectMod.ProjectDetailsResult = js.native
  val directory: java.lang.String = js.native
  val filePath: java.lang.String = js.native
  val rootDirectory: java.lang.String = js.native
  val `type`: ProjectType = js.native
  def createIntegration(name: IntegrationName): js.Promise[IIntegration] = js.native
  def detected(): js.Promise[scala.Boolean] = js.native
  def getBuildRunner(): js.Promise[js.UndefOr[ionicLib.libBuildMod.BuildRunner[_]]] = js.native
  def getDistDir(): js.Promise[java.lang.String] = js.native
  def getDocsUrl(): js.Promise[java.lang.String] = js.native
  def getGenerateRunner(): js.Promise[js.UndefOr[ionicLib.libGenerateMod.GenerateRunner[_]]] = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def getIntegration(name: IntegrationName): js.UndefOr[stdLib.Required[ProjectIntegration]] = js.native
  def getPackageJson(): js.Promise[
    js.Tuple2[
      js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.PackageJson], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  def getPackageJson(pkgName: java.lang.String): js.Promise[
    js.Tuple2[
      js.UndefOr[atIonicCliDashFrameworkLib.definitionsMod.PackageJson], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  def getServeRunner(): js.Promise[js.UndefOr[ionicLib.libServeMod.ServeRunner[_]]] = js.native
  def getSourceDir(): js.Promise[java.lang.String] = js.native
  def getSourceDir(sourceRoot: java.lang.String): js.Promise[java.lang.String] = js.native
  def personalize(details: ProjectPersonalizationDetails): js.Promise[scala.Unit] = js.native
  def registerAilments(registry: IAilmentRegistry): js.Promise[scala.Unit] = js.native
  def requireAppflowId(): js.Promise[java.lang.String] = js.native
  def requireBuildRunner(): js.Promise[ionicLib.libBuildMod.BuildRunner[_]] = js.native
  def requireGenerateRunner(): js.Promise[ionicLib.libGenerateMod.GenerateRunner[_]] = js.native
  def requireIntegration(name: IntegrationName): stdLib.Required[ProjectIntegration] = js.native
  def requirePackageJson(): js.Promise[atIonicCliDashFrameworkLib.definitionsMod.PackageJson] = js.native
  def requirePackageJson(pkgName: java.lang.String): js.Promise[atIonicCliDashFrameworkLib.definitionsMod.PackageJson] = js.native
  def requireServeRunner(): js.Promise[ionicLib.libServeMod.ServeRunner[_]] = js.native
}

