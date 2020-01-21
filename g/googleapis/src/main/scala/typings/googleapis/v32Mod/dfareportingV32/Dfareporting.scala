package typings.googleapis.v32Mod.dfareportingV32

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DCM/DFA Reporting And Trafficking API
  *
  * Manages your DoubleClick Campaign Manager ad campaigns and reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const dfareporting = google.dfareporting('v3.2');
  *
  * @namespace dfareporting
  * @type {Function}
  * @version v3.2
  * @variation v3.2
  * @param {object=} options Options for Dfareporting
  */
@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Dfareporting")
@js.native
class Dfareporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var accountActiveAdSummaries: ResourceAccountactiveadsummaries = js.native
  var accountPermissionGroups: ResourceAccountpermissiongroups = js.native
  var accountPermissions: ResourceAccountpermissions = js.native
  var accountUserProfiles: ResourceAccountuserprofiles = js.native
  var accounts: ResourceAccounts = js.native
  var ads: ResourceAds = js.native
  var advertiserGroups: ResourceAdvertisergroups = js.native
  var advertiserLandingPages: ResourceAdvertiserlandingpages = js.native
  var advertisers: ResourceAdvertisers = js.native
  var browsers: ResourceBrowsers = js.native
  var campaignCreativeAssociations: ResourceCampaigncreativeassociations = js.native
  var campaigns: ResourceCampaigns = js.native
  var changeLogs: ResourceChangelogs = js.native
  var cities: ResourceCities = js.native
  var connectionTypes: ResourceConnectiontypes = js.native
  var contentCategories: ResourceContentcategories = js.native
  var context: APIRequestContext = js.native
  var conversions: ResourceConversions = js.native
  var countries: ResourceCountries = js.native
  var creativeAssets: ResourceCreativeassets = js.native
  var creativeFieldValues: ResourceCreativefieldvalues = js.native
  var creativeFields: ResourceCreativefields = js.native
  var creativeGroups: ResourceCreativegroups = js.native
  var creatives: ResourceCreatives = js.native
  var dimensionValues: ResourceDimensionvalues = js.native
  var directorySiteContacts: ResourceDirectorysitecontacts = js.native
  var directorySites: ResourceDirectorysites = js.native
  var dynamicTargetingKeys: ResourceDynamictargetingkeys = js.native
  var eventTags: ResourceEventtags = js.native
  var files: ResourceFiles = js.native
  var floodlightActivities: ResourceFloodlightactivities = js.native
  var floodlightActivityGroups: ResourceFloodlightactivitygroups = js.native
  var floodlightConfigurations: ResourceFloodlightconfigurations = js.native
  var inventoryItems: ResourceInventoryitems = js.native
  var languages: ResourceLanguages = js.native
  var metros: ResourceMetros = js.native
  var mobileApps: ResourceMobileapps = js.native
  var mobileCarriers: ResourceMobilecarriers = js.native
  var operatingSystemVersions: ResourceOperatingsystemversions = js.native
  var operatingSystems: ResourceOperatingsystems = js.native
  var orderDocuments: ResourceOrderdocuments = js.native
  var orders: ResourceOrders = js.native
  var placementGroups: ResourcePlacementgroups = js.native
  var placementStrategies: ResourcePlacementstrategies = js.native
  var placements: ResourcePlacements = js.native
  var platformTypes: ResourcePlatformtypes = js.native
  var postalCodes: ResourcePostalcodes = js.native
  var projects: ResourceProjects = js.native
  var regions: ResourceRegions = js.native
  var remarketingListShares: ResourceRemarketinglistshares = js.native
  var remarketingLists: ResourceRemarketinglists = js.native
  var reports: ResourceReports = js.native
  var sites: ResourceSites = js.native
  var sizes: ResourceSizes = js.native
  var subaccounts: ResourceSubaccounts = js.native
  var targetableRemarketingLists: ResourceTargetableremarketinglists = js.native
  var targetingTemplates: ResourceTargetingtemplates = js.native
  var userProfiles: ResourceUserprofiles = js.native
  var userRolePermissionGroups: ResourceUserrolepermissiongroups = js.native
  var userRolePermissions: ResourceUserrolepermissions = js.native
  var userRoles: ResourceUserroles = js.native
  var videoFormats: ResourceVideoformats = js.native
}

