package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a video.  NOTE: Creating a video from Google Drive requires that
  * the requesting app have at least one of the drive, drive.readonly, or
  * drive.file OAuth scopes.
  */
trait SchemaCreateVideoRequest extends StObject {
  
  /**
    * The element properties for the video.  The PageElementProperties.size
    * property is optional. If you don&#39;t specify a size, a default size is
    * chosen by the server.  The PageElementProperties.transform property is
    * optional. The transform must not have shear components. If you don&#39;t
    * specify a transform, the video will be placed at the top left corner of
    * the page.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.undefined
  
  /**
    * The video source&#39;s unique identifier for this video.  e.g. For
    * YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0, the ID is
    * 7U3axjORYZ0. For a Google Drive video
    * https://drive.google.com/file/d/1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q the ID
    * is 1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaCreateVideoRequest {
  
  @scala.inline
  def apply(): SchemaCreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVideoRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateVideoRequestMutableBuilder[Self <: SchemaCreateVideoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementProperties(value: SchemaPageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
