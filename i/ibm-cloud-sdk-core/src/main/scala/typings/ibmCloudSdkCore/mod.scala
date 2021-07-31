package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.ibmCloudSdkCore.baseServiceMod.UserOptions
import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.ibmCloudSdkCore.helperMod.FileParamAttributes
import typings.ibmCloudSdkCore.v1Mod.Options
import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.std.Error
import typings.std.File
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ibm-cloud-sdk-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ibm-cloud-sdk-core", "BaseService")
  @js.native
  class BaseService protected ()
    extends typings.ibmCloudSdkCore.baseServiceMod.BaseService {
    /**
      * Internal base class that other services inherit from
      * @param {UserOptions} options
      * @param {string} [options.username] - required unless use_unauthenticated is set
      * @param {string} [options.password] - required unless use_unauthenticated is set
      * @param {boolean} [options.use_unauthenticated] - skip credential requirement
      * @param {HeaderOptions} [options.headers]
      * @param {boolean} [options.headers.X-Watson-Learning-Opt-Out=false] - opt-out of data collection
      * @param {string} [options.url] - override default service base url
      * @private
      * @abstract
      * @constructor
      * @throws {Error}
      * @returns {BaseService}
      */
    def this(userOptions: UserOptions) = this()
  }
  /* static members */
  object BaseService {
    
    @JSImport("ibm-cloud-sdk-core", "BaseService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core", "BaseService.URL")
    @js.native
    def URL: String = js.native
    @scala.inline
    def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ibm-cloud-sdk-core", "IamTokenManagerV1")
  @js.native
  class IamTokenManagerV1 protected ()
    extends typings.ibmCloudSdkCore.v1Mod.IamTokenManagerV1 {
    /**
      * IAM Token Manager Service
      *
      * Retreives, stores, and refreshes IAM tokens.
      *
      * @param {Object} options
      * @param {String} options.iamApikey
      * @param {String} options.iamAccessToken
      * @param {String} options.iamUrl - url of the iam api to retrieve tokens from
      * @constructor
      */
    def this(options: Options) = this()
  }
  
  @scala.inline
  def buildRequestFileObject(fileParams: FileParamAttributes): FileObject = ^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestFileObject")(fileParams.asInstanceOf[js.Any]).asInstanceOf[FileObject]
  
  object contentType {
    
    @JSImport("ibm-cloud-sdk-core", "contentType")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromFilename(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def fromFilename(file: ReadableStream[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def fromHeader(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def getContentType(inputData: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getContentType(inputData: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getContentType(inputData: typings.node.NodeJS.ReadableStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  object qs {
    
    @JSImport("ibm-cloud-sdk-core", "qs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stringify(queryParams: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(queryParams.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def streamToPromise(stream: Stream): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToPromise")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def stripTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toLowerKeys(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
