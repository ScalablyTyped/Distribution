package typings.lodash

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod extends Shortcut {
  
  @JSImport("lodash/fp/convert", JSImport.Namespace)
  @js.native
  val ^ : Convert = js.native
  
  @js.native
  trait Convert extends StObject {
    
    def apply(func: js.Object): js.Any = js.native
    def apply(func: js.Object, options: ConvertOptions): js.Any = js.native
    def apply(name: String, func: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    def apply(name: String, func: js.Function1[/* repeated */ js.Any, _], options: ConvertOptions): js.Any = js.native
  }
  
  @js.native
  trait ConvertOptions extends StObject {
    
    var cap: js.UndefOr[Boolean] = js.native
    
    var curry: js.UndefOr[Boolean] = js.native
    
    var fixed: js.UndefOr[Boolean] = js.native
    
    var immutable: js.UndefOr[Boolean] = js.native
    
    var rearg: js.UndefOr[Boolean] = js.native
  }
  object ConvertOptions {
    
    @scala.inline
    def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit class ConvertOptionsMutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCap(value: Boolean): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
      
      @scala.inline
      def setCurry(value: Boolean): Self = StObject.set(x, "curry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurryUndefined: Self = StObject.set(x, "curry", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
      
      @scala.inline
      def setRearg(value: Boolean): Self = StObject.set(x, "rearg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReargUndefined: Self = StObject.set(x, "rearg", js.undefined)
    }
  }
  
  type _To = Convert
  
  /* This means you don't have to write `^`, but can instead just say `convertMod.foo` */
  override def _to: Convert = ^
}
