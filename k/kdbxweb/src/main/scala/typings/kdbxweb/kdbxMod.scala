package typings.kdbxweb

import org.scalablytyped.runtime.StringDictionary
import typings.kdbxweb.anon.Binaries
import typings.kdbxweb.anon.PreserveXml
import typings.kdbxweb.kdbxBinariesMod.KdbxBinaries
import typings.kdbxweb.kdbxBinariesMod.KdbxBinary
import typings.kdbxweb.kdbxBinariesMod.KdbxBinaryWithHash
import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxCredentialsMod.KdbxCredentials
import typings.kdbxweb.kdbxDeletedObjectMod.KdbxDeletedObject
import typings.kdbxweb.kdbxEntryMod.KdbxEntry
import typings.kdbxweb.kdbxEntryMod.KdbxEntryEditState
import typings.kdbxweb.kdbxGroupMod.KdbxGroup
import typings.kdbxweb.kdbxHeaderMod.KdbxHeader
import typings.kdbxweb.kdbxMetaMod.KdbxMeta
import typings.kdbxweb.kdbxMetaMod.KdbxMetaEditState
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.kdbxwebNumbers.`3`
import typings.kdbxweb.kdbxwebNumbers.`4`
import typings.std.Document
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx", "Kdbx")
  @js.native
  open class Kdbx () extends StObject {
    
    /**
      * Adds a so-called deleted object, this is used to keep track of objects during merging
      * @param uuid - object uuid
      * @param dt - deletion date
      */
    def addDeletedObject(uuid: KdbxUuid, dt: js.Date): Unit = js.native
    
    var binaries: KdbxBinaries = js.native
    
    def buildXml(ctx: KdbxContext): Unit = js.native
    
    /**
      * Perform database cleanup
      * @param settings.historyRules - remove extra history, it it doesn't match defined rules, e.g. records number
      * @param settings.customIcons - remove unused custom icons
      * @param settings.binaries - remove unused binaries
      */
    def cleanup(): Unit = js.native
    def cleanup(settings: Binaries): Unit = js.native
    
    /**
      * Creates a binary in the db and returns an object that can be put to entry.binaries
      */
    def createBinary(value: KdbxBinary): js.Promise[KdbxBinaryWithHash] = js.native
    
    /**
      * Creates a default group, if it's not yet created
      */
    def createDefaultGroup(): Unit = js.native
    
    /**
      * Adds a new entry to a group
      */
    def createEntry(group: KdbxGroup): KdbxEntry = js.native
    
    /**
      * Adds a new group to an existing group
      */
    def createGroup(group: KdbxGroup, name: String): KdbxGroup = js.native
    
    /**
      * Creates a recycle bin group, if it's not yet created
      */
    def createRecycleBin(): Unit = js.native
    
    var credentials: KdbxCredentials = js.native
    
    var deletedObjects: js.Array[KdbxDeletedObject] = js.native
    
    /**
      * Gets the default group
      */
    def getDefaultGroup(): KdbxGroup = js.native
    
    def getGroup(uuid: String): js.UndefOr[KdbxGroup] = js.native
    def getGroup(uuid: String, parentGroup: KdbxGroup): js.UndefOr[KdbxGroup] = js.native
    /**
      * Get a group by uuid, returns undefined if it's not found
      */
    def getGroup(uuid: KdbxUuid): js.UndefOr[KdbxGroup] = js.native
    def getGroup(uuid: KdbxUuid, parentGroup: KdbxGroup): js.UndefOr[KdbxGroup] = js.native
    
    /**
      * Gets editing state tombstones (for successful merge)
      * The replica must save this state with the db, assign in on opening the db,
      * and call removeLocalEditState on successful upstream push.
      * This state is JSON serializable.
      */
    def getLocalEditState(): KdbxEditState = js.native
    
    /* private */ var getObjectMap: Any = js.native
    
    var groups: js.Array[KdbxGroup] = js.native
    
    var header: KdbxHeader = js.native
    
    /**
      * Import an entry from another file
      * It's up to caller to decide what should happen to the original entry in the source file
      * Returns the new entry
      * @param entry - entry to be imported
      * @param group - target parent group
      * @param file - the source file containing the group
      */
    def importEntry(entry: KdbxEntry, group: KdbxGroup, file: Kdbx): KdbxEntry = js.native
    
    def loadFromXml(ctx: KdbxContext): js.Promise[Kdbx] = js.native
    
    /**
      * Merge the db with another db
      * Some parts of the remote DB are copied by reference, so it should NOT be modified after merge
      * Suggested use case:
      * - open the local db
      * - get a remote db somehow and open in
      * - merge the remote db into the local db: local.merge(remote)
      * - close the remote db
      * @param remote - database to merge in
      */
    def merge(remote: Kdbx): Unit = js.native
    
    var meta: KdbxMeta = js.native
    
    /**
      * Move an object from one group to another
      * @param object - object to be moved
      * @param toGroup - target parent group
      * @param atIndex - index in target group (by default, insert to the end of the group)
      */
    def move(`object`: KdbxEntry): Unit = js.native
    def move(`object`: KdbxEntry, toGroup: Null, atIndex: Double): Unit = js.native
    def move(`object`: KdbxEntry, toGroup: Unit, atIndex: Double): Unit = js.native
    def move(`object`: KdbxEntry, toGroup: KdbxGroup): Unit = js.native
    def move(`object`: KdbxEntry, toGroup: KdbxGroup, atIndex: Double): Unit = js.native
    def move(`object`: KdbxGroup): Unit = js.native
    def move(`object`: KdbxGroup, toGroup: Null, atIndex: Double): Unit = js.native
    def move(`object`: KdbxGroup, toGroup: Unit, atIndex: Double): Unit = js.native
    def move(`object`: KdbxGroup, toGroup: KdbxGroup): Unit = js.native
    def move(`object`: KdbxGroup, toGroup: KdbxGroup, atIndex: Double): Unit = js.native
    
    /* private */ var parseMeta: Any = js.native
    
    /* private */ var parseRoot: Any = js.native
    
    /* private */ var readDeletedObjects: Any = js.native
    
    /* private */ var readGroup: Any = js.native
    
    /**
      * Delete an entry or a group
      * Depending on settings, removes either to trash, or completely
      */
    def remove(`object`: KdbxEntry): Unit = js.native
    def remove(`object`: KdbxGroup): Unit = js.native
    
    /**
      * Removes editing state tombstones
      * Immediately after successful upstream push the replica must:
      * - call this method
      * - discard any previous state obtained by getLocalEditState call before
      */
    def removeLocalEditState(): Unit = js.native
    
    /**
      * Save the db to ArrayBuffer
      */
    def save(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Save the db as XML string
      */
    def saveXml(): js.Promise[String] = js.native
    def saveXml(prettyPrint: Boolean): js.Promise[String] = js.native
    
    /**
      * Set file key derivation function
      * @param kdf - KDF id, from KdfId
      */
    def setKdf(kdf: String): Unit = js.native
    
    /**
      * Sets editing state tombstones returned previously by getLocalEditState
      * The replica must call this method on opening the db to the state returned previously on getLocalEditState.
      * @param editingState - result of getLocalEditState invoked before on saving the db
      */
    def setLocalEditState(editingState: KdbxEditState): Unit = js.native
    
    /**
      * Set the file version to a specified number
      */
    def setVersion(version: `3` | `4`): Unit = js.native
    
    /**
      * Upgrade the file to latest version
      */
    def upgrade(): Unit = js.native
    
    def versionIsAtLeast(major: Double, minor: Double): Boolean = js.native
    
    def versionMajor: Double = js.native
    
    def versionMinor: Double = js.native
    
    var xml: js.UndefOr[Document] = js.native
  }
  /* static members */
  object Kdbx {
    
    @JSImport("kdbxweb/dist/types/format/kdbx", "Kdbx")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new database
      */
    inline def create(credentials: KdbxCredentials, name: String): Kdbx = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Kdbx]
    
    /**
      * Load a kdbx file
      * If there was an error loading file, throws an exception
      */
    inline def load(data: js.typedarray.ArrayBuffer, credentials: KdbxCredentials): js.Promise[Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Kdbx]]
    inline def load(data: js.typedarray.ArrayBuffer, credentials: KdbxCredentials, options: PreserveXml): js.Promise[Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Kdbx]]
    
    /**
      * Import database from an xml file
      * If there was an error loading file, throws an exception
      */
    inline def loadXml(data: String, credentials: KdbxCredentials): js.Promise[Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Kdbx]]
  }
  
  trait KdbxEditState extends StObject {
    
    var entries: js.UndefOr[StringDictionary[KdbxEntryEditState]] = js.undefined
    
    var meta: js.UndefOr[KdbxMetaEditState] = js.undefined
  }
  object KdbxEditState {
    
    inline def apply(): KdbxEditState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdbxEditState]
    }
    
    extension [Self <: KdbxEditState](x: Self) {
      
      inline def setEntries(value: StringDictionary[KdbxEntryEditState]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setMeta(value: KdbxMetaEditState): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait MergeObjectMap extends StObject {
    
    var deleted: Map[String, js.Date]
    
    var entries: Map[String, KdbxEntry]
    
    var groups: Map[String, KdbxGroup]
    
    var remoteEntries: Map[String, KdbxEntry]
    
    var remoteGroups: Map[String, KdbxGroup]
  }
  object MergeObjectMap {
    
    inline def apply(
      deleted: Map[String, js.Date],
      entries: Map[String, KdbxEntry],
      groups: Map[String, KdbxGroup],
      remoteEntries: Map[String, KdbxEntry],
      remoteGroups: Map[String, KdbxGroup]
    ): MergeObjectMap = {
      val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], remoteEntries = remoteEntries.asInstanceOf[js.Any], remoteGroups = remoteGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeObjectMap]
    }
    
    extension [Self <: MergeObjectMap](x: Self) {
      
      inline def setDeleted(value: Map[String, js.Date]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: Map[String, KdbxEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: Map[String, KdbxGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setRemoteEntries(value: Map[String, KdbxEntry]): Self = StObject.set(x, "remoteEntries", value.asInstanceOf[js.Any])
      
      inline def setRemoteGroups(value: Map[String, KdbxGroup]): Self = StObject.set(x, "remoteGroups", value.asInstanceOf[js.Any])
    }
  }
}
