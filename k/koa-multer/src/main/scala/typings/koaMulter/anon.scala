package typings.koaMulter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FieldNameSize extends StObject {
    
    /** Max field name size (Default: 100 bytes) */
    var fieldNameSize: js.UndefOr[Double] = js.native
    
    /** Max field value size (Default: 1MB) */
    var fieldSize: js.UndefOr[Double] = js.native
    
    /** Max number of non- file fields (Default: Infinity) */
    var fields: js.UndefOr[Double] = js.native
    
    /** For multipart forms, the max file size (in bytes)(Default: Infinity) */
    var fileSize: js.UndefOr[Double] = js.native
    
    /** For multipart forms, the max number of file fields (Default: Infinity) */
    var files: js.UndefOr[Double] = js.native
    
    /** For multipart forms, the max number of header key=> value pairs to parse Default: 2000(same as node's http). */
    var headerPairs: js.UndefOr[Double] = js.native
    
    /** For multipart forms, the max number of parts (fields + files)(Default: Infinity) */
    var parts: js.UndefOr[Double] = js.native
    
    /** Keep the full path of files instead of just the base name (Default: false) */
    var preservePath: js.UndefOr[Boolean] = js.native
  }
  object FieldNameSize {
    
    @scala.inline
    def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    @scala.inline
    implicit class FieldNameSizeMutableBuilder[Self <: FieldNameSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      @scala.inline
      def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      @scala.inline
      def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      @scala.inline
      def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      @scala.inline
      def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
}
