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
ScalablyTyped.runtime.Instantiable0[JSZip]
     with /**
     * Create JSZip instance
     */

/**
     * Create JSZip instance
     * If no parameters given an empty zip archive will be created
     *
     * @param data Serialized zip archive
     * @param options Description of the serialized zip archive
     */
ScalablyTyped.runtime.Instantiable1[/* data */ jszipLib.InputFileFormat, JSZip]
     with /**
     * Create JSZip instance
     */

/**
     * Create JSZip instance
     * If no parameters given an empty zip archive will be created
     *
     * @param data Serialized zip archive
     * @param options Description of the serialized zip archive
     */
ScalablyTyped.runtime.Instantiable2[
      /* data */ jszipLib.InputFileFormat, 
      /* options */ jszipLib.jszipMod.JSZipNs.JSZipLoadOptions, 
      JSZip
    ] {
  var external: jszipLib.Anon_Promise = js.native
  var files: ScalablyTyped.runtime.StringDictionary[jszipLib.jszipMod.JSZipNs.JSZipObject] = js.native
  var support: JSZipSupport = js.native
  var version: java.lang.String = js.native
  def apply(): JSZip = js.native
  /**
       * Get a file from the archive
       *
       * @param Path relative path to file
       * @return File matching path, null if no file found
       */
  def file(path: java.lang.String): jszipLib.jszipMod.JSZipNs.JSZipObject = js.native
  /**
       * Get files matching a RegExp from archive
       *
       * @param path RegExp to match
       * @return Return all matching files or an empty array
       */
  def file(path: stdLib.RegExp): js.Array[jszipLib.jszipMod.JSZipNs.JSZipObject] = js.native
  /**
       * Add a file to the archive
       *
       * @param path Relative path to file
       * @param data Content of the file
       * @param options Optional information about the file
       * @return JSZip object
       */
  def file[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](path: java.lang.String, data: js.Any): this.type = js.native
  /**
       * Add a file to the archive
       *
       * @param path Relative path to file
       * @param data Content of the file
       * @param options Optional information about the file
       * @return JSZip object
       */
  def file[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](path: java.lang.String, data: js.Any, options: jszipLib.jszipMod.JSZipNs.JSZipFileOptions): this.type = js.native
  def file[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](
    path: java.lang.String,
    data: scala.Null,
    options: jszipLib.jszipMod.JSZipNs.JSZipFileOptions with jszipLib.Anon_Dir
  ): this.type = js.native
  /**
       * Add a file to the archive
       *
       * @param path Relative path to file
       * @param data Content of the file
       * @param options Optional information about the file
       * @return JSZip object
       */
  def file[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](path: java.lang.String, data: stdLib.Promise[_]): this.type = js.native
  /**
       * Add a file to the archive
       *
       * @param path Relative path to file
       * @param data Content of the file
       * @param options Optional information about the file
       * @return JSZip object
       */
  def file[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](
    path: java.lang.String,
    data: stdLib.Promise[_],
    options: jszipLib.jszipMod.JSZipNs.JSZipFileOptions
  ): this.type = js.native
  @JSName("file")
  def `file_TInputType<this>`[T /* <: jszipLib.jszipMod.JSZipNs.InputType */](path: java.lang.String): this.type = js.native
  /**
       * Get all files which match the given filter function
       *
       * @param predicate Filter function
       * @return Array of matched elements
       */
  def filter(
    predicate: js.Function2[
      /* relativePath */ java.lang.String, 
      /* file */ jszipLib.jszipMod.JSZipNs.JSZipObject, 
      scala.Boolean
    ]
  ): js.Array[jszipLib.jszipMod.JSZipNs.JSZipObject] = js.native
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
  def folder(name: stdLib.RegExp): js.Array[jszipLib.jszipMod.JSZipNs.JSZipObject] = js.native
  /**
       * Call a callback function for each entry at this folder level.
       *
       * @param callback function
       */
  def forEach(
    callback: js.Function2[
      /* relativePath */ java.lang.String, 
      /* file */ jszipLib.jszipMod.JSZipNs.JSZipObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return The serialized archive
       */
  def generateAsync[T /* <: jszipLib.jszipMod.JSZipNs.OutputType */](): stdLib.Promise[_] = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return The serialized archive
       */
  def generateAsync[T /* <: jszipLib.jszipMod.JSZipNs.OutputType */](options: jszipLib.jszipMod.JSZipNs.JSZipGeneratorOptions[T]): stdLib.Promise[_] = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return The serialized archive
       */
  def generateAsync[T /* <: jszipLib.jszipMod.JSZipNs.OutputType */](options: jszipLib.jszipMod.JSZipNs.JSZipGeneratorOptions[T], onUpdate: jszipLib.OnUpdateCallback): stdLib.Promise[_] = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return A Node.js `ReadableStream`
       */
  def generateNodeStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return A Node.js `ReadableStream`
       */
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(options: jszipLib.jszipMod.JSZipNs.JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer]): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
       * Generates a new archive asynchronously
       *
       * @param options Optional options for the generator
       * @param onUpdate The optional function called on each internal update with the metadata.
       * @return A Node.js `ReadableStream`
       */
  @JSName("generateNodeStream")
  def generateNodeStream_nodebuffer(
    options: jszipLib.jszipMod.JSZipNs.JSZipGeneratorOptions[jszipLib.jszipLibStrings.nodebuffer],
    onUpdate: jszipLib.OnUpdateCallback
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  /**
       * Deserialize zip file asynchronously
       *
       * @param data Serialized zip file
       * @param options Options for deserializing
       * @return Returns promise
       */
  def loadAsync(data: jszipLib.InputFileFormat): stdLib.Promise[JSZip] = js.native
  /**
       * Deserialize zip file asynchronously
       *
       * @param data Serialized zip file
       * @param options Options for deserializing
       * @return Returns promise
       */
  def loadAsync(data: jszipLib.InputFileFormat, options: jszipLib.jszipMod.JSZipNs.JSZipLoadOptions): stdLib.Promise[JSZip] = js.native
  /**
       * Removes the file or folder from the archive
       *
       * @param path Relative path of file or folder
       * @return Returns the JSZip instance
       */
  def remove(path: java.lang.String): JSZip = js.native
}

