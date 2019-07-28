package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseConfig
import typings.atIonicCliDashFramework.definitionsMod.PackageJson
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProject extends js.Object {
  val config: BaseConfig[IProjectConfig] = js.native
  val details: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/project.ProjectDetailsResult */ js.Any = js.native
  val directory: String = js.native
  val filePath: String = js.native
  val rootDirectory: String = js.native
  val `type`: ProjectType = js.native
  def createIntegration(name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  def detected(): js.Promise[Boolean] = js.native
  def getBuildRunner(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/build.BuildRunner<any> */ _
    ]
  ] = js.native
  def getDistDir(): js.Promise[String] = js.native
  def getDocsUrl(): js.Promise[String] = js.native
  def getGenerateRunner(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/generate.GenerateRunner<any> */ _
    ]
  ] = js.native
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  def getIntegration(name: IntegrationName): js.UndefOr[Required[ProjectIntegration]] = js.native
  def getPackageJson(): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  def getPackageJson(pkgName: String): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  def getServeRunner(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/serve.ServeRunner<any> */ _
    ]
  ] = js.native
  def getSourceDir(): js.Promise[String] = js.native
  def getSourceDir(sourceRoot: String): js.Promise[String] = js.native
  def personalize(details: ProjectPersonalizationDetails): js.Promise[Unit] = js.native
  def registerAilments(registry: IAilmentRegistry): js.Promise[Unit] = js.native
  def requireAppflowId(): js.Promise[String] = js.native
  def requireBuildRunner(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/build.BuildRunner<any> */ _
  ] = js.native
  def requireGenerateRunner(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/generate.GenerateRunner<any> */ _
  ] = js.native
  def requireIntegration(name: IntegrationName): Required[ProjectIntegration] = js.native
  def requirePackageJson(): js.Promise[PackageJson] = js.native
  def requirePackageJson(pkgName: String): js.Promise[PackageJson] = js.native
  def requireServeRunner(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ionic/lib/serve.ServeRunner<any> */ _
  ] = js.native
}

