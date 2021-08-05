package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGraphicsStatsBucket extends StObject {
  
  /**
    * Number of frames in the bucket.
    */
  var frameCount: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound of render time in milliseconds.
    */
  var renderMillis: js.UndefOr[String] = js.undefined
}
object SchemaGraphicsStatsBucket {
  
  inline def apply(): SchemaGraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStatsBucket]
  }
  
  extension [Self <: SchemaGraphicsStatsBucket](x: Self) {
    
    inline def setFrameCount(value: String): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrameCountUndefined: Self = StObject.set(x, "frameCount", js.undefined)
    
    inline def setRenderMillis(value: String): Self = StObject.set(x, "renderMillis", value.asInstanceOf[js.Any])
    
    inline def setRenderMillisUndefined: Self = StObject.set(x, "renderMillis", js.undefined)
  }
}
