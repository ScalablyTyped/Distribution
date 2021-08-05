package typings.jszip

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jszip.anon.JSZipFileOptionsdirtrue
import typings.jszip.anon.Level
import typings.jszip.anon.Promise
import typings.jszip.jszipStrings.DOS
import typings.jszip.jszipStrings.UNIX
import typings.jszip.jszipStrings.array
import typings.jszip.jszipStrings.arraybuffer
import typings.jszip.jszipStrings.base64
import typings.jszip.jszipStrings.binarystring
import typings.jszip.jszipStrings.blob
import typings.jszip.jszipStrings.nodebuffer
import typings.jszip.jszipStrings.string
import typings.jszip.jszipStrings.text
import typings.jszip.jszipStrings.uint8array
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Date
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jszip", JSImport.Namespace)
  @js.native
  val ^ : js.Object & JSZip = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jszip", JSImport.Namespace)
  @js.native
  /**
    * Create JSZip instance
    */
  /**
    * Create JSZip instance
    * If no parameters given an empty zip archive will be created
    *
    * @param data Serialized zip archive
    * @param options Description of the serialized zip archive
    */
  class Class ()
    extends StObject
       with JSZip {
    def this(data: InputFileFormat) = this()
    def this(data: Unit, options: JSZipLoadOptions) = this()
    def this(data: InputFileFormat, options: JSZipLoadOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jszip.jszipStrings.STORE
    - typings.jszip.jszipStrings.DEFLATE
  */
  trait Compression extends StObject
  object Compression {
    
    inline def DEFLATE: typings.jszip.jszipStrings.DEFLATE = "DEFLATE".asInstanceOf[typings.jszip.jszipStrings.DEFLATE]
    
    inline def STORE: typings.jszip.jszipStrings.STORE = "STORE".asInstanceOf[typings.jszip.jszipStrings.STORE]
  }
  
  trait InputByType extends StObject {
    
    var array: js.Array[Double]
    
    var arraybuffer: ArrayBuffer
    
    var base64: String
    
    var binarystring: String
    
    var blob: Blob
    
    var stream: ReadableStream
    
    var string: String
    
    var text: String
    
    var uint8array: Uint8Array
  }
  object InputByType {
    
    inline def apply(
      array: js.Array[Double],
      arraybuffer: ArrayBuffer,
      base64: String,
      binarystring: String,
      blob: Blob,
      stream: ReadableStream,
      string: String,
      text: String,
      uint8array: Uint8Array
    ): InputByType = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arraybuffer = arraybuffer.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binarystring = binarystring.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputByType]
    }
    
    extension [Self <: InputByType](x: Self) {
      
      inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      inline def setArraybuffer(value: ArrayBuffer): Self = StObject.set(x, "arraybuffer", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBinarystring(value: String): Self = StObject.set(x, "binarystring", value.asInstanceOf[js.Any])
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setStream(value: ReadableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUint8array(value: Uint8Array): Self = StObject.set(x, "uint8array", value.asInstanceOf[js.Any])
    }
  }
  
  // This private `_data` property on a JSZipObject uses this interface.
  // If/when it is made public this should be uncommented.
  // interface CompressedObject {
  //     compressedSize: number;
  //     uncompressedSize: number;
  //     crc32: number;
  //     compression: object;
  //     compressedContent: string|ArrayBuffer|Uint8Array|Buffer;
  // }
  type InputFileFormat = Blob | String | ArrayBuffer | ReadableStream | js.Array[Double] | Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typings.jszip.jszipStrings.base64
    - typings.jszip.jszipStrings.string
    - typings.jszip.jszipStrings.text
    - typings.jszip.jszipStrings.binarystring
    - typings.jszip.jszipStrings.array
    - typings.jszip.jszipStrings.uint8array
    - typings.jszip.jszipStrings.arraybuffer
    - typings.jszip.jszipStrings.blob
    - typings.jszip.jszipStrings.stream
  */
  trait InputType extends StObject
  
  @js.native
  trait JSZip
    extends StObject
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
  Instantiable0[JSZip]
       with Instantiable1[/* data */ InputFileFormat, JSZip]
       with Instantiable2[
          (/* data */ InputFileFormat) | (/* data */ Unit), 
          /* options */ JSZipLoadOptions, 
          JSZip
        ] {
    
    def apply(): JSZip = js.native
    
    var external: Promise = js.native
    
    def file(path: String): this.type = js.native
    /**
      * Add a file to the archive
      *
      * @param path Relative path to file
      * @param data Content of the file
      * @param options Optional information about the file
      * @return JSZip object
      */
    def file(path: String, data: String): this.type = js.native
    def file(path: String, data: String, options: JSZipFileOptions): this.type = js.native
    def file(path: String, data: js.Array[Double]): this.type = js.native
    def file(path: String, data: js.Array[Double], options: JSZipFileOptions): this.type = js.native
    def file(
      path: String,
      data: js.Promise[js.Array[Double] | ArrayBuffer | Blob | ReadableStream | String | Uint8Array]
    ): this.type = js.native
    def file(
      path: String,
      data: js.Promise[js.Array[Double] | ArrayBuffer | Blob | ReadableStream | String | Uint8Array],
      options: JSZipFileOptions
    ): this.type = js.native
    def file(path: String, data: Null, options: JSZipFileOptionsdirtrue): this.type = js.native
    def file(path: String, data: ReadableStream): this.type = js.native
    def file(path: String, data: ReadableStream, options: JSZipFileOptions): this.type = js.native
    def file(path: String, data: ArrayBuffer): this.type = js.native
    def file(path: String, data: ArrayBuffer, options: JSZipFileOptions): this.type = js.native
    def file(path: String, data: Blob): this.type = js.native
    def file(path: String, data: Blob, options: JSZipFileOptions): this.type = js.native
    def file(path: String, data: Uint8Array): this.type = js.native
    def file(path: String, data: Uint8Array, options: JSZipFileOptions): this.type = js.native
    /**
      * Get files matching a RegExp from archive
      *
      * @param path RegExp to match
      * @return Return all matching files or an empty array
      */
    def file(path: RegExp): js.Array[JSZipObject] = js.native
    /**
      * Get a file from the archive
      *
      * @param Path relative path to file
      * @return File matching path, null if no file found
      */
    @JSName("file")
    def file_Union(path: String): JSZipObject | Null = js.native
    
    var files: StringDictionary[JSZipObject] = js.native
    
    /**
      * Get all files which match the given filter function
      *
      * @param predicate Filter function
      * @return Array of matched elements
      */
    def filter(predicate: js.Function2[/* relativePath */ String, /* file */ JSZipObject, Boolean]): js.Array[JSZipObject] = js.native
    
    /**
      * Returns an new JSZip instance with the given folder as root
      *
      * @param name Name of the folder
      * @return New JSZip object with the given folder as root or null
      */
    def folder(name: String): JSZip | Null = js.native
    /**
      * Returns new JSZip instances with the matching folders as root
      *
      * @param name RegExp to match
      * @return New array of JSZipFile objects which match the RegExp
      */
    def folder(name: RegExp): js.Array[JSZipObject] = js.native
    
    /**
      * Call a callback function for each entry at this folder level.
      *
      * @param callback function
      */
    def forEach(callback: js.Function2[/* relativePath */ String, /* file */ JSZipObject, Unit]): Unit = js.native
    
    /**
      * Generates a new archive asynchronously
      *
      * @param options Optional options for the generator
      * @param onUpdate The optional function called on each internal update with the metadata.
      * @return The serialized archive
      */
    def generateAsync(): js.Promise[String] = js.native
    def generateAsync(options: Unit, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_array(options: JSZipGeneratorOptions[array]): js.Promise[js.Array[Double]] = js.native
    @JSName("generateAsync")
    def generateAsync_array(options: JSZipGeneratorOptions[array], onUpdate: OnUpdateCallback): js.Promise[js.Array[Double]] = js.native
    @JSName("generateAsync")
    def generateAsync_arraybuffer(options: JSZipGeneratorOptions[arraybuffer]): js.Promise[ArrayBuffer] = js.native
    @JSName("generateAsync")
    def generateAsync_arraybuffer(options: JSZipGeneratorOptions[arraybuffer], onUpdate: OnUpdateCallback): js.Promise[ArrayBuffer] = js.native
    @JSName("generateAsync")
    def generateAsync_base64(options: JSZipGeneratorOptions[base64]): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_base64(options: JSZipGeneratorOptions[base64], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_binarystring(options: JSZipGeneratorOptions[binarystring]): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_binarystring(options: JSZipGeneratorOptions[binarystring], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_blob(options: JSZipGeneratorOptions[blob]): js.Promise[Blob] = js.native
    @JSName("generateAsync")
    def generateAsync_blob(options: JSZipGeneratorOptions[blob], onUpdate: OnUpdateCallback): js.Promise[Blob] = js.native
    @JSName("generateAsync")
    def generateAsync_nodebuffer(options: JSZipGeneratorOptions[nodebuffer]): js.Promise[Buffer] = js.native
    @JSName("generateAsync")
    def generateAsync_nodebuffer(options: JSZipGeneratorOptions[nodebuffer], onUpdate: OnUpdateCallback): js.Promise[Buffer] = js.native
    @JSName("generateAsync")
    def generateAsync_string(options: JSZipGeneratorOptions[string]): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_string(options: JSZipGeneratorOptions[string], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_text(options: JSZipGeneratorOptions[text]): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_text(options: JSZipGeneratorOptions[text], onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("generateAsync")
    def generateAsync_uint8array(options: JSZipGeneratorOptions[uint8array]): js.Promise[Uint8Array] = js.native
    @JSName("generateAsync")
    def generateAsync_uint8array(options: JSZipGeneratorOptions[uint8array], onUpdate: OnUpdateCallback): js.Promise[Uint8Array] = js.native
    
    /**
      * Generates a new archive asynchronously
      *
      * @param options Optional options for the generator
      * @param onUpdate The optional function called on each internal update with the metadata.
      * @return A Node.js `ReadableStream`
      */
    def generateNodeStream(): ReadableStream = js.native
    def generateNodeStream(options: Unit, onUpdate: OnUpdateCallback): ReadableStream = js.native
    @JSName("generateNodeStream")
    def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[nodebuffer]): ReadableStream = js.native
    @JSName("generateNodeStream")
    def generateNodeStream_nodebuffer(options: JSZipGeneratorOptions[nodebuffer], onUpdate: OnUpdateCallback): ReadableStream = js.native
    
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
    def remove(path: String): JSZip = js.native
    
    var support: JSZipSupport = js.native
    
    var version: String = js.native
  }
  
  trait JSZipFileOptions extends StObject {
    
    /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
      * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
      */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var compression: js.UndefOr[String] = js.undefined
    
    /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The last modification date, defaults to the current date.
      */
    var date: js.UndefOr[Date] = js.undefined
    
    /** Set to `true` if this is a directory and content should be ignored. */
    var dir: js.UndefOr[Boolean] = js.undefined
    
    /** 6 bits number. The DOS permissions of the file, if any. */
    var dosPermissions: js.UndefOr[Double | Null] = js.undefined
    
    /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
    var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 16 bits number. The UNIX permissions of the file, if any.
      * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
      */
    var unixPermissions: js.UndefOr[Double | String | Null] = js.undefined
  }
  object JSZipFileOptions {
    
    inline def apply(): JSZipFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSZipFileOptions]
    }
    
    extension [Self <: JSZipFileOptions](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      inline def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDosPermissions(value: Double): Self = StObject.set(x, "dosPermissions", value.asInstanceOf[js.Any])
      
      inline def setDosPermissionsNull: Self = StObject.set(x, "dosPermissions", null)
      
      inline def setDosPermissionsUndefined: Self = StObject.set(x, "dosPermissions", js.undefined)
      
      inline def setOptimizedBinaryString(value: Boolean): Self = StObject.set(x, "optimizedBinaryString", value.asInstanceOf[js.Any])
      
      inline def setOptimizedBinaryStringUndefined: Self = StObject.set(x, "optimizedBinaryString", js.undefined)
      
      inline def setUnixPermissions(value: Double | String): Self = StObject.set(x, "unixPermissions", value.asInstanceOf[js.Any])
      
      inline def setUnixPermissionsNull: Self = StObject.set(x, "unixPermissions", null)
      
      inline def setUnixPermissionsUndefined: Self = StObject.set(x, "unixPermissions", js.undefined)
    }
  }
  
  trait JSZipGeneratorOptions[T /* <: OutputType */] extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var compression: js.UndefOr[Compression] = js.undefined
    
    var compressionOptions: js.UndefOr[Null | Level] = js.undefined
    
    var encodeFileName: js.UndefOr[js.Function1[/* filename */ String, String]] = js.undefined
    
    /**
      * mime-type for the generated file.
      * Useful when you need to generate a file with a different extension, ie: “.ods”.
      * @default 'application/zip'
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /** DOS (default) or UNIX */
    var platform: js.UndefOr[DOS | UNIX] = js.undefined
    
    /** Stream the files and create file descriptors */
    var streamFiles: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[T] = js.undefined
  }
  object JSZipGeneratorOptions {
    
    inline def apply[T /* <: OutputType */](): JSZipGeneratorOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSZipGeneratorOptions[T]]
    }
    
    extension [Self <: JSZipGeneratorOptions[?], T /* <: OutputType */](x: Self & JSZipGeneratorOptions[T]) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* filename */ String => String): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setStreamFiles(value: Boolean): Self = StObject.set(x, "streamFiles", value.asInstanceOf[js.Any])
      
      inline def setStreamFilesUndefined: Self = StObject.set(x, "streamFiles", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait JSZipLoadOptions extends StObject {
    
    var base64: js.UndefOr[Boolean] = js.undefined
    
    var checkCRC32: js.UndefOr[Boolean] = js.undefined
    
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  }
  object JSZipLoadOptions {
    
    inline def apply(): JSZipLoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSZipLoadOptions]
    }
    
    extension [Self <: JSZipLoadOptions](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setCheckCRC32(value: Boolean): Self = StObject.set(x, "checkCRC32", value.asInstanceOf[js.Any])
      
      inline def setCheckCRC32Undefined: Self = StObject.set(x, "checkCRC32", js.undefined)
      
      inline def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      inline def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      inline def setOptimizedBinaryString(value: Boolean): Self = StObject.set(x, "optimizedBinaryString", value.asInstanceOf[js.Any])
      
      inline def setOptimizedBinaryStringUndefined: Self = StObject.set(x, "optimizedBinaryString", js.undefined)
    }
  }
  
  @js.native
  trait JSZipObject extends StObject {
    
    @JSName("async")
    def async_array(`type`: array): js.Promise[js.Array[Double]] = js.native
    @JSName("async")
    def async_array(`type`: array, onUpdate: OnUpdateCallback): js.Promise[js.Array[Double]] = js.native
    @JSName("async")
    def async_arraybuffer(`type`: arraybuffer): js.Promise[ArrayBuffer] = js.native
    @JSName("async")
    def async_arraybuffer(`type`: arraybuffer, onUpdate: OnUpdateCallback): js.Promise[ArrayBuffer] = js.native
    /**
      * Prepare the content in the asked type.
      * @param type the type of the result.
      * @param onUpdate a function to call on each internal update.
      * @return Promise the promise of the result.
      */
    @JSName("async")
    def async_base64(`type`: base64): js.Promise[String] = js.native
    @JSName("async")
    def async_base64(`type`: base64, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("async")
    def async_binarystring(`type`: binarystring): js.Promise[String] = js.native
    @JSName("async")
    def async_binarystring(`type`: binarystring, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("async")
    def async_blob(`type`: blob): js.Promise[Blob] = js.native
    @JSName("async")
    def async_blob(`type`: blob, onUpdate: OnUpdateCallback): js.Promise[Blob] = js.native
    @JSName("async")
    def async_nodebuffer(`type`: nodebuffer): js.Promise[Buffer] = js.native
    @JSName("async")
    def async_nodebuffer(`type`: nodebuffer, onUpdate: OnUpdateCallback): js.Promise[Buffer] = js.native
    @JSName("async")
    def async_string(`type`: string): js.Promise[String] = js.native
    @JSName("async")
    def async_string(`type`: string, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("async")
    def async_text(`type`: text): js.Promise[String] = js.native
    @JSName("async")
    def async_text(`type`: text, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
    @JSName("async")
    def async_uint8array(`type`: uint8array): js.Promise[Uint8Array] = js.native
    @JSName("async")
    def async_uint8array(`type`: uint8array, onUpdate: OnUpdateCallback): js.Promise[Uint8Array] = js.native
    
    var comment: String = js.native
    
    var date: Date = js.native
    
    var dir: Boolean = js.native
    
    /** The UNIX permissions of the file, if any. */
    var dosPermissions: Double | Null = js.native
    
    var name: String = js.native
    
    def nodeStream(): ReadableStream = js.native
    def nodeStream(`type`: Unit, onUpdate: OnUpdateCallback): ReadableStream = js.native
    @JSName("nodeStream")
    def nodeStream_nodebuffer(`type`: nodebuffer): ReadableStream = js.native
    @JSName("nodeStream")
    def nodeStream_nodebuffer(`type`: nodebuffer, onUpdate: OnUpdateCallback): ReadableStream = js.native
    
    var options: JSZipObjectOptions = js.native
    
    /** The UNIX permissions of the file, if any. */
    var unixPermissions: Double | String | Null = js.native
  }
  
  trait JSZipObjectOptions extends StObject {
    
    var compression: Compression
  }
  object JSZipObjectOptions {
    
    inline def apply(compression: Compression): JSZipObjectOptions = {
      val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSZipObjectOptions]
    }
    
    extension [Self <: JSZipObjectOptions](x: Self) {
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSZipSupport extends StObject {
    
    var arraybuffer: Boolean
    
    var blob: Boolean
    
    var nodebuffer: Boolean
    
    var uint8array: Boolean
  }
  object JSZipSupport {
    
    inline def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): JSZipSupport = {
      val __obj = js.Dynamic.literal(arraybuffer = arraybuffer.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSZipSupport]
    }
    
    extension [Self <: JSZipSupport](x: Self) {
      
      inline def setArraybuffer(value: Boolean): Self = StObject.set(x, "arraybuffer", value.asInstanceOf[js.Any])
      
      inline def setBlob(value: Boolean): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setNodebuffer(value: Boolean): Self = StObject.set(x, "nodebuffer", value.asInstanceOf[js.Any])
      
      inline def setUint8array(value: Boolean): Self = StObject.set(x, "uint8array", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var currentFile: String
    
    var percent: Double
  }
  object Metadata {
    
    inline def apply(currentFile: String, percent: Double): Metadata = {
      val __obj = js.Dynamic.literal(currentFile = currentFile.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setCurrentFile(value: String): Self = StObject.set(x, "currentFile", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  type OnUpdateCallback = js.Function1[/* metadata */ Metadata, Unit]
  
  trait OutputByType extends StObject {
    
    var array: js.Array[Double]
    
    var arraybuffer: ArrayBuffer
    
    var base64: String
    
    var binarystring: String
    
    var blob: Blob
    
    var nodebuffer: Buffer
    
    var string: String
    
    var text: String
    
    var uint8array: Uint8Array
  }
  object OutputByType {
    
    inline def apply(
      array: js.Array[Double],
      arraybuffer: ArrayBuffer,
      base64: String,
      binarystring: String,
      blob: Blob,
      nodebuffer: Buffer,
      string: String,
      text: String,
      uint8array: Uint8Array
    ): OutputByType = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], arraybuffer = arraybuffer.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binarystring = binarystring.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputByType]
    }
    
    extension [Self <: OutputByType](x: Self) {
      
      inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      inline def setArraybuffer(value: ArrayBuffer): Self = StObject.set(x, "arraybuffer", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBinarystring(value: String): Self = StObject.set(x, "binarystring", value.asInstanceOf[js.Any])
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setNodebuffer(value: Buffer): Self = StObject.set(x, "nodebuffer", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUint8array(value: Uint8Array): Self = StObject.set(x, "uint8array", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jszip.jszipStrings.base64
    - typings.jszip.jszipStrings.string
    - typings.jszip.jszipStrings.text
    - typings.jszip.jszipStrings.binarystring
    - typings.jszip.jszipStrings.array
    - typings.jszip.jszipStrings.uint8array
    - typings.jszip.jszipStrings.arraybuffer
    - typings.jszip.jszipStrings.blob
    - typings.jszip.jszipStrings.nodebuffer
  */
  trait OutputType extends StObject
  
  type _To = js.Object & JSZip
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & JSZip = ^
}
