package typings.littleLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  def apply(module: String): Unit = js.native
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  def apply(module: String, callback: js.UndefOr[scala.Nothing], context: js.Any): Unit = js.native
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  def apply(module: String, callback: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]): Unit = js.native
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  def apply(
    module: String,
    callback: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit],
    context: js.Any
  ): Unit = js.native
  @JSImport("little-loader", JSImport.Namespace)
  @js.native
  def apply(module: String, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var setup: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit]] = js.native
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
      def setCallback(value: js.ThisFunction1[/* this */ js.Any, /* err */ String, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setSetup(value: js.ThisFunction1[/* this */ js.Any, /* script */ js.Any, Unit]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    }
  }
}
