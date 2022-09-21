package typings.isTrademarked

import typings.isTrademarked.isTrademarkedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(searchTerm: String): js.Promise[`false` | js.Array[TrademarkedData]] = ^.asInstanceOf[js.Dynamic].apply(searchTerm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`false` | js.Array[TrademarkedData]]]
  inline def apply(searchTerm: String, opts: Options): js.Promise[`false` | js.Array[TrademarkedData]] = (^.asInstanceOf[js.Dynamic].apply(searchTerm.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`false` | js.Array[TrademarkedData]]]
  
  @JSImport("is-trademarked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait TrademarkedData extends StObject {
    
    var description: String
    
    var reg: js.Date
    
    var serviceCode: String
    
    var sn: String
    
    var wordmark: String
  }
  object TrademarkedData {
    
    inline def apply(description: String, reg: js.Date, serviceCode: String, sn: String, wordmark: String): TrademarkedData = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reg = reg.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], wordmark = wordmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrademarkedData]
    }
    
    extension [Self <: TrademarkedData](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setReg(value: js.Date): Self = StObject.set(x, "reg", value.asInstanceOf[js.Any])
      
      inline def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      inline def setSn(value: String): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
      
      inline def setWordmark(value: String): Self = StObject.set(x, "wordmark", value.asInstanceOf[js.Any])
    }
  }
}
