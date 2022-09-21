package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contest extends StObject {
  
  /** A number specifying the position of this contest on the voter's ballot. */
  var ballotPlacement: js.UndefOr[String] = js.undefined
  
  /** The official title on the ballot for this contest, only where available. */
  var ballotTitle: js.UndefOr[String] = js.undefined
  
  /** The candidate choices for this contest. */
  var candidates: js.UndefOr[js.Array[Candidate]] = js.undefined
  
  /** Information about the electoral district that this contest is in. */
  var district: js.UndefOr[ElectoralDistrict] = js.undefined
  
  /** A description of any additional eligibility requirements for voting in this contest. */
  var electorateSpecifications: js.UndefOr[String] = js.undefined
  
  /**
    * The levels of government of the office for this contest. There may be more than one in cases where a jurisdiction effectively acts at two different levels of government; for
    * example, the mayor of the District of Columbia acts at "locality" level, but also effectively at both "administrative-area-2" and "administrative-area-1".
    */
  var level: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The number of candidates that will be elected to office in this contest. */
  var numberElected: js.UndefOr[String] = js.undefined
  
  /** The number of candidates that a voter may vote for in this contest. */
  var numberVotingFor: js.UndefOr[String] = js.undefined
  
  /** The name of the office for this contest. */
  var office: js.UndefOr[String] = js.undefined
  
  /** If this is a partisan election, the name of the party/parties it is for. */
  var primaryParties: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [DEPRECATED] If this is a partisan election, the name of the party it is for. This field as deprecated in favor of the array "primaryParties", as contests may contain more than one
    * party.
    */
  var primaryParty: js.UndefOr[String] = js.undefined
  
  /**
    * The set of ballot responses for the referendum. A ballot response represents a line on the ballot. Common examples might include "yes" or "no" for referenda. This field is only
    * populated for contests of type 'Referendum'.
    */
  var referendumBallotResponses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Specifies a short summary of the referendum that is typically on the ballot below the title but above the text. This field is only populated for contests of type 'Referendum'. */
  var referendumBrief: js.UndefOr[String] = js.undefined
  
  /** A statement in opposition to the referendum. It does not necessarily appear on the ballot. This field is only populated for contests of type 'Referendum'. */
  var referendumConStatement: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies what effect abstaining (not voting) on the proposition will have (i.e. whether abstaining is considered a vote against it). This field is only populated for contests of
    * type 'Referendum'.
    */
  var referendumEffectOfAbstain: js.UndefOr[String] = js.undefined
  
  /** The threshold of votes that the referendum needs in order to pass, e.g. "two-thirds". This field is only populated for contests of type 'Referendum'. */
  var referendumPassageThreshold: js.UndefOr[String] = js.undefined
  
  /** A statement in favor of the referendum. It does not necessarily appear on the ballot. This field is only populated for contests of type 'Referendum'. */
  var referendumProStatement: js.UndefOr[String] = js.undefined
  
  /** A brief description of the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumSubtitle: js.UndefOr[String] = js.undefined
  
  /** The full text of the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumText: js.UndefOr[String] = js.undefined
  
  /** The title of the referendum (e.g. 'Proposition 42'). This field is only populated for contests of type 'Referendum'. */
  var referendumTitle: js.UndefOr[String] = js.undefined
  
  /** A link to the referendum. This field is only populated for contests of type 'Referendum'. */
  var referendumUrl: js.UndefOr[String] = js.undefined
  
  /** The roles which this office fulfills. */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of sources for this contest. If multiple sources are listed, the data has been aggregated from those sources. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  
  /** "Yes" or "No" depending on whether this a contest being held outside the normal election cycle. */
  var special: js.UndefOr[String] = js.undefined
  
  /**
    * The type of contest. Usually this will be 'General', 'Primary', or 'Run-off' for contests with candidates. For referenda this will be 'Referendum'. For Retention contests this will
    * typically be 'Retention'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Contest {
  
  inline def apply(): Contest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contest]
  }
  
  extension [Self <: Contest](x: Self) {
    
    inline def setBallotPlacement(value: String): Self = StObject.set(x, "ballotPlacement", value.asInstanceOf[js.Any])
    
    inline def setBallotPlacementUndefined: Self = StObject.set(x, "ballotPlacement", js.undefined)
    
    inline def setBallotTitle(value: String): Self = StObject.set(x, "ballotTitle", value.asInstanceOf[js.Any])
    
    inline def setBallotTitleUndefined: Self = StObject.set(x, "ballotTitle", js.undefined)
    
    inline def setCandidates(value: js.Array[Candidate]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: Candidate*): Self = StObject.set(x, "candidates", js.Array(value*))
    
    inline def setDistrict(value: ElectoralDistrict): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
    
    inline def setElectorateSpecifications(value: String): Self = StObject.set(x, "electorateSpecifications", value.asInstanceOf[js.Any])
    
    inline def setElectorateSpecificationsUndefined: Self = StObject.set(x, "electorateSpecifications", js.undefined)
    
    inline def setLevel(value: js.Array[String]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelVarargs(value: String*): Self = StObject.set(x, "level", js.Array(value*))
    
    inline def setNumberElected(value: String): Self = StObject.set(x, "numberElected", value.asInstanceOf[js.Any])
    
    inline def setNumberElectedUndefined: Self = StObject.set(x, "numberElected", js.undefined)
    
    inline def setNumberVotingFor(value: String): Self = StObject.set(x, "numberVotingFor", value.asInstanceOf[js.Any])
    
    inline def setNumberVotingForUndefined: Self = StObject.set(x, "numberVotingFor", js.undefined)
    
    inline def setOffice(value: String): Self = StObject.set(x, "office", value.asInstanceOf[js.Any])
    
    inline def setOfficeUndefined: Self = StObject.set(x, "office", js.undefined)
    
    inline def setPrimaryParties(value: js.Array[String]): Self = StObject.set(x, "primaryParties", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPartiesUndefined: Self = StObject.set(x, "primaryParties", js.undefined)
    
    inline def setPrimaryPartiesVarargs(value: String*): Self = StObject.set(x, "primaryParties", js.Array(value*))
    
    inline def setPrimaryParty(value: String): Self = StObject.set(x, "primaryParty", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPartyUndefined: Self = StObject.set(x, "primaryParty", js.undefined)
    
    inline def setReferendumBallotResponses(value: js.Array[String]): Self = StObject.set(x, "referendumBallotResponses", value.asInstanceOf[js.Any])
    
    inline def setReferendumBallotResponsesUndefined: Self = StObject.set(x, "referendumBallotResponses", js.undefined)
    
    inline def setReferendumBallotResponsesVarargs(value: String*): Self = StObject.set(x, "referendumBallotResponses", js.Array(value*))
    
    inline def setReferendumBrief(value: String): Self = StObject.set(x, "referendumBrief", value.asInstanceOf[js.Any])
    
    inline def setReferendumBriefUndefined: Self = StObject.set(x, "referendumBrief", js.undefined)
    
    inline def setReferendumConStatement(value: String): Self = StObject.set(x, "referendumConStatement", value.asInstanceOf[js.Any])
    
    inline def setReferendumConStatementUndefined: Self = StObject.set(x, "referendumConStatement", js.undefined)
    
    inline def setReferendumEffectOfAbstain(value: String): Self = StObject.set(x, "referendumEffectOfAbstain", value.asInstanceOf[js.Any])
    
    inline def setReferendumEffectOfAbstainUndefined: Self = StObject.set(x, "referendumEffectOfAbstain", js.undefined)
    
    inline def setReferendumPassageThreshold(value: String): Self = StObject.set(x, "referendumPassageThreshold", value.asInstanceOf[js.Any])
    
    inline def setReferendumPassageThresholdUndefined: Self = StObject.set(x, "referendumPassageThreshold", js.undefined)
    
    inline def setReferendumProStatement(value: String): Self = StObject.set(x, "referendumProStatement", value.asInstanceOf[js.Any])
    
    inline def setReferendumProStatementUndefined: Self = StObject.set(x, "referendumProStatement", js.undefined)
    
    inline def setReferendumSubtitle(value: String): Self = StObject.set(x, "referendumSubtitle", value.asInstanceOf[js.Any])
    
    inline def setReferendumSubtitleUndefined: Self = StObject.set(x, "referendumSubtitle", js.undefined)
    
    inline def setReferendumText(value: String): Self = StObject.set(x, "referendumText", value.asInstanceOf[js.Any])
    
    inline def setReferendumTextUndefined: Self = StObject.set(x, "referendumText", js.undefined)
    
    inline def setReferendumTitle(value: String): Self = StObject.set(x, "referendumTitle", value.asInstanceOf[js.Any])
    
    inline def setReferendumTitleUndefined: Self = StObject.set(x, "referendumTitle", js.undefined)
    
    inline def setReferendumUrl(value: String): Self = StObject.set(x, "referendumUrl", value.asInstanceOf[js.Any])
    
    inline def setReferendumUrlUndefined: Self = StObject.set(x, "referendumUrl", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSpecial(value: String): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    inline def setSpecialUndefined: Self = StObject.set(x, "special", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
