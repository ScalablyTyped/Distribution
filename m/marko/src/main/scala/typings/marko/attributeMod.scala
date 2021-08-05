package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeMod {
  
  @JSImport("marko/src/compiler/taglib-loader/Attribute", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Attribute {
    
    /* CompleteClass */
    var allowExpressions: Boolean = js.native
    
    /* CompleteClass */
    var autocomplete: Boolean = js.native
    
    /* CompleteClass */
    var defaultValue: String = js.native
    
    /* CompleteClass */
    var deprecated: js.Any = js.native
    
    /* CompleteClass */
    var dynamicAttribute: Boolean = js.native
    
    /* CompleteClass */
    var `enum`: js.Any = js.native
    
    /* CompleteClass */
    var filePath: String = js.native
    
    /* CompleteClass */
    var html: Boolean = js.native
    
    /* CompleteClass */
    var ignore: Boolean = js.native
    
    /* CompleteClass */
    var key: String = js.native
    
    /* CompleteClass */
    var removeDashes: Boolean = js.native
    
    /* CompleteClass */
    var required: Boolean = js.native
    
    /* CompleteClass */
    var setContextFlag: String = js.native
    
    /* CompleteClass */
    var setFlag: String | Null = js.native
    
    /* CompleteClass */
    var targetProperty: String | Null = js.native
    
    /* CompleteClass */
    var `type`: String | Null = js.native
  }
  
  trait Attribute extends StObject {
    
    var allowExpressions: Boolean
    
    var autocomplete: Boolean
    
    var defaultValue: String
    
    var deprecated: js.Any
    
    var dynamicAttribute: Boolean
    
    var `enum`: js.Any
    
    var filePath: String
    
    var html: Boolean
    
    var ignore: Boolean
    
    var key: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[js.Any] = js.undefined
    
    var preserveName: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var removeDashes: Boolean
    
    var required: Boolean
    
    var setContextFlag: String
    
    var setFlag: String | Null
    
    var targetProperty: String | Null
    
    var `type`: String | Null
  }
  object Attribute {
    
    inline def apply(
      allowExpressions: Boolean,
      autocomplete: Boolean,
      defaultValue: String,
      deprecated: js.Any,
      dynamicAttribute: Boolean,
      `enum`: js.Any,
      filePath: String,
      html: Boolean,
      ignore: Boolean,
      key: String,
      removeDashes: Boolean,
      required: Boolean,
      setContextFlag: String
    ): Attribute = {
      val __obj = js.Dynamic.literal(allowExpressions = allowExpressions.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], dynamicAttribute = dynamicAttribute.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], removeDashes = removeDashes.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setContextFlag = setContextFlag.asInstanceOf[js.Any], setFlag = null, targetProperty = null)
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setAllowExpressions(value: Boolean): Self = StObject.set(x, "allowExpressions", value.asInstanceOf[js.Any])
      
      inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDeprecated(value: js.Any): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDynamicAttribute(value: Boolean): Self = StObject.set(x, "dynamicAttribute", value.asInstanceOf[js.Any])
      
      inline def setEnum(value: js.Any): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPattern(value: js.Any): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPreserveName(value: String): Self = StObject.set(x, "preserveName", value.asInstanceOf[js.Any])
      
      inline def setPreserveNameUndefined: Self = StObject.set(x, "preserveName", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRemoveDashes(value: Boolean): Self = StObject.set(x, "removeDashes", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSetContextFlag(value: String): Self = StObject.set(x, "setContextFlag", value.asInstanceOf[js.Any])
      
      inline def setSetFlag(value: String): Self = StObject.set(x, "setFlag", value.asInstanceOf[js.Any])
      
      inline def setSetFlagNull: Self = StObject.set(x, "setFlag", null)
      
      inline def setTargetProperty(value: String): Self = StObject.set(x, "targetProperty", value.asInstanceOf[js.Any])
      
      inline def setTargetPropertyNull: Self = StObject.set(x, "targetProperty", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
}
