package typings.joi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description
  extends /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.native
  
  var example: js.UndefOr[js.Array[_]] = js.native
  
  var flags: js.UndefOr[js.Object] = js.native
  
  var invalids: js.UndefOr[js.Array[_]] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var meta: js.UndefOr[js.Array[_]] = js.native
  
  var notes: js.UndefOr[js.Array[String]] = js.native
  
  var options: js.UndefOr[ValidationOptions] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[Types | String] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var valids: js.UndefOr[js.Array[_]] = js.native
}
object Description {
  
  @scala.inline
  def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExample(value: js.Array[_]): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExampleVarargs(value: js.Any*): Self = StObject.set(x, "example", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: js.Object): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setInvalids(value: js.Array[_]): Self = StObject.set(x, "invalids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidsUndefined: Self = StObject.set(x, "invalids", js.undefined)
    
    @scala.inline
    def setInvalidsVarargs(value: js.Any*): Self = StObject.set(x, "invalids", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Types | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValids(value: js.Array[_]): Self = StObject.set(x, "valids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidsUndefined: Self = StObject.set(x, "valids", js.undefined)
    
    @scala.inline
    def setValidsVarargs(value: js.Any*): Self = StObject.set(x, "valids", js.Array(value :_*))
  }
}
