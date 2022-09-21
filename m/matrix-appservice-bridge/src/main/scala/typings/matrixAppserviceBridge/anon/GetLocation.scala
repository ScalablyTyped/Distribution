package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.bridgeMod.PossiblePromise
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyLocationResponse
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyProtocolResponse
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyUserResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocation extends StObject {
  
  var getLocation: js.UndefOr[
    js.Function2[
      /* protocol */ String, 
      /* fields */ Record[String, js.Array[String] | String], 
      PossiblePromise[js.Array[ThirdpartyLocationResponse]]
    ]
  ] = js.undefined
  
  var getProtocol: js.UndefOr[js.Function1[/* protocol */ String, PossiblePromise[ThirdpartyProtocolResponse]]] = js.undefined
  
  var getUser: js.UndefOr[
    js.Function2[
      /* protocol */ String, 
      /* fields */ Record[String, js.Array[String] | String], 
      PossiblePromise[js.Array[ThirdpartyUserResponse]]
    ]
  ] = js.undefined
  
  var parseLocation: js.UndefOr[
    js.Function1[/* alias */ String, PossiblePromise[js.Array[ThirdpartyLocationResponse]]]
  ] = js.undefined
  
  var parseUser: js.UndefOr[
    js.Function1[/* userid */ String, PossiblePromise[js.Array[ThirdpartyLocationResponse]]]
  ] = js.undefined
  
  var protocols: js.Array[String]
}
object GetLocation {
  
  inline def apply(protocols: js.Array[String]): GetLocation = {
    val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocation]
  }
  
  extension [Self <: GetLocation](x: Self) {
    
    inline def setGetLocation(
      value: (/* protocol */ String, /* fields */ Record[String, js.Array[String] | String]) => PossiblePromise[js.Array[ThirdpartyLocationResponse]]
    ): Self = StObject.set(x, "getLocation", js.Any.fromFunction2(value))
    
    inline def setGetLocationUndefined: Self = StObject.set(x, "getLocation", js.undefined)
    
    inline def setGetProtocol(value: /* protocol */ String => PossiblePromise[ThirdpartyProtocolResponse]): Self = StObject.set(x, "getProtocol", js.Any.fromFunction1(value))
    
    inline def setGetProtocolUndefined: Self = StObject.set(x, "getProtocol", js.undefined)
    
    inline def setGetUser(
      value: (/* protocol */ String, /* fields */ Record[String, js.Array[String] | String]) => PossiblePromise[js.Array[ThirdpartyUserResponse]]
    ): Self = StObject.set(x, "getUser", js.Any.fromFunction2(value))
    
    inline def setGetUserUndefined: Self = StObject.set(x, "getUser", js.undefined)
    
    inline def setParseLocation(value: /* alias */ String => PossiblePromise[js.Array[ThirdpartyLocationResponse]]): Self = StObject.set(x, "parseLocation", js.Any.fromFunction1(value))
    
    inline def setParseLocationUndefined: Self = StObject.set(x, "parseLocation", js.undefined)
    
    inline def setParseUser(value: /* userid */ String => PossiblePromise[js.Array[ThirdpartyLocationResponse]]): Self = StObject.set(x, "parseUser", js.Any.fromFunction1(value))
    
    inline def setParseUserUndefined: Self = StObject.set(x, "parseUser", js.undefined)
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}
