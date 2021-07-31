package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssocLanguage[T] extends StObject {
  
  var assocLanguage: js.UndefOr[String] = js.undefined
  
  var autoselect: js.UndefOr[Boolean] = js.undefined
  
  var channels: js.UndefOr[String] = js.undefined
  
  var characteristics: js.UndefOr[String] = js.undefined
  
  var forced: js.UndefOr[Boolean] = js.undefined
  
  var groupId: String
  
  var instreamId: js.UndefOr[String] = js.undefined
  
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var `type`: T
  
  var uri: js.UndefOr[String] = js.undefined
}
object AssocLanguage {
  
  @scala.inline
  def apply[T](groupId: String, name: String, `type`: T): AssocLanguage[T] = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssocLanguage[T]]
  }
  
  @scala.inline
  implicit class AssocLanguageMutableBuilder[Self <: AssocLanguage[?], T] (val x: Self & AssocLanguage[T]) extends AnyVal {
    
    @scala.inline
    def setAssocLanguage(value: String): Self = StObject.set(x, "assocLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssocLanguageUndefined: Self = StObject.set(x, "assocLanguage", js.undefined)
    
    @scala.inline
    def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoselectUndefined: Self = StObject.set(x, "autoselect", js.undefined)
    
    @scala.inline
    def setChannels(value: String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setCharacteristics(value: String): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicsUndefined: Self = StObject.set(x, "characteristics", js.undefined)
    
    @scala.inline
    def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcedUndefined: Self = StObject.set(x, "forced", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstreamId(value: String): Self = StObject.set(x, "instreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstreamIdUndefined: Self = StObject.set(x, "instreamId", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
