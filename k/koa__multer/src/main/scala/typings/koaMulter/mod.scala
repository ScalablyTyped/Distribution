package typings.koaMulter

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaMulter.anon.FieldNameSize
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Instance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance]
  inline def apply(options: Options): Instance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("@koa/multer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* The disk storage engine gives you full control on storing files to disk. */
  inline def diskStorage(options: DiskStorageOptions): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("diskStorage")(options.asInstanceOf[js.Any]).asInstanceOf[StorageEngine]
  
  /* The memory storage engine stores the files in memory as Buffer objects. */
  inline def memoryStorage(): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStorage")().asInstanceOf[StorageEngine]
  
  trait DiskStorageOptions extends StObject {
    
    /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
    var destination: js.UndefOr[
        String | (js.Function3[
          /* req */ IncomingMessage, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
          Unit
        ])
      ] = js.undefined
    
    /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
    var filename: js.UndefOr[
        js.Function3[
          /* req */ IncomingMessage, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object DiskStorageOptions {
    
    inline def apply(): DiskStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiskStorageOptions]
    }
    
    extension [Self <: DiskStorageOptions](x: Self) {
      
      inline def setDestination(
        value: String | (js.Function3[
              /* req */ IncomingMessage, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationFunction3(
        value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit]) => Unit
      ): Self = StObject.set(x, "destination", js.Any.fromFunction3(value))
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setFilename(
        value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Unit
      ): Self = StObject.set(x, "filename", js.Any.fromFunction3(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait Field extends StObject {
    
    /** Optional maximum number of files per field to accept. */
    var maxCount: js.UndefOr[Double] = js.undefined
    
    /** The field name. */
    var name: String
  }
  object Field {
    
    inline def apply(name: String): Field = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    /** A Buffer of the entire file (MemoryStorage) */
    var buffer: Buffer
    
    /** The folder to which the file has been saved (DiskStorage) */
    var destination: String
    
    /** Encoding type of the file */
    var encoding: String
    
    /** Field name specified in the form */
    var fieldname: String
    
    /** The name of the file within the destination (DiskStorage) */
    var filename: String
    
    /** Mime type of the file */
    var mimetype: String
    
    /** Name of the file on the user's computer */
    var originalname: String
    
    /** Location of the uploaded file (DiskStorage) */
    var path: String
    
    /** Size of the file in bytes */
    var size: Double
  }
  object File {
    
    inline def apply(
      buffer: Buffer,
      destination: String,
      encoding: String,
      fieldname: String,
      filename: String,
      mimetype: String,
      originalname: String,
      path: String,
      size: Double
    ): File = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setOriginalname(value: String): Self = StObject.set(x, "originalname", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    /** Accepts all files that comes over the wire. An array of files will be stored in req.files. */
    def any(): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
    def array(fieldName: String): Middleware[DefaultState, DefaultContext, Any] = js.native
    def array(fieldName: String, maxCount: Double): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    /** Accept a mix of files, specified by fields. An object with arrays of files will be stored in req.files. */
    def fields(fields: js.Array[Field]): Middleware[DefaultState, DefaultContext, Any] = js.native
    
    /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
    /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
    def single(): Middleware[DefaultState, DefaultContext, Any] = js.native
    def single(fieldName: String): Middleware[DefaultState, DefaultContext, Any] = js.native
  }
  
  @js.native
  trait MulterIncomingMessage extends IncomingMessage {
    
    var body: Any = js.native
    
    var file: File = js.native
    
    var files: StringDictionary[js.Array[File]] | js.Array[File] = js.native
  }
  
  trait Options extends StObject {
    
    /** The destination directory for the uploaded files. */
    var dest: js.UndefOr[String] = js.undefined
    
    /** A function to control which files to upload and which to skip. */
    var fileFilter: js.UndefOr[
        js.Function3[
          /* req */ IncomingMessage, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * An object specifying the size limits of the following optional properties. This object is passed to busboy
      * directly, and the details of properties can be found on https://github.com/mscdex/busboy#busboy-methods
      */
    var limits: js.UndefOr[FieldNameSize] = js.undefined
    
    /** The storage engine to use for uploaded files. */
    var storage: js.UndefOr[StorageEngine] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setFileFilter(
        value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* acceptFile */ Boolean, Unit]) => Unit
      ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
      
      inline def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
      
      inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setStorage(value: StorageEngine): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  trait StorageEngine extends StObject {
    
    def _handleFile(
      req: IncomingMessage,
      file: File,
      callback: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]
    ): Unit
    
    def _removeFile(req: IncomingMessage, file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  }
  object StorageEngine {
    
    inline def apply(
      _handleFile: (IncomingMessage, File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Unit,
      _removeFile: (IncomingMessage, File, js.Function1[/* error */ js.Error, Unit]) => Unit
    ): StorageEngine = {
      val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
      __obj.asInstanceOf[StorageEngine]
    }
    
    extension [Self <: StorageEngine](x: Self) {
      
      inline def set_handleFile(
        value: (IncomingMessage, File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[File], Unit]) => Unit
      ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3(value))
      
      inline def set_removeFile(value: (IncomingMessage, File, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3(value))
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait DefaultContext extends StObject {
      
      var file: typings.std.File
      
      var files: js.UndefOr[StringDictionary[js.Array[typings.std.File]] | js.Array[typings.std.File]] = js.undefined
    }
    object DefaultContext {
      
      inline def apply(file: typings.std.File): typings.koaMulter.mod.koaAugmentingMod.DefaultContext = {
        val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.koaMulter.mod.koaAugmentingMod.DefaultContext]
      }
      
      extension [Self <: typings.koaMulter.mod.koaAugmentingMod.DefaultContext](x: Self) {
        
        inline def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFiles(value: StringDictionary[js.Array[typings.std.File]] | js.Array[typings.std.File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: typings.std.File*): Self = StObject.set(x, "files", js.Array(value*))
      }
    }
    
    trait Request extends StObject {
      
      var file: typings.std.File
      
      var files: js.UndefOr[StringDictionary[js.Array[typings.std.File]] | js.Array[typings.std.File]] = js.undefined
    }
    object Request {
      
      inline def apply(file: typings.std.File): Request = {
        val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setFile(value: typings.std.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFiles(value: StringDictionary[js.Array[typings.std.File]] | js.Array[typings.std.File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        
        inline def setFilesVarargs(value: typings.std.File*): Self = StObject.set(x, "files", js.Array(value*))
      }
    }
  }
}
