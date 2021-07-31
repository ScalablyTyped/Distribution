package typings.iso31662

import org.scalablytyped.runtime.StringDictionary
import typings.iso31662.mod.CountryInfo.Full
import typings.iso31662.mod.CountryInfo.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iso-3166-2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def country(countryCodeOrName: String): CountryInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("country")(countryCodeOrName.asInstanceOf[js.Any]).asInstanceOf[CountryInfo | Null]
  
  @JSImport("iso-3166-2", "data")
  @js.native
  val data: Map = js.native
  
  @scala.inline
  def subdivision(countryCodeOrFullSubdivisionCode: String): SubdivisionInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("subdivision")(countryCodeOrFullSubdivisionCode.asInstanceOf[js.Any]).asInstanceOf[SubdivisionInfo | Null]
  @scala.inline
  def subdivision(countryCodeOrFullSubdivisionCode: String, subdivisionCodeOrName: String): SubdivisionInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("subdivision")(countryCodeOrFullSubdivisionCode.asInstanceOf[js.Any], subdivisionCodeOrName.asInstanceOf[js.Any])).asInstanceOf[SubdivisionInfo | Null]
  
  object CountryInfo {
    
    trait Full
      extends StObject
         with Partial {
      
      var code: String
    }
    object Full {
      
      @scala.inline
      def apply(code: String, name: String, sub: typings.iso31662.mod.SubdivisionInfo.Map): Full = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
        __obj.asInstanceOf[Full]
      }
      
      @scala.inline
      implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      }
    }
    
    type Map = // full data if this country has been retrieved with country() at least once
    StringDictionary[Full | Partial]
    
    trait Partial extends StObject {
      
      var name: String
      
      var sub: typings.iso31662.mod.SubdivisionInfo.Map
    }
    object Partial {
      
      @scala.inline
      def apply(name: String, sub: typings.iso31662.mod.SubdivisionInfo.Map): Partial = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
        __obj.asInstanceOf[Partial]
      }
      
      @scala.inline
      implicit class PartialMutableBuilder[Self <: Partial] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(value: typings.iso31662.mod.SubdivisionInfo.Map): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      }
    }
  }
  type CountryInfo = Full
  
  object SubdivisionInfo {
    
    trait Full
      extends StObject
         with Partial {
      
      var code: String
      
      var countryCode: String
      
      var countryName: String
      
      var regionCode: String
    }
    object Full {
      
      @scala.inline
      def apply(
        code: String,
        countryCode: String,
        countryName: String,
        name: String,
        regionCode: String,
        `type`: String
      ): typings.iso31662.mod.SubdivisionInfo.Full = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regionCode = regionCode.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.iso31662.mod.SubdivisionInfo.Full]
      }
      
      @scala.inline
      implicit class FullMutableBuilder[Self <: typings.iso31662.mod.SubdivisionInfo.Full] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountryName(value: String): Self = StObject.set(x, "countryName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
      }
    }
    
    type Map = // full data if this subdivision has been retrieved with subdivision() at least once
    StringDictionary[typings.iso31662.mod.SubdivisionInfo.Full | Partial]
    
    trait Partial extends StObject {
      
      var name: String
      
      var `type`: String
    }
    object Partial {
      
      @scala.inline
      def apply(name: String, `type`: String): Partial = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Partial]
      }
      
      @scala.inline
      implicit class PartialMutableBuilder[Self <: Partial] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  type SubdivisionInfo = typings.iso31662.mod.SubdivisionInfo.Full
}
