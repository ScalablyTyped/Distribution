package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An artifact that was uploaded during a build. This is a single record in
  * the artifact manifest JSON file.
  */
trait SchemaArtifactResult extends StObject {
  
  /**
    * The file hash of the artifact.
    */
  var fileHash: js.UndefOr[js.Array[SchemaFileHashes]] = js.undefined
  
  /**
    * The path of an artifact in a Google Cloud Storage bucket, with the
    * generation number. For example,
    * `gs://mybucket/path/to/output.jar#generation`.
    */
  var location: js.UndefOr[String] = js.undefined
}
object SchemaArtifactResult {
  
  @scala.inline
  def apply(): SchemaArtifactResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactResult]
  }
  
  @scala.inline
  implicit class SchemaArtifactResultMutableBuilder[Self <: SchemaArtifactResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileHash(value: js.Array[SchemaFileHashes]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setFileHashVarargs(value: SchemaFileHashes*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
