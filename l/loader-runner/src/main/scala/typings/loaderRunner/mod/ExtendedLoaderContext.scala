package typings.loaderRunner.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[Unit]]] | Null = js.native
  var callback: js.Function0[Unit] | Null = js.native
  var context: String | Null = js.native
  var currentRequest: String = js.native
  var data: js.Any = js.native
  var loaderIndex: Double = js.native
  var loaders: js.Array[Loader] = js.native
  var previousRequest: String = js.native
  var query: StringDictionary[js.Any] | String = js.native
  var remainingRequest: String = js.native
  var request: String = js.native
  var resource: String = js.native
  var resourcePath: js.UndefOr[String] = js.native
  var resourceQuery: js.UndefOr[String] = js.native
  def addContextDependency(context: String): Unit = js.native
  def addDependency(file: String): Unit = js.native
  def cacheable(flag: Boolean): Unit = js.native
  def clearDependencies(): Unit = js.native
  def dependency(file: String): Unit = js.native
  def getContextDependencies(): js.Array[String] = js.native
  def getDependencies(): js.Array[String] = js.native
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
    resource: String
  ): ExtendedLoaderContext = {
    val __obj = js.Dynamic.literal(addContextDependency = js.Any.fromFunction1(addContextDependency), addDependency = js.Any.fromFunction1(addDependency), cacheable = js.Any.fromFunction1(cacheable), clearDependencies = js.Any.fromFunction0(clearDependencies), currentRequest = currentRequest.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dependency = js.Any.fromFunction1(dependency), getContextDependencies = js.Any.fromFunction0(getContextDependencies), getDependencies = js.Any.fromFunction0(getDependencies), loaderIndex = loaderIndex.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], previousRequest = previousRequest.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], remainingRequest = remainingRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedLoaderContext]
  }
  @scala.inline
  implicit class ExtendedLoaderContextOps[Self <: ExtendedLoaderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddContextDependency(value: String => Unit): Self = this.set("addContextDependency", js.Any.fromFunction1(value))
    @scala.inline
    def setAddDependency(value: String => Unit): Self = this.set("addDependency", js.Any.fromFunction1(value))
    @scala.inline
    def setCacheable(value: Boolean => Unit): Self = this.set("cacheable", js.Any.fromFunction1(value))
    @scala.inline
    def setClearDependencies(value: () => Unit): Self = this.set("clearDependencies", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentRequest(value: String): Self = this.set("currentRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependency(value: String => Unit): Self = this.set("dependency", js.Any.fromFunction1(value))
    @scala.inline
    def setGetContextDependencies(value: () => js.Array[String]): Self = this.set("getContextDependencies", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDependencies(value: () => js.Array[String]): Self = this.set("getDependencies", js.Any.fromFunction0(value))
    @scala.inline
    def setLoaderIndex(value: Double): Self = this.set("loaderIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadersVarargs(value: Loader*): Self = this.set("loaders", js.Array(value :_*))
    @scala.inline
    def setLoaders(value: js.Array[Loader]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousRequest(value: String): Self = this.set("previousRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: StringDictionary[js.Any] | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainingRequest(value: String): Self = this.set("remainingRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: () => js.UndefOr[js.Function0[Unit]]): Self = this.set("async", js.Any.fromFunction0(value))
    @scala.inline
    def setAsyncNull: Self = this.set("async", null)
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setCallbackNull: Self = this.set("callback", null)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    @scala.inline
    def setResourcePath(value: String): Self = this.set("resourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePath: Self = this.set("resourcePath", js.undefined)
    @scala.inline
    def setResourceQuery(value: String): Self = this.set("resourceQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceQuery: Self = this.set("resourceQuery", js.undefined)
  }
  
}

