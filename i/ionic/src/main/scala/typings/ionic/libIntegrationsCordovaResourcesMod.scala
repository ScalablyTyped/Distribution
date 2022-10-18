package typings.ionic

import typings.ionic.definitionsMod.ImageResource
import typings.ionic.definitionsMod.ImageResourceTransformResult
import typings.ionic.definitionsMod.ImageUploadResponse
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.definitionsMod.KnownPlatform
import typings.ionic.definitionsMod.ResourcesConfig
import typings.ionic.definitionsMod.SourceImage
import typings.ionic.libIntegrationsCordovaConfigMod.CordovaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCordovaResourcesMod {
  
  @JSImport("ionic/lib/integrations/cordova/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "RESOURCES")
  @js.native
  val RESOURCES: ResourcesConfig = js.native
  
  inline def addResourcesToConfigXml(conf: CordovaConfig, platformList: js.Array[KnownPlatform], resourceJson: ResourcesConfig): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addResourcesToConfigXml")(conf.asInstanceOf[js.Any], platformList.asInstanceOf[js.Any], resourceJson.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createImgDestinationDirectories(imgResources: js.Array[ImageResource]): js.Promise[js.Array[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImgDestinationDirectories")(imgResources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit]]]
  
  inline def findMostSpecificSourceImage(imageResource: ImageResource, srcImagesAvailable: js.Array[SourceImage]): js.UndefOr[SourceImage] = (^.asInstanceOf[js.Dynamic].applyDynamic("findMostSpecificSourceImage")(imageResource.asInstanceOf[js.Any], srcImagesAvailable.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SourceImage]]
  
  inline def getImageResources(projectDir: String): js.Array[ImageResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageResources")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[ImageResource]]
  
  inline def getSourceImages(projectDir: String, buildPlatforms: js.Array[String], resourceTypes: js.Array[String]): js.Promise[js.Array[SourceImage]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceImages")(projectDir.asInstanceOf[js.Any], buildPlatforms.asInstanceOf[js.Any], resourceTypes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SourceImage]]]
  
  inline def transformResourceImage(env: IonicEnvironment, resource: ImageResource): js.Promise[ImageResourceTransformResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformResourceImage")(env.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageResourceTransformResult]]
  
  inline def uploadSourceImage(env: IonicEnvironment, srcImage: SourceImage): js.Promise[ImageUploadResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadSourceImage")(env.asInstanceOf[js.Any], srcImage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageUploadResponse]]
}
