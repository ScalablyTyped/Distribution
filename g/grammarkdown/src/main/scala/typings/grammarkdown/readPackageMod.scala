package typings.grammarkdown

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readPackageMod {
  
  @JSImport("grammarkdown/dist/read-package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readPackage(packagePath: String, done: js.Function2[/* err */ js.Any, /* pkg */ js.UndefOr[Package], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")(packagePath.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readPackageSync(packagePath: String): Package = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageSync")(packagePath.asInstanceOf[js.Any]).asInstanceOf[Package]
  
  trait Package extends StObject {
    
    var author: js.UndefOr[String | Person] = js.undefined
    
    var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var license: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Package {
    
    inline def apply(): Package = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Package]
    }
    
    extension [Self <: Package](x: Self) {
      
      inline def setAuthor(value: String | Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Person {
    
    inline def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    extension [Self <: Person](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
