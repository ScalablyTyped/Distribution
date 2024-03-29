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
    * Creates a new Boom object using the provided message or Error
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
  inline def badData[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badData[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badData[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badData[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badData[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badGateway[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")().asInstanceOf[Boom[Data]]
  inline def badGateway[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badImplementation[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")().asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def badRequest[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")().asInstanceOf[Boom[Data]]
  inline def badRequest[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def boomify[Data, Decoration](err: js.Error): Boom[Data] & Decoration = ^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(err.asInstanceOf[js.Any]).asInstanceOf[Boom[Data] & Decoration]
  inline def boomify[Data, Decoration](err: js.Error, options: Options[Data] & Decorate[Decoration]): Boom[Data] & Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(err.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boom[Data] & Decoration]
  
  inline def clientTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")().asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def conflict[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")().asInstanceOf[Boom[Data]]
  inline def conflict[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def conflict[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def conflict[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def conflict[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def conflict[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def entityTooLarge[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")().asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def expectationFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")().asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def failedDependency[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")().asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def forbidden[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[Boom[Data]]
  inline def forbidden[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def gatewayTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")().asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def illegal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")().asInstanceOf[Boom[Data]]
  inline def illegal[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def illegal[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def illegal[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def illegal[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def illegal[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def internal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")().asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: String, data: Data, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: String, data: Unit, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: js.Error, data: Data, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: js.Error, data: Unit, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: Unit, data: Data, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](messageOrError: Unit, data: Unit, statusCode: Double): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def isBoom(obj: Any): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoom")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean]
  inline def isBoom(obj: Any, statusCode: Double): /* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoom")(obj.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[/* is @hapi/boom.@hapi/boom.Boom<any> */ Boolean]
  
  inline def lengthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")().asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def locked[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")().asInstanceOf[Boom[Data]]
  inline def locked[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def locked[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def locked[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def locked[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def locked[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def methodNotAllowed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")().asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: String, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: js.Error, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: Unit, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: Unit, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: Unit, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](messageOrError: Unit, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notAcceptable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")().asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notFound[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[Boom[Data]]
  inline def notFound[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notFound[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notFound[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notFound[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notFound[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def notImplemented[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")().asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def paymentRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")().asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def preconditionFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")().asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def preconditionRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")().asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def proxyAuthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")().asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def rangeNotSatisfiable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")().asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def resourceGone[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")().asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def serverUnavailable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")().asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def teapot[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")().asInstanceOf[Boom[Data]]
  inline def teapot[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def teapot[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def teapot[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def teapot[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def teapot[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def tooEarly[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")().asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooEarly[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooEarly")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def tooManyRequests[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")().asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  object unauthorized {
    
    inline def apply[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boom[Data]]
    inline def apply[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].apply(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
    inline def apply[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].apply(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MissingAuth] (val x: Self) extends AnyVal {
        
        inline def setIsMissing(value: Boolean): Self = StObject.set(x, "isMissing", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def unsupportedMediaType[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")().asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  inline def uriTooLong[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")().asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](messageOrError: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](messageOrError: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](messageOrError: js.Error): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(messageOrError.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](messageOrError: js.Error, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](messageOrError: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(messageOrError.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decorate[?], Decoration] (val x: Self & Decorate[Decoration]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Data] (val x: Self & Options[Data]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
