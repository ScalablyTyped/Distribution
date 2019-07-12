package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "Metadata")
@js.native
/**
  * @param options Boolean options for the beginning of the call.
  *   These options only have any effect when passed at the beginning of
  *   a client request.
  */
class Metadata () extends js.Object {
  def this(options: MetadataOptions) = this()
  /**
    * Adds the given value for the given key by appending to a list of previous
    * values associated with that key. Normalizes the key.
    * @param key The key for which a new value should be appended.
    * @param value The value to add. Must be a buffer if and only
    *   if the normalized key ends with '-bin'.
    */
  def add(key: java.lang.String, value: MetadataValue): scala.Unit = js.native
  /**
    * Gets a list of all values associated with the key. Normalizes the key.
    * @param key The key whose value should be retrieved.
    * @return A list of values associated with the given key.
    */
  def get(key: java.lang.String): js.Array[MetadataValue] = js.native
  /**
    * Gets a plain object mapping each key to the first value associated with it.
    * This reflects the most common way that people will want to see metadata.
    * @return A key/value mapping of the metadata.
    */
  def getMap(): org.scalablytyped.runtime.StringDictionary[MetadataValue] = js.native
  /**
    * Removes the given key and any associated values. Normalizes the key.
    * @param key The key whose values should be removed.
    */
  def remove(key: java.lang.String): scala.Unit = js.native
  /**
    * Sets the given value for the given key by replacing any other values
    * associated with that key. Normalizes the key.
    * @param key The key to whose value should be set.
    * @param value The value to set. Must be a buffer if and only
    *   if the normalized key ends with '-bin'.
    */
  def set(key: java.lang.String, value: MetadataValue): scala.Unit = js.native
  /**
    * Set options on the metadata object
    * @param options Boolean options for the beginning of the call.
    *   These options only have any effect when passed at the beginning of
    *   a client request.
    */
  def setOptions(options: MetadataOptions): scala.Unit = js.native
}

