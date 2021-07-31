package typings.grammarkdown.grammarkdownMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownOption extends StObject {
  
  var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
  
  var convert: js.UndefOr[
    js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, js.Any]
  ] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var isUsage: js.UndefOr[Boolean] = js.undefined
  
  var longName: String
  
  var many: js.UndefOr[Boolean] = js.undefined
  
  var param: js.UndefOr[String] = js.undefined
  
  var shortName: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String | (Map[String, js.Any])] = js.undefined
  
  var validate: js.UndefOr[
    js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
  ] = js.undefined
}
object KnownOption {
  
  @scala.inline
  def apply(longName: String): KnownOption = {
    val __obj = js.Dynamic.literal(longName = longName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownOption]
  }
  
  @scala.inline
  implicit class KnownOptionMutableBuilder[Self <: KnownOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasFor(value: js.Array[String]): Self = StObject.set(x, "aliasFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasForUndefined: Self = StObject.set(x, "aliasFor", js.undefined)
    
    @scala.inline
    def setAliasForVarargs(value: String*): Self = StObject.set(x, "aliasFor", js.Array(value :_*))
    
    @scala.inline
    def setConvert(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => js.Any): Self = StObject.set(x, "convert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIsUsage(value: Boolean): Self = StObject.set(x, "isUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUsageUndefined: Self = StObject.set(x, "isUsage", js.undefined)
    
    @scala.inline
    def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    @scala.inline
    def setType(value: String | (Map[String, js.Any])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidate(value: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
