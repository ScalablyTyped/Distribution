package typings.gulpCoffeeify

import org.scalablytyped.runtime.Shortcut
import typings.gulpCoffeeify.anon.Base
import typings.gulpCoffeeify.anon.Debug
import typings.gulpCoffeeify.anon.Ext
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-coffeeify", JSImport.Namespace)
  @js.native
  val ^ : Coffeeify = js.native
  
  type Aliases = js.Array[Base]
  
  type Coffeeify = js.Function1[/* option */ js.UndefOr[Option], ReadWriteStream]
  
  trait Option extends StObject {
    
    /**
      * [DEPRECATED]: You should use a 'paths' options of browserify.
      */
    var aliases: js.UndefOr[Aliases] = js.undefined
    
    var options: js.UndefOr[Debug] = js.undefined
    
    /**
      * [DEPRECATED]
      */
    var transforms: js.UndefOr[Transforms] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: Base*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setOptions(value: Debug): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTransforms(value: Transforms): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: Ext*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  type Transforms = js.Array[Ext]
  
  type _To = Coffeeify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Coffeeify = ^
}
