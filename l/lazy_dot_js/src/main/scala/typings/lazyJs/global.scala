package typings.lazyJs

import typings.lazyJs.LazyJS.LazyStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Lazy")
  @js.native
  def Lazy: LazyStatic = js.native
  
  object LazyJS {
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    object ArrayLikeSequence {
      
      @JSGlobal("LazyJS.ArrayLikeSequence.define")
      @js.native
      def define(methodName: js.Array[String], overrides: js.Any): js.Function = js.native
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    object ObjectLikeSequence {
      
      @JSGlobal("LazyJS.ObjectLikeSequence.define")
      @js.native
      def define(methodName: js.Array[String], overrides: js.Any): js.Function = js.native
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    object Sequence {
      
      @JSGlobal("LazyJS.Sequence.define")
      @js.native
      def define(methodName: js.Array[String], overrides: js.Any): js.Function = js.native
    }
    
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    object StringLikeSequence {
      
      @JSGlobal("LazyJS.StringLikeSequence.define")
      @js.native
      def define(methodName: js.Array[String], overrides: js.Any): js.Function = js.native
    }
  }
  
  @scala.inline
  def Lazy_=(x: LazyStatic): Unit = js.Dynamic.global.updateDynamic("Lazy")(x.asInstanceOf[js.Any])
}
