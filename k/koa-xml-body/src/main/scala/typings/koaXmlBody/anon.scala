package typings.koaXmlBody

import typings.koa.mod.Context
import typings.std.Error
import typings.xml2js.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Encoding extends StObject {
    
    // requested encoding. Default is utf8. If not set, the lib will retrive it from content-type(such as content-type:application/xml;charset=gb2312).
    var encoding: js.UndefOr[String] = js.native
    
    // length of the body. When content-length is found, it will be overwritten automatically.
    var length: js.UndefOr[Double] = js.native
    
    // limit of the body. If the body ends up being larger than this limit, a 413 error code is returned. Default is 1mb.
    var limit: js.UndefOr[Double] = js.native
    
    // error handler. Default is a noop function. It means it will eat the error silently. You can config it to customize the response.
    var onerror: js.UndefOr[js.Function2[/* err */ Error, /* ctx */ Context, Unit]] = js.native
    
    // options which will be used to parse xml. Default is {}. See xml2js Options for details.
    var xmlOptions: js.UndefOr[ParserOptions] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOnerror(value: (/* err */ Error, /* ctx */ Context) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setXmlOptions(value: ParserOptions): Self = StObject.set(x, "xmlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlOptionsUndefined: Self = StObject.set(x, "xmlOptions", js.undefined)
    }
  }
}
