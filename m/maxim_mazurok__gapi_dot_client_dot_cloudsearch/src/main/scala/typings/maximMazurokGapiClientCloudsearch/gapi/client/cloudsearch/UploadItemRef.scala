package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadItemRef extends StObject {
  
  /** Name of the content reference. The maximum length is 2048 characters. */
  var name: js.UndefOr[String] = js.undefined
}
object UploadItemRef {
  
  @scala.inline
  def apply(): UploadItemRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadItemRef]
  }
  
  @scala.inline
  implicit class UploadItemRefMutableBuilder[Self <: UploadItemRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
