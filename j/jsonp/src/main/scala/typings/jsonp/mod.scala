package typings.jsonp

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  def apply(url: String): CancelFn = js.native
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  def apply(url: String, callback: RequestCallback): CancelFn = js.native
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  def apply(url: String, options: js.UndefOr[scala.Nothing], cb: RequestCallback): CancelFn = js.native
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options): CancelFn = js.native
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  def apply(url: String, options: Options, cb: RequestCallback): CancelFn = js.native
  
  type CancelFn = js.Function0[Unit]
  
  @js.native
  trait Options extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var param: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
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
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* error */ Error | Null, /* data */ js.Any, Unit]
}
