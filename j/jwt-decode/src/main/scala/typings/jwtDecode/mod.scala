package typings.jwtDecode

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jwt-decode", JSImport.Default)
  @js.native
  def default[T](token: String): T = js.native
  @JSImport("jwt-decode", JSImport.Default)
  @js.native
  def default[T](token: String, options: JwtDecodeOptions): T = js.native
  
  @JSImport("jwt-decode", "InvalidTokenError")
  @js.native
  class InvalidTokenError () extends Error
  
  @js.native
  trait JwtDecodeOptions extends StObject {
    
    var header: js.UndefOr[Boolean] = js.native
  }
  object JwtDecodeOptions {
    
    @scala.inline
    def apply(): JwtDecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JwtDecodeOptions]
    }
    
    @scala.inline
    implicit class JwtDecodeOptionsMutableBuilder[Self <: JwtDecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait JwtHeader extends StObject {
    
    var alg: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object JwtHeader {
    
    @scala.inline
    def apply(): JwtHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JwtHeader]
    }
    
    @scala.inline
    implicit class JwtHeaderMutableBuilder[Self <: JwtHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait JwtPayload extends StObject {
    
    var aud: js.UndefOr[js.Array[String] | String] = js.native
    
    var exp: js.UndefOr[Double] = js.native
    
    var iat: js.UndefOr[Double] = js.native
    
    var iss: js.UndefOr[String] = js.native
    
    var jti: js.UndefOr[String] = js.native
    
    var nbf: js.UndefOr[Double] = js.native
    
    var sub: js.UndefOr[String] = js.native
  }
  object JwtPayload {
    
    @scala.inline
    def apply(): JwtPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JwtPayload]
    }
    
    @scala.inline
    implicit class JwtPayloadMutableBuilder[Self <: JwtPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAud(value: js.Array[String] | String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
      
      @scala.inline
      def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value :_*))
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
      
      @scala.inline
      def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
      
      @scala.inline
      def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
      
      @scala.inline
      def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
}
