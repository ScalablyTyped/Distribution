package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultDisplayMetadata extends StObject {
  
  /** The metalines content to be displayed with the result. */
  var metalines: js.UndefOr[js.Array[ResultDisplayLine]] = js.native
  
  /** The display label for the object. */
  var objectTypeLabel: js.UndefOr[String] = js.native
}
object ResultDisplayMetadata {
  
  @scala.inline
  def apply(): ResultDisplayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultDisplayMetadata]
  }
  
  @scala.inline
  implicit class ResultDisplayMetadataMutableBuilder[Self <: ResultDisplayMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalines(value: js.Array[ResultDisplayLine]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    @scala.inline
    def setMetalinesVarargs(value: ResultDisplayLine*): Self = StObject.set(x, "metalines", js.Array(value :_*))
    
    @scala.inline
    def setObjectTypeLabel(value: String): Self = StObject.set(x, "objectTypeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeLabelUndefined: Self = StObject.set(x, "objectTypeLabel", js.undefined)
  }
}
