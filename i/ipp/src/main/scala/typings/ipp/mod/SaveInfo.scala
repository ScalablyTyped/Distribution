package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveInfo extends StObject {
  
  var `save-document-format`: js.UndefOr[MimeMediaType] = js.native
  
  var `save-location`: js.UndefOr[String] = js.native
  
  var `save-name`: js.UndefOr[String] = js.native
}
object SaveInfo {
  
  @scala.inline
  def apply(): SaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveInfo]
  }
  
  @scala.inline
  implicit class SaveInfoMutableBuilder[Self <: SaveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setSave-document-format`(value: MimeMediaType): Self = StObject.set(x, "save-document-format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSave-document-formatUndefined`: Self = StObject.set(x, "save-document-format", js.undefined)
    
    @scala.inline
    def `setSave-location`(value: String): Self = StObject.set(x, "save-location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSave-locationUndefined`: Self = StObject.set(x, "save-location", js.undefined)
    
    @scala.inline
    def `setSave-name`(value: String): Self = StObject.set(x, "save-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSave-nameUndefined`: Self = StObject.set(x, "save-name", js.undefined)
  }
}
