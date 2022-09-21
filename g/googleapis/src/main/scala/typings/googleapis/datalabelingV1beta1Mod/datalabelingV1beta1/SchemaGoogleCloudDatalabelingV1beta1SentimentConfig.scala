package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1SentimentConfig extends StObject {
  
  /**
    * If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false.
    */
  var enableLabelSentimentSelection: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1SentimentConfig {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1SentimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1SentimentConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1SentimentConfig](x: Self) {
    
    inline def setEnableLabelSentimentSelection(value: Boolean): Self = StObject.set(x, "enableLabelSentimentSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelSentimentSelectionNull: Self = StObject.set(x, "enableLabelSentimentSelection", null)
    
    inline def setEnableLabelSentimentSelectionUndefined: Self = StObject.set(x, "enableLabelSentimentSelection", js.undefined)
  }
}
