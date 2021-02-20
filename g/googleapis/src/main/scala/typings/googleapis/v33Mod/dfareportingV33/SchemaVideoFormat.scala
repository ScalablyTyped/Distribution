package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about supported video formats.
  */
@js.native
trait SchemaVideoFormat extends StObject {
  
  /**
    * File type of the video format.
    */
  var fileType: js.UndefOr[String] = js.native
  
  /**
    * ID of the video format.
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoFormat&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The resolution of this video format.
    */
  var resolution: js.UndefOr[SchemaSize] = js.native
  
  /**
    * The target bit rate of this video format.
    */
  var targetBitRate: js.UndefOr[Double] = js.native
}
object SchemaVideoFormat {
  
  @scala.inline
  def apply(): SchemaVideoFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFormat]
  }
  
  @scala.inline
  implicit class SchemaVideoFormatMutableBuilder[Self <: SchemaVideoFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResolution(value: SchemaSize): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setTargetBitRate(value: Double): Self = StObject.set(x, "targetBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBitRateUndefined: Self = StObject.set(x, "targetBitRate", js.undefined)
  }
}
