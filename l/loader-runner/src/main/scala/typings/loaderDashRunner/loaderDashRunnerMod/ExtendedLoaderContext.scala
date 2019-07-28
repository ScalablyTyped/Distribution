package typings.loaderDashRunner.loaderDashRunnerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[Unit]]] | Null
  var callback: js.Function0[Unit] | Null
  var context: String | Null
  var currentRequest: String
  var data: js.Any
  var loaderIndex: Double
  var loaders: js.Array[Loader]
  var previousRequest: String
  var query: StringDictionary[js.Any] | String
  var remainingRequest: String
  var request: String
  var resource: String
  var resourcePath: js.UndefOr[String] = js.undefined
  var resourceQuery: js.UndefOr[String] = js.undefined
  def addContextDependency(context: String): Unit
  def addDependency(file: String): Unit
  def cacheable(flag: Boolean): Unit
  def clearDependencies(): Unit
  def dependency(file: String): Unit
  def getContextDependencies(): js.Array[String]
  def getDependencies(): js.Array[String]
}

object ExtendedLoaderContext {
  @scala.inline
  def apply(
    addContextDependency: String => Unit,
    addDependency: String => Unit,
    cacheable: Boolean => Unit,
    clearDependencies: () => Unit,
    currentRequest: String,
    data: js.Any,
    dependency: String => Unit,
    getContextDependencies: () => js.Array[String],
    getDependencies: () => js.Array[String],
    loaderIndex: Double,
    loaders: js.Array[Loader],
    previousRequest: String,
    query: StringDictionary[js.Any] | String,
    remainingRequest: String,
    request: String,
    resource: String,
    async: () => js.UndefOr[js.Function0[Unit]] = null,
    callback: () => Unit = null,
    context: String = null,
    resourcePath: String = null,
    resourceQuery: String = null
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

