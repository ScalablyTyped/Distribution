package typings.ionic

import typings.ionic.definitionsMod.ImageResource
import typings.ionic.definitionsMod.ImageResourceTransformResult
import typings.ionic.definitionsMod.ImageUploadResponse
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.definitionsMod.KnownPlatform
import typings.ionic.definitionsMod.ResourcesConfig
import typings.ionic.definitionsMod.SourceImage
import typings.ionic.libIntegrationsCordovaConfigMod.CordovaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/resources", JSImport.Namespace)
@js.native
object libIntegrationsCordovaResourcesMod extends js.Object {
  val RESOURCES: ResourcesConfig = js.native
  def addResourcesToConfigXml(conf: CordovaConfig, platformList: js.Array[KnownPlatform], resourceJson: ResourcesConfig): js.Promise[Unit] = js.native
  def createImgDestinationDirectories(imgResources: js.Array[ImageResource]): js.Promise[js.Array[Unit]] = js.native
  def findMostSpecificSourceImage(imageResource: ImageResource, srcImagesAvailable: js.Array[SourceImage]): js.UndefOr[SourceImage] = js.native
  def getImageResources(projectDir: String): js.Array[ImageResource] = js.native
  def getSourceImages(projectDir: String, buildPlatforms: js.Array[String], resourceTypes: js.Array[String]): js.Promise[js.Array[SourceImage]] = js.native
  def transformResourceImage(env: IonicEnvironment, resource: ImageResource): js.Promise[ImageResourceTransformResult] = js.native
  def uploadSourceImage(env: IonicEnvironment, srcImage: SourceImage): js.Promise[ImageUploadResponse] = js.native
}

