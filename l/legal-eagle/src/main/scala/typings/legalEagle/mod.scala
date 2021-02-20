package typings.legalEagle

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("legal-eagle", JSImport.Namespace)
  @js.native
  def apply(
    options: Options,
    cb: js.Function2[/* err */ Error | Null, /* licenseSummary */ LicenseLookup, Unit]
  ): Unit = js.native
  
  @js.native
  trait Entry extends StObject {
    
    var license: String = js.native
    
    var repository: String = js.native
    
    var source: String = js.native
    
    var sourceText: String = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(license: String, repository: String, source: String, sourceText: String): Entry = {
      val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
    }
  }
  
  type LicenseLookup = StringDictionary[Entry]
  
  @js.native
  trait Options extends StObject {
    
    var omitPermissive: js.UndefOr[Boolean] = js.native
    
    var overrides: js.UndefOr[LicenseLookup] = js.native
    
    var path: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(path: String): Options = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOmitPermissive(value: Boolean): Self = StObject.set(x, "omitPermissive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitPermissiveUndefined: Self = StObject.set(x, "omitPermissive", js.undefined)
      
      @scala.inline
      def setOverrides(value: LicenseLookup): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
