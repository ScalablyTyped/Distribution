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
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Base*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: Debug): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTransforms(value: Transforms): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      @scala.inline
      def setTransformsVarargs(value: Ext*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    }
  }
  
  type Transforms = js.Array[Ext]
  
  type _To = Coffeeify
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Coffeeify = ^
}
