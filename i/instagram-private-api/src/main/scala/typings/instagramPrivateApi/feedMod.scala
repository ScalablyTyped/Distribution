package typings.instagramPrivateApi

import typings.chance.Chance.Chance
import typings.instagramPrivateApi.anon.PartialAttemptOptionsany
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.rxjs.mod.Observable_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/core/feed", JSImport.Namespace)
@js.native
object feedMod extends js.Object {
  
  @js.native
  abstract class Feed[Response, Item] () extends Repository {
    
    var attemptOptions: PartialAttemptOptionsany = js.native
    
    var chance: Chance = js.native
    
    def deserialize(data: String): Unit = js.native
    
    def isMoreAvailable(): Boolean = js.native
    
    def items(): js.Promise[js.Array[Item]] = js.native
    
    @JSName("items$")
    def items$: Observable_[js.Array[Item]] = js.native
    
    var moreAvailable: Boolean = js.native
    
    def observable(): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: js.UndefOr[scala.Nothing], attemptOptions: PartialAttemptOptionsany): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[_]]): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[_]], attemptOptions: PartialAttemptOptionsany): Observable_[js.Array[Item]] = js.native
    
    var rankToken: String = js.native
    
    def request(args: js.Any*): js.Promise[Response] = js.native
    
    def serialize(): String = js.native
    
    /* protected */ def state_=(response: Response): Unit = js.native
    
    def toPlain(): Record[String, _] = js.native
  }
}
