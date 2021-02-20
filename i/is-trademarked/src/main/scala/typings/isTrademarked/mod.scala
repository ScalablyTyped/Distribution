package typings.isTrademarked

import typings.isTrademarked.isTrademarkedBooleans.`false`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-trademarked", JSImport.Namespace)
  @js.native
  def apply(searchTerm: String): js.Promise[`false` | js.Array[TrademarkedData]] = js.native
  @JSImport("is-trademarked", JSImport.Namespace)
  @js.native
  def apply(searchTerm: String, opts: Options): js.Promise[`false` | js.Array[TrademarkedData]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var token: js.UndefOr[String] = js.native
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
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait TrademarkedData extends StObject {
    
    var description: String = js.native
    
    var reg: Date = js.native
    
    var serviceCode: String = js.native
    
    var sn: String = js.native
    
    var wordmark: String = js.native
  }
  object TrademarkedData {
    
    @scala.inline
    def apply(description: String, reg: Date, serviceCode: String, sn: String, wordmark: String): TrademarkedData = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], wordmark = wordmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrademarkedData]
    }
    
    @scala.inline
    implicit class TrademarkedDataMutableBuilder[Self <: TrademarkedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReg(value: Date): Self = StObject.set(x, "reg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSn(value: String): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordmark(value: String): Self = StObject.set(x, "wordmark", value.asInstanceOf[js.Any])
    }
  }
}
