package typings.lernaGetPackages

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalTsTypings extends StObject {
    
    var additionalTsTypings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AdditionalTsTypings {
    
    inline def apply(): AdditionalTsTypings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalTsTypings]
    }
    
    extension [Self <: AdditionalTsTypings](x: Self) {
      
      inline def setAdditionalTsTypings(value: js.Array[String]): Self = StObject.set(x, "additionalTsTypings", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTsTypingsUndefined: Self = StObject.set(x, "additionalTsTypings", js.undefined)
      
      inline def setAdditionalTsTypingsVarargs(value: String*): Self = StObject.set(x, "additionalTsTypings", js.Array(value*))
    }
  }
  
  trait Config extends StObject {
    
    var config: js.UndefOr[AdditionalTsTypings] = js.undefined
    
    var dependencies: Record[String, String]
    
    var main: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var version: String
  }
  object Config {
    
    inline def apply(dependencies: Record[String, String], name: String, version: String): Config = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: AdditionalTsTypings): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
