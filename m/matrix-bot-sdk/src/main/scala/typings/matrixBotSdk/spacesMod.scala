package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.matrixClientMod.MatrixClient
import typings.matrixBotSdk.spaceChildEventMod.SpaceChildEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacesMod {
  
  @JSImport("matrix-bot-sdk/lib/models/Spaces", "Space")
  @js.native
  open class Space protected () extends StObject {
    def this(roomId: String, client: MatrixClient) = this()
    
    /**
      * Adds a child room to the space. Must be joined to both the room and the space.
      * @param {string} roomId The room ID to add.
      * @param {SpaceChildEntityOptions} childOpts Additional options for the child space.
      * @returns {Promise<void>} Resolves when complete.
      */
    def addChildRoom(roomId: String): js.Promise[Unit] = js.native
    def addChildRoom(roomId: String, childOpts: SpaceChildEntityOptions): js.Promise[Unit] = js.native
    
    /**
      * Adds a child space to the space. Must be joined to both spaces.
      * @param {Space} space The space to add.
      * @param {SpaceChildEntityOptions} childOpts Related options for the child's representation.
      * @returns {Promise<Space>} Resolves when complete.
      */
    def addChildSpace(space: Space): js.Promise[Unit] = js.native
    def addChildSpace(space: Space, childOpts: SpaceChildEntityOptions): js.Promise[Unit] = js.native
    
    val client: MatrixClient = js.native
    
    /**
      * Creates a new child space under this space.
      * @param {SpaceCreateOptions} opts The options for the new space.
      * @returns {Promise<Space>} Resolves to the created space.
      */
    def createChildSpace(opts: NewChildOpts): js.Promise[Space] = js.native
    
    /**
      * Gets all the child rooms on the space. These may be spaces or other rooms.
      * @returns {Promise<SpaceEntityMap>} Resolves to a map of children for this space.
      */
    def getChildEntities(): js.Promise[SpaceEntityMap] = js.native
    
    /**
      * Invite a user to the current space.
      * @param {string} userId The user ID to invite.
      * @returns {Promise<void>} Resolves when completed.
      */
    def inviteUser(userId: String): js.Promise[Any] = js.native
    
    /**
      * Removes a child room from the space. Must be joined to the current space (not needed for child room).
      * @param {string} roomId The room ID to remove.
      * @returns {Promise<void>} Resolves when complete.
      */
    def removeChildRoom(roomId: String): js.Promise[Unit] = js.native
    
    /**
      * Removes a child space from the space. Must be joined to the current space (not needed for child space).
      * @param {Space} space The space to remove.
      * @returns {Promise<void>} Resolves when complete.
      */
    def removeChildSpace(space: Space): js.Promise[Unit] = js.native
    
    val roomId: String = js.native
  }
  
  trait NewChildOpts
    extends StObject
       with SpaceCreateOptions
       with SpaceChildEntityOptions
  object NewChildOpts {
    
    inline def apply(isPublic: Boolean, name: String): NewChildOpts = {
      val __obj = js.Dynamic.literal(isPublic = isPublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewChildOpts]
    }
  }
  
  trait SpaceChildEntityOptions extends StObject {
    
    /**
      * A short string to differentiate the rendering order of entities.
      * @see validateSpaceOrderString
      */
    var order: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the entity is intended to be a suggested entity.
      */
    var suggested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Servers to try and join through. When not provided, the SDK will try to
      * determine a set.
      */
    var via: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SpaceChildEntityOptions {
    
    inline def apply(): SpaceChildEntityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceChildEntityOptions]
    }
    
    extension [Self <: SpaceChildEntityOptions](x: Self) {
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSuggested(value: Boolean): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      inline def setSuggestedUndefined: Self = StObject.set(x, "suggested", js.undefined)
      
      inline def setVia(value: js.Array[String]): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
      
      inline def setViaVarargs(value: String*): Self = StObject.set(x, "via", js.Array(value*))
    }
  }
  
  trait SpaceCreateOptions extends StObject {
    
    /**
      * An MXC URI for the space's avatar.
      */
    var avatarUrl: js.UndefOr[String] = js.undefined
    
    /**
      * User IDs to invite to the space upon creation.
      */
    var invites: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether or not the space should be publicly joinable or not.
      */
    var isPublic: Boolean
    
    /**
      * Optional localpart for the alias of the space.
      */
    var localpart: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the space.
      */
    var name: String
    
    /**
      * The topic/description for the space.
      */
    var topic: js.UndefOr[String] = js.undefined
  }
  object SpaceCreateOptions {
    
    inline def apply(isPublic: Boolean, name: String): SpaceCreateOptions = {
      val __obj = js.Dynamic.literal(isPublic = isPublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceCreateOptions]
    }
    
    extension [Self <: SpaceCreateOptions](x: Self) {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
      
      inline def setInvites(value: js.Array[String]): Self = StObject.set(x, "invites", value.asInstanceOf[js.Any])
      
      inline def setInvitesUndefined: Self = StObject.set(x, "invites", js.undefined)
      
      inline def setInvitesVarargs(value: String*): Self = StObject.set(x, "invites", js.Array(value*))
      
      inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
      
      inline def setLocalpart(value: String): Self = StObject.set(x, "localpart", value.asInstanceOf[js.Any])
      
      inline def setLocalpartUndefined: Self = StObject.set(x, "localpart", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  type SpaceEntityMap = StringDictionary[SpaceChildEvent]
}
