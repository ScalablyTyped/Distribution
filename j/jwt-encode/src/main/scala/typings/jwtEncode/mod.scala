package typings.jwtEncode

import org.scalablytyped.runtime.StringDictionary
import typings.jwtEncode.jwtEncodeStrings.HS256
import typings.jwtEncode.jwtEncodeStrings.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: Any, secret: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: Any, secret: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jwt-encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BaseOptions extends StObject {
    
    var alg: HS256
    
    var typ: JWT
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal(alg = "HS256", typ = "JWT")
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAlg(value: HS256): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setTyp(value: JWT): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<jwt-encode.jwt-encode.BaseOptions> & {[key: string] : string} */
  trait Options
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var alg: js.UndefOr[HS256] = js.undefined
    
    var typ: js.UndefOr[JWT] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlg(value: HS256): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setTyp(value: JWT): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
}
