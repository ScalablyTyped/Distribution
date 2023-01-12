package typings.jwtSimple

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(token: String, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(token: String, key: String, noVerify: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(token: String, key: String, noVerify: Boolean, algorithm: TAlgorithm): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(token: String, key: String, noVerify: Unit, algorithm: TAlgorithm): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(payload: Any, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Any, key: String, algorithm: Unit, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Any, key: String, algorithm: TAlgorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(payload: Any, key: String, algorithm: TAlgorithm, options: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IOptions extends StObject {
    
    var header: Any
  }
  object IOptions {
    
    inline def apply(header: Any): IOptions = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jwtSimple.jwtSimpleStrings.HS256
    - typings.jwtSimple.jwtSimpleStrings.HS384
    - typings.jwtSimple.jwtSimpleStrings.HS512
    - typings.jwtSimple.jwtSimpleStrings.RS256
  */
  trait TAlgorithm extends StObject
  object TAlgorithm {
    
    inline def HS256: typings.jwtSimple.jwtSimpleStrings.HS256 = "HS256".asInstanceOf[typings.jwtSimple.jwtSimpleStrings.HS256]
    
    inline def HS384: typings.jwtSimple.jwtSimpleStrings.HS384 = "HS384".asInstanceOf[typings.jwtSimple.jwtSimpleStrings.HS384]
    
    inline def HS512: typings.jwtSimple.jwtSimpleStrings.HS512 = "HS512".asInstanceOf[typings.jwtSimple.jwtSimpleStrings.HS512]
    
    inline def RS256: typings.jwtSimple.jwtSimpleStrings.RS256 = "RS256".asInstanceOf[typings.jwtSimple.jwtSimpleStrings.RS256]
  }
}
