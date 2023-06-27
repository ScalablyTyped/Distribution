package typings.k6.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /**
    * 	Map to set or get VU metadata.
    */
  var metadata: Record[String, Double | String | Boolean]
  
  /**
    * 	Map to set or get VU tags.
    */
  var tags: Record[String, Double | String | Boolean]
}
object Metadata {
  
  inline def apply(
    metadata: Record[String, Double | String | Boolean],
    tags: Record[String, Double | String | Boolean]
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: Record[String, Double | String | Boolean]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Record[String, Double | String | Boolean]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
