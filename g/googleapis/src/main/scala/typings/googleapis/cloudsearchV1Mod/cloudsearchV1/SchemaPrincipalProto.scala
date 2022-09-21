package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrincipalProto extends StObject {
  
  /**
    * scope = ALL_AUTHENTICATED_USERS
    */
  var allAuthenticatedUsers: js.UndefOr[SchemaAllAuthenticatedUsersProto] = js.undefined
  
  /**
    * scope = CAP_TOKEN_HOLDER
    */
  var capTokenHolder: js.UndefOr[SchemaCapTokenHolderProto] = js.undefined
  
  /**
    * scope = CHAT
    */
  var chat: js.UndefOr[SchemaChatProto] = js.undefined
  
  /**
    * scope = CIRCLE
    */
  var circle: js.UndefOr[SchemaCircleProto] = js.undefined
  
  /**
    * scope = CLOUD_PRINCIPAL
    */
  var cloudPrincipal: js.UndefOr[SchemaCloudPrincipalProto] = js.undefined
  
  /**
    * scope = CONTACT_GROUP
    */
  var contactGroup: js.UndefOr[SchemaContactGroupProto] = js.undefined
  
  /**
    * scope = EMAIL_OWNER
    */
  var emailOwner: js.UndefOr[SchemaEmailOwnerProto] = js.undefined
  
  /**
    * scope = EVENT
    */
  var event: js.UndefOr[SchemaEventProto] = js.undefined
  
  /**
    * scope = GAIA_GROUP
    */
  var gaiaGroup: js.UndefOr[SchemaGaiaGroupProto] = js.undefined
  
  /**
    * scope = GAIA_USER
    */
  var gaiaUser: js.UndefOr[SchemaGaiaUserProto] = js.undefined
  
  /**
    * scope = HOST
    */
  var host: js.UndefOr[SchemaHostProto] = js.undefined
  
  /**
    * scope = LDAP_GROUP
    */
  var ldapGroup: js.UndefOr[SchemaLdapGroupProto] = js.undefined
  
  /**
    * scope = LDAP_USER
    */
  var ldapUser: js.UndefOr[SchemaLdapUserProto] = js.undefined
  
  /**
    * scope = MDB_GROUP
    */
  var mdbGroup: js.UndefOr[SchemaMdbGroupProto] = js.undefined
  
  /**
    * scope = MDB_USER
    */
  var mdbUser: js.UndefOr[SchemaMdbUserProto] = js.undefined
  
  /**
    * scope = OAUTH_CONSUMER;
    */
  var oauthConsumer: js.UndefOr[SchemaOAuthConsumerProto] = js.undefined
  
  /**
    * scope = POSTINI_USER
    */
  var postiniUser: js.UndefOr[SchemaPostiniUserProto] = js.undefined
  
  /**
    * scope = RBAC_ROLE
    */
  var rbacRole: js.UndefOr[SchemaRbacRoleProto] = js.undefined
  
  /**
    * scope = RBAC_SUBJECT
    */
  var rbacSubject: js.UndefOr[SchemaRbacSubjectProto] = js.undefined
  
  /**
    * scope = RESOURCE_ROLE
    */
  var resourceRole: js.UndefOr[SchemaResourceRoleProto] = js.undefined
  
  /**
    * This is only optional because required enums cannot be extended. Currently required.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * scope = SIGNING_KEY_POSSESSOR
    */
  var signingKeyPossessor: js.UndefOr[SchemaSigningKeyPossessorProto] = js.undefined
  
  /**
    * scope = SIMPLE_SECRET_HOLDER
    */
  var simpleSecretHolder: js.UndefOr[SchemaSimpleSecretHolderProto] = js.undefined
  
  /**
    * scope = SOCIAL_GRAPH_NODE
    */
  var socialGraphNode: js.UndefOr[SchemaSocialGraphNodeProto] = js.undefined
  
  /**
    * scope = SQUARE
    */
  var square: js.UndefOr[SchemaSquareProto] = js.undefined
  
  /**
    * scope = YOUTUBE_USER
    */
  var youtubeUser: js.UndefOr[SchemaYoutubeUserProto] = js.undefined
  
  /**
    * scope = ZWIEBACK_SESSION
    */
  var zwiebackSession: js.UndefOr[SchemaZwiebackSessionProto] = js.undefined
}
object SchemaPrincipalProto {
  
  inline def apply(): SchemaPrincipalProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrincipalProto]
  }
  
  extension [Self <: SchemaPrincipalProto](x: Self) {
    
    inline def setAllAuthenticatedUsers(value: SchemaAllAuthenticatedUsersProto): Self = StObject.set(x, "allAuthenticatedUsers", value.asInstanceOf[js.Any])
    
    inline def setAllAuthenticatedUsersUndefined: Self = StObject.set(x, "allAuthenticatedUsers", js.undefined)
    
    inline def setCapTokenHolder(value: SchemaCapTokenHolderProto): Self = StObject.set(x, "capTokenHolder", value.asInstanceOf[js.Any])
    
    inline def setCapTokenHolderUndefined: Self = StObject.set(x, "capTokenHolder", js.undefined)
    
    inline def setChat(value: SchemaChatProto): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
    
    inline def setCircle(value: SchemaCircleProto): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setCloudPrincipal(value: SchemaCloudPrincipalProto): Self = StObject.set(x, "cloudPrincipal", value.asInstanceOf[js.Any])
    
    inline def setCloudPrincipalUndefined: Self = StObject.set(x, "cloudPrincipal", js.undefined)
    
    inline def setContactGroup(value: SchemaContactGroupProto): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    inline def setEmailOwner(value: SchemaEmailOwnerProto): Self = StObject.set(x, "emailOwner", value.asInstanceOf[js.Any])
    
    inline def setEmailOwnerUndefined: Self = StObject.set(x, "emailOwner", js.undefined)
    
    inline def setEvent(value: SchemaEventProto): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setGaiaGroup(value: SchemaGaiaGroupProto): Self = StObject.set(x, "gaiaGroup", value.asInstanceOf[js.Any])
    
    inline def setGaiaGroupUndefined: Self = StObject.set(x, "gaiaGroup", js.undefined)
    
    inline def setGaiaUser(value: SchemaGaiaUserProto): Self = StObject.set(x, "gaiaUser", value.asInstanceOf[js.Any])
    
    inline def setGaiaUserUndefined: Self = StObject.set(x, "gaiaUser", js.undefined)
    
    inline def setHost(value: SchemaHostProto): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLdapGroup(value: SchemaLdapGroupProto): Self = StObject.set(x, "ldapGroup", value.asInstanceOf[js.Any])
    
    inline def setLdapGroupUndefined: Self = StObject.set(x, "ldapGroup", js.undefined)
    
    inline def setLdapUser(value: SchemaLdapUserProto): Self = StObject.set(x, "ldapUser", value.asInstanceOf[js.Any])
    
    inline def setLdapUserUndefined: Self = StObject.set(x, "ldapUser", js.undefined)
    
    inline def setMdbGroup(value: SchemaMdbGroupProto): Self = StObject.set(x, "mdbGroup", value.asInstanceOf[js.Any])
    
    inline def setMdbGroupUndefined: Self = StObject.set(x, "mdbGroup", js.undefined)
    
    inline def setMdbUser(value: SchemaMdbUserProto): Self = StObject.set(x, "mdbUser", value.asInstanceOf[js.Any])
    
    inline def setMdbUserUndefined: Self = StObject.set(x, "mdbUser", js.undefined)
    
    inline def setOauthConsumer(value: SchemaOAuthConsumerProto): Self = StObject.set(x, "oauthConsumer", value.asInstanceOf[js.Any])
    
    inline def setOauthConsumerUndefined: Self = StObject.set(x, "oauthConsumer", js.undefined)
    
    inline def setPostiniUser(value: SchemaPostiniUserProto): Self = StObject.set(x, "postiniUser", value.asInstanceOf[js.Any])
    
    inline def setPostiniUserUndefined: Self = StObject.set(x, "postiniUser", js.undefined)
    
    inline def setRbacRole(value: SchemaRbacRoleProto): Self = StObject.set(x, "rbacRole", value.asInstanceOf[js.Any])
    
    inline def setRbacRoleUndefined: Self = StObject.set(x, "rbacRole", js.undefined)
    
    inline def setRbacSubject(value: SchemaRbacSubjectProto): Self = StObject.set(x, "rbacSubject", value.asInstanceOf[js.Any])
    
    inline def setRbacSubjectUndefined: Self = StObject.set(x, "rbacSubject", js.undefined)
    
    inline def setResourceRole(value: SchemaResourceRoleProto): Self = StObject.set(x, "resourceRole", value.asInstanceOf[js.Any])
    
    inline def setResourceRoleUndefined: Self = StObject.set(x, "resourceRole", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSigningKeyPossessor(value: SchemaSigningKeyPossessorProto): Self = StObject.set(x, "signingKeyPossessor", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyPossessorUndefined: Self = StObject.set(x, "signingKeyPossessor", js.undefined)
    
    inline def setSimpleSecretHolder(value: SchemaSimpleSecretHolderProto): Self = StObject.set(x, "simpleSecretHolder", value.asInstanceOf[js.Any])
    
    inline def setSimpleSecretHolderUndefined: Self = StObject.set(x, "simpleSecretHolder", js.undefined)
    
    inline def setSocialGraphNode(value: SchemaSocialGraphNodeProto): Self = StObject.set(x, "socialGraphNode", value.asInstanceOf[js.Any])
    
    inline def setSocialGraphNodeUndefined: Self = StObject.set(x, "socialGraphNode", js.undefined)
    
    inline def setSquare(value: SchemaSquareProto): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setYoutubeUser(value: SchemaYoutubeUserProto): Self = StObject.set(x, "youtubeUser", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUserUndefined: Self = StObject.set(x, "youtubeUser", js.undefined)
    
    inline def setZwiebackSession(value: SchemaZwiebackSessionProto): Self = StObject.set(x, "zwiebackSession", value.asInstanceOf[js.Any])
    
    inline def setZwiebackSessionUndefined: Self = StObject.set(x, "zwiebackSession", js.undefined)
  }
}
