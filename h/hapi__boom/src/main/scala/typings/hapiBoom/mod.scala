package typings.hapiBoom

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBoom.hapiBoomStrings._empty
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/boom", "Boom")
  @js.native
  /**
    * Creates a new Boom object using the provided message
    */
  class Boom[Data] () extends Error {
    def this(message: String) = this()
    def this(message: Error) = this()
    def this(message: js.UndefOr[scala.Nothing], options: Options[Data]) = this()
    def this(message: String, options: Options[Data]) = this()
    def this(message: Error, options: Options[Data]) = this()
    
    /**
      * Custom error data with additional information specific to the error type
      */
    var data: js.UndefOr[Data] = js.native
    
    /**
      * isBoom - if true, indicates this is a Boom object instance.
      */
    var isBoom: Boolean = js.native
    
    /**
      * Convenience boolean indicating status code >= 500
      */
    var isServer: Boolean = js.native
    
    /**
      * The formatted response
      */
    var output: Output = js.native
    
    /**
      * Specifies if an error object is a valid boom object
      *
      * @param debug - A boolean that, when true, does not hide the original 500 error message. Defaults to false.
      */
    def reformat(): String = js.native
    def reformat(debug: Boolean): String = js.native
    
    /**
      * The constructor used to create the error
      */
    var typeof: js.Function = js.native
  }
  
  @JSImport("@hapi/boom", "badData")
  @js.native
  def badData[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badData")
  @js.native
  def badData[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badData")
  @js.native
  def badData[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badData")
  @js.native
  def badData[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "badGateway")
  @js.native
  def badGateway[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badGateway")
  @js.native
  def badGateway[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badGateway")
  @js.native
  def badGateway[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badGateway")
  @js.native
  def badGateway[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "badImplementation")
  @js.native
  def badImplementation[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "badRequest")
  @js.native
  def badRequest[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badRequest")
  @js.native
  def badRequest[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badRequest")
  @js.native
  def badRequest[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "badRequest")
  @js.native
  def badRequest[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "boomify")
  @js.native
  def boomify[Data, Decoration](err: Error): Boom[Data] with Decoration = js.native
  @JSImport("@hapi/boom", "boomify")
  @js.native
  def boomify[Data, Decoration](err: Error, options: Options[Data] with Decorate[Decoration]): Boom[Data] with Decoration = js.native
  
  @JSImport("@hapi/boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "conflict")
  @js.native
  def conflict[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "conflict")
  @js.native
  def conflict[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "conflict")
  @js.native
  def conflict[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "conflict")
  @js.native
  def conflict[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "failedDependency")
  @js.native
  def failedDependency[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "forbidden")
  @js.native
  def forbidden[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "forbidden")
  @js.native
  def forbidden[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "forbidden")
  @js.native
  def forbidden[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "forbidden")
  @js.native
  def forbidden[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "illegal")
  @js.native
  def illegal[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "illegal")
  @js.native
  def illegal[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "illegal")
  @js.native
  def illegal[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "illegal")
  @js.native
  def illegal[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: js.UndefOr[scala.Nothing], data: Data, statusCode: Double): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], statusCode: Double): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: String, data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: String, data: Data, statusCode: Double): Boom[Data] = js.native
  @JSImport("@hapi/boom", "internal")
  @js.native
  def internal[Data](message: String, data: js.UndefOr[scala.Nothing], statusCode: Double): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "isBoom")
  @js.native
  def isBoom(err: Error): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = js.native
  @JSImport("@hapi/boom", "isBoom")
  @js.native
  def isBoom(err: Error, statusCode: Double): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = js.native
  
  @JSImport("@hapi/boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "locked")
  @js.native
  def locked[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "locked")
  @js.native
  def locked[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "locked")
  @js.native
  def locked[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "locked")
  @js.native
  def locked[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "notFound")
  @js.native
  def notFound[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notFound")
  @js.native
  def notFound[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notFound")
  @js.native
  def notFound[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notFound")
  @js.native
  def notFound[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "notImplemented")
  @js.native
  def notImplemented[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "resourceGone")
  @js.native
  def resourceGone[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "teapot")
  @js.native
  def teapot[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "teapot")
  @js.native
  def teapot[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "teapot")
  @js.native
  def teapot[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "teapot")
  @js.native
  def teapot[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "tooEarly")
  @js.native
  def tooEarly[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooEarly")
  @js.native
  def tooEarly[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooEarly")
  @js.native
  def tooEarly[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooEarly")
  @js.native
  def tooEarly[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: String, data: Data): Boom[Data] = js.native
  
  object unauthorized {
    
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: String): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: String, scheme: String): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: String, scheme: String, attributes: String): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: String, scheme: String, attributes: Attributes): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: String, wwwAuthenticate: js.Array[String]): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: Null, scheme: String): Boom[Data] with MissingAuth = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: Null, scheme: String, attributes: String): Boom[Data] with MissingAuth = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: Null, scheme: String, attributes: Attributes): Boom[Data] with MissingAuth = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: Null, wwwAuthenticate: js.Array[String]): Boom[Data] = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: _empty, scheme: String): Boom[Data] with MissingAuth = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: _empty, scheme: String, attributes: String): Boom[Data] with MissingAuth = js.native
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    def apply[Data](message: _empty, scheme: String, attributes: Attributes): Boom[Data] with MissingAuth = js.native
    
    type Attributes = StringDictionary[js.UndefOr[Double | String | Null]]
    
    @js.native
    trait MissingAuth extends StObject {
      
      /**
        * Indicate whether the 401 unauthorized error is due to missing credentials (vs. invalid)
        */
      var isMissing: Boolean = js.native
    }
    object MissingAuth {
      
      @scala.inline
      def apply(isMissing: Boolean): MissingAuth = {
        val __obj = js.Dynamic.literal(isMissing = isMissing.asInstanceOf[js.Any])
        __obj.asInstanceOf[MissingAuth]
      }
      
      @scala.inline
      implicit class MissingAuthMutableBuilder[Self <: MissingAuth] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsMissing(value: Boolean): Self = StObject.set(x, "isMissing", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@hapi/boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: String, data: Data): Boom[Data] = js.native
  
  @JSImport("@hapi/boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](): Boom[Data] = js.native
  @JSImport("@hapi/boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("@hapi/boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: String): Boom[Data] = js.native
  @JSImport("@hapi/boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: String, data: Data): Boom[Data] = js.native
  
  @js.native
  trait Decorate[Decoration] extends StObject {
    
    /**
      * An option with extra properties to set on the error object
      */
    var decorate: js.UndefOr[Decoration] = js.native
  }
  object Decorate {
    
    @scala.inline
    def apply[Decoration](): Decorate[Decoration] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decorate[Decoration]]
    }
    
    @scala.inline
    implicit class DecorateMutableBuilder[Self <: Decorate[_], Decoration] (val x: Self with Decorate[Decoration]) extends AnyVal {
      
      @scala.inline
      def setDecorate(value: Decoration): Self = StObject.set(x, "decorate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
    }
  }
  
  @js.native
  trait Options[Data] extends StObject {
    
    /**
      * Constructor reference used to crop the exception call stack output
      */
    var ctor: js.UndefOr[js.Function] = js.native
    
    /**
      * Additional error information
      */
    var data: js.UndefOr[Data] = js.native
    
    /**
      * Error message string
      *
      * @default none
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * If false, the err provided is a Boom object, and a statusCode or message are provided, the values are ignored
      *
      * @default true
      */
    var `override`: js.UndefOr[Boolean] = js.native
    
    /**
      * The HTTP status code
      *
      * @default 500
      */
    var statusCode: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Data](): Options[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Data]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], Data] (val x: Self with Options[Data]) extends AnyVal {
      
      @scala.inline
      def setCtor(value: js.Function): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    /**
      * An object containing any HTTP headers where each key is a header name and value is the header content
      */
    var headers: js.Object = js.native
    
    /**
      * The formatted object used as the response payload (stringified)
      */
    var payload: Payload = js.native
    
    /**
      * The HTTP status code
      */
    var statusCode: Double = js.native
  }
  object Output {
    
    @scala.inline
    def apply(headers: js.Object, payload: Payload, statusCode: Double): Output = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    /**
      * The HTTP status message derived from statusCode
      */
    var error: String = js.native
    
    /**
      The error message derived from error.message
      */
    var message: String = js.native
    
    /**
      * The HTTP status code derived from error.output.statusCode
      */
    var statusCode: Double = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(error: String, message: String, statusCode: Double): Payload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
