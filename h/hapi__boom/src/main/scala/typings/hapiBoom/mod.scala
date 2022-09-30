package typings.hapiBoom

import org.scalablytyped.runtime.StringDictionary
import typings.hapiBoom.hapiBoomStrings._empty
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/boom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/boom", "Boom")
  @js.native
  /**
    * Creates a new Boom object using the provided message
    */
  open class Boom[Data] ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: js.Error) = this()
    def this(message: String, options: Options[Data]) = this()
    def this(message: js.Error, options: Options[Data]) = this()
    def this(message: Unit, options: Options[Data]) = this()
    
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
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
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
  
  inline def badData[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")().asInstanceOf[Boom[Data]]
  inline def badData[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badData[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badData[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badGateway[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")().asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badImplementation[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")().asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badRequest[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")().asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def boomify[Data, Decoration](err: js.Error): Boom[Data] & Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(err.asInstanceOf[js.Any]).asInstanceOf[Boom[Data] & Decoration]
  inline def boomify[Data, Decoration](err: js.Error, options: Options[Data] & Decorate[Decoration]): Boom[Data] & Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boom[Data] & Decoration]
  
  inline def clientTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")().asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def conflict[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")().asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def entityTooLarge[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")().asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def expectationFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")().asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def failedDependency[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")().asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def forbidden[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def gatewayTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")().asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def illegal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")().asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def internal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")().asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String, data: Data, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String, data: Unit, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: Unit, data: Data, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: Unit, data: Unit, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def isBoom(obj: Any): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoom")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean]
  inline def isBoom(obj: Any, statusCode: Double): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoom")(obj.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[/* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean]
  
  inline def lengthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")().asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def locked[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")().asInstanceOf[Boom[Data]]
  inline def locked[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def locked[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def locked[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def methodNotAllowed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")().asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notAcceptable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")().asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notFound[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notImplemented[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")().asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def paymentRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")().asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def preconditionFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")().asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def preconditionRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")().asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def proxyAuthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")().asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def rangeNotSatisfiable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")().asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def resourceGone[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")().asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def serverUnavailable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")().asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def teapot[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")().asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def tooEarly[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")().asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def tooManyRequests[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")().asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  object unauthorized {
    
    inline def apply[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boom[Data]]
    inline def apply[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: String, scheme: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: String, scheme: String, attributes: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: String, scheme: String, attributes: Attributes): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: String, wwwAuthenticate: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], wwwAuthenticate.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: Null, scheme: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: Null, scheme: String, attributes: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: Null, scheme: String, attributes: Attributes): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: Null, wwwAuthenticate: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], wwwAuthenticate.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
    inline def apply[Data](message: _empty, scheme: String): Boom[Data] & MissingAuth = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Data] & MissingAuth]
    inline def apply[Data](message: _empty, scheme: String, attributes: String): Boom[Data] & MissingAuth = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data] & MissingAuth]
    inline def apply[Data](message: _empty, scheme: String, attributes: Attributes): Boom[Data] & MissingAuth = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Data] & MissingAuth]
    
    @JSImport("@hapi/boom", "unauthorized")
    @js.native
    val ^ : js.Any = js.native
    
    type Attributes = StringDictionary[js.UndefOr[Double | String | Null]]
    
    trait MissingAuth extends StObject {
      
      /**
        * Indicate whether the 401 unauthorized error is due to missing credentials (vs. invalid)
        */
      var isMissing: Boolean
    }
    object MissingAuth {
      
      inline def apply(isMissing: Boolean): MissingAuth = {
        val __obj = js.Dynamic.literal(isMissing = isMissing.asInstanceOf[js.Any])
        __obj.asInstanceOf[MissingAuth]
      }
      
      extension [Self <: MissingAuth](x: Self) {
        
        inline def setIsMissing(value: Boolean): Self = StObject.set(x, "isMissing", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def unsupportedMediaType[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")().asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def uriTooLong[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")().asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  trait Decorate[Decoration] extends StObject {
    
    /**
      * An option with extra properties to set on the error object
      */
    var decorate: js.UndefOr[Decoration] = js.undefined
  }
  object Decorate {
    
    inline def apply[Decoration](): Decorate[Decoration] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decorate[Decoration]]
    }
    
    extension [Self <: Decorate[?], Decoration](x: Self & Decorate[Decoration]) {
      
      inline def setDecorate(value: Decoration): Self = StObject.set(x, "decorate", value.asInstanceOf[js.Any])
      
      inline def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
    }
  }
  
  trait Options[Data] extends StObject {
    
    /**
      * Constructor reference used to crop the exception call stack output
      */
    var ctor: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Additional error information
      */
    var data: js.UndefOr[Data] = js.undefined
    
    /**
      * Error message string
      *
      * @default none
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * If false, the err provided is a Boom object, and a statusCode or message are provided, the values are ignored
      *
      * @default true
      */
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTTP status code
      *
      * @default 500
      */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[Data](): Options[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Data]]
    }
    
    extension [Self <: Options[?], Data](x: Self & Options[Data]) {
      
      inline def setCtor(value: js.Function): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
      
      inline def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait Output extends StObject {
    
    /**
      * An object containing any HTTP headers where each key is a header name and value is the header content
      */
    var headers: StringDictionary[js.UndefOr[String | js.Array[String] | Double]]
    
    /**
      * The formatted object used as the response payload (stringified)
      */
    var payload: Payload
    
    /**
      * The HTTP status code
      */
    var statusCode: Double
  }
  object Output {
    
    inline def apply(
      headers: StringDictionary[js.UndefOr[String | js.Array[String] | Double]],
      payload: Payload,
      statusCode: Double
    ): Output = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String] | Double]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload
    extends StObject
       with /**
    * Custom properties
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * The HTTP status message derived from statusCode
      */
    var error: String
    
    /**
      * The error message derived from error.message
      */
    var message: String
    
    /**
      * The HTTP status code derived from error.output.statusCode
      */
    var statusCode: Double
  }
  object Payload {
    
    inline def apply(error: String, message: String, statusCode: Double): Payload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
