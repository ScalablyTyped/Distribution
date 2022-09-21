package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Results extends StObject {
  
  /**
    * Path to the artifact manifest. Only populated when artifacts are uploaded.
    */
  var artifactManifest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time to push all non-container artifacts.
    */
  var artifactTiming: js.UndefOr[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan] = js.undefined
  
  /**
    * List of build step digests, in the order corresponding to build step indices.
    */
  var buildStepImages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of build step outputs, produced by builder images, in the order corresponding to build step indices. [Cloud Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can produce this output by writing to `$BUILDER_OUTPUT/output`. Only the first 4KB of data is stored.
    */
  var buildStepOutputs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Container images that were built as a part of the build.
    */
  var images: js.UndefOr[js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage]] = js.undefined
  
  /**
    * Number of artifacts uploaded. Only populated when artifacts are uploaded.
    */
  var numArtifacts: js.UndefOr[String | Null] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Results {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Results = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Results]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Results](x: Self) {
    
    inline def setArtifactManifest(value: String): Self = StObject.set(x, "artifactManifest", value.asInstanceOf[js.Any])
    
    inline def setArtifactManifestNull: Self = StObject.set(x, "artifactManifest", null)
    
    inline def setArtifactManifestUndefined: Self = StObject.set(x, "artifactManifest", js.undefined)
    
    inline def setArtifactTiming(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1TimeSpan): Self = StObject.set(x, "artifactTiming", value.asInstanceOf[js.Any])
    
    inline def setArtifactTimingUndefined: Self = StObject.set(x, "artifactTiming", js.undefined)
    
    inline def setBuildStepImages(value: js.Array[String]): Self = StObject.set(x, "buildStepImages", value.asInstanceOf[js.Any])
    
    inline def setBuildStepImagesNull: Self = StObject.set(x, "buildStepImages", null)
    
    inline def setBuildStepImagesUndefined: Self = StObject.set(x, "buildStepImages", js.undefined)
    
    inline def setBuildStepImagesVarargs(value: String*): Self = StObject.set(x, "buildStepImages", js.Array(value*))
    
    inline def setBuildStepOutputs(value: js.Array[String]): Self = StObject.set(x, "buildStepOutputs", value.asInstanceOf[js.Any])
    
    inline def setBuildStepOutputsNull: Self = StObject.set(x, "buildStepOutputs", null)
    
    inline def setBuildStepOutputsUndefined: Self = StObject.set(x, "buildStepOutputs", js.undefined)
    
    inline def setBuildStepOutputsVarargs(value: String*): Self = StObject.set(x, "buildStepOutputs", js.Array(value*))
    
    inline def setImages(value: js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1BuiltImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setNumArtifacts(value: String): Self = StObject.set(x, "numArtifacts", value.asInstanceOf[js.Any])
    
    inline def setNumArtifactsNull: Self = StObject.set(x, "numArtifacts", null)
    
    inline def setNumArtifactsUndefined: Self = StObject.set(x, "numArtifacts", js.undefined)
  }
}
