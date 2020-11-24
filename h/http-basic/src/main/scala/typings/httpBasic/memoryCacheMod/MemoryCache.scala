package typings.httpBasic.memoryCacheMod

import typings.httpBasic.anon.PickCachedResponseheaders
import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.node.NodeJS.ErrnoException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryCache extends js.Object {
  
  val _cache: js.Any = js.native
  
  def getResponse(
    url: String,
    callback: js.Function2[/* err */ Null | Error, /* response */ Null | CachedResponse, Unit]
  ): Unit = js.native
  
  def invalidateResponse(url: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  
  def setResponse(url: String, response: CachedResponse): Unit = js.native
  
  def updateResponseHeaders(url: String, response: PickCachedResponseheaders): Unit = js.native
}
object MemoryCache {
  
  @scala.inline
  def apply(
    _cache: js.Any,
    getResponse: (String, js.Function2[/* err */ Null | Error, /* response */ Null | CachedResponse, Unit]) => Unit,
    invalidateResponse: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Unit,
    setResponse: (String, CachedResponse) => Unit,
    updateResponseHeaders: (String, PickCachedResponseheaders) => Unit
  ): MemoryCache = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], getResponse = js.Any.fromFunction2(getResponse), invalidateResponse = js.Any.fromFunction2(invalidateResponse), setResponse = js.Any.fromFunction2(setResponse), updateResponseHeaders = js.Any.fromFunction2(updateResponseHeaders))
    __obj.asInstanceOf[MemoryCache]
  }
  
  @scala.inline
  implicit class MemoryCacheOps[Self <: MemoryCache] (val x: Self) extends AnyVal {
    
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
    def set_cache(value: js.Any): Self = this.set("_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetResponse(
      value: (String, js.Function2[/* err */ Null | Error, /* response */ Null | CachedResponse, Unit]) => Unit
    ): Self = this.set("getResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInvalidateResponse(value: (String, js.Function1[/* err */ ErrnoException | Null, Unit]) => Unit): Self = this.set("invalidateResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetResponse(value: (String, CachedResponse) => Unit): Self = this.set("setResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateResponseHeaders(value: (String, PickCachedResponseheaders) => Unit): Self = this.set("updateResponseHeaders", js.Any.fromFunction2(value))
  }
}
