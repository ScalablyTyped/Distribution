package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGraphicsStatsBucket extends StObject {
  
  /**
    * Number of frames in the bucket.
    */
  var frameCount: js.UndefOr[String] = js.native
  
  /**
    * Lower bound of render time in milliseconds.
    */
  var renderMillis: js.UndefOr[String] = js.native
}
object SchemaGraphicsStatsBucket {
  
  @scala.inline
  def apply(): SchemaGraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStatsBucket]
  }
  
  @scala.inline
  implicit class SchemaGraphicsStatsBucketMutableBuilder[Self <: SchemaGraphicsStatsBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameCount(value: String): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCountUndefined: Self = StObject.set(x, "frameCount", js.undefined)
    
    @scala.inline
    def setRenderMillis(value: String): Self = StObject.set(x, "renderMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMillisUndefined: Self = StObject.set(x, "renderMillis", js.undefined)
  }
}
