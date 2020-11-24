package typings.httpCacheSemantics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-cache-semantics", JSImport.Namespace)
@js.native
class ^ protected () extends CachePolicy {
  def this(req: Request, res: Response) = this()
  def this(req: Request, res: Response, options: Options) = this()
}
@JSImport("http-cache-semantics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * `policy = CachePolicy.fromObject(obj)` creates an instance from object created by `toObject()`.
    */
  def fromObject(obj: CachePolicyObject): CachePolicy = js.native
}
