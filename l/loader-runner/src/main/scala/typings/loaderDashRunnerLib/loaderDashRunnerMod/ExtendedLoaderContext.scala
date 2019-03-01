package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[scala.Unit]]] | scala.Null
  var callback: js.Function0[scala.Unit] | scala.Null
  var context: java.lang.String | scala.Null
  var currentRequest: java.lang.String
  var data: js.Any
  var loaderIndex: scala.Double
  var loaders: js.Array[Loader]
  var previousRequest: java.lang.String
  var query: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String
  var remainingRequest: java.lang.String
  var request: java.lang.String
  var resource: java.lang.String
  var resourcePath: js.UndefOr[java.lang.String]
  var resourceQuery: js.UndefOr[java.lang.String]
  def addContextDependency(context: java.lang.String): scala.Unit
  def addDependency(file: java.lang.String): scala.Unit
  def cacheable(flag: scala.Boolean): scala.Unit
  def clearDependencies(): scala.Unit
  def dependency(file: java.lang.String): scala.Unit
  def getContextDependencies(): js.Array[java.lang.String]
  def getDependencies(): js.Array[java.lang.String]
}

object ExtendedLoaderContext {
  @scala.inline
  def apply(
    addContextDependency: js.Function1[java.lang.String, scala.Unit],
    addDependency: js.Function1[java.lang.String, scala.Unit],
    cacheable: js.Function1[scala.Boolean, scala.Unit],
    clearDependencies: js.Function0[scala.Unit],
    currentRequest: java.lang.String,
    data: js.Any,
    dependency: js.Function1[java.lang.String, scala.Unit],
    getContextDependencies: js.Function0[js.Array[java.lang.String]],
    getDependencies: js.Function0[js.Array[java.lang.String]],
    loaderIndex: scala.Double,
    loaders: js.Array[Loader],
    previousRequest: java.lang.String,
    query: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String,
    remainingRequest: java.lang.String,
    request: java.lang.String,
    resource: java.lang.String,
    async: js.Function0[js.UndefOr[js.Function0[scala.Unit]]] = null,
    callback: js.Function0[scala.Unit] = null,
    context: java.lang.String = null,
    resourcePath: java.lang.String = null,
    resourceQuery: java.lang.String = null
  ): ExtendedLoaderContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addContextDependency")(addContextDependency)
    __obj.updateDynamic("addDependency")(addDependency)
    __obj.updateDynamic("cacheable")(cacheable)
    __obj.updateDynamic("clearDependencies")(clearDependencies)
    __obj.updateDynamic("currentRequest")(currentRequest)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("dependency")(dependency)
    __obj.updateDynamic("getContextDependencies")(getContextDependencies)
    __obj.updateDynamic("getDependencies")(getDependencies)
    __obj.updateDynamic("loaderIndex")(loaderIndex)
    __obj.updateDynamic("loaders")(loaders)
    __obj.updateDynamic("previousRequest")(previousRequest)
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.updateDynamic("remainingRequest")(remainingRequest)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("resource")(resource)
    if (async != null) __obj.updateDynamic("async")(async)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (context != null) __obj.updateDynamic("context")(context)
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath)
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery)
    __obj.asInstanceOf[ExtendedLoaderContext]
  }
}

