package typings.grpcGrpcJs.metadataMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/metadata", "Metadata")
@js.native
class Metadata () extends js.Object {
  def this(options: MetadataOptions) = this()
  
  var _getCoreRepresentation: js.Any = js.native
  
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
  
  var internalRepr: MetadataObject = js.native
  
  /**
    * Merges all key-value pairs from a given Metadata object into this one.
    * If both this object and the given object have values in the same key,
    * values from the other Metadata object will be appended to this object's
    * values.
    * @param other A Metadata object.
    */
  def merge(other: Metadata): Unit = js.native
  
  var options: js.Any = js.native
  
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
}
/* static members */
@JSImport("@grpc/grpc-js/build/src/metadata", "Metadata")
@js.native
object Metadata extends js.Object {
  
  /**
    * Returns a new Metadata object based fields in a given IncomingHttpHeaders
    * object.
    * @param headers An IncomingHttpHeaders object.
    */
  def fromHttp2Headers(headers: IncomingHttpHeaders): Metadata = js.native
}
