package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a source file which is used to generate the service
  * configuration defined by `google.api.Service`.
  */
trait SchemaConfigSource extends StObject {
  
  /**
    * Set of source configuration files that are used to generate a service
    * configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[SchemaConfigFile]] = js.undefined
  
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaConfigSource {
  
  @scala.inline
  def apply(): SchemaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigSource]
  }
  
  @scala.inline
  implicit class SchemaConfigSourceMutableBuilder[Self <: SchemaConfigSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[SchemaConfigFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaConfigFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
