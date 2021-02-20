package typings.massive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(connection: java.lang.String): js.Promise[typings.massive.mod.Database] = typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(connection: java.lang.String, loaderConfig: js.UndefOr[scala.Nothing], driverConfig: js.Object): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(connection: java.lang.String, loaderConfig: typings.massive.mod.Loader): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(connection: java.lang.String, loaderConfig: typings.massive.mod.Loader, driverConfig: js.Object): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(connection: typings.massive.mod.ConnectionInfo): js.Promise[typings.massive.mod.Database] = typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: typings.massive.mod.ConnectionInfo,
    loaderConfig: js.UndefOr[scala.Nothing],
    driverConfig: js.Object
  ): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(connection: typings.massive.mod.ConnectionInfo, loaderConfig: typings.massive.mod.Loader): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  @scala.inline
  def apply(
    connection: typings.massive.mod.ConnectionInfo,
    loaderConfig: typings.massive.mod.Loader,
    driverConfig: js.Object
  ): js.Promise[typings.massive.mod.Database] = (typings.massive.mod.^.asInstanceOf[js.Dynamic].apply(connection.asInstanceOf[js.Any], loaderConfig.asInstanceOf[js.Any], driverConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.massive.mod.Database]]
  
  type AnyObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type QueryParamTypes = java.lang.String | scala.Double | js.Object
  
  type QueryParams = js.Array[typings.massive.mod.QueryParamTypes] | typings.massive.mod.QueryParamTypes
  
  type UUID = java.lang.String
}
