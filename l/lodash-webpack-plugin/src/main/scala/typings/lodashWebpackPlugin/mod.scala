package typings.lodashWebpackPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("lodash-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCaching(value: Boolean): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
      
      inline def setCachingUndefined: Self = StObject.set(x, "caching", js.undefined)
      
      inline def setChaining(value: Boolean): Self = StObject.set(x, "chaining", value.asInstanceOf[js.Any])
      
      inline def setChainingUndefined: Self = StObject.set(x, "chaining", js.undefined)
      
      inline def setCloning(value: Boolean): Self = StObject.set(x, "cloning", value.asInstanceOf[js.Any])
      
      inline def setCloningUndefined: Self = StObject.set(x, "cloning", js.undefined)
      
      inline def setCoercions(value: Boolean): Self = StObject.set(x, "coercions", value.asInstanceOf[js.Any])
      
      inline def setCoercionsUndefined: Self = StObject.set(x, "coercions", js.undefined)
      
      inline def setCollections(value: Boolean): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      inline def setCurrying(value: Boolean): Self = StObject.set(x, "currying", value.asInstanceOf[js.Any])
      
      inline def setCurryingUndefined: Self = StObject.set(x, "currying", js.undefined)
      
      inline def setDeburring(value: Boolean): Self = StObject.set(x, "deburring", value.asInstanceOf[js.Any])
      
      inline def setDeburringUndefined: Self = StObject.set(x, "deburring", js.undefined)
      
      inline def setExotics(value: Boolean): Self = StObject.set(x, "exotics", value.asInstanceOf[js.Any])
      
      inline def setExoticsUndefined: Self = StObject.set(x, "exotics", js.undefined)
      
      inline def setFlattening(value: Boolean): Self = StObject.set(x, "flattening", value.asInstanceOf[js.Any])
      
      inline def setFlatteningUndefined: Self = StObject.set(x, "flattening", js.undefined)
      
      inline def setGuards(value: Boolean): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
      
      inline def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
      
      inline def setMemoizing(value: Boolean): Self = StObject.set(x, "memoizing", value.asInstanceOf[js.Any])
      
      inline def setMemoizingUndefined: Self = StObject.set(x, "memoizing", js.undefined)
      
      inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPaths(value: Boolean): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPlaceholders(value: Boolean): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      inline def setShorthands(value: Boolean): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
      
      inline def setShorthandsUndefined: Self = StObject.set(x, "shorthands", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
}
