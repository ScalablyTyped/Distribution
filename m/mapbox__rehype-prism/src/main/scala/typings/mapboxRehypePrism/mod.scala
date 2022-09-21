package typings.mapboxRehypePrism

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.Root
import typings.std.Record
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@mapbox/rehype-prism", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Array[js.UndefOr[Options]], Root, Root] = js.native
  
  trait Options extends StObject {
    
    /**
      * Provide [aliases](https://github.com/wooorm/refractor#refractoraliasname-alias) to refractor to register as alternative names for a language.
      *
      * @default undefined
      */
    var alias: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
    
    /**
      * By default, if `{name}` does not correspond to a [language supported by refractor](https://github.com/wooorm/refractor#syntaxes) an error will be thrown.
      * If you would like to silently skip `<code>` elements with invalid languages, set this option to `true`.
      *
      * @default false
      */
    var ignoreMissing: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlias(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setIgnoreMissing(value: Boolean): Self = StObject.set(x, "ignoreMissing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingUndefined: Self = StObject.set(x, "ignoreMissing", js.undefined)
    }
  }
  
  type _To = Plugin[js.Array[js.UndefOr[Options]], Root, Root]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[js.UndefOr[Options]], Root, Root] = ^
}
