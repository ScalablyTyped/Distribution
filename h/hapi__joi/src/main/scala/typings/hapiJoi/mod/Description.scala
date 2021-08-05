package typings.hapiJoi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var example: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var flags: js.UndefOr[js.Object] = js.undefined
  
  var invalids: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var notes: js.UndefOr[js.Array[String]] = js.undefined
  
  var options: js.UndefOr[ValidationOptions] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[Types | String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var valids: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object Description {
  
  inline def apply(): Description = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExample(value: js.Array[js.Any]): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExampleVarargs(value: js.Any*): Self = StObject.set(x, "example", js.Array(value :_*))
    
    inline def setFlags(value: js.Object): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setInvalids(value: js.Array[js.Any]): Self = StObject.set(x, "invalids", value.asInstanceOf[js.Any])
    
    inline def setInvalidsUndefined: Self = StObject.set(x, "invalids", js.undefined)
    
    inline def setInvalidsVarargs(value: js.Any*): Self = StObject.set(x, "invalids", js.Array(value :_*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMeta(value: js.Array[js.Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    inline def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setType(value: Types | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValids(value: js.Array[js.Any]): Self = StObject.set(x, "valids", value.asInstanceOf[js.Any])
    
    inline def setValidsUndefined: Self = StObject.set(x, "valids", js.undefined)
    
    inline def setValidsVarargs(value: js.Any*): Self = StObject.set(x, "valids", js.Array(value :_*))
  }
}
