package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountRepositoryMod.AccountRepository
import typings.instagramPrivateApi.addressBookRepositoryMod.AddressBookRepository
import typings.instagramPrivateApi.adsRepositoryMod.AdsRepository
import typings.instagramPrivateApi.attributionRepositoryMod.AttributionRepository
import typings.instagramPrivateApi.challengeRepositoryMod.ChallengeRepository
import typings.instagramPrivateApi.consentRepositoryMod.ConsentRepository
import typings.instagramPrivateApi.creativesRepositoryMod.CreativesRepository
import typings.instagramPrivateApi.directRepositoryMod.DirectRepository
import typings.instagramPrivateApi.directThreadRepositoryMod.DirectThreadRepository
import typings.instagramPrivateApi.discoverRepositoryMod.DiscoverRepository
import typings.instagramPrivateApi.entityFactoryMod.EntityFactory
import typings.instagramPrivateApi.fbsearchRepositoryMod.FbsearchRepository
import typings.instagramPrivateApi.feedFactoryMod.FeedFactory
import typings.instagramPrivateApi.friendshipRepositoryMod.FriendshipRepository
import typings.instagramPrivateApi.highlightsRepositoryMod.HighlightsRepository
import typings.instagramPrivateApi.igtvRepositoryMod.IgtvRepository
import typings.instagramPrivateApi.insightsServiceMod.InsightsService
import typings.instagramPrivateApi.launcherRepositoryMod.LauncherRepository
import typings.instagramPrivateApi.linkedAccountRepositoryMod.LinkedAccountRepository
import typings.instagramPrivateApi.liveRepositoryMod.LiveRepository
import typings.instagramPrivateApi.locationRepositoryMod.LocationRepository
import typings.instagramPrivateApi.locationSearchRepositoryMod.LocationSearch
import typings.instagramPrivateApi.loomRepositoryMod.LoomRepository
import typings.instagramPrivateApi.mediaRepositoryMod.MediaRepository
import typings.instagramPrivateApi.musicRepositoryMod.MusicRepository
import typings.instagramPrivateApi.newsRepositoryMod.NewsRepository
import typings.instagramPrivateApi.publishServiceMod.PublishService
import typings.instagramPrivateApi.qeRepositoryMod.QeRepository
import typings.instagramPrivateApi.qpRepositoryMod.QpRepository
import typings.instagramPrivateApi.requestMod.Request
import typings.instagramPrivateApi.restrictActionRepositoryMod.RestrictActionRepository
import typings.instagramPrivateApi.searchServiceMod.SearchService
import typings.instagramPrivateApi.simulateServiceMod.SimulateService
import typings.instagramPrivateApi.stateMod.State
import typings.instagramPrivateApi.statusRepositoryMod.StatusRepository
import typings.instagramPrivateApi.storyServiceMod.StoryService
import typings.instagramPrivateApi.tagRepositoryMod.TagRepository
import typings.instagramPrivateApi.uploadRepositoryMod.UploadRepository
import typings.instagramPrivateApi.userRepositoryMod.UserRepository
import typings.instagramPrivateApi.zrRepositoryMod.ZrRepository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("instagram-private-api/dist/core/client", "IgApiClient")
  @js.native
  class IgApiClient () extends StObject {
    
    var account: AccountRepository = js.native
    
    var addressBook: AddressBookRepository = js.native
    
    var ads: AdsRepository = js.native
    
    var attribution: AttributionRepository = js.native
    
    var challenge: ChallengeRepository = js.native
    
    var consent: ConsentRepository = js.native
    
    var creatives: CreativesRepository = js.native
    
    def destroy(): Unit = js.native
    
    var direct: DirectRepository = js.native
    
    var directThread: DirectThreadRepository = js.native
    
    var discover: DiscoverRepository = js.native
    
    var entity: EntityFactory = js.native
    
    var fbsearch: FbsearchRepository = js.native
    
    var feed: FeedFactory = js.native
    
    var friendship: FriendshipRepository = js.native
    
    var highlights: HighlightsRepository = js.native
    
    var igtv: IgtvRepository = js.native
    
    var insights: InsightsService = js.native
    
    var launcher: LauncherRepository = js.native
    
    var linkedAccount: LinkedAccountRepository = js.native
    
    var live: LiveRepository = js.native
    
    var location: LocationRepository = js.native
    
    var locationSearch: LocationSearch = js.native
    
    var loom: LoomRepository = js.native
    
    var media: MediaRepository = js.native
    
    var music: MusicRepository = js.native
    
    var news: NewsRepository = js.native
    
    var publish: PublishService = js.native
    
    var qe: QeRepository = js.native
    
    var qp: QpRepository = js.native
    
    var request: Request = js.native
    
    var restrictAction: RestrictActionRepository = js.native
    
    var search: SearchService = js.native
    
    var simulate: SimulateService = js.native
    
    var state: State = js.native
    
    var status: StatusRepository = js.native
    
    var story: StoryService = js.native
    
    var tag: TagRepository = js.native
    
    var upload: UploadRepository = js.native
    
    var user: UserRepository = js.native
    
    var zr: ZrRepository = js.native
  }
}
