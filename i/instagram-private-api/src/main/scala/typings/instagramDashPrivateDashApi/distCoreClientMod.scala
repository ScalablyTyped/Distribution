package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreEntityDotFactoryMod.EntityFactory
import typings.instagramDashPrivateDashApi.distCoreFeedDotFactoryMod.FeedFactory
import typings.instagramDashPrivateDashApi.distCoreRequestMod.Request
import typings.instagramDashPrivateDashApi.distCoreStateMod.State
import typings.instagramDashPrivateDashApi.distRepositoriesAccountDotRepositoryMod.AccountRepository
import typings.instagramDashPrivateDashApi.distRepositoriesAddressDashBookDotRepositoryMod.AddressBookRepository
import typings.instagramDashPrivateDashApi.distRepositoriesAdsDotRepositoryMod.AdsRepository
import typings.instagramDashPrivateDashApi.distRepositoriesAttributionDotRepositoryMod.AttributionRepository
import typings.instagramDashPrivateDashApi.distRepositoriesChallengeDotRepositoryMod.ChallengeRepository
import typings.instagramDashPrivateDashApi.distRepositoriesConsentDotRepositoryMod.ConsentRepository
import typings.instagramDashPrivateDashApi.distRepositoriesCreativesDotRepositoryMod.CreativesRepository
import typings.instagramDashPrivateDashApi.distRepositoriesDirectDashThreadDotRepositoryMod.DirectThreadRepository
import typings.instagramDashPrivateDashApi.distRepositoriesDirectDotRepositoryMod.DirectRepository
import typings.instagramDashPrivateDashApi.distRepositoriesDiscoverDotRepositoryMod.DiscoverRepository
import typings.instagramDashPrivateDashApi.distRepositoriesFbsearchDotRepositoryMod.FbsearchRepository
import typings.instagramDashPrivateDashApi.distRepositoriesFriendshipDotRepositoryMod.FriendshipRepository
import typings.instagramDashPrivateDashApi.distRepositoriesHighlightsDotRepositoryMod.HighlightsRepository
import typings.instagramDashPrivateDashApi.distRepositoriesIgtvDotRepositoryMod.IgtvRepository
import typings.instagramDashPrivateDashApi.distRepositoriesLauncherDotRepositoryMod.LauncherRepository
import typings.instagramDashPrivateDashApi.distRepositoriesLinkedDashAccountDotRepositoryMod.LinkedAccountRepository
import typings.instagramDashPrivateDashApi.distRepositoriesLiveDotRepositoryMod.LiveRepository
import typings.instagramDashPrivateDashApi.distRepositoriesLocationDashSearchDotRepositoryMod.LocationSearch
import typings.instagramDashPrivateDashApi.distRepositoriesLocationDotRepositoryMod.LocationRepository
import typings.instagramDashPrivateDashApi.distRepositoriesLoomDotRepositoryMod.LoomRepository
import typings.instagramDashPrivateDashApi.distRepositoriesMediaDotRepositoryMod.MediaRepository
import typings.instagramDashPrivateDashApi.distRepositoriesMusicDotRepositoryMod.MusicRepository
import typings.instagramDashPrivateDashApi.distRepositoriesNewsDotRepositoryMod.NewsRepository
import typings.instagramDashPrivateDashApi.distRepositoriesQeDotRepositoryMod.QeRepository
import typings.instagramDashPrivateDashApi.distRepositoriesQpDotRepositoryMod.QpRepository
import typings.instagramDashPrivateDashApi.distRepositoriesRestrictDashActionDotRepositoryMod.RestrictActionRepository
import typings.instagramDashPrivateDashApi.distRepositoriesStatusDotRepositoryMod.StatusRepository
import typings.instagramDashPrivateDashApi.distRepositoriesTagDotRepositoryMod.TagRepository
import typings.instagramDashPrivateDashApi.distRepositoriesUploadDotRepositoryMod.UploadRepository
import typings.instagramDashPrivateDashApi.distRepositoriesUserDotRepositoryMod.UserRepository
import typings.instagramDashPrivateDashApi.distRepositoriesZrDotRepositoryMod.ZrRepository
import typings.instagramDashPrivateDashApi.distServicesInsightsDotServiceMod.InsightsService
import typings.instagramDashPrivateDashApi.distServicesPublishDotServiceMod.PublishService
import typings.instagramDashPrivateDashApi.distServicesSearchDotServiceMod.SearchService
import typings.instagramDashPrivateDashApi.distServicesSimulateDotServiceMod.SimulateService
import typings.instagramDashPrivateDashApi.distServicesStoryDotServiceMod.StoryService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/client", JSImport.Namespace)
@js.native
object distCoreClientMod extends js.Object {
  @js.native
  class IgApiClient () extends js.Object {
    var account: AccountRepository = js.native
    var addressBook: AddressBookRepository = js.native
    var ads: AdsRepository = js.native
    var attribution: AttributionRepository = js.native
    var challenge: ChallengeRepository = js.native
    var consent: ConsentRepository = js.native
    var creatives: CreativesRepository = js.native
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
    def destroy(): Unit = js.native
  }
  
}

