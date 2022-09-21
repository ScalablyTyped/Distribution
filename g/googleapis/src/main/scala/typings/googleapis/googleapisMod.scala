package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.apisMod.GeneratedAPIs
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleapisMod {
  
  @JSImport("googleapis/build/src/googleapis", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @JSImport("googleapis/build/src/googleapis", "GoogleApis")
  @js.native
  /**
    * GoogleApis constructor.
    *
    * @example
    * ```js
    * const GoogleApis = require('googleapis').GoogleApis;
    * const google = new GoogleApis();
    * ```
    *
    * @param options - Configuration options.
    */
  open class GoogleApis () extends GeneratedAPIs {
    def this(options: GlobalOptions) = this()
    
    /* private */ var _discovery: Any = js.native
    
    var _options: GlobalOptions = js.native
    
    /**
      * Add APIs endpoints to googleapis object
      * E.g. googleapis.drive and googleapis.datastore
      *
      * @param apisToAdd - Apis to be added to this GoogleApis instance.
      */
    /* private */ var addAPIs: Any = js.native
    
    var auth: typings.googleapisCommon.mod.AuthPlus = js.native
    
    /**
      * Dynamically generate an apis object that can provide Endpoint objects for
      * the discovered APIs.
      *
      * @example
      * ```js
      * const {google} = require('googleapis');
      * const discoveryUrl = 'https://myapp.appspot.com/_ah/api/discovery/v1/apis/';
      * google.discover(discoveryUrl, function (err) {
      *   const someapi = google.someapi('v1');
      * });
      * ```
      *
      * @param url - Url to the discovery service for a set of APIs. e.g. https://www.googleapis.com/discovery/v1/apis
      * @param callback - Callback function.
      */
    def discover(url: String): js.Promise[Unit] = js.native
    def discover(url: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    /**
      * Dynamically generate an Endpoint object from a discovery doc.
      *
      * @param path - Url or file path to discover doc for a single API.
      * @param options - Options to configure the Endpoint object generated from the discovery doc.
      * @returns A promise that resolves with the configured endpoint.
      */
    def discoverAPI[T](apiPath: String): js.Promise[T] = js.native
    def discoverAPI[T](apiPath: String, options: js.Object): js.Promise[T] = js.native
    
    /* private */ var discoverAsync: Any = js.native
    
    /**
      * Obtain a Map of supported APIs, along with included API versions.
      */
    def getSupportedAPIs(): StringDictionary[js.Array[String]] = js.native
    
    /**
      * Set options.
      *
      * @param options - Configuration options.
      */
    def options(): Unit = js.native
    def options(options: GlobalOptions): Unit = js.native
  }
}
