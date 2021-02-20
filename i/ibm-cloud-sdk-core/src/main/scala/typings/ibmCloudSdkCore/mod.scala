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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("ibm-cloud-sdk-core", "buildRequestFileObject")
  @js.native
  def buildRequestFileObject(fileParams: FileParamAttributes): FileObject = js.native
  
  object contentType {
    
    @JSImport("ibm-cloud-sdk-core", "contentType.fromFilename")
    @js.native
    def fromFilename(file: String): String = js.native
    @JSImport("ibm-cloud-sdk-core", "contentType.fromFilename")
    @js.native
    def fromFilename(file: FileObject): String = js.native
    @JSImport("ibm-cloud-sdk-core", "contentType.fromFilename")
    @js.native
    def fromFilename(file: Buffer): String = js.native
    @JSImport("ibm-cloud-sdk-core", "contentType.fromFilename")
    @js.native
    def fromFilename(file: File): String = js.native
    @JSImport("ibm-cloud-sdk-core", "contentType.fromFilename")
    @js.native
    def fromFilename(file: ReadableStream[_]): String = js.native
    
    @JSImport("ibm-cloud-sdk-core", "contentType.fromHeader")
    @js.native
    def fromHeader(buffer: Buffer): String = js.native
  }
  
  @JSImport("ibm-cloud-sdk-core", "getContentType")
  @js.native
  def getContentType(inputData: String): String = js.native
  @JSImport("ibm-cloud-sdk-core", "getContentType")
  @js.native
  def getContentType(inputData: Buffer): String = js.native
  @JSImport("ibm-cloud-sdk-core", "getContentType")
  @js.native
  def getContentType(inputData: typings.node.NodeJS.ReadableStream): String = js.native
  
  @JSImport("ibm-cloud-sdk-core", "getFormat")
  @js.native
  def getFormat(params: StringDictionary[js.Any], formats: js.Array[String]): String = js.native
  
  @JSImport("ibm-cloud-sdk-core", "getMissingParams")
  @js.native
  def getMissingParams(params: StringDictionary[js.Any], requires: js.Array[String]): Null | Error = js.native
  
  @JSImport("ibm-cloud-sdk-core", "isEmptyObject")
  @js.native
  def isEmptyObject(obj: js.Any): Boolean = js.native
  
  @JSImport("ibm-cloud-sdk-core", "isFileParam")
  @js.native
  def isFileParam(obj: js.Any): Boolean = js.native
  
  @JSImport("ibm-cloud-sdk-core", "isHTML")
  @js.native
  def isHTML(text: String): Boolean = js.native
  
  object qs {
    
    @JSImport("ibm-cloud-sdk-core", "qs.stringify")
    @js.native
    def stringify(queryParams: js.Object): String = js.native
  }
  
  @JSImport("ibm-cloud-sdk-core", "streamToPromise")
  @js.native
  def streamToPromise(stream: Stream): js.Promise[_] = js.native
  
  @JSImport("ibm-cloud-sdk-core", "stripTrailingSlash")
  @js.native
  def stripTrailingSlash(url: String): String = js.native
  
  @JSImport("ibm-cloud-sdk-core", "toLowerKeys")
  @js.native
  def toLowerKeys(obj: js.Object): js.Object = js.native
}
