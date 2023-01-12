package typings.libphonenumberJs

import typings.libphonenumberJs.libphonenumberJsBooleans.`true`
import typings.libphonenumberJs.typesMod.CountryCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var defaultCountry: js.UndefOr[CountryCode] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setDefaultCountry(value: CountryCode): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
    }
  }
  
  trait DefaultCallingCode extends StObject {
    
    var defaultCallingCode: js.UndefOr[String] = js.undefined
    
    var defaultCountry: js.UndefOr[CountryCode] = js.undefined
    
    var extract: js.UndefOr[Boolean] = js.undefined
  }
  object DefaultCallingCode {
    
    inline def apply(): DefaultCallingCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultCallingCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultCallingCode] (val x: Self) extends AnyVal {
      
      inline def setDefaultCallingCode(value: String): Self = StObject.set(x, "defaultCallingCode", value.asInstanceOf[js.Any])
      
      inline def setDefaultCallingCodeUndefined: Self = StObject.set(x, "defaultCallingCode", js.undefined)
      
      inline def setDefaultCountry(value: CountryCode): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    }
  }
  
  trait DefaultCountry extends StObject {
    
    var defaultCallingCode: js.UndefOr[String] = js.undefined
    
    var defaultCountry: js.UndefOr[CountryCode] = js.undefined
  }
  object DefaultCountry {
    
    inline def apply(): DefaultCountry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultCountry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultCountry] (val x: Self) extends AnyVal {
      
      inline def setDefaultCallingCode(value: String): Self = StObject.set(x, "defaultCallingCode", value.asInstanceOf[js.Any])
      
      inline def setDefaultCallingCodeUndefined: Self = StObject.set(x, "defaultCallingCode", js.undefined)
      
      inline def setDefaultCountry(value: CountryCode): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
    }
  }
  
  trait Tag[T] extends StObject {
    
    var __tag: js.UndefOr[T] = js.undefined
  }
  object Tag {
    
    inline def apply[T](): Tag[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tag[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag[?], T] (val x: Self & Tag[T]) extends AnyVal {
      
      inline def set__tag(value: T): Self = StObject.set(x, "__tag", value.asInstanceOf[js.Any])
      
      inline def set__tagUndefined: Self = StObject.set(x, "__tag", js.undefined)
    }
  }
  
  trait V2 extends StObject {
    
    var defaultCountry: js.UndefOr[CountryCode] = js.undefined
    
    var v2: `true`
  }
  object V2 {
    
    inline def apply(): V2 = {
      val __obj = js.Dynamic.literal(v2 = true)
      __obj.asInstanceOf[V2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V2] (val x: Self) extends AnyVal {
      
      inline def setDefaultCountry(value: CountryCode): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setV2(value: `true`): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
    }
  }
}
