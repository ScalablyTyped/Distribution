package typings.instagramDashPrivateDashApi

import typings.chance.Chance.Chance
import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/feed", JSImport.Namespace)
@js.native
object distCoreFeedMod extends js.Object {
  @js.native
  abstract class Feed[Response, Item] () extends Repository {
    var attemptOptions: PartialAttemptOptionsany = js.native
    var chance: Chance = js.native
    @JSName("items$")
    val items$: Observable[js.Array[Item]] = js.native
    var moreAvailable: Boolean = js.native
    var rankToken: String = js.native
    var state: Response = js.native
    def deserialize(data: String): Unit = js.native
    def isMoreAvailable(): Boolean = js.native
    def items(): js.Promise[js.Array[Item]] = js.native
    def observable(): Observable[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[_]]): Observable[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[_]], attemptOptions: PartialAttemptOptionsany): Observable[js.Array[Item]] = js.native
    def request(args: js.Any*): js.Promise[Response] = js.native
    def serialize(): String = js.native
    def toPlain(): js.Object = js.native
  }
  
}

