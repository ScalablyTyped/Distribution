package typings.lodashWebpackPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lodash-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  type LodashModuleReplacementPlugin = Plugin
  
  trait Options extends StObject {
    
    var caching: js.UndefOr[Boolean] = js.undefined
    
    var chaining: js.UndefOr[Boolean] = js.undefined
    
    var cloning: js.UndefOr[Boolean] = js.undefined
    
    var coercions: js.UndefOr[Boolean] = js.undefined
    
    var collections: js.UndefOr[Boolean] = js.undefined
    
    var currying: js.UndefOr[Boolean] = js.undefined
    
    var deburring: js.UndefOr[Boolean] = js.undefined
    
    var exotics: js.UndefOr[Boolean] = js.undefined
    
    var flattening: js.UndefOr[Boolean] = js.undefined
    
    var guards: js.UndefOr[Boolean] = js.undefined
    
    var memoizing: js.UndefOr[Boolean] = js.undefined
    
    var metadata: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[Boolean] = js.undefined
    
    var placeholders: js.UndefOr[Boolean] = js.undefined
    
    var shorthands: js.UndefOr[Boolean] = js.undefined
    
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaching(value: Boolean): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachingUndefined: Self = StObject.set(x, "caching", js.undefined)
      
      @scala.inline
      def setChaining(value: Boolean): Self = StObject.set(x, "chaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainingUndefined: Self = StObject.set(x, "chaining", js.undefined)
      
      @scala.inline
      def setCloning(value: Boolean): Self = StObject.set(x, "cloning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloningUndefined: Self = StObject.set(x, "cloning", js.undefined)
      
      @scala.inline
      def setCoercions(value: Boolean): Self = StObject.set(x, "coercions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoercionsUndefined: Self = StObject.set(x, "coercions", js.undefined)
      
      @scala.inline
      def setCollections(value: Boolean): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      @scala.inline
      def setCurrying(value: Boolean): Self = StObject.set(x, "currying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurryingUndefined: Self = StObject.set(x, "currying", js.undefined)
      
      @scala.inline
      def setDeburring(value: Boolean): Self = StObject.set(x, "deburring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeburringUndefined: Self = StObject.set(x, "deburring", js.undefined)
      
      @scala.inline
      def setExotics(value: Boolean): Self = StObject.set(x, "exotics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExoticsUndefined: Self = StObject.set(x, "exotics", js.undefined)
      
      @scala.inline
      def setFlattening(value: Boolean): Self = StObject.set(x, "flattening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatteningUndefined: Self = StObject.set(x, "flattening", js.undefined)
      
      @scala.inline
      def setGuards(value: Boolean): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
      
      @scala.inline
      def setMemoizing(value: Boolean): Self = StObject.set(x, "memoizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoizingUndefined: Self = StObject.set(x, "memoizing", js.undefined)
      
      @scala.inline
      def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPaths(value: Boolean): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: Boolean): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      @scala.inline
      def setShorthands(value: Boolean): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShorthandsUndefined: Self = StObject.set(x, "shorthands", js.undefined)
      
      @scala.inline
      def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
}
