package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.bridgeMod.PossiblePromise
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyLocationResponse
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyProtocolResponse
import typings.matrixAppserviceBridge.thirdpartyMod.ThirdpartyUserResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocation extends StObject {
  
  var getLocation: js.UndefOr[
    js.Function2[
      /* protocol */ String, 
      /* fields */ Record[String, js.Array[String] | String], 
      PossiblePromise[js.Array[ThirdpartyLocationResponse]]
    ]
  ] = js.native
  
  var getProtocol: js.UndefOr[js.Function1[/* protocol */ String, PossiblePromise[ThirdpartyProtocolResponse]]] = js.native
  
  var getUser: js.UndefOr[
    js.Function2[
      /* protocol */ String, 
      /* fields */ Record[String, js.Array[String] | String], 
      PossiblePromise[js.Array[ThirdpartyUserResponse]]
    ]
  ] = js.native
  
  var parseLocation: js.UndefOr[
    js.Function1[/* alias */ String, PossiblePromise[js.Array[ThirdpartyLocationResponse]]]
  ] = js.native
  
  var parseUser: js.UndefOr[
    js.Function1[/* userid */ String, PossiblePromise[js.Array[ThirdpartyLocationResponse]]]
  ] = js.native
  
  var protocols: js.Array[String] = js.native
}
object GetLocation {
  
  @scala.inline
  def apply(protocols: js.Array[String]): GetLocation = {
    val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocation]
  }
  
  @scala.inline
  implicit class GetLocationMutableBuilder[Self <: GetLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLocation(
      value: (/* protocol */ String, /* fields */ Record[String, js.Array[String] | String]) => PossiblePromise[js.Array[ThirdpartyLocationResponse]]
    ): Self = StObject.set(x, "getLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLocationUndefined: Self = StObject.set(x, "getLocation", js.undefined)
    
    @scala.inline
    def setGetProtocol(value: /* protocol */ String => PossiblePromise[ThirdpartyProtocolResponse]): Self = StObject.set(x, "getProtocol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProtocolUndefined: Self = StObject.set(x, "getProtocol", js.undefined)
    
    @scala.inline
    def setGetUser(
      value: (/* protocol */ String, /* fields */ Record[String, js.Array[String] | String]) => PossiblePromise[js.Array[ThirdpartyUserResponse]]
    ): Self = StObject.set(x, "getUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserUndefined: Self = StObject.set(x, "getUser", js.undefined)
    
    @scala.inline
    def setParseLocation(value: /* alias */ String => PossiblePromise[js.Array[ThirdpartyLocationResponse]]): Self = StObject.set(x, "parseLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseLocationUndefined: Self = StObject.set(x, "parseLocation", js.undefined)
    
    @scala.inline
    def setParseUser(value: /* userid */ String => PossiblePromise[js.Array[ThirdpartyLocationResponse]]): Self = StObject.set(x, "parseUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseUserUndefined: Self = StObject.set(x, "parseUser", js.undefined)
    
    @scala.inline
    def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
  }
}
