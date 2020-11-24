package typings.kBucket.anon

import typings.kBucket.mod.Contact
import typings.kBucket.mod.Distance
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arbiter[T /* <: Contact */] extends js.Object {
  
  var arbiter: js.UndefOr[typings.kBucket.mod.Arbiter[T]] = js.native
  
  var distance: js.UndefOr[Distance] = js.native
  
  var localNodeId: js.UndefOr[Uint8Array] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var numberOfNodesPerKBucket: js.UndefOr[Double] = js.native
  
  var numberOfNodesToPing: js.UndefOr[Double] = js.native
}
object Arbiter {
  
  @scala.inline
  def apply[T /* <: Contact */](): Arbiter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arbiter[T]]
  }
  
  @scala.inline
  implicit class ArbiterOps[Self <: Arbiter[_], T /* <: Contact */] (val x: Self with Arbiter[T]) extends AnyVal {
    
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
    def setArbiter(value: (T, T) => T): Self = this.set("arbiter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteArbiter: Self = this.set("arbiter", js.undefined)
    
    @scala.inline
    def setDistance(value: (/* firstId */ Uint8Array, /* secondId */ Uint8Array) => Double): Self = this.set("distance", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setLocalNodeId(value: Uint8Array): Self = this.set("localNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalNodeId: Self = this.set("localNodeId", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNumberOfNodesPerKBucket(value: Double): Self = this.set("numberOfNodesPerKBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodesPerKBucket: Self = this.set("numberOfNodesPerKBucket", js.undefined)
    
    @scala.inline
    def setNumberOfNodesToPing(value: Double): Self = this.set("numberOfNodesToPing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodesToPing: Self = this.set("numberOfNodesToPing", js.undefined)
  }
}
