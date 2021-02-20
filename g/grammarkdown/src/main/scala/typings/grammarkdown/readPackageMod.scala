package typings.grammarkdown

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readPackageMod {
  
  @JSImport("grammarkdown/dist/read-package", "readPackage")
  @js.native
  def readPackage(packagePath: String, done: js.Function2[/* err */ js.Any, /* pkg */ js.UndefOr[Package], Unit]): Unit = js.native
  
  @JSImport("grammarkdown/dist/read-package", "readPackageSync")
  @js.native
  def readPackageSync(packagePath: String): Package = js.native
  
  @js.native
  trait Package extends StObject {
    
    var author: js.UndefOr[String | Person] = js.native
    
    var dependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var devDependencies: js.UndefOr[StringDictionary[String]] = js.native
    
    var homepage: js.UndefOr[String] = js.native
    
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    var license: js.UndefOr[String] = js.native
    
    var main: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Package {
    
    @scala.inline
    def apply(): Package = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit class PackageMutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String | Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Person extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object Person {
    
    @scala.inline
    def apply(): Person = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Person]
    }
    
    @scala.inline
    implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
