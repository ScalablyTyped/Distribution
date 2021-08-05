package typings.matterJs

import org.scalablytyped.runtime.StringDictionary
import typings.matterJs.mod.Plugin
import typings.matterJs.mod._Dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dict
    extends StObject
       with /* _ */ StringDictionary[js.Any] {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Dict {
    
    inline def apply(): Dict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dict]
    }
    
    extension [Self <: Dict](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait IsRange extends StObject {
    
    var isRange: Boolean
    
    var number: Double
    
    var operator: String
    
    var parts: js.Array[Double]
    
    var prerelease: String
    
    var range: String
    
    var version: String
  }
  object IsRange {
    
    inline def apply(
      isRange: Boolean,
      number: Double,
      operator: String,
      parts: js.Array[Double],
      prerelease: String,
      range: String,
      version: String
    ): IsRange = {
      val __obj = js.Dynamic.literal(isRange = isRange.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsRange]
    }
    
    extension [Self <: IsRange](x: Self) {
      
      inline def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setParts(value: js.Array[Double]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: Double*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name
    extends StObject
       with _Dependency {
    
    var name: String
    
    var range: String
  }
  object Name {
    
    inline def apply(name: String, range: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uses
    extends StObject
       with /* _ */ StringDictionary[js.Any] {
    
    var uses: js.UndefOr[js.Array[Plugin | String]] = js.undefined
  }
  object Uses {
    
    inline def apply(): Uses = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Uses]
    }
    
    extension [Self <: Uses](x: Self) {
      
      inline def setUses(value: js.Array[Plugin | String]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: (Plugin | String)*): Self = StObject.set(x, "uses", js.Array(value :_*))
    }
  }
  
  trait Version
    extends StObject
       with _Dependency {
    
    var name: String
    
    var version: String
  }
  object Version {
    
    inline def apply(name: String, version: String): Version = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
