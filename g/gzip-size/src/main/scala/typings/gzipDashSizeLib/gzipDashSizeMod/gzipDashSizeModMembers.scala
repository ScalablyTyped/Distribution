package typings
package gzipDashSizeLib.gzipDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gzip-size", JSImport.Namespace)
@js.native
object gzipDashSizeModMembers extends js.Object {
  /**
    * Returns a Promise for the size.
    * @param input A string or Buffer to determine the gzip size of
    * @param options Any zlib option
    */
  def apply(input: java.lang.String | nodeLib.Buffer): js.Promise[scala.Double] = js.native
  def apply(input: java.lang.String | nodeLib.Buffer, options: nodeLib.zlibMod.ZlibOptions): js.Promise[scala.Double] = js.native
  /**
    * Returns a Promise for the size of the file.
    * @param path The path to the file
    * @param options Any zlib option
    */
  def file(path: java.lang.String): js.Promise[scala.Double] = js.native
  def file(path: java.lang.String, options: nodeLib.zlibMod.ZlibOptions): js.Promise[scala.Double] = js.native
  /**
    * Returns a stream.PassThrough. The stream emits a gzip-size event and has a gzipSize property.
    * @param options Any zlib option
    */
  def stream(): GzipSizeStream = js.native
  def stream(options: nodeLib.zlibMod.ZlibOptions): GzipSizeStream = js.native
  /**
    * Returns the size synchronously
    * @param input A string or Buffer to determine the gzip size of
    * @param options Any zlib option
    */
  def sync(input: java.lang.String): scala.Double = js.native
  def sync(input: java.lang.String, options: nodeLib.zlibMod.ZlibOptions): scala.Double = js.native
  def sync(input: nodeLib.Buffer): scala.Double = js.native
  def sync(input: nodeLib.Buffer, options: nodeLib.zlibMod.ZlibOptions): scala.Double = js.native
}

