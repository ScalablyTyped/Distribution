package typings.markdownEscapes

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-escapes", JSImport.Namespace)
  @js.native
  val ^ : MarkdownEscapes = js.native
  
  @js.native
  trait MarkdownEscapes extends StObject {
    
    /**
      * Get escapes.
      * Supports `options.commonmark` and `options.gfm`,
      * which when true returns the extra escape characters supported by those flavors.
      */
    def apply(): js.Array[String] = js.native
    def apply(options: Options): js.Array[String] = js.native
    
    /**
      * List of default escapable characters.
      */
    val default: js.Array[String] = js.native
    
    /**
      * List of escapable characters in CommonMark (which includes all gfms).
      */
    val commonmark: js.Array[String] = js.native
    
    /**
      * List of escapable characters in GFM (which includes all defaults).
      */
    val gfm: js.Array[String] = js.native
  }
  
  trait Options extends StObject {
    
    /** @default false */
    var commonmark: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var gfm: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCommonmark(value: Boolean): Self = StObject.set(x, "commonmark", value.asInstanceOf[js.Any])
      
      inline def setCommonmarkUndefined: Self = StObject.set(x, "commonmark", js.undefined)
      
      inline def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    }
  }
  
  type _To = MarkdownEscapes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MarkdownEscapes = ^
}
