package typings.humps

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def camelize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def camelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def camelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def camelizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def camelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("camelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def decamelize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def decamelize(value: String, optionsOrProcessor: OptionOrProcessor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(value.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def decamelizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def decamelizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def decamelizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def decamelizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("decamelizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def depascalize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def depascalize(value: String, optionsOrProcessor: OptionOrProcessor): String = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalize")(value.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def depascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def depascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def depascalizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def depascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("depascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def pascalize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def pascalizeKeys(str: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def pascalizeKeys(str: js.Array[js.Object], optionsOrProcessor: OptionOrProcessor): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def pascalizeKeys(str: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def pascalizeKeys(str: js.Object, optionsOrProcessor: OptionOrProcessor): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("pascalizeKeys")(str.asInstanceOf[js.Any], optionsOrProcessor.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait HumpsOptions extends StObject {
    
    var process: js.UndefOr[HumpsProcessor] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var split: js.UndefOr[RegExp] = js.undefined
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
