package typings.gulpCache.mod.gc

import typings.gulpUtil.mod.PluginError
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGulpCacheStatic extends js.Object {
  
  /**
    * Caches the result of a task.
    * @param task The task whose result is to be cached.
    */
  def apply(task: ReadWriteStream): Transform = js.native
  /**
    * Caches the result of a task.
    * @param task Task whose result is to be cached.
    * @param options Override values for available settings.
    */
  def apply(task: ReadWriteStream, options: IGulpCacheOptions): Transform = js.native
  
  /**
    * Represents a cache store.
    */
  var Cache: IGulpCache = js.native
  
  def clear(options: IGulpCacheOptions): Transform = js.native
  
  /**
    * Purges the cache.
    * @param err PluginError instance in case of a plugin error.
    *            If callback is not specified an exception of type
    *            'PluginError' is thrown.
    */
  def clearAll(): Unit = js.native
  def clearAll(callback: js.Function1[/* err */ PluginError, Unit]): Unit = js.native
}
