package typings.jsonp

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String): CancelFn = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[CancelFn]
  @scala.inline
  def apply(url: String, callback: RequestCallback): CancelFn = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[CancelFn]
  @scala.inline
  def apply(url: String, options: Unit, cb: RequestCallback): CancelFn = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[CancelFn]
  @scala.inline
  def apply(url: String, options: Options): CancelFn = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelFn]
  @scala.inline
  def apply(url: String, options: Options, cb: RequestCallback): CancelFn = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[CancelFn]
  
  @JSImport("jsonp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CancelFn = js.Function0[Unit]
  
  trait Options extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var param: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
