package typings.jszip

import typings.jszip.jszipBooleans.`true`
import typings.jszip.mod.Compression
import typings.jszip.mod.CompressionOptions
import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jszip.jszip.JSZipFileOptions & {  dir :true} */
  trait JSZipFileOptionsdirtrue extends StObject {
    
    /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
      * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
      */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * Sets per file compression. The `compressionOptions` parameter depends on the compression type.
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * Sets per file compression level for `DEFLATE` compression.
      */
    var compressionOptions: js.UndefOr[Null | CompressionOptions] = js.undefined
    
    /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The last modification date, defaults to the current date.
      */
    var date: js.UndefOr[js.Date] = js.undefined
    
    /** Set to `true` if this is a directory and content should be ignored. */
    var dir: js.UndefOr[Boolean] & `true`
    
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
  object JSZipFileOptionsdirtrue {
    
    inline def apply(dir: js.UndefOr[Boolean] & `true`): JSZipFileOptionsdirtrue = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSZipFileOptionsdirtrue]
    }
    
    extension [Self <: JSZipFileOptionsdirtrue](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: CompressionOptions): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      inline def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDir(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
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
  
  trait Promise extends StObject {
    
    var Promise: PromiseConstructorLike
  }
  object Promise {
    
    inline def apply(Promise: PromiseConstructorLike): Promise = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    extension [Self <: Promise](x: Self) {
      
      inline def setPromise(value: PromiseConstructorLike): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    }
  }
}
