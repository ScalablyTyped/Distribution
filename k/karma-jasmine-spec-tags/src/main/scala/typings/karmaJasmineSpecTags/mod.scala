package typings.karmaJasmineSpecTags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A plugin for karma-jasmine which helps to filter tests (specs) by tags.
/* augmented module */
object mod {
  
  /**
    * Default values can be configured using client map in Karma configuration
    */
  @js.native
  trait ClientOptions extends StObject {
    
    /**
      * defines a comma-separated list of tag names
      * * If `names` is defined then specs which match to tags will be skipped.
      * * If `names` is not defined then all specs with a tag will be skipped.
      */
    var skipTags: js.UndefOr[String | js.Array[String] | Boolean] = js.native
    
    /**
      * defines a prefix for a tag name
      * @default '#'
      */
    var tagPrefix: js.UndefOr[String] = js.native
    
    /**
      * defines a comma-separated list of tag names:
      * * if `names` is defined then specs which match to tags will be executed.
      * * If `names` is not defined then all specs with a tag will be executed.
      */
    var tags: js.UndefOr[String | js.Array[String] | Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipTags(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "skipTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipTagsUndefined: Self = StObject.set(x, "skipTags", js.undefined)
      
      @scala.inline
      def setSkipTagsVarargs(value: String*): Self = StObject.set(x, "skipTags", js.Array(value :_*))
      
      @scala.inline
      def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      @scala.inline
      def setTags(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
