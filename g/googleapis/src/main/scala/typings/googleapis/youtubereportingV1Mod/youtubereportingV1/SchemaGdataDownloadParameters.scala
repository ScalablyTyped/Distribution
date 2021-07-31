package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataDownloadParameters extends StObject {
  
  /**
    * gdata
    */
  var allowGzipCompression: js.UndefOr[Boolean] = js.undefined
  
  /**
    * gdata
    */
  var ignoreRange: js.UndefOr[Boolean] = js.undefined
}
object SchemaGdataDownloadParameters {
  
  @scala.inline
  def apply(): SchemaGdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDownloadParameters]
  }
  
  @scala.inline
  implicit class SchemaGdataDownloadParametersMutableBuilder[Self <: SchemaGdataDownloadParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowGzipCompression(value: Boolean): Self = StObject.set(x, "allowGzipCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGzipCompressionUndefined: Self = StObject.set(x, "allowGzipCompression", js.undefined)
    
    @scala.inline
    def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
  }
}
