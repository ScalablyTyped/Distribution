package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalProto extends StObject {
  
  /** scope = ALL_AUTHENTICATED_USERS */
  var allAuthenticatedUsers: js.UndefOr[Any] = js.undefined
  
  /** scope = CAP_TOKEN_HOLDER */
  var capTokenHolder: js.UndefOr[CapTokenHolderProto] = js.undefined
  
  /** scope = CHAT */
  var chat: js.UndefOr[ChatProto] = js.undefined
  
  /** scope = CIRCLE */
  var circle: js.UndefOr[CircleProto] = js.undefined
  
  /** scope = CLOUD_PRINCIPAL */
  var cloudPrincipal: js.UndefOr[CloudPrincipalProto] = js.undefined
  
  /** scope = CONTACT_GROUP */
  var contactGroup: js.UndefOr[ContactGroupProto] = js.undefined
  
  /** scope = EMAIL_OWNER */
  var emailOwner: js.UndefOr[EmailOwnerProto] = js.undefined
  
  /** scope = EVENT */
  var event: js.UndefOr[EventProto] = js.undefined
  
  /** scope = GAIA_GROUP */
  var gaiaGroup: js.UndefOr[GaiaGroupProto] = js.undefined
  
  /** scope = GAIA_USER */
  var gaiaUser: js.UndefOr[GaiaUserProto] = js.undefined
  
  /** scope = HOST */
  var host: js.UndefOr[HostProto] = js.undefined
  
  /** scope = LDAP_GROUP */
  var ldapGroup: js.UndefOr[LdapGroupProto] = js.undefined
  
  /** scope = LDAP_USER */
  var ldapUser: js.UndefOr[LdapUserProto] = js.undefined
  
  /** scope = MDB_GROUP */
  var mdbGroup: js.UndefOr[MdbGroupProto] = js.undefined
  
  /** scope = MDB_USER */
  var mdbUser: js.UndefOr[MdbUserProto] = js.undefined
  
  /** scope = OAUTH_CONSUMER; */
  var oauthConsumer: js.UndefOr[OAuthConsumerProto] = js.undefined
  
  /** scope = POSTINI_USER */
  var postiniUser: js.UndefOr[PostiniUserProto] = js.undefined
  
  /** scope = RBAC_ROLE */
  var rbacRole: js.UndefOr[RbacRoleProto] = js.undefined
  
  /** scope = RBAC_SUBJECT */
  var rbacSubject: js.UndefOr[RbacSubjectProto] = js.undefined
  
  /** scope = RESOURCE_ROLE */
  var resourceRole: js.UndefOr[ResourceRoleProto] = js.undefined
  
  /** This is only optional because required enums cannot be extended. Currently required. */
  var scope: js.UndefOr[String] = js.undefined
  
  /** scope = SIGNING_KEY_POSSESSOR */
  var signingKeyPossessor: js.UndefOr[SigningKeyPossessorProto] = js.undefined
  
  /** scope = SIMPLE_SECRET_HOLDER */
  var simpleSecretHolder: js.UndefOr[SimpleSecretHolderProto] = js.undefined
  
  /** scope = SOCIAL_GRAPH_NODE */
  var socialGraphNode: js.UndefOr[SocialGraphNodeProto] = js.undefined
  
  /** scope = SQUARE */
  var square: js.UndefOr[SquareProto] = js.undefined
  
  /** scope = YOUTUBE_USER */
  var youtubeUser: js.UndefOr[YoutubeUserProto] = js.undefined
  
  /** scope = ZWIEBACK_SESSION */
  var zwiebackSession: js.UndefOr[ZwiebackSessionProto] = js.undefined
}
object PrincipalProto {
  
  inline def apply(): PrincipalProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalProto]
  }
  
  extension [Self <: PrincipalProto](x: Self) {
    
    inline def setAllAuthenticatedUsers(value: Any): Self = StObject.set(x, "allAuthenticatedUsers", value.asInstanceOf[js.Any])
    
    inline def setAllAuthenticatedUsersUndefined: Self = StObject.set(x, "allAuthenticatedUsers", js.undefined)
    
    inline def setCapTokenHolder(value: CapTokenHolderProto): Self = StObject.set(x, "capTokenHolder", value.asInstanceOf[js.Any])
    
    inline def setCapTokenHolderUndefined: Self = StObject.set(x, "capTokenHolder", js.undefined)
    
    inline def setChat(value: ChatProto): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
    
    inline def setCircle(value: CircleProto): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setCloudPrincipal(value: CloudPrincipalProto): Self = StObject.set(x, "cloudPrincipal", value.asInstanceOf[js.Any])
    
    inline def setCloudPrincipalUndefined: Self = StObject.set(x, "cloudPrincipal", js.undefined)
    
    inline def setContactGroup(value: ContactGroupProto): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setEmailOwner(value: EmailOwnerProto): Self = StObject.set(x, "emailOwner", value.asInstanceOf[js.Any])
    
    inline def setEmailOwnerUndefined: Self = StObject.set(x, "emailOwner", js.undefined)
    
    inline def setEvent(value: EventProto): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setGaiaGroup(value: GaiaGroupProto): Self = StObject.set(x, "gaiaGroup", value.asInstanceOf[js.Any])
    
    inline def setGaiaGroupUndefined: Self = StObject.set(x, "gaiaGroup", js.undefined)
    
    inline def setGaiaUser(value: GaiaUserProto): Self = StObject.set(x, "gaiaUser", value.asInstanceOf[js.Any])
    
    inline def setGaiaUserUndefined: Self = StObject.set(x, "gaiaUser", js.undefined)
    
    inline def setHost(value: HostProto): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLdapGroup(value: LdapGroupProto): Self = StObject.set(x, "ldapGroup", value.asInstanceOf[js.Any])
    
    inline def setLdapGroupUndefined: Self = StObject.set(x, "ldapGroup", js.undefined)
    
    inline def setLdapUser(value: LdapUserProto): Self = StObject.set(x, "ldapUser", value.asInstanceOf[js.Any])
    
    inline def setLdapUserUndefined: Self = StObject.set(x, "ldapUser", js.undefined)
    
    inline def setMdbGroup(value: MdbGroupProto): Self = StObject.set(x, "mdbGroup", value.asInstanceOf[js.Any])
    
    inline def setMdbGroupUndefined: Self = StObject.set(x, "mdbGroup", js.undefined)
    
    inline def setMdbUser(value: MdbUserProto): Self = StObject.set(x, "mdbUser", value.asInstanceOf[js.Any])
    
    inline def setMdbUserUndefined: Self = StObject.set(x, "mdbUser", js.undefined)
    
    inline def setOauthConsumer(value: OAuthConsumerProto): Self = StObject.set(x, "oauthConsumer", value.asInstanceOf[js.Any])
    
    inline def setOauthConsumerUndefined: Self = StObject.set(x, "oauthConsumer", js.undefined)
    
    inline def setPostiniUser(value: PostiniUserProto): Self = StObject.set(x, "postiniUser", value.asInstanceOf[js.Any])
    
    inline def setPostiniUserUndefined: Self = StObject.set(x, "postiniUser", js.undefined)
    
    inline def setRbacRole(value: RbacRoleProto): Self = StObject.set(x, "rbacRole", value.asInstanceOf[js.Any])
    
    inline def setRbacRoleUndefined: Self = StObject.set(x, "rbacRole", js.undefined)
    
    inline def setRbacSubject(value: RbacSubjectProto): Self = StObject.set(x, "rbacSubject", value.asInstanceOf[js.Any])
    
    inline def setRbacSubjectUndefined: Self = StObject.set(x, "rbacSubject", js.undefined)
    
    inline def setResourceRole(value: ResourceRoleProto): Self = StObject.set(x, "resourceRole", value.asInstanceOf[js.Any])
    
    inline def setResourceRoleUndefined: Self = StObject.set(x, "resourceRole", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSigningKeyPossessor(value: SigningKeyPossessorProto): Self = StObject.set(x, "signingKeyPossessor", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyPossessorUndefined: Self = StObject.set(x, "signingKeyPossessor", js.undefined)
    
    inline def setSimpleSecretHolder(value: SimpleSecretHolderProto): Self = StObject.set(x, "simpleSecretHolder", value.asInstanceOf[js.Any])
    
    inline def setSimpleSecretHolderUndefined: Self = StObject.set(x, "simpleSecretHolder", js.undefined)
    
    inline def setSocialGraphNode(value: SocialGraphNodeProto): Self = StObject.set(x, "socialGraphNode", value.asInstanceOf[js.Any])
    
    inline def setSocialGraphNodeUndefined: Self = StObject.set(x, "socialGraphNode", js.undefined)
    
    inline def setSquare(value: SquareProto): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setYoutubeUser(value: YoutubeUserProto): Self = StObject.set(x, "youtubeUser", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUserUndefined: Self = StObject.set(x, "youtubeUser", js.undefined)
    
    inline def setZwiebackSession(value: ZwiebackSessionProto): Self = StObject.set(x, "zwiebackSession", value.asInstanceOf[js.Any])
    
    inline def setZwiebackSessionUndefined: Self = StObject.set(x, "zwiebackSession", js.undefined)
  }
}
