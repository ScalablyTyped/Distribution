package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message resulting from reading an image file.
  */
@js.native
trait SchemaImageError extends StObject {
  
  /**
    * The type of image error encountered. Optional for older image errors.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The file path in the import of the image that was rejected.
    */
  var filePath: js.UndefOr[String] = js.native
}
object SchemaImageError {
  
  @scala.inline
  def apply(): SchemaImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageError]
  }
  
  @scala.inline
  implicit class SchemaImageErrorMutableBuilder[Self <: SchemaImageError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
