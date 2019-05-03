package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZip
  extends /**
  * Create JSZip instance
  */
/**
  * Create JSZip instance
  * If no parameters given an empty zip archive will be created
  *
  * @param data Serialized zip archive
  * @param options Description of the serialized zip archive
  */
org.scalablytyped.runtime.Instantiable0[JSZip]
     with org.scalablytyped.runtime.Instantiable1[/* data */ InputFileFormat, JSZip]
     with org.scalablytyped.runtime.Instantiable2[/* data */ InputFileFormat, /* options */ JSZipLoadOptions, JSZip] {
  var external: jszipLib.Anon_Promise = js.native
  var files: org.scalablytyped.runtime.StringDictionary[JSZipObject] = js.native
  var support: JSZipSupport = js.native
  var version: java.lang.String = js.native
  def apply(): JSZip = js.native
  def file(path: java.lang.String): this.type = js.native
  /**
    * Add a file to the archive
    *
    * @param path Relative path to file
    * @param data Content of the file
    * @param options Optional information about the file
    * @return JSZip object
    */
  def file(path: java.lang.String, data: java.lang.String): this.type = js.native
  def file(path: java.lang.String, data: java.lang.String, options: JSZipFileOptions): this.type = js.native
  def file(path: java.lang.String, data: js.Array[scala.Double]): this.type = js.native
  def file(path: java.lang.String, data: js.Array[scala.Double], options: JSZipFileOptions): this.type = js.native
  def file(
    path: java.lang.String,
    data: js.Promise[
      js.Array[scala.Double] | stdLib.ArrayBuffer | stdLib.Blob | nodeLib.NodeJSNs.ReadableStream | java.lang.String | stdLib.Uint8Array
    ]
  ): this.type = js.native
  def file(
    path: java.lang.String,
    data: js.Promise[
      js.Array[scala.Double] | stdLib.ArrayBuffer | stdLib.Blob | nodeLib.NodeJSNs.ReadableStream | java.lang.String | stdLib.Uint8Array
    ],
    options: JSZipFileOptions
  ): this.type = js.native
  def file(path: java.lang.String, data: nodeLib.NodeJSNs.ReadableStream): this.type = js.native
  def file(path: java.lang.String, data: nodeLib.NodeJSNs.ReadableStream, options: JSZipFileOptions): this.type = js.native
  def file(path: java.lang.String, data: scala.Null, options: JSZipFileOptions with jszipLib.Anon_Dir): this.type = js.native
  def file(path: java.lang.String, data: stdLib.ArrayBuffer): this.type = js.native
  def file(path: java.lang.String, data: stdLib.ArrayBuffer, options: JSZipFileOptions): this.type = js.native
  def file(path: java.lang.String, data: stdLib.Blob): this.type = js.native
  def file(path: java.lang.String, data: stdLib.Blob, options: JSZipFileOptions): this.type = js.native
  def file(path: java.lang.String, data: stdLib.Uint8Array): this.type = js.native
  def file(path: java.lang.String, data: stdLib.Uint8Array, options: JSZipFileOptions): this.type = js.native
  /**
    * Get files matching a RegExp from archive
    *
    * @param path RegExp to match
    * @return Return all matching files or an empty array
    */
  def file(path: stdLib.RegExp): js.Array[JSZipObject] = js.native
  /**
    * Get a file from the archive
    *
    * @param Path relative path to file
    * @return File matching path, null if no file found
    */
  @JSName("file")
  def file_JSZipObject(path: java.lang.String): JSZipObject = js.native
  /**
    * Get all files which match the given filter function
    *
    * @param predicate Filter function
    * @return Array of matched elements
    */
  def filter(
    predicate: js.Function2[/* relativePath */ java.lang.String, /* file */ JSZipObject, scala.Boolean]
  ): js.Array[JSZipObject] = js.native
  /**
    * Returns an new JSZip instance with the given folder as root
    *
    * @param name Name of the folder
    * @return New JSZip object with the given folder as root or null
    */
  def folder(name: java.lang.String): JSZip = js.native
  /**
    * Returns new JSZip instances with the matching folders as root
    *
    * @param name RegExp to match
    * @return New array of JSZipFile objects which match the RegExp
    */
  def folder(name: stdLib.RegExp): js.Array[JSZipObject] = js.native
  /**
    * Call a callback function for each entry at this folder level.
    *
    * @param callback function
    */
  def forEach(callback: js.Function2[/* relativePath */ java.lang.String, /* file */ JSZipObject, scala.Unit]): scala.Unit = js.native
  /**
    * Generates a new archive asynchronously
    *
    * @param options Optional options for the generator
    * @param onUpdate The optional function called on each internal update with the metadata.
    * @return The serialized archive
    */
  def generateAsync(): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_array(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.array]): js.Promise[js.Array[scala.Double]] = js.native
  @JSName("generateAsync")
  def generateAsync_array(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.array], onUpdate: OnUpdateCallback): js.Promise[js.Array[scala.Double]] = js.native
  @JSName("generateAsync")
  def generateAsync_arraybuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.arraybuffer]): js.Promise[stdLib.ArrayBuffer] = js.native
  @JSName("generateAsync")
  def generateAsync_arraybuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.arraybuffer], onUpdate: OnUpdateCallback): js.Promise[stdLib.ArrayBuffer] = js.native
  @JSName("generateAsync")
  def generateAsync_base64(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.base64]): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_base64(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.base64], onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_binarystring(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.binarystring]): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_binarystring(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.binarystring], onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_blob(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.blob]): js.Promise[stdLib.Blob] = js.native
  @JSName("generateAsync")
  def generateAsync_blob(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.blob], onUpdate: OnUpdateCallback): js.Promise[stdLib.Blob] = js.native
  @JSName("generateAsync")
  def generateAsync_nodebuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer]): js.Promise[nodeLib.Buffer] = js.native
  @JSName("generateAsync")
  def generateAsync_nodebuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer], onUpdate: OnUpdateCallback): js.Promise[nodeLib.Buffer] = js.native
  @JSName("generateAsync")
  def generateAsync_text(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.text]): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_text(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.text], onUpdate: OnUpdateCallback): js.Promise[java.lang.String] = js.native
  @JSName("generateAsync")
  def generateAsync_uint8array(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.uint8array]): js.Promise[stdLib.Uint8Array] = js.native
  @JSName("generateAsync")
  def generateAsync_uint8array(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.uint8array], onUpdate: OnUpdateCallback): js.Promise[stdLib.Uint8Array] = js.native
  /**
    * Generates a new archive asynchronously
    *
    * @param options Optional options for the generator
    * @param onUpdate The optional function called on each internal update with the metadata.
    * @return A Node.js `ReadableStream`
    */
  def generateNodeStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer]): nodeLib.NodeJSNs.ReadableStream = js.native
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer], onUpdate: OnUpdateCallback): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
    * Deserialize zip file asynchronously
    *
    * @param data Serialized zip file
    * @param options Options for deserializing
    * @return Returns promise
    */
  def loadAsync(data: InputFileFormat): js.Promise[JSZip] = js.native
  def loadAsync(data: InputFileFormat, options: JSZipLoadOptions): js.Promise[JSZip] = js.native
  /**
    * Removes the file or folder from the archive
    *
    * @param path Relative path of file or folder
    * @return Returns the JSZip instance
    */
  def remove(path: java.lang.String): JSZip = js.native
}

