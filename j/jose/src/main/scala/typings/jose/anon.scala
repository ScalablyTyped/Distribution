package typings.jose

import typings.jose.distTypesTypesMod.JWEHeaderParameters
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait D extends StObject {
    
    var d: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[String] = js.undefined
    
    var t: js.UndefOr[String] = js.undefined
  }
  object D {
    
    inline def apply(): D = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[D]
    }
    
    extension [Self <: D](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    }
  }
  
  /* Inlined std.Omit<jose.jose/dist/types/types.FlattenedJWSInput, 'payload'> */
  trait OmitFlattenedJWSInputpayl extends StObject {
    
    var header: js.UndefOr[JWSHeaderParameters] = js.undefined
    
    var `protected`: js.UndefOr[String] = js.undefined
    
    var signature: String
  }
  object OmitFlattenedJWSInputpayl {
    
    inline def apply(signature: String): OmitFlattenedJWSInputpayl = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitFlattenedJWSInputpayl]
    }
    
    extension [Self <: OmitFlattenedJWSInputpayl](x: Self) {
      
      inline def setHeader(value: JWSHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<jose.jose/dist/types/types.FlattenedJWE, 'encrypted_key' | 'header'> */
  trait PickFlattenedJWEencrypted extends StObject {
    
    var encrypted_key: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[JWEHeaderParameters] = js.undefined
  }
  object PickFlattenedJWEencrypted {
    
    inline def apply(): PickFlattenedJWEencrypted = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickFlattenedJWEencrypted]
    }
    
    extension [Self <: PickFlattenedJWEencrypted](x: Self) {
      
      inline def setEncrypted_key(value: String): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
      
      inline def setEncrypted_keyUndefined: Self = StObject.set(x, "encrypted_key", js.undefined)
      
      inline def setHeader(value: JWEHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  /* Inlined std.Pick<jose.jose/dist/types/types.JWK, 'kty' | 'crv' | 'x' | 'y' | 'e' | 'n'> */
  trait PickJWKktycrvxyen extends StObject {
    
    var crv: js.UndefOr[String] = js.undefined
    
    var e: js.UndefOr[String] = js.undefined
    
    var kty: js.UndefOr[String] = js.undefined
    
    var n: js.UndefOr[String] = js.undefined
    
    var x: js.UndefOr[String] = js.undefined
    
    var y: js.UndefOr[String] = js.undefined
  }
  object PickJWKktycrvxyen {
    
    inline def apply(): PickJWKktycrvxyen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickJWKktycrvxyen]
    }
    
    extension [Self <: PickJWKktycrvxyen](x: Self) {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
