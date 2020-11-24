package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.ibmCloudSdkCore.baseServiceMod.UserOptions
import typings.ibmCloudSdkCore.helperMod.FileObject
import typings.ibmCloudSdkCore.helperMod.FileParamAttributes
import typings.ibmCloudSdkCore.v1Mod.Options
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Stream
import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ibm-cloud-sdk-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def buildRequestFileObject(fileParams: FileParamAttributes): FileObject = js.native
  
  def getContentType(inputData: String): String = js.native
  def getContentType(inputData: Buffer): String = js.native
  def getContentType(inputData: ReadableStream): String = js.native
  
  def getFormat(params: StringDictionary[js.Any], formats: js.Array[String]): String = js.native
  
  def getMissingParams(params: StringDictionary[js.Any], requires: js.Array[String]): Null | Error = js.native
  
  def isEmptyObject(obj: js.Any): Boolean = js.native
  
  def isFileParam(obj: js.Any): Boolean = js.native
  
  def isHTML(text: String): Boolean = js.native
  
  def streamToPromise(stream: Stream): js.Promise[_] = js.native
  
  def stripTrailingSlash(url: String): String = js.native
  
  def toLowerKeys(obj: js.Object): js.Object = js.native
  
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
  @js.native
  object BaseService extends js.Object {
    
    var URL: String = js.native
  }
  
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
  
  @js.native
  object contentType extends js.Object {
    
    def fromFilename(file: String): String = js.native
    def fromFilename(file: FileObject): String = js.native
    def fromFilename(file: Buffer): String = js.native
    def fromFilename(file: File): String = js.native
    def fromFilename(file: typings.std.ReadableStream[_]): String = js.native
    
    def fromHeader(buffer: Buffer): String = js.native
  }
  
  @js.native
  object qs extends js.Object {
    
    def stringify(queryParams: js.Object): String = js.native
  }
}
