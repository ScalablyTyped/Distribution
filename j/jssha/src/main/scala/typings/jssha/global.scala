package typings.jssha

import org.scalablytyped.runtime.Shortcut
import typings.jssha.mod.Hasher
import typings.jssha.mod.Options
import typings.jssha.mod.StringDataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsSHA extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("jsSHA")
    @js.native
    class ^ protected ()
      extends StObject
         with Hasher[String] {
      /**
        * Create a Hasher object.
        *
        * @param variant - The desired SHA variant (SHA-1, SHA-224, SHA-256,
        *   SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-384, SHA3-512, SHAKE128, or SHAKE256).
        * @param inputFormat The format of srcString.
        */
      def this(variant: String, inputFormat: StringDataFormat) = this()
      def this(variant: String, inputFormat: StringDataFormat, options: Options) = this()
    }
    
    @JSGlobal("jsSHA")
    @js.native
    val ^ : js.Object & typings.jssha.mod.jsSHA = js.native
    
    type _To = js.Object & typings.jssha.mod.jsSHA
    
    /* This means you don't have to write `^`, but can instead just say `jsSHA.foo` */
    override def _to: js.Object & typings.jssha.mod.jsSHA = ^
  }
}
