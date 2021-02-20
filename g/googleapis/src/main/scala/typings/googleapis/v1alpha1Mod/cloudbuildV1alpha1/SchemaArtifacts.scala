package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Artifacts produced by a build that should be uploaded upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifacts extends StObject {
  
  /**
    * A list of images to be pushed upon the successful completion of all build
    * steps.  The images will be pushed using the builder service account&#39;s
    * credentials.  The digests of the pushed images will be stored in the
    * Build resource&#39;s results field.  If any of the images fail to be
    * pushed, the build is marked FAILURE.
    */
  var images: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of objects to be uploaded to Cloud Storage upon successful
    * completion of all build steps.  Files in the workspace matching specified
    * paths globs will be uploaded to the specified Cloud Storage location
    * using the builder service account&#39;s credentials.  The location and
    * generation of the uploaded objects will be stored in the Build
    * resource&#39;s results field.  If any objects fail to be pushed, the
    * build is marked FAILURE.
    */
  var objects: js.UndefOr[SchemaArtifactObjects] = js.native
}
object SchemaArtifacts {
  
  @scala.inline
  def apply(): SchemaArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifacts]
  }
  
  @scala.inline
  implicit class SchemaArtifactsMutableBuilder[Self <: SchemaArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: SchemaArtifactObjects): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
  }
}
