package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "buildRequestFileObject")
  @js.native
  def buildRequestFileObject(fileParams: FileParamAttributes): FileObject = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "getContentType")
  @js.native
  def getContentType(inputData: String): String = js.native
  @JSImport("ibm-cloud-sdk-core/lib/helper", "getContentType")
  @js.native
  def getContentType(inputData: Buffer): String = js.native
  @JSImport("ibm-cloud-sdk-core/lib/helper", "getContentType")
  @js.native
  def getContentType(inputData: ReadableStream): String = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "getFormat")
  @js.native
  def getFormat(params: StringDictionary[js.Any], formats: js.Array[String]): String = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "getMissingParams")
  @js.native
  def getMissingParams(params: StringDictionary[js.Any], requires: js.Array[String]): Null | Error = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "isEmptyObject")
  @js.native
  def isEmptyObject(obj: js.Any): Boolean = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "isFileParam")
  @js.native
  def isFileParam(obj: js.Any): Boolean = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "isHTML")
  @js.native
  def isHTML(text: String): Boolean = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "stripTrailingSlash")
  @js.native
  def stripTrailingSlash(url: String): String = js.native
  
  @JSImport("ibm-cloud-sdk-core/lib/helper", "toLowerKeys")
  @js.native
  def toLowerKeys(obj: js.Object): js.Object = js.native
  
  @js.native
  trait FileObject extends StObject {
    
    var options: js.UndefOr[FileOptions] = js.native
    
    var value: ReadableStream | Buffer | String = js.native
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
  
  @js.native
  trait FileOptions extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
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
  
  @js.native
  trait FileParamAttributes extends StObject {
    
    var contentType: String = js.native
    
    var data: ReadableStream | Buffer | FileObject = js.native
    
    var filename: String = js.native
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
  trait FileStream extends ReadableStream {
    
    var path: String | Buffer = js.native
  }
}
