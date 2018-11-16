package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * An interface represents an object, that can be configured credentials, settings etc. by H.service.Platform
         */
@js.native
trait IConfigurable extends js.Object {
  /**
               * This methods receive configuration parameters from the platform, that can be used by the object implementing the interface.
               * @param appId {string} - The application ID to identify the client against the platform (mandatory to provide)
               * @param appCode {string} - The application code to identify the client against the platform (mandatory to provide)
               * @param useHTTPS {boolean} - Indicates whether secure communication should be used, default is false
               * @param useCIT {boolean} - Indicates whether the Customer Integration Testing should be used, default is false
               * @param opt_baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com. Note that if useHTTPS flag is passed it will override the URL scheme specified in
               * the opt_baseUrl to use HTTPS.
               * @returns {H.service.IConfigurable}
               */
  def configure(appId: java.lang.String, appCode: java.lang.String, useHTTPS: scala.Boolean, useCIT: scala.Boolean): IConfigurable = js.native
  /**
               * This methods receive configuration parameters from the platform, that can be used by the object implementing the interface.
               * @param appId {string} - The application ID to identify the client against the platform (mandatory to provide)
               * @param appCode {string} - The application code to identify the client against the platform (mandatory to provide)
               * @param useHTTPS {boolean} - Indicates whether secure communication should be used, default is false
               * @param useCIT {boolean} - Indicates whether the Customer Integration Testing should be used, default is false
               * @param opt_baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com. Note that if useHTTPS flag is passed it will override the URL scheme specified in
               * the opt_baseUrl to use HTTPS.
               * @returns {H.service.IConfigurable}
               */
  def configure(
    appId: java.lang.String,
    appCode: java.lang.String,
    useHTTPS: scala.Boolean,
    useCIT: scala.Boolean,
    opt_baseUrl: Url
  ): IConfigurable = js.native
}

