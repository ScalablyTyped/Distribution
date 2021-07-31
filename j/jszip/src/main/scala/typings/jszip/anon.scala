package typings.jszip

import typings.jszip.jszipBooleans.`true`
import typings.std.Date
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
    
    var compression: js.UndefOr[String] = js.undefined
    
    /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
    var createFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The last modification date, defaults to the current date.
      */
    var date: js.UndefOr[Date] = js.undefined
    
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
    
    @scala.inline
    def apply(dir: js.UndefOr[Boolean] & `true`): JSZipFileOptionsdirtrue = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSZipFileOptionsdirtrue]
    }
    
    @scala.inline
    implicit class JSZipFileOptionsdirtrueMutableBuilder[Self <: JSZipFileOptionsdirtrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCreateFolders(value: Boolean): Self = StObject.set(x, "createFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFoldersUndefined: Self = StObject.set(x, "createFolders", js.undefined)
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDir(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDosPermissions(value: Double): Self = StObject.set(x, "dosPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDosPermissionsNull: Self = StObject.set(x, "dosPermissions", null)
      
      @scala.inline
      def setDosPermissionsUndefined: Self = StObject.set(x, "dosPermissions", js.undefined)
      
      @scala.inline
      def setOptimizedBinaryString(value: Boolean): Self = StObject.set(x, "optimizedBinaryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizedBinaryStringUndefined: Self = StObject.set(x, "optimizedBinaryString", js.undefined)
      
      @scala.inline
      def setUnixPermissions(value: Double | String): Self = StObject.set(x, "unixPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnixPermissionsNull: Self = StObject.set(x, "unixPermissions", null)
      
      @scala.inline
      def setUnixPermissionsUndefined: Self = StObject.set(x, "unixPermissions", js.undefined)
    }
  }
  
  trait Level extends StObject {
    
    var level: Double
  }
  object Level {
    
    @scala.inline
    def apply(level: Double): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait Promise extends StObject {
    
    var Promise: PromiseConstructorLike
  }
  object Promise {
    
    @scala.inline
    def apply(Promise: PromiseConstructorLike): Promise = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    @scala.inline
    implicit class PromiseMutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: PromiseConstructorLike): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    }
  }
}
