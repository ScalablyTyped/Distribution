package typings.massive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.massive.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(connection: String): js.Promise[Database] = ^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Database]]
inline def apply(connection: String, loaderConfig: Unit, driverConfig: js.Object): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
inline def apply(connection: String, loaderConfig: Loader): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
inline def apply(connection: String, loaderConfig: Loader, driverConfig: js.Object): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
inline def apply(connection: ConnectionInfo): js.Promise[Database] = ^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Database]]
inline def apply(connection: ConnectionInfo, loaderConfig: Unit, driverConfig: js.Object): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
inline def apply(connection: ConnectionInfo, loaderConfig: Loader): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]
inline def apply(connection: ConnectionInfo, loaderConfig: Loader, driverConfig: js.Object): js.Promise[Database] = (^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Database]]

type AnyObject[T] = StringDictionary[T]

type QueryParamTypes = String | Double | js.Object

type QueryParams = js.Array[QueryParamTypes] | QueryParamTypes

type UUID = String
