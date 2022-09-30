package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SynapseRoomProperty extends StObject
@JSImport("matrix-bot-sdk/lib/SynapseAdminApis", "SynapseRoomProperty")
@js.native
object SynapseRoomProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SynapseRoomProperty & String] = js.native
  
  @js.native
  sealed trait CanFederate
    extends StObject
       with SynapseRoomProperty
  /* "federatable" */ val CanFederate: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.CanFederate & String = js.native
  
  @js.native
  sealed trait CanonicalAlias
    extends StObject
       with SynapseRoomProperty
  /* "canonical_alias" */ val CanonicalAlias: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.CanonicalAlias & String = js.native
  
  @js.native
  sealed trait Creator
    extends StObject
       with SynapseRoomProperty
  /* "creator" */ val Creator: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.Creator & String = js.native
  
  @js.native
  sealed trait Encryption
    extends StObject
       with SynapseRoomProperty
  /* "encryption" */ val Encryption: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.Encryption & String = js.native
  
  @js.native
  sealed trait GuestAccess
    extends StObject
       with SynapseRoomProperty
  /* "guest_access" */ val GuestAccess: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.GuestAccess & String = js.native
  
  @js.native
  sealed trait HistoryVisibility
    extends StObject
       with SynapseRoomProperty
  /* "history_visibility" */ val HistoryVisibility: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.HistoryVisibility & String = js.native
  
  @js.native
  sealed trait IsPublic
    extends StObject
       with SynapseRoomProperty
  /* "public" */ val IsPublic: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.IsPublic & String = js.native
  
  @js.native
  sealed trait JoinRules
    extends StObject
       with SynapseRoomProperty
  /* "join_rules" */ val JoinRules: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.JoinRules & String = js.native
  
  @js.native
  sealed trait JoinedLocalMembers
    extends StObject
       with SynapseRoomProperty
  /* "joined_local_members" */ val JoinedLocalMembers: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.JoinedLocalMembers & String = js.native
  
  @js.native
  sealed trait JoinedMembers
    extends StObject
       with SynapseRoomProperty
  /* "joined_members" */ val JoinedMembers: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.JoinedMembers & String = js.native
  
  @js.native
  sealed trait Name
    extends StObject
       with SynapseRoomProperty
  /* "name" */ val Name: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.Name & String = js.native
  
  @js.native
  sealed trait NumStateEvents
    extends StObject
       with SynapseRoomProperty
  /* "state_events" */ val NumStateEvents: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.NumStateEvents & String = js.native
  
  @js.native
  sealed trait Version
    extends StObject
       with SynapseRoomProperty
  /* "version" */ val Version: typings.matrixBotSdk.synapseAdminApisMod.SynapseRoomProperty.Version & String = js.native
}
