package typings.humps

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humps", "camelize")
  @js.native
  def camelize(value: String): String = js.native
  
  @JSImport("humps", "camelizeKeys")
  @js.native
  def camelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("humps", "camelizeKeys")
  @js.native
  def camelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = js.native
  @JSImport("humps", "camelizeKeys")
  @js.native
  def camelizeKeys(str: js.Object): js.Object = js.native
  @JSImport("humps", "camelizeKeys")
  @js.native
  def camelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = js.native
  
  @JSImport("humps", "decamelize")
  @js.native
  def decamelize(value: String): String = js.native
  @JSImport("humps", "decamelize")
  @js.native
  def decamelize(value: String, optionsOrProcessor: OptionOrProcessor): String = js.native
  
  @JSImport("humps", "decamelizeKeys")
  @js.native
  def decamelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("humps", "decamelizeKeys")
  @js.native
  def decamelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = js.native
  @JSImport("humps", "decamelizeKeys")
  @js.native
  def decamelizeKeys(str: js.Object): js.Object = js.native
  @JSImport("humps", "decamelizeKeys")
  @js.native
  def decamelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = js.native
  
  @JSImport("humps", "depascalize")
  @js.native
  def depascalize(value: String): String = js.native
  @JSImport("humps", "depascalize")
  @js.native
  def depascalize(value: String, optionsOrProcessor: OptionOrProcessor): String = js.native
  
  @JSImport("humps", "depascalizeKeys")
  @js.native
  def depascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("humps", "depascalizeKeys")
  @js.native
  def depascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = js.native
  @JSImport("humps", "depascalizeKeys")
  @js.native
  def depascalizeKeys(str: js.Object): js.Object = js.native
  @JSImport("humps", "depascalizeKeys")
  @js.native
  def depascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = js.native
  
  @JSImport("humps", "pascalize")
  @js.native
  def pascalize(value: String): String = js.native
  
  @JSImport("humps", "pascalizeKeys")
  @js.native
  def pascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = js.native
  @JSImport("humps", "pascalizeKeys")
  @js.native
  def pascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = js.native
  @JSImport("humps", "pascalizeKeys")
  @js.native
  def pascalizeKeys(str: js.Object): js.Object = js.native
  @JSImport("humps", "pascalizeKeys")
  @js.native
  def pascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = js.native
  
  @js.native
  trait HumpsOptions extends StObject {
    
    var process: js.UndefOr[HumpsProcessor] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var split: js.UndefOr[RegExp] = js.native
  }
  object HumpsOptions {
    
    @scala.inline
    def apply(): HumpsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumpsOptions]
    }
    
    @scala.inline
    implicit class HumpsOptionsMutableBuilder[Self <: HumpsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(
        value: (/* key */ String, /* convert */ HumpsProcessorParameter, /* options */ js.UndefOr[HumpsOptions]) => String
      ): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSplit(value: RegExp): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  type HumpsProcessor = js.Function3[
    /* key */ String, 
    /* convert */ HumpsProcessorParameter, 
    /* options */ js.UndefOr[HumpsOptions], 
    String
  ]
  
  type HumpsProcessorParameter = js.Function2[/* key */ String, /* options */ js.UndefOr[HumpsOptions], String]
  
  type OptionOrProcessor = HumpsOptions | HumpsProcessor
}
