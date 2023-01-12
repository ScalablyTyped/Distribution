package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.failed
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.processing
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.queued
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var stage: js.UndefOr[processing | queued | success | failed] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var tilesetId: String
}
object Stage {
  
  inline def apply(tilesetId: String): Stage = {
    val __obj = js.Dynamic.literal(tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setStage(value: processing | queued | success | failed): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
