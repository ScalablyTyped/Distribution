package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildRequestFileObject(fileParams: FileParamAttributes): FileObject = ^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestFileObject")(fileParams.asInstanceOf[js.Any]).asInstanceOf[FileObject]
  
  @scala.inline
  def getContentType(inputData: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getContentType(inputData: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getContentType(inputData: ReadableStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getFormat(params: StringDictionary[js.Any], formats: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(params.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getMissingParams(params: StringDictionary[js.Any], requires: js.Array[String]): Null | Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getMissingParams")(params.asInstanceOf[js.Any], requires.asInstanceOf[js.Any])).asInstanceOf[Null | Error]
  
  @scala.inline
  def isEmptyObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFileParam(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileParam")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHTML(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTML")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def stripTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toLowerKeys(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  trait FileObject extends StObject {
    
    var options: js.UndefOr[FileOptions] = js.undefined
    
    var value: ReadableStream | Buffer | String
  }
  object FileObject {
    
    @scala.inline
    def apply(value: ReadableStream | Buffer | String): FileObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileObject]
    }
    
    @scala.inline
    implicit class FileObjectMutableBuilder[Self <: FileObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: FileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setValue(value: ReadableStream | Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileOptions extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object FileOptions {
    
    @scala.inline
    def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait FileParamAttributes extends StObject {
    
    var contentType: String
    
    var data: ReadableStream | Buffer | FileObject
    
    var filename: String
  }
  object FileParamAttributes {
    
    @scala.inline
    def apply(contentType: String, data: ReadableStream | Buffer | FileObject, filename: String): FileParamAttributes = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileParamAttributes]
    }
    
    @scala.inline
    implicit class FileParamAttributesMutableBuilder[Self <: FileParamAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: ReadableStream | Buffer | FileObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileStream
    extends StObject
       with ReadableStream {
    
    var path: String | Buffer = js.native
  }
}
