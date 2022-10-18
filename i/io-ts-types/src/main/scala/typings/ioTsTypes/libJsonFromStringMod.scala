package typings.ioTsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.ioTs.mod.Type_
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonFromStringMod {
  
  @JSImport("io-ts-types/lib/JsonFromString", "Json")
  @js.native
  val Json: Type_[
    typings.ioTsTypes.libJsonFromStringMod.Json, 
    typings.ioTsTypes.libJsonFromStringMod.Json, 
    Any
  ] = js.native
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.ioTsTypes.libJsonFromStringMod.JsonArray
    - typings.ioTsTypes.libJsonFromStringMod.JsonRecord
  */
  type Json = _Json | Boolean | Double | String | Null
  
  @js.native
  trait JsonArray
    extends StObject
       with ReadonlyArray[typings.ioTsTypes.libJsonFromStringMod.Json]
       with _Json
  @JSImport("io-ts-types/lib/JsonFromString", "JsonArray")
  @js.native
  val JsonArray: Type_[
    typings.ioTsTypes.libJsonFromStringMod.JsonArray, 
    typings.ioTsTypes.libJsonFromStringMod.JsonArray, 
    Any
  ] = js.native
  
  @JSImport("io-ts-types/lib/JsonFromString", "JsonFromString")
  @js.native
  val JsonFromString: Type_[typings.ioTsTypes.libJsonFromStringMod.Json, String, String] = js.native
  
  trait JsonRecord
    extends StObject
       with /* key */ StringDictionary[typings.ioTsTypes.libJsonFromStringMod.Json]
       with _Json
  @JSImport("io-ts-types/lib/JsonFromString", "JsonRecord")
  @js.native
  val JsonRecord: Type_[
    typings.ioTsTypes.libJsonFromStringMod.JsonRecord, 
    typings.ioTsTypes.libJsonFromStringMod.JsonRecord, 
    Any
  ] = js.native
  
  trait _Json extends StObject
}
