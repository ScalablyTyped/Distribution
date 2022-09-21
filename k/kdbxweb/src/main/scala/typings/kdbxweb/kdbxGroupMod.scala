package typings.kdbxweb

import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxCustomDataMod.KdbxCustomDataMap
import typings.kdbxweb.kdbxEntryMod.KdbxEntry
import typings.kdbxweb.kdbxMod.MergeObjectMap
import typings.kdbxweb.kdbxTimesMod.KdbxTimes
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.xmlUtilsMod.global.Node
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxGroupMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-group", "KdbxGroup")
  @js.native
  open class KdbxGroup () extends StObject {
    
    def allEntries(): IterableIterator[KdbxEntry] = js.native
    
    def allGroups(): IterableIterator[KdbxGroup] = js.native
    
    def allGroupsAndEntries(): IterableIterator[KdbxGroup | KdbxEntry] = js.native
    
    def copyFrom(group: KdbxGroup): Unit = js.native
    
    var customData: js.UndefOr[KdbxCustomDataMap] = js.native
    
    var customIcon: js.UndefOr[KdbxUuid] = js.native
    
    var defaultAutoTypeSeq: js.UndefOr[String] = js.native
    
    var enableAutoType: js.UndefOr[Boolean | Null] = js.native
    
    var enableSearching: js.UndefOr[Boolean | Null] = js.native
    
    var entries: js.Array[KdbxEntry] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var groups: js.Array[KdbxGroup] = js.native
    
    var icon: js.UndefOr[Double] = js.native
    
    def lastModTime: Double = js.native
    
    var lastTopVisibleEntry: js.UndefOr[KdbxUuid] = js.native
    
    def locationChanged: Double = js.native
    
    def merge(objectMap: MergeObjectMap): Unit = js.native
    
    /**
      * Merge object collection with remote collection
      * Implements 2P-set CRDT with tombstones stored in objectMap.deleted
      * Assumes tombstones are already merged
      */
    /* private */ var mergeCollection: Any = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var parentGroup: js.UndefOr[KdbxGroup] = js.native
    
    var previousParentGroup: js.UndefOr[KdbxUuid] = js.native
    
    /* private */ var readNode: Any = js.native
    
    var tags: js.Array[String] = js.native
    
    var times: KdbxTimes = js.native
    
    var uuid: KdbxUuid = js.native
    
    def write(parentNode: Node, ctx: KdbxContext): Unit = js.native
  }
  /* static members */
  object KdbxGroup {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-group", "KdbxGroup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(name: String): KdbxGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[KdbxGroup]
    inline def create(name: String, parentGroup: KdbxGroup): KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[KdbxGroup]
    
    /**
      * Finds a best place to insert new item into collection
      */
    @JSImport("kdbxweb/dist/types/format/kdbx-group", "KdbxGroup.findInsertIx")
    @js.native
    def findInsertIx: Any = js.native
    inline def findInsertIx_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findInsertIx")(x.asInstanceOf[js.Any])
    
    inline def read(xmlNode: Node, ctx: KdbxContext): KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[KdbxGroup]
    inline def read(xmlNode: Node, ctx: KdbxContext, parentGroup: KdbxGroup): KdbxGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[KdbxGroup]
  }
}
