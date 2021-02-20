package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPopulateVersionFilesRequest extends StObject {
  
  /**
    * A set of file paths to the hashes corresponding to assets that should be
    * added to the version. Note that a file path to an empty hash will remove
    * the path from the version. Calculate a hash by Gzipping the file then
    * taking the SHA256 hash of the newly compressed file.
    */
  var files: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaPopulateVersionFilesRequest {
  
  @scala.inline
  def apply(): SchemaPopulateVersionFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesRequest]
  }
  
  @scala.inline
  implicit class SchemaPopulateVersionFilesRequestMutableBuilder[Self <: SchemaPopulateVersionFilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: StringDictionary[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
  }
}
