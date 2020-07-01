package typings.googleapis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleapis.anon.ReadonlyEndpoint
import typings.googleapis.anon.TypeofOAuth2Client
import typings.googleapis.apisMod.GeneratedAPIs
import typings.googleapisCommon.apiMod.APIEndpoint
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/googleapis", JSImport.Namespace)
@js.native
object googleapisMod extends js.Object {
  @js.native
  class AuthPlus () extends GoogleAuth {
    var Compute: Instantiable0[typings.googleAuthLibrary.mod.Compute] = js.native
    var JWT: Instantiable1[/* options */ JWTOptions, typings.googleAuthLibrary.mod.JWT] = js.native
    var OAuth2: TypeofOAuth2Client = js.native
  }
  
  @js.native
  /**
    * GoogleApis constructor.
    *
    * @example
    * const GoogleApis = require('googleapis').GoogleApis;
    * const google = new GoogleApis();
    *
    * @class GoogleApis
    * @param {Object} [options] Configuration options.
    */
  class GoogleApis ()
    extends GeneratedAPIs
       with /* index */ StringDictionary[APIEndpoint] {
    def this(options: GlobalOptions) = this()
    var _discovery: js.Any = js.native
    var _options: GlobalOptions = js.native
    /**
      * Add APIs endpoints to googleapis object
      * E.g. googleapis.drive and googleapis.datastore
      *
      * @name GoogleApis#addAPIs
      * @method
      * @param {Object} apis Apis to be added to this GoogleApis instance.
      * @private
      */
    var addAPIs: js.Any = js.native
    var auth: AuthPlus = js.native
    var discoverAsync: js.Any = js.native
    /**
      * Dynamically generate an apis object that can provide Endpoint objects for
      * the discovered APIs.
      *
      * @example
      * const {google} = require('googleapis');
      * const discoveryUrl =
      * 'https://myapp.appspot.com/_ah/api/discovery/v1/apis/';
      * google.discover(discoveryUrl, function (err) {
      *   const someapi = google.someapi('v1');
      * });
      *
      * @name GoogleApis#discover
      * @method
      * @param url Url to the discovery service for a set of APIs. e.g.,
      * https://www.googleapis.com/discovery/v1/apis
      * @param {Function} callback Callback function.
      */
    def discover(url: String): js.Promise[Unit] = js.native
    def discover(url: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    /**
      * Dynamically generate an Endpoint object from a discovery doc.
      *
      * @param path Url or file path to discover doc for a single API.
      * @param Options to configure the Endpoint object generated from the
      * discovery doc.
      * @returns A promise that resolves with the configured endpoint.
      */
    def discoverAPI(apiPath: String): js.Promise[ReadonlyEndpoint] = js.native
    def discoverAPI(apiPath: String, options: js.Object): js.Promise[ReadonlyEndpoint] = js.native
    /**
      * Obtain a Map of supported APIs, along with included API versions.
      */
    def getSupportedAPIs(): StringDictionary[js.Array[String]] = js.native
    /**
      * Set options.
      *
      * @param  {Object} [options] Configuration options.
      */
    def options(): Unit = js.native
    def options(options: GlobalOptions): Unit = js.native
  }
  
}

