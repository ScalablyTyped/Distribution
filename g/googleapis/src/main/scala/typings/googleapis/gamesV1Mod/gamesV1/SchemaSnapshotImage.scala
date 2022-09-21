package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSnapshotImage extends StObject {
  
  /**
    * The height of the image.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#snapshotImage`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MIME type of the image.
    */
  var mime_type: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the image. This URL may be invalidated at any time and should not be cached.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the image.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSnapshotImage {
  
  inline def apply(): SchemaSnapshotImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshotImage]
  }
  
  extension [Self <: SchemaSnapshotImage](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setMime_typeNull: Self = StObject.set(x, "mime_type", null)
    
    inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
