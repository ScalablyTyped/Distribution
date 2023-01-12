package typings.hapiAccept

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/accept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def charset(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")().asInstanceOf[String]
  inline def charset(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def charset(header: String, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("charset")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def charset(header: Unit, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("charset")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def charsets(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("charsets")().asInstanceOf[js.Array[String]]
  inline def charsets(header: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("charsets")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def encoding(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encoding")().asInstanceOf[String]
  inline def encoding(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encoding")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encoding(header: String, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encoding")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encoding(header: Unit, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encoding")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodings(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodings")().asInstanceOf[js.Array[String]]
  inline def encodings(header: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodings")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def language(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")().asInstanceOf[String]
  inline def language(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def language(header: String, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("language")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def language(header: Unit, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("language")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def languages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")().asInstanceOf[js.Array[String]]
  inline def languages(header: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("languages")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def mediaType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaType")().asInstanceOf[String]
  inline def mediaType(header: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaType")(header.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mediaType(header: String, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaType")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def mediaType(header: Unit, preferences: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mediaType")(header.asInstanceOf[js.Any], preferences.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mediaTypes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTypes")().asInstanceOf[js.Array[String]]
  inline def mediaTypes(header: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaTypes")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  object parseAll {
    
    inline def apply(headers: Headers): Result = ^.asInstanceOf[js.Dynamic].apply(headers.asInstanceOf[js.Any]).asInstanceOf[Result]
    
    @JSImport("@hapi/accept", "parseAll")
    @js.native
    val ^ : js.Any = js.native
    
    trait Headers
      extends StObject
         with /* header */ StringDictionary[Any] {
      
      val accept: js.UndefOr[String] = js.undefined
      
      val `accept-charset`: js.UndefOr[String] = js.undefined
      
      val `accept-encoding`: js.UndefOr[String] = js.undefined
      
      val `accept-language`: js.UndefOr[String] = js.undefined
    }
    object Headers {
      
      inline def apply(): Headers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Headers]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
        
        inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
        
        inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
        
        inline def `setAccept-encoding`(value: String): Self = StObject.set(x, "accept-encoding", value.asInstanceOf[js.Any])
        
        inline def `setAccept-encodingUndefined`: Self = StObject.set(x, "accept-encoding", js.undefined)
        
        inline def `setAccept-language`(value: String): Self = StObject.set(x, "accept-language", value.asInstanceOf[js.Any])
        
        inline def `setAccept-languageUndefined`: Self = StObject.set(x, "accept-language", js.undefined)
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      }
    }
    
    trait Result extends StObject {
      
      var charsets: js.Array[String]
      
      var encodings: js.Array[String]
      
      var languages: js.Array[String]
      
      var mediaTypes: js.Array[String]
    }
    object Result {
      
      inline def apply(
        charsets: js.Array[String],
        encodings: js.Array[String],
        languages: js.Array[String],
        mediaTypes: js.Array[String]
      ): Result = {
        val __obj = js.Dynamic.literal(charsets = charsets.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mediaTypes = mediaTypes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
        
        inline def setCharsets(value: js.Array[String]): Self = StObject.set(x, "charsets", value.asInstanceOf[js.Any])
        
        inline def setCharsetsVarargs(value: String*): Self = StObject.set(x, "charsets", js.Array(value*))
        
        inline def setEncodings(value: js.Array[String]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
        
        inline def setEncodingsVarargs(value: String*): Self = StObject.set(x, "encodings", js.Array(value*))
        
        inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
        
        inline def setMediaTypes(value: js.Array[String]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
        
        inline def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
      }
    }
  }
}
