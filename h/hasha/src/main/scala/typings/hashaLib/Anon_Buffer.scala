package typings
package hashaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buffer extends js.Object {
  /**
  	 * Calculate the hash for a `string`, `Buffer`, or an array thereof.
  	 *
  	 * @param input - Data you want to hash.
  	 *
  	 * While strings are supported you should prefer buffers as they're faster to hash. Although if you already have a string you should not convert it to a buffer.
  	 *
  	 * Pass an array instead of concatenating strings and/or buffers. The output is the same, but arrays do not incur the overhead of concatenation.
  	 *
  	 * @returns A hash.
  	 */
  def apply(input: hashaLib.hashaMod.HashaInput): java.lang.String = js.native
  def apply(
    input: hashaLib.hashaMod.HashaInput,
    options: hashaLib.hashaMod.Options[hashaLib.hashaLibStrings.buffer]
  ): nodeLib.Buffer = js.native
  /**
  	 * Calculate the hash for a file.
  	 *
  	 * @param filePath - Path to a file you want to hash.
  	 * @returns The calculated file hash.
  	 */
  def fromFile(filePath: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def fromFile(filePath: java.lang.String, options: hashaLib.hashaMod.Options[hashaLib.hashaMod.ToStringEncoding]): js.Promise[java.lang.String | scala.Null] = js.native
  /**
  	 * Synchronously calculate the hash for a file.
  	 *
  	 * @param filePath - Path to a file you want to hash.
  	 * @returns The calculated file hash.
  	 */
  def fromFileSync(filePath: java.lang.String): java.lang.String = js.native
  def fromFileSync(filePath: java.lang.String, options: hashaLib.hashaMod.Options[hashaLib.hashaMod.ToStringEncoding]): java.lang.String = js.native
  @JSName("fromFileSync")
  def fromFileSync_buffer(filePath: java.lang.String, options: hashaLib.hashaMod.Options[hashaLib.hashaLibStrings.buffer]): nodeLib.Buffer = js.native
  @JSName("fromFile")
  def fromFile_buffer(filePath: java.lang.String, options: hashaLib.hashaMod.Options[hashaLib.hashaLibStrings.buffer]): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  /**
  	 * Calculate the hash for a stream.
  	 *
  	 * @param stream - A stream you want to hash.
  	 * @returns The calculated hash.
  	 */
  def fromStream(stream: nodeLib.streamMod.Readable): js.Promise[java.lang.String | scala.Null] = js.native
  def fromStream(
    stream: nodeLib.streamMod.Readable,
    options: hashaLib.hashaMod.Options[hashaLib.hashaMod.ToStringEncoding]
  ): js.Promise[java.lang.String | scala.Null] = js.native
  @JSName("fromStream")
  def fromStream_buffer(
    stream: nodeLib.streamMod.Readable,
    options: hashaLib.hashaMod.Options[hashaLib.hashaLibStrings.buffer]
  ): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  /**
  	 * Create a [hash transform stream](https://nodejs.org/api/crypto.html#crypto_class_hash).
  	 *
  	 * @returns The created hash transform stream.
  	 */
  def stream(): nodeLib.cryptoMod.Hash = js.native
  def stream(options: hashaLib.hashaMod.Options[hashaLib.hashaMod.HashaEncoding]): nodeLib.cryptoMod.Hash = js.native
}

