package typings.hapiAccept

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/accept", "charset")
  @js.native
  def charset(): String = js.native
  @JSImport("@hapi/accept", "charset")
  @js.native
  def charset(header: js.UndefOr[scala.Nothing], preferences: js.Array[String]): String = js.native
  @JSImport("@hapi/accept", "charset")
  @js.native
  def charset(header: String): String = js.native
  @JSImport("@hapi/accept", "charset")
  @js.native
  def charset(header: String, preferences: js.Array[String]): String = js.native
  
  @JSImport("@hapi/accept", "charsets")
  @js.native
  def charsets(): js.Array[String] = js.native
  @JSImport("@hapi/accept", "charsets")
  @js.native
  def charsets(header: String): js.Array[String] = js.native
  
  @JSImport("@hapi/accept", "encoding")
  @js.native
  def encoding(): String = js.native
  @JSImport("@hapi/accept", "encoding")
  @js.native
  def encoding(header: js.UndefOr[scala.Nothing], preferences: js.Array[String]): String = js.native
  @JSImport("@hapi/accept", "encoding")
  @js.native
  def encoding(header: String): String = js.native
  @JSImport("@hapi/accept", "encoding")
  @js.native
  def encoding(header: String, preferences: js.Array[String]): String = js.native
  
  @JSImport("@hapi/accept", "encodings")
  @js.native
  def encodings(): js.Array[String] = js.native
  @JSImport("@hapi/accept", "encodings")
  @js.native
  def encodings(header: String): js.Array[String] = js.native
  
  @JSImport("@hapi/accept", "language")
  @js.native
  def language(): String = js.native
  @JSImport("@hapi/accept", "language")
  @js.native
  def language(header: js.UndefOr[scala.Nothing], preferences: js.Array[String]): String = js.native
  @JSImport("@hapi/accept", "language")
  @js.native
  def language(header: String): String = js.native
  @JSImport("@hapi/accept", "language")
  @js.native
  def language(header: String, preferences: js.Array[String]): String = js.native
  
  @JSImport("@hapi/accept", "languages")
  @js.native
  def languages(): js.Array[String] = js.native
  @JSImport("@hapi/accept", "languages")
  @js.native
  def languages(header: String): js.Array[String] = js.native
  
  @JSImport("@hapi/accept", "mediaType")
  @js.native
  def mediaType(): String = js.native
  @JSImport("@hapi/accept", "mediaType")
  @js.native
  def mediaType(header: js.UndefOr[scala.Nothing], preferences: js.Array[String]): String = js.native
  @JSImport("@hapi/accept", "mediaType")
  @js.native
  def mediaType(header: String): String = js.native
  @JSImport("@hapi/accept", "mediaType")
  @js.native
  def mediaType(header: String, preferences: js.Array[String]): String = js.native
  
  @JSImport("@hapi/accept", "mediaTypes")
  @js.native
  def mediaTypes(): js.Array[String] = js.native
  @JSImport("@hapi/accept", "mediaTypes")
  @js.native
  def mediaTypes(header: String): js.Array[String] = js.native
  
  object parseAll {
    
    @JSImport("@hapi/accept", "parseAll")
    @js.native
    def apply(headers: Headers): Result = js.native
    
    @js.native
    trait Headers
      extends /* header */ StringDictionary[js.Any] {
      
      val accept: js.UndefOr[String] = js.native
      
      val `accept-charset`: js.UndefOr[String] = js.native
      
      val `accept-encoding`: js.UndefOr[String] = js.native
      
      val `accept-language`: js.UndefOr[String] = js.native
    }
    object Headers {
      
      @scala.inline
      def apply(): Headers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Headers]
      }
      
      @scala.inline
      implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
        
        @scala.inline
        def `setAccept-encoding`(value: String): Self = StObject.set(x, "accept-encoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAccept-encodingUndefined`: Self = StObject.set(x, "accept-encoding", js.undefined)
        
        @scala.inline
        def `setAccept-language`(value: String): Self = StObject.set(x, "accept-language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAccept-languageUndefined`: Self = StObject.set(x, "accept-language", js.undefined)
        
        @scala.inline
        def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      }
    }
    
    @js.native
    trait Result extends StObject {
      
      var charsets: js.Array[String] = js.native
      
      var encodings: js.Array[String] = js.native
      
      var languages: js.Array[String] = js.native
      
      var mediaTypes: js.Array[String] = js.native
    }
    object Result {
      
      @scala.inline
      def apply(
        charsets: js.Array[String],
        encodings: js.Array[String],
        languages: js.Array[String],
        mediaTypes: js.Array[String]
      ): Result = {
        val __obj = js.Dynamic.literal(charsets = charsets.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mediaTypes = mediaTypes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      @scala.inline
      implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCharsets(value: js.Array[String]): Self = StObject.set(x, "charsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharsetsVarargs(value: String*): Self = StObject.set(x, "charsets", js.Array(value :_*))
        
        @scala.inline
        def setEncodings(value: js.Array[String]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncodingsVarargs(value: String*): Self = StObject.set(x, "encodings", js.Array(value :_*))
        
        @scala.inline
        def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
        
        @scala.inline
        def setMediaTypes(value: js.Array[String]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value :_*))
      }
    }
  }
}
