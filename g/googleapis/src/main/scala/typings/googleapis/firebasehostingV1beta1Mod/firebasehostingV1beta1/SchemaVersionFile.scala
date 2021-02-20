package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A static content file that is part of a version.
  */
@js.native
trait SchemaVersionFile extends StObject {
  
  /**
    * The SHA256 content hash of the file.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * The URI at which the file&#39;s content should display.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Output only. The current status of a particular file in the specified
    * version. &lt;br&gt;The value will be either `pending upload` or
    * `uploaded`.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaVersionFile {
  
  @scala.inline
  def apply(): SchemaVersionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionFile]
  }
  
  @scala.inline
  implicit class SchemaVersionFileMutableBuilder[Self <: SchemaVersionFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
