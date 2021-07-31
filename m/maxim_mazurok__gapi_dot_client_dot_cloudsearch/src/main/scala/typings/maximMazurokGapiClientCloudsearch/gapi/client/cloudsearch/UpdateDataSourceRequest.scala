package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
  
  var source: js.UndefOr[DataSource] = js.undefined
}
object UpdateDataSourceRequest {
  
  @scala.inline
  def apply(): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  @scala.inline
  implicit class UpdateDataSourceRequestMutableBuilder[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setSource(value: DataSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
