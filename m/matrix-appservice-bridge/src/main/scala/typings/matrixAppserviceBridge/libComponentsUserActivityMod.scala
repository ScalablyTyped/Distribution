package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.anon.AllUsers
import typings.matrixAppserviceBridge.matrixAppserviceBridgeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUserActivityMod {
  
  trait UserActivitySet extends StObject {
    
    var users: StringDictionary[UserActivity]
  }
  object UserActivitySet {
    
    inline def apply(users: StringDictionary[UserActivity]): UserActivitySet = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivitySet]
    }
    
    @JSImport("matrix-appservice-bridge/lib/components/user-activity", "UserActivitySet.DEFAULT")
    @js.native
    val DEFAULT: UserActivitySet = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserActivitySet] (val x: Self) extends AnyVal {
      
      inline def setUsers(value: StringDictionary[UserActivity]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/user-activity", "UserActivityTracker")
  @js.native
  open class UserActivityTracker protected () extends StObject {
    def this(config: UserActivityTrackerConfig, dataSet: UserActivitySet) = this()
    def this(config: UserActivityTrackerConfig, dataSet: UserActivitySet, onChanges: ChangesCallback) = this()
    
    /* private */ val config: Any = js.native
    
    /**
      * Return the number of users active within the number of days specified in `config.inactiveAfterDays`.
      *
      * It returns the total number of active users under `allUsers` in the returned object.
      * `privateUsers` represents those users with their `metadata.private` set to `true`
      */
    def countActiveUsers(): AllUsers = js.native
    def countActiveUsers(dateNow: js.Date): AllUsers = js.native
    
    /* private */ val dataSet: Any = js.native
    
    def getUserData(userId: String): UserActivity = js.native
    
    /* private */ val onChanges: Any = js.native
    
    def updateUserActivity(userId: String): Unit = js.native
    def updateUserActivity(userId: String, metadata: Unit, dateOverride: js.Date): Unit = js.native
    def updateUserActivity(userId: String, metadata: UserActivityMetadata): Unit = js.native
    def updateUserActivity(userId: String, metadata: UserActivityMetadata, dateOverride: js.Date): Unit = js.native
  }
  
  trait UserActivityTrackerConfig extends StObject {
    
    var inactiveAfterDays: Double
    
    var minUserActiveDays: Double
  }
  object UserActivityTrackerConfig {
    
    inline def apply(inactiveAfterDays: Double, minUserActiveDays: Double): UserActivityTrackerConfig = {
      val __obj = js.Dynamic.literal(inactiveAfterDays = inactiveAfterDays.asInstanceOf[js.Any], minUserActiveDays = minUserActiveDays.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityTrackerConfig]
    }
    
    @JSImport("matrix-appservice-bridge/lib/components/user-activity", "UserActivityTrackerConfig.DEFAULT")
    @js.native
    val DEFAULT: UserActivityTrackerConfig = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserActivityTrackerConfig] (val x: Self) extends AnyVal {
      
      inline def setInactiveAfterDays(value: Double): Self = StObject.set(x, "inactiveAfterDays", value.asInstanceOf[js.Any])
      
      inline def setMinUserActiveDays(value: Double): Self = StObject.set(x, "minUserActiveDays", value.asInstanceOf[js.Any])
    }
  }
  
  type ChangesCallback = js.Function1[/* state */ UserActivityState, Unit]
  
  trait UserActivity extends StObject {
    
    var metadata: UserActivityMetadata
    
    var ts: js.Array[Double]
  }
  object UserActivity {
    
    inline def apply(metadata: UserActivityMetadata, ts: js.Array[Double]): UserActivity = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserActivity] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: UserActivityMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setTs(value: js.Array[Double]): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsVarargs(value: Double*): Self = StObject.set(x, "ts", js.Array(value*))
    }
  }
  
  trait UserActivityMetadata extends StObject {
    
    /**
      * The user was previously active, so we don't have a grace period.
      */
    var active: js.UndefOr[`true`] = js.undefined
    
    /**
      * The user is active in "private" rooms. Undefined if not.
      */
    var `private`: js.UndefOr[`true`] = js.undefined
  }
  object UserActivityMetadata {
    
    inline def apply(): UserActivityMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserActivityMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserActivityMetadata] (val x: Self) extends AnyVal {
      
      inline def setActive(value: `true`): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setPrivate(value: `true`): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  trait UserActivityState extends StObject {
    
    var activeUsers: Double
    
    var changed: js.Array[String]
    
    var dataSet: UserActivitySet
  }
  object UserActivityState {
    
    inline def apply(activeUsers: Double, changed: js.Array[String], dataSet: UserActivitySet): UserActivityState = {
      val __obj = js.Dynamic.literal(activeUsers = activeUsers.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], dataSet = dataSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserActivityState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserActivityState] (val x: Self) extends AnyVal {
      
      inline def setActiveUsers(value: Double): Self = StObject.set(x, "activeUsers", value.asInstanceOf[js.Any])
      
      inline def setChanged(value: js.Array[String]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setChangedVarargs(value: String*): Self = StObject.set(x, "changed", js.Array(value*))
      
      inline def setDataSet(value: UserActivitySet): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
    }
  }
}
