package typings.matrixAppservice

import typings.matrixAppservice.anon.Errcode
import typings.matrixAppservice.anon.HomeserverToken
import typings.matrixAppservice.libAppServiceRegistrationMod.AppServiceOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("matrix-appservice", "AppService")
  @js.native
  open class AppService protected ()
    extends typings.matrixAppservice.libAppServiceMod.AppService {
    /**
      * Construct a new application service.
      * @constructor
      * @param {Object} config Configuration for this service.
      * @param {String} config.homeserverToken The incoming HS token to expect. Must
      * be set prior to calling listen(port).
      * @param {Number} config.httpMaxSizeBytes The max number of bytes allowed on an
      * incoming HTTP request. Default: 5000000.
      * @throws If a homeserver token is not supplied.
      */
    def this(config: HomeserverToken) = this()
  }
  
  @JSImport("matrix-appservice", "AppServiceRegistration")
  @js.native
  open class AppServiceRegistration ()
    extends typings.matrixAppservice.libAppServiceRegistrationMod.AppServiceRegistration {
    def this(url: String) = this()
  }
  /* static members */
  object AppServiceRegistration {
    
    @JSImport("matrix-appservice", "AppServiceRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a JSON object to an AppServiceRegistration object.
      * @static
      * @param obj The registration object
      * @return The registration.
      */
    inline def fromObject(obj: AppServiceOutput): typings.matrixAppservice.libAppServiceRegistrationMod.AppServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.matrixAppservice.libAppServiceRegistrationMod.AppServiceRegistration]
    
    /**
      * Generate a random token.
      * @return {string} A randomly generated token.
      */
    inline def generateToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateToken")().asInstanceOf[String]
  }
  
  @JSImport("matrix-appservice", "AppserviceHttpError")
  @js.native
  open class AppserviceHttpError protected ()
    extends typings.matrixAppservice.libAppserviceHttpErrorMod.AppserviceHttpError {
    /**
      * Creates a new Appservice HTTP error
      * @param body The error body.
      * @param status The HTTP status code.
      */
    def this(body: Errcode, status: Double) = this()
  }
}
