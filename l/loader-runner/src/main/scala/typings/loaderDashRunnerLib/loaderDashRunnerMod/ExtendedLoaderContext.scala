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
  var resourcePath: js.UndefOr[java.lang.String] = js.undefined
  var resourceQuery: js.UndefOr[java.lang.String] = js.undefined
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
    addContextDependency: java.lang.String => scala.Unit,
    addDependency: java.lang.String => scala.Unit,
    cacheable: scala.Boolean => scala.Unit,
    clearDependencies: () => scala.Unit,
    currentRequest: java.lang.String,
    data: js.Any,
    dependency: java.lang.String => scala.Unit,
    getContextDependencies: () => js.Array[java.lang.String],
    getDependencies: () => js.Array[java.lang.String],
    loaderIndex: scala.Double,
    loaders: js.Array[Loader],
    previousRequest: java.lang.String,
    query: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String,
    remainingRequest: java.lang.String,
    request: java.lang.String,
    resource: java.lang.String,
    async: () => js.UndefOr[js.Function0[scala.Unit]] = null,
    callback: () => scala.Unit = null,
    context: java.lang.String = null,
    resourcePath: java.lang.String = null,
    resourceQuery: java.lang.String = null
  ): ExtendedLoaderContext = {
    val __obj = js.Dynamic.literal(addContextDependency = js.Any.fromFunction1(addContextDependency), addDependency = js.Any.fromFunction1(addDependency), cacheable = js.Any.fromFunction1(cacheable), clearDependencies = js.Any.fromFunction0(clearDependencies), currentRequest = currentRequest, data = data, dependency = js.Any.fromFunction1(dependency), getContextDependencies = js.Any.fromFunction0(getContextDependencies), getDependencies = js.Any.fromFunction0(getDependencies), loaderIndex = loaderIndex, loaders = loaders, previousRequest = previousRequest, query = query.asInstanceOf[js.Any], remainingRequest = remainingRequest, request = request, resource = resource)
    if (async != null) __obj.updateDynamic("async")(js.Any.fromFunction0(async))
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (context != null) __obj.updateDynamic("context")(context)
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath)
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery)
    __obj.asInstanceOf[ExtendedLoaderContext]
  }
}

