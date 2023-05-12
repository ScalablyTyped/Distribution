package typings.jackspeak

import typings.jackspeak.distCjsMod.ConfigOptionBase
import typings.jackspeak.distCjsMod.ConfigType
import typings.jackspeak.distCjsMod.UsageField
import typings.jackspeak.distCjsMod.ValidValue
import typings.jackspeak.jackspeakStrings.config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default[T /* <: ConfigType */, M /* <: Boolean */] extends StObject {
    
    var default: js.UndefOr[ValidValue[T, M]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[T] = js.undefined
    
    var validate: js.UndefOr[
        js.Function1[/* v */ Any, /* is jackspeak.jackspeak/dist/cjs.ValidValue<T, M> */ Boolean]
      ] = js.undefined
  }
  object Default {
    
    inline def apply[T /* <: ConfigType */, M /* <: Boolean */](): Default[T, M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default[T, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default[?, ?], T /* <: ConfigType */, M /* <: Boolean */] (val x: Self & (Default[T, M])) extends AnyVal {
      
      inline def setDefault(value: ValidValue[T, M]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: /* v */ Any => /* is jackspeak.jackspeak/dist/cjs.ValidValue<T, M> */ Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Delim extends StObject {
    
    var default: js.UndefOr[String | Double | Boolean | (js.Array[Boolean | Double | String])] = js.undefined
    
    var delim: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: ConfigType
    
    var validate: js.UndefOr[js.Function1[/* v */ Any, Boolean]] = js.undefined
  }
  object Delim {
    
    inline def apply(`type`: ConfigType): Delim = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delim] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String | Double | Boolean | (js.Array[Boolean | Double | String])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
      
      inline def setDelimUndefined: Self = StObject.set(x, "delim", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: ConfigType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: /* v */ Any => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Description[T /* <: ConfigType */, M /* <: Boolean */] extends StObject {
    
    var default: js.UndefOr[ValidValue[T, M]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var hint: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends 'boolean' ? undefined : string | undefined */ js.Any
      ] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: T
    
    var validate: js.UndefOr[
        js.Function1[/* v */ Any, /* is jackspeak.jackspeak/dist/cjs.ValidValue<T, M> */ Boolean]
      ] = js.undefined
  }
  object Description {
    
    inline def apply[T /* <: ConfigType */, M /* <: Boolean */](`type`: T): Description[T, M] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description[T, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description[?, ?], T /* <: ConfigType */, M /* <: Boolean */] (val x: Self & (Description[T, M])) extends AnyVal {
      
      inline def setDefault(value: ValidValue[T, M]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHint(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'boolean' ? undefined : string | undefined */ js.Any
      ): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: /* v */ Any => /* is jackspeak.jackspeak/dist/cjs.ValidValue<T, M> */ Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Hint[T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */] extends StObject {
    
    var default: js.UndefOr[typings.jackspeak.distMjsMod.ValidValue[T, M]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var hint: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends 'boolean' ? undefined : string | undefined */ js.Any
      ] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: T
    
    var validate: js.UndefOr[
        js.Function1[/* v */ Any, /* is jackspeak.jackspeak/dist/mjs.ValidValue<T, M> */ Boolean]
      ] = js.undefined
  }
  object Hint {
    
    inline def apply[T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */](`type`: T): Hint[T, M] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hint[T, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hint[?, ?], T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */] (val x: Self & (Hint[T, M])) extends AnyVal {
      
      inline def setDefault(value: typings.jackspeak.distMjsMod.ValidValue[T, M]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHint(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'boolean' ? undefined : string | undefined */ js.Any
      ): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: /* v */ Any => /* is jackspeak.jackspeak/dist/mjs.ValidValue<T, M> */ Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Multiple extends StObject {
    
    var default: js.UndefOr[String | Double | Boolean | (js.Array[Boolean | Double | String])] = js.undefined
    
    var delim: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: typings.jackspeak.distMjsMod.ConfigType
    
    var validate: js.UndefOr[js.Function1[/* v */ Any, Boolean]] = js.undefined
  }
  object Multiple {
    
    inline def apply(`type`: typings.jackspeak.distMjsMod.ConfigType): Multiple = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Multiple]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String | Double | Boolean | (js.Array[Boolean | Double | String])): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
      
      inline def setDelimUndefined: Self = StObject.set(x, "delim", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: typings.jackspeak.distMjsMod.ConfigType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: /* v */ Any => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Name
    extends StObject
       with UsageField {
    
    var name: String
    
    var `type`: config
    
    var value: ConfigOptionBase[ConfigType, Boolean]
  }
  object Name {
    
    inline def apply(name: String, value: ConfigOptionBase[ConfigType, Boolean]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("config")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: config): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ConfigOptionBase[ConfigType, Boolean]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pre extends StObject {
    
    var pre: js.UndefOr[Boolean] = js.undefined
  }
  object Pre {
    
    inline def apply(): Pre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pre]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pre] (val x: Self) extends AnyVal {
      
      inline def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  trait Short[T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */] extends StObject {
    
    var default: js.UndefOr[typings.jackspeak.distMjsMod.ValidValue[T, M]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[T] = js.undefined
    
    var validate: js.UndefOr[
        js.Function1[/* v */ Any, /* is jackspeak.jackspeak/dist/mjs.ValidValue<T, M> */ Boolean]
      ] = js.undefined
  }
  object Short {
    
    inline def apply[T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */](): Short[T, M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Short[T, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Short[?, ?], T /* <: typings.jackspeak.distMjsMod.ConfigType */, M /* <: Boolean */] (val x: Self & (Short[T, M])) extends AnyVal {
      
      inline def setDefault(value: typings.jackspeak.distMjsMod.ValidValue[T, M]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: /* v */ Any => /* is jackspeak.jackspeak/dist/mjs.ValidValue<T, M> */ Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait Type
    extends StObject
       with typings.jackspeak.distMjsMod.UsageField {
    
    var name: String
    
    var `type`: config
    
    var value: typings.jackspeak.distMjsMod.ConfigOptionBase[typings.jackspeak.distMjsMod.ConfigType, Boolean]
  }
  object Type {
    
    inline def apply(
      name: String,
      value: typings.jackspeak.distMjsMod.ConfigOptionBase[typings.jackspeak.distMjsMod.ConfigType, Boolean]
    ): Type = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("config")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: config): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(
        value: typings.jackspeak.distMjsMod.ConfigOptionBase[typings.jackspeak.distMjsMod.ConfigType, Boolean]
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
