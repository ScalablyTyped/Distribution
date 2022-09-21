package typings.legalEagle

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    options: Options,
    cb: js.Function2[/* err */ js.Error | Null, /* licenseSummary */ LicenseLookup, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("legal-eagle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Entry extends StObject {
    
    var license: String
    
    var repository: String
    
    var source: String
    
    var sourceText: String
  }
  object Entry {
    
    inline def apply(license: String, repository: String, source: String, sourceText: String): Entry = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
    }
  }
  
  type LicenseLookup = StringDictionary[Entry]
  
  trait Options extends StObject {
    
    var omitPermissive: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[LicenseLookup] = js.undefined
    
    var path: String
  }
  object Options {
    
    inline def apply(path: String): Options = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOmitPermissive(value: Boolean): Self = StObject.set(x, "omitPermissive", value.asInstanceOf[js.Any])
      
      inline def setOmitPermissiveUndefined: Self = StObject.set(x, "omitPermissive", js.undefined)
      
      inline def setOverrides(value: LicenseLookup): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
