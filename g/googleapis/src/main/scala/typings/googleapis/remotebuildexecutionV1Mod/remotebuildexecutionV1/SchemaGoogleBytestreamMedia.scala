package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media resource.
  */
trait SchemaGoogleBytestreamMedia extends StObject {
  
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object SchemaGoogleBytestreamMedia {
  
  @scala.inline
  def apply(): SchemaGoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleBytestreamMedia]
  }
  
  @scala.inline
  implicit class SchemaGoogleBytestreamMediaMutableBuilder[Self <: SchemaGoogleBytestreamMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
