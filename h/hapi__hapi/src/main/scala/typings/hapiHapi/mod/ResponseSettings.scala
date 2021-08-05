package typings.hapiHapi.mod

import typings.hapiHapi.mod.Json.StringifyArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseSettings extends StObject {
  
  /**
    * Defaults value: true.
    * If true and source is a Stream, copies the statusCode and headers properties of the stream object to the outbound response.
    */
  val passThrough: Boolean
  
  /**
    * @default null (use route defaults).
    * Override the route json options used when source value requires stringification.
    */
  val stringify: StringifyArguments
  
  /**
    * @default null (use route defaults).
    * If set, overrides the route cache with an expiration value in milliseconds.
    */
  val ttl: Double
  
  /**
    * @default false.
    * If true, a suffix will be automatically added to the 'ETag' header at transmission time (separated by a '-' character) when the HTTP 'Vary' header is present.
    */
  var varyEtag: Boolean
}
object ResponseSettings {
  
  inline def apply(passThrough: Boolean, stringify: StringifyArguments, ttl: Double, varyEtag: Boolean): ResponseSettings = {
    val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any], stringify = stringify.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], varyEtag = varyEtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseSettings]
  }
  
  extension [Self <: ResponseSettings](x: Self) {
    
    inline def setPassThrough(value: Boolean): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
    
    inline def setStringify(value: StringifyArguments): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setVaryEtag(value: Boolean): Self = StObject.set(x, "varyEtag", value.asInstanceOf[js.Any])
  }
}
