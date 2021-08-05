package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeBody extends StObject {
  
  /** A URL provided by this administrative body for information on absentee voting. */
  var absenteeVotingInfoUrl: js.UndefOr[String] = js.undefined
  
  /** A URL provided by this administrative body to give contest information to the voter. */
  var ballotInfoUrl: js.UndefOr[String] = js.undefined
  
  /** The mailing address of this administrative body. */
  var correspondenceAddress: js.UndefOr[SimpleAddressType] = js.undefined
  
  /** A URL provided by this administrative body for looking up general election information. */
  var electionInfoUrl: js.UndefOr[String] = js.undefined
  
  /** A last minute or emergency notification text provided by this administrative body. */
  var electionNoticeText: js.UndefOr[String] = js.undefined
  
  /** A URL provided by this administrative body for additional information related to the last minute or emergency notification. */
  var electionNoticeUrl: js.UndefOr[String] = js.undefined
  
  /** The election officials for this election administrative body. */
  var electionOfficials: js.UndefOr[js.Array[ElectionOfficial]] = js.undefined
  
  /** A URL provided by this administrative body for confirming that the voter is registered to vote. */
  var electionRegistrationConfirmationUrl: js.UndefOr[String] = js.undefined
  
  /** A URL provided by this administrative body for looking up how to register to vote. */
  var electionRegistrationUrl: js.UndefOr[String] = js.undefined
  
  /** A URL provided by this administrative body describing election rules to the voter. */
  var electionRulesUrl: js.UndefOr[String] = js.undefined
  
  /** A description of the hours of operation for this administrative body. */
  var hoursOfOperation: js.UndefOr[String] = js.undefined
  
  /** The name of this election administrative body. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The physical address of this administrative body. */
  var physicalAddress: js.UndefOr[SimpleAddressType] = js.undefined
  
  /** A description of the services this administrative body may provide. */
  var voter_services: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A URL provided by this administrative body for looking up where to vote. */
  var votingLocationFinderUrl: js.UndefOr[String] = js.undefined
}
object AdministrativeBody {
  
  inline def apply(): AdministrativeBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeBody]
  }
  
  extension [Self <: AdministrativeBody](x: Self) {
    
    inline def setAbsenteeVotingInfoUrl(value: String): Self = StObject.set(x, "absenteeVotingInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setAbsenteeVotingInfoUrlUndefined: Self = StObject.set(x, "absenteeVotingInfoUrl", js.undefined)
    
    inline def setBallotInfoUrl(value: String): Self = StObject.set(x, "ballotInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setBallotInfoUrlUndefined: Self = StObject.set(x, "ballotInfoUrl", js.undefined)
    
    inline def setCorrespondenceAddress(value: SimpleAddressType): Self = StObject.set(x, "correspondenceAddress", value.asInstanceOf[js.Any])
    
    inline def setCorrespondenceAddressUndefined: Self = StObject.set(x, "correspondenceAddress", js.undefined)
    
    inline def setElectionInfoUrl(value: String): Self = StObject.set(x, "electionInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setElectionInfoUrlUndefined: Self = StObject.set(x, "electionInfoUrl", js.undefined)
    
    inline def setElectionNoticeText(value: String): Self = StObject.set(x, "electionNoticeText", value.asInstanceOf[js.Any])
    
    inline def setElectionNoticeTextUndefined: Self = StObject.set(x, "electionNoticeText", js.undefined)
    
    inline def setElectionNoticeUrl(value: String): Self = StObject.set(x, "electionNoticeUrl", value.asInstanceOf[js.Any])
    
    inline def setElectionNoticeUrlUndefined: Self = StObject.set(x, "electionNoticeUrl", js.undefined)
    
    inline def setElectionOfficials(value: js.Array[ElectionOfficial]): Self = StObject.set(x, "electionOfficials", value.asInstanceOf[js.Any])
    
    inline def setElectionOfficialsUndefined: Self = StObject.set(x, "electionOfficials", js.undefined)
    
    inline def setElectionOfficialsVarargs(value: ElectionOfficial*): Self = StObject.set(x, "electionOfficials", js.Array(value :_*))
    
    inline def setElectionRegistrationConfirmationUrl(value: String): Self = StObject.set(x, "electionRegistrationConfirmationUrl", value.asInstanceOf[js.Any])
    
    inline def setElectionRegistrationConfirmationUrlUndefined: Self = StObject.set(x, "electionRegistrationConfirmationUrl", js.undefined)
    
    inline def setElectionRegistrationUrl(value: String): Self = StObject.set(x, "electionRegistrationUrl", value.asInstanceOf[js.Any])
    
    inline def setElectionRegistrationUrlUndefined: Self = StObject.set(x, "electionRegistrationUrl", js.undefined)
    
    inline def setElectionRulesUrl(value: String): Self = StObject.set(x, "electionRulesUrl", value.asInstanceOf[js.Any])
    
    inline def setElectionRulesUrlUndefined: Self = StObject.set(x, "electionRulesUrl", js.undefined)
    
    inline def setHoursOfOperation(value: String): Self = StObject.set(x, "hoursOfOperation", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationUndefined: Self = StObject.set(x, "hoursOfOperation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhysicalAddress(value: SimpleAddressType): Self = StObject.set(x, "physicalAddress", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddressUndefined: Self = StObject.set(x, "physicalAddress", js.undefined)
    
    inline def setVoter_services(value: js.Array[String]): Self = StObject.set(x, "voter_services", value.asInstanceOf[js.Any])
    
    inline def setVoter_servicesUndefined: Self = StObject.set(x, "voter_services", js.undefined)
    
    inline def setVoter_servicesVarargs(value: String*): Self = StObject.set(x, "voter_services", js.Array(value :_*))
    
    inline def setVotingLocationFinderUrl(value: String): Self = StObject.set(x, "votingLocationFinderUrl", value.asInstanceOf[js.Any])
    
    inline def setVotingLocationFinderUrlUndefined: Self = StObject.set(x, "votingLocationFinderUrl", js.undefined)
  }
}
