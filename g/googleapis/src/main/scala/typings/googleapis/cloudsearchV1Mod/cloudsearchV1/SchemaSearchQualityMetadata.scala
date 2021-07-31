package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional search quality metadata of the item.
  */
trait SchemaSearchQualityMetadata extends StObject {
  
  /**
    * An indication of the quality of the item, used to influence search
    * quality. Value should be between 0.0 (lowest quality) and 1.0 (highest
    * quality). The default value is 0.0.
    */
  var quality: js.UndefOr[Double] = js.undefined
}
object SchemaSearchQualityMetadata {
  
  @scala.inline
  def apply(): SchemaSearchQualityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchQualityMetadata]
  }
  
  @scala.inline
  implicit class SchemaSearchQualityMetadataMutableBuilder[Self <: SchemaSearchQualityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
