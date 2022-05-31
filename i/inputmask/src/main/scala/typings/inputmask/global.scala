package typings.inputmask

import org.scalablytyped.runtime.Shortcut
import typings.inputmask.mod.Instance
import typings.inputmask.mod.Options
import typings.inputmask.mod.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Inputmask extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Inputmask")
    @js.native
    /**
      * Creates a new Inputmask instance.
      *
      * @param opts Mask options.
      */
    class ^ ()
      extends StObject
         with Instance {
      /**
        * Creates a new Inputmask instance.
        *
        * @param maskOrAlias A mask pattern or a reference to a predefined alias.
        * @param opts Mask options.
        */
      def this(maskOrAlias: String) = this()
      def this(opts: Options) = this()
      def this(maskOrAlias: String, opts: Options) = this()
    }
    
    @JSGlobal("Inputmask")
    @js.native
    val ^ : js.Object & Static = js.native
    
    type _To = js.Object & Static
    
    /* This means you don't have to write `^`, but can instead just say `Inputmask.foo` */
    override def _to: js.Object & Static = ^
  }
}
