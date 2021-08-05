package typings.instagramPrivateApi

import typings.chance.Chance.Chance
import typings.instagramPrivateApi.anon.PartialAttemptOptionsany
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.rxjs.mod.Observable_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedMod {
  
  @JSImport("instagram-private-api/dist/core/feed", "Feed")
  @js.native
  abstract class Feed[Response, Item] protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    var attemptOptions: PartialAttemptOptionsany = js.native
    
    /* protected */ var chance: Chance = js.native
    
    def deserialize(data: String): Unit = js.native
    
    def isMoreAvailable(): Boolean = js.native
    
    def items(): js.Promise[js.Array[Item]] = js.native
    
    @JSName("items$")
    def items$: Observable_[js.Array[Item]] = js.native
    
    /* protected */ var moreAvailable: Boolean = js.native
    
    def observable(): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[js.Any]]): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: js.Function0[js.Promise[js.Any]], attemptOptions: PartialAttemptOptionsany): Observable_[js.Array[Item]] = js.native
    def observable(semaphore: Unit, attemptOptions: PartialAttemptOptionsany): Observable_[js.Array[Item]] = js.native
    
    /* protected */ var rankToken: String = js.native
    
    def request(args: js.Any*): js.Promise[Response] = js.native
    
    def serialize(): String = js.native
    
    /* protected */ def state_=(response: Response): Unit = js.native
    
    def toPlain(): Record[String, js.Any] = js.native
  }
}
