package typings.koaCash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("koa", JSImport.Namespace)
@js.native
object koaAugmentingMod extends js.Object {
  @js.native
  trait BaseContext extends js.Object {
    /**
      * This is how you enable a route to be cached. If you don't call await ctx.cashed(),
      * then this route will not be cached nor will it attempt to serve the request from the cache.
      *
      * Notes:
      * * Only `GET` and `HEAD` requests are cached.
      * * Only 200 responses are cached. Don't set 304 status codes on these routes - this
      *   middleware will handle it for you.
      * * The underlying store should be able to handle Date objects as well as Buffer objects.
      *   Otherwise, you may have to serialize/deserialize yourself.
      * @param maxAge The max age passed to `get()`.
      */
    def cashed(): js.Promise[Boolean] = js.native
    def cashed(maxAge: Double): js.Promise[Boolean] = js.native
  }
  
}

