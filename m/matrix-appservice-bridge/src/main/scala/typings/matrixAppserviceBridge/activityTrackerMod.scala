package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.InactiveMs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityTrackerMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/activity-tracker", "ActivityTracker")
  @js.native
  open class ActivityTracker protected () extends StObject {
    def this(
      client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatrixClient */ Any,
      opts: ActivityTrackerOpts
    ) = this()
    
    /* private */ var canUseWhois: Any = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Determine if a user is online or offline using a range of metrics.
      * @param userId The userId to check
      * @param maxTimeMs The maximum time a user may be inactive for before they are considered offline.
      * @param defaultOnline Should the user be online or offline if no data is found. Defaults to `opts.defaultOnline`
      */
    def isUserOnline(userId: String, maxTimeMs: Double): js.Promise[InactiveMs] = js.native
    def isUserOnline(userId: String, maxTimeMs: Double, defaultOnline: Boolean): js.Promise[InactiveMs] = js.native
    
    /* private */ var lastActiveTime: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /**
      * Sets the last active time of the user to `ts`. By default this is the current time.
      * @param userId The userId of a user who performed an action.
      * @param ts The timestamp to set in milliseconds.
      */
    def setLastActiveTime(userId: String): Unit = js.native
    def setLastActiveTime(userId: String, ts: Double): Unit = js.native
    
    def usingWhois: Boolean | Null = js.native
  }
  
  trait ActivityTrackerOpts extends StObject {
    
    /**
      * Should the tracker assume offline or online if it doesn't have enough information.
      */
    var defaultOnline: Boolean
    
    /**
      * Run a function when the last active time for a user gets updated
      */
    var onLastActiveTimeUpdated: js.UndefOr[js.Function2[/* userId */ String, /* ts */ Double, Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * Matrix server name. Used for determining local and remote users.
      * @example matrix.org
      */
    var serverName: String
    
    /**
      * Should presence be used. Set to false if the homeserver has presence disabled.
      */
    var usePresence: js.UndefOr[Boolean] = js.undefined
  }
  object ActivityTrackerOpts {
    
    inline def apply(defaultOnline: Boolean, serverName: String): ActivityTrackerOpts = {
      val __obj = js.Dynamic.literal(defaultOnline = defaultOnline.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivityTrackerOpts]
    }
    
    extension [Self <: ActivityTrackerOpts](x: Self) {
      
      inline def setDefaultOnline(value: Boolean): Self = StObject.set(x, "defaultOnline", value.asInstanceOf[js.Any])
      
      inline def setOnLastActiveTimeUpdated(value: (/* userId */ String, /* ts */ Double) => Unit | js.Promise[Unit]): Self = StObject.set(x, "onLastActiveTimeUpdated", js.Any.fromFunction2(value))
      
      inline def setOnLastActiveTimeUpdatedUndefined: Self = StObject.set(x, "onLastActiveTimeUpdated", js.undefined)
      
      inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setUsePresence(value: Boolean): Self = StObject.set(x, "usePresence", value.asInstanceOf[js.Any])
      
      inline def setUsePresenceUndefined: Self = StObject.set(x, "usePresence", js.undefined)
    }
  }
}
