package typings.ionic.definitionsMod

import typings.ionic.anon.RequiredProjectIntegratio
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libGenerateMod.GenerateRunner
import typings.ionic.libProjectMod.ProjectDetailsResult
import typings.ionic.libServeMod.ServeRunner
import typings.ionicCliFramework.definitionsMod.PackageJson
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProject extends js.Object {
  
  val config: BaseConfig[IProjectConfig] = js.native
  
  def createIntegration(name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  
  val details: ProjectDetailsResult = js.native
  
  def detected(): js.Promise[Boolean] = js.native
  
  val directory: String = js.native
  
  val filePath: String = js.native
  
  def getBuildRunner(): js.Promise[js.UndefOr[BuildRunner[_]]] = js.native
  
  def getDistDir(): js.Promise[String] = js.native
  
  def getDocsUrl(): js.Promise[String] = js.native
  
  def getGenerateRunner(): js.Promise[js.UndefOr[GenerateRunner[_]]] = js.native
  
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  
  def getIntegration(name: IntegrationName): js.UndefOr[RequiredProjectIntegratio] = js.native
  
  def getPackageJson(): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  def getPackageJson(pkgName: String): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  
  def getServeRunner(): js.Promise[js.UndefOr[ServeRunner[_]]] = js.native
  
  def getSourceDir(): js.Promise[String] = js.native
  def getSourceDir(sourceRoot: String): js.Promise[String] = js.native
  
  val pathPrefix: js.Array[String] = js.native
  
  def personalize(details: ProjectPersonalizationDetails): js.Promise[Unit] = js.native
  
  def registerAilments(registry: IAilmentRegistry): js.Promise[Unit] = js.native
  
  def requireAppflowId(): js.Promise[String] = js.native
  
  def requireBuildRunner(): js.Promise[BuildRunner[_]] = js.native
  
  def requireGenerateRunner(): js.Promise[GenerateRunner[_]] = js.native
  
  def requireIntegration(name: IntegrationName): RequiredProjectIntegratio = js.native
  
  def requirePackageJson(): js.Promise[PackageJson] = js.native
  def requirePackageJson(pkgName: String): js.Promise[PackageJson] = js.native
  
  def requireServeRunner(): js.Promise[ServeRunner[_]] = js.native
  
  val rootDirectory: String = js.native
  
  val `type`: ProjectType = js.native
}
