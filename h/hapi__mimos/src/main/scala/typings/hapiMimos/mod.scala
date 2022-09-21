package typings.hapiMimos

import org.scalablytyped.runtime.StringDictionary
import typings.hapiMimos.hapiMimosStrings.`mime-db`
import typings.hapiMimos.hapiMimosStrings.mimos
import typings.hapiMimos.mod.MimeDb.MimeEntry
import typings.hapiMimos.mod.MimeDb.MimeSource
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/mimos", "Mimos")
  @js.native
  /**
    * Create a Mimos object for mime lookups.
    */
  open class Mimos[P /* <: js.Object */] () extends StObject {
    def this(options: MimosOptions[NoInfer[P]]) = this()
    
    /**
      * Extract extension from file path and lookup mime information.
      *
      * @param path - Path to file
      *
      * @return Found mime object, or {} if no match.
      */
    def path(path: String): (MimosEntry & Partial[P]) | js.Object = js.native
    
    /**
      * Lookup mime information.
      *
      * @param type - The content-type to find mime information about.
      *
      * @return Mime object for provided type.
      */
    def `type`(`type`: String): MimosEntry & Partial[P] = js.native
  }
  
  @JSImport("@hapi/mimos", "MimosEntry")
  @js.native
  /* private */ open class MimosEntry () extends StObject {
    
    /**
      * Optional charset for type.
      */
    var charset: js.UndefOr[String] = js.native
    
    /**
      * Boolean that indicates if the contents is likely to become smaller if
      * gzip or similar compression is applied.
      */
    var compressible: Boolean = js.native
    
    /**
      * Array of strings with possible lowercased file extensions, without the
      * dot.
      */
    var extensions: js.Array[String] = js.native
    
    /**
      * String with identifier for the source of the data.
      */
    var source: MimeSource | `mime-db` | mimos = js.native
    
    /**
      * String with the content-type.
      */
    var `type`: String = js.native
  }
  
  object MimeDb {
    
    trait MimeEntry extends StObject {
      
      /**
        * Charset for type.
        */
      var charset: js.UndefOr[String] = js.undefined
      
      /**
        * Boolean that indicates if the contents is likely to become smaller if
        * gzip or similar compression is applied.
        */
      var compressible: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Array of strings with possible lowercased file extensions, without the
        * dot.
        */
      var extensions: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * String with identifier for the source of the data.
        */
      var source: js.UndefOr[MimeSource] = js.undefined
    }
    object MimeEntry {
      
      inline def apply(): MimeEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MimeEntry]
      }
      
      extension [Self <: MimeEntry](x: Self) {
        
        inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
        
        inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
        
        inline def setCompressible(value: Boolean): Self = StObject.set(x, "compressible", value.asInstanceOf[js.Any])
        
        inline def setCompressibleUndefined: Self = StObject.set(x, "compressible", js.undefined)
        
        inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
        
        inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
        
        inline def setSource(value: MimeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.hapiMimos.hapiMimosStrings.iana
      - typings.hapiMimos.hapiMimosStrings.apache
      - typings.hapiMimos.hapiMimosStrings.nginx
    */
    trait MimeSource extends StObject
    object MimeSource {
      
      inline def apache: typings.hapiMimos.hapiMimosStrings.apache = "apache".asInstanceOf[typings.hapiMimos.hapiMimosStrings.apache]
      
      inline def iana: typings.hapiMimos.hapiMimosStrings.iana = "iana".asInstanceOf[typings.hapiMimos.hapiMimosStrings.iana]
      
      inline def nginx: typings.hapiMimos.hapiMimosStrings.nginx = "nginx".asInstanceOf[typings.hapiMimos.hapiMimosStrings.nginx]
    }
  }
  
  trait MimosDeclaration[P /* <: js.Object */]
    extends StObject
       with MimeEntry {
    
    /**
      * Method with signature `function(mime)`.
      *
      * When this mime type is found in the database, this function will run.
      * This allows you make customizations to `mime` based on developer criteria.
      */
    var predicate: js.UndefOr[js.Function1[/* mime */ MimosEntry & P, MimosEntry]] = js.undefined
    
    /**
      * The `type` value of result objects, defaults to `key`.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MimosDeclaration {
    
    inline def apply[P /* <: js.Object */](): MimosDeclaration[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosDeclaration[P]]
    }
    
    extension [Self <: MimosDeclaration[?], P /* <: js.Object */](x: Self & MimosDeclaration[P]) {
      
      inline def setPredicate(value: /* mime */ MimosEntry & P => MimosEntry): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MimosOptions[P /* <: js.Object */] extends StObject {
    
    /**
      * An object hash that is merged into the built-in mime information from
      * {@link https://github.com/jshttp/mime-db}.
      *
      * Each key value pair represents a single mime object override.
      *
      * Each override entry should follow this schema:
      *  * The key is the lower-cased correct mime-type. (Ex. "application/javascript").
      *  * The value should be an object following the structure from
      *    {@link https://github.com/jshttp/mime-db#data-structure} with additional
      *    optional values:
      *     * type - Specify the `type` value of result objects, defaults to `key`.
      *     * predicate - Method that is called with mime entry on lookup, that
      *       must return an entry. This allows you make customizations to `mime`
      *       based on developer criteria.
      */
    var `override`: js.UndefOr[StringDictionary[MimosDeclaration[P] & P]] = js.undefined
  }
  object MimosOptions {
    
    inline def apply[P /* <: js.Object */](): MimosOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosOptions[P]]
    }
    
    extension [Self <: MimosOptions[?], P /* <: js.Object */](x: Self & MimosOptions[P]) {
      
      inline def setOverride(value: StringDictionary[MimosDeclaration[P] & P]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  // Helpers
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
}
