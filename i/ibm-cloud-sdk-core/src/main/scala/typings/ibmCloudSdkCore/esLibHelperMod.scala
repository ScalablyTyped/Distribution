package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibHelperMod {
  
  @JSImport("ibm-cloud-sdk-core/es/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildRequestFileObject(fileParam: FileWithMetadata): js.Promise[FileObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestFileObject")(fileParam.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileObject]]
  
  inline def constructServiceUrl(parameterizedUrl: String, defaultUrlVariables: Map[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constructServiceUrl")(parameterizedUrl.asInstanceOf[js.Any], defaultUrlVariables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def constructServiceUrl(
    parameterizedUrl: String,
    defaultUrlVariables: Map[String, String],
    providedUrlVariables: Map[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constructServiceUrl")(parameterizedUrl.asInstanceOf[js.Any], defaultUrlVariables.asInstanceOf[js.Any], providedUrlVariables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getContentType(inputData: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getContentType(inputData: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getFormat(params: StringDictionary[Any], formats: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(params.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMissingParams(params: StringDictionary[Any], requires: js.Array[String]): Null | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getMissingParams")(params.asInstanceOf[js.Any], requires.asInstanceOf[js.Any])).asInstanceOf[Null | js.Error]
  
  inline def getQueryParam(urlStr: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParam")(urlStr.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isEmptyObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileData(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileData")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileWithMetadata(obj: Any): /* is ibm-cloud-sdk-core.ibm-cloud-sdk-core/es/lib/helper.FileWithMetadata */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileWithMetadata")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ibm-cloud-sdk-core.ibm-cloud-sdk-core/es/lib/helper.FileWithMetadata */ Boolean]
  
  inline def isHTML(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTML")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stripTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLowerKeys(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def validateParams(params: StringDictionary[Any], requiredParams: js.Array[String], allParams: js.Array[String]): Null | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("validateParams")(params.asInstanceOf[js.Any], requiredParams.asInstanceOf[js.Any], allParams.asInstanceOf[js.Any])).asInstanceOf[Null | js.Error]
  
  trait FileObject extends StObject {
    
    var options: js.UndefOr[FileOptions] = js.undefined
    
    var value: ReadableStream | Buffer | String
  }
  object FileObject {
    
    inline def apply(value: ReadableStream | Buffer | String): FileObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileObject]
    }
    
    extension [Self <: FileObject](x: Self) {
      
      inline def setOptions(value: FileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setValue(value: ReadableStream | Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileOptions extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  @js.native
  trait FileStream
    extends StObject
       with ReadableStream {
    
    var path: String | Buffer = js.native
  }
  
  trait FileWithMetadata extends StObject {
    
    var contentType: String
    
    var data: ReadableStream | Buffer
    
    var filename: String
  }
  object FileWithMetadata {
    
    inline def apply(contentType: String, data: ReadableStream | Buffer, filename: String): FileWithMetadata = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileWithMetadata]
    }
    
    extension [Self <: FileWithMetadata](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setData(value: ReadableStream | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
