package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("@grpc/grpc-js/build/src/metadata", "Metadata")
  @js.native
  open class Metadata () extends StObject {
    def this(options: MetadataOptions) = this()
    
    /* private */ var _getCoreRepresentation: Any = js.native
    
    /**
      * Adds the given value for the given key by appending to a list of previous
      * values associated with that key. Normalizes the key.
      * @param key The key for which a new value should be appended.
      * @param value The value to add. Must be a buffer if and only
      *   if the normalized key ends with '-bin'.
      */
    def add(key: String, value: MetadataValue): Unit = js.native
    
    /**
      * Gets a list of all values associated with the key. Normalizes the key.
      * @param key The key whose value should be retrieved.
      * @return A list of values associated with the given key.
      */
    def get(key: String): js.Array[MetadataValue] = js.native
    
    /**
      * Gets a plain object mapping each key to the first value associated with it.
      * This reflects the most common way that people will want to see metadata.
      * @return A key/value mapping of the metadata.
      */
    def getMap(): StringDictionary[MetadataValue] = js.native
    
    def getOptions(): MetadataOptions = js.native
    
    /* protected */ var internalRepr: MetadataObject = js.native
    
    /**
      * Merges all key-value pairs from a given Metadata object into this one.
      * If both this object and the given object have values in the same key,
      * values from the other Metadata object will be appended to this object's
      * values.
      * @param other A Metadata object.
      */
    def merge(other: Metadata): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Removes the given key and any associated values. Normalizes the key.
      * @param key The key whose values should be removed.
      */
    def remove(key: String): Unit = js.native
    
    /**
      * Sets the given value for the given key by replacing any other values
      * associated with that key. Normalizes the key.
      * @param key The key to whose value should be set.
      * @param value The value to set. Must be a buffer if and only
      *   if the normalized key ends with '-bin'.
      */
    def set(key: String, value: MetadataValue): Unit = js.native
    
    def setOptions(options: MetadataOptions): Unit = js.native
    
    /**
      * Creates an OutgoingHttpHeaders object that can be used with the http2 API.
      */
    def toHttp2Headers(): OutgoingHttpHeaders = js.native
    
    /**
      * This modifies the behavior of JSON.stringify to show an object
      * representation of the metadata map.
      */
    def toJSON(): StringDictionary[js.Array[String | Buffer]] = js.native
  }
  /* static members */
  object Metadata {
    
    @JSImport("@grpc/grpc-js/build/src/metadata", "Metadata")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    inline def fromHttp2Headers(headers: IncomingHttpHeaders): Metadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHttp2Headers")(headers.asInstanceOf[js.Any]).asInstanceOf[Metadata]
  }
  
  type MetadataObject = Map[String, js.Array[MetadataValue]]
  
  trait MetadataOptions extends StObject {
    
    var cacheableRequest: js.UndefOr[Boolean] = js.undefined
    
    var corked: js.UndefOr[Boolean] = js.undefined
    
    var idempotentRequest: js.UndefOr[Boolean] = js.undefined
    
    var waitForReady: js.UndefOr[Boolean] = js.undefined
  }
  object MetadataOptions {
    
    inline def apply(): MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataOptions]
    }
    
    extension [Self <: MetadataOptions](x: Self) {
      
      inline def setCacheableRequest(value: Boolean): Self = StObject.set(x, "cacheableRequest", value.asInstanceOf[js.Any])
      
      inline def setCacheableRequestUndefined: Self = StObject.set(x, "cacheableRequest", js.undefined)
      
      inline def setCorked(value: Boolean): Self = StObject.set(x, "corked", value.asInstanceOf[js.Any])
      
      inline def setCorkedUndefined: Self = StObject.set(x, "corked", js.undefined)
      
      inline def setIdempotentRequest(value: Boolean): Self = StObject.set(x, "idempotentRequest", value.asInstanceOf[js.Any])
      
      inline def setIdempotentRequestUndefined: Self = StObject.set(x, "idempotentRequest", js.undefined)
      
      inline def setWaitForReady(value: Boolean): Self = StObject.set(x, "waitForReady", value.asInstanceOf[js.Any])
      
      inline def setWaitForReadyUndefined: Self = StObject.set(x, "waitForReady", js.undefined)
    }
  }
  
  type MetadataValue = String | Buffer
}
