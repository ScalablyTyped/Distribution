package typings.kdbxweb

import typings.kdbxweb.kdbxBinariesMod.KdbxBinary
import typings.kdbxweb.kdbxBinariesMod.KdbxBinaryWithHash
import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxCustomDataMod.KdbxCustomDataMap
import typings.kdbxweb.kdbxGroupMod.KdbxGroup
import typings.kdbxweb.kdbxMetaMod.KdbxMeta
import typings.kdbxweb.kdbxMod.MergeObjectMap
import typings.kdbxweb.kdbxTimesMod.KdbxTimes
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.protectedValueMod.ProtectedValue
import typings.kdbxweb.xmlUtilsMod.global.Node
import typings.std.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxEntryMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-entry", "KdbxEntry")
  @js.native
  open class KdbxEntry () extends StObject {
    
    var _editState: js.UndefOr[KdbxEntryEditState] = js.native
    
    /* private */ var addHistoryTombstone: Any = js.native
    
    var autoType: KdbxEntryAutoType = js.native
    
    var bgColor: js.UndefOr[String] = js.native
    
    var binaries: Map[String, KdbxBinary | KdbxBinaryWithHash] = js.native
    
    def copyFrom(entry: KdbxEntry): Unit = js.native
    
    var customData: js.UndefOr[KdbxCustomDataMap] = js.native
    
    var customIcon: js.UndefOr[KdbxUuid] = js.native
    
    var fgColor: js.UndefOr[String] = js.native
    
    var fields: Map[String, KdbxEntryField] = js.native
    
    var history: js.Array[KdbxEntry] = js.native
    
    var icon: js.UndefOr[Double] = js.native
    
    def lastModTime: Double = js.native
    
    def locationChanged: Double = js.native
    
    def merge(objectMap: MergeObjectMap): Unit = js.native
    
    /**
      * Merge entry history with remote entry history
      * Tombstones are stored locally and must be immediately discarded by replica after successful upstream push.
      * It's client responsibility, to save and load tombstones for local replica, and to clear them after successful upstream push.
      *
      * Implements remove-win OR-set CRDT with local tombstones stored in _editState.
      *
      * Format doesn't allow saving tombstones for history entries, so they are stored locally.
      * Any unmodified state from past or modifications of current state synced with central upstream will be successfully merged.
      * Assumes there's only one central upstream, may produce inconsistencies while merging outdated replica outside main upstream.
      * Phantom entries and phantom deletions will appear if remote replica checked out an old state and has just added a new state.
      * If a client is using central upstream for sync, the remote replica must first sync it state and
      * only after it update the upstream, so this should never happen.
      *
      * References:
      *
      * An Optimized Conflict-free Replicated Set arXiv:1210.3368 [cs.DC]
      * http://arxiv.org/abs/1210.3368
      *
      * Gene T. J. Wuu and Arthur J. Bernstein. Efficient solutions to the replicated log and dictionary
      * problems. In Symp. on Principles of Dist. Comp. (PODC), pages 233–242, Vancouver, BC, Canada, August 1984.
      * https://pages.lip6.fr/Marc.Shapiro/papers/RR-7687.pdf
      */
    /* private */ var mergeHistory: Any = js.native
    
    var overrideUrl: js.UndefOr[String] = js.native
    
    var parentGroup: js.UndefOr[KdbxGroup] = js.native
    
    var previousParentGroup: js.UndefOr[KdbxUuid] = js.native
    
    def pushHistory(): Unit = js.native
    
    var qualityCheck: js.UndefOr[Boolean] = js.native
    
    /* private */ var readAutoType: Any = js.native
    
    /* private */ var readAutoTypeItem: Any = js.native
    
    /* private */ var readBinary: Any = js.native
    
    /* private */ var readCustomData: Any = js.native
    
    /* private */ var readField: Any = js.native
    
    /* private */ var readHistory: Any = js.native
    
    /* private */ var readNode: Any = js.native
    
    def removeHistory(index: Double): Unit = js.native
    def removeHistory(index: Double, count: Double): Unit = js.native
    
    /* private */ var setField: Any = js.native
    
    var tags: js.Array[String] = js.native
    
    var times: KdbxTimes = js.native
    
    var uuid: KdbxUuid = js.native
    
    def write(parentNode: Element, ctx: KdbxContext): Unit = js.native
    
    /* private */ var writeAutoType: Any = js.native
    
    /* private */ var writeBinaries: Any = js.native
    
    /* private */ var writeCustomData: Any = js.native
    
    /* private */ var writeFields: Any = js.native
    
    /* private */ var writeHistory: Any = js.native
  }
  /* static members */
  object KdbxEntry {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-entry", "KdbxEntry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(meta: KdbxMeta, parentGroup: KdbxGroup): KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(meta.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[KdbxEntry]
    
    inline def read(xmlNode: Node, ctx: KdbxContext): KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[KdbxEntry]
    inline def read(xmlNode: Node, ctx: KdbxContext, parentGroup: KdbxGroup): KdbxEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], parentGroup.asInstanceOf[js.Any])).asInstanceOf[KdbxEntry]
  }
  
  trait KdbxAutoTypeItem extends StObject {
    
    var keystrokeSequence: String
    
    var window: String
  }
  object KdbxAutoTypeItem {
    
    inline def apply(keystrokeSequence: String, window: String): KdbxAutoTypeItem = {
      val __obj = js.Dynamic.literal(keystrokeSequence = keystrokeSequence.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxAutoTypeItem]
    }
    
    extension [Self <: KdbxAutoTypeItem](x: Self) {
      
      inline def setKeystrokeSequence(value: String): Self = StObject.set(x, "keystrokeSequence", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: String): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait KdbxEntryAutoType extends StObject {
    
    var defaultSequence: js.UndefOr[String] = js.undefined
    
    var enabled: Boolean
    
    var items: js.Array[KdbxAutoTypeItem]
    
    var obfuscation: Double
  }
  object KdbxEntryAutoType {
    
    inline def apply(enabled: Boolean, items: js.Array[KdbxAutoTypeItem], obfuscation: Double): KdbxEntryAutoType = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxEntryAutoType]
    }
    
    extension [Self <: KdbxEntryAutoType](x: Self) {
      
      inline def setDefaultSequence(value: String): Self = StObject.set(x, "defaultSequence", value.asInstanceOf[js.Any])
      
      inline def setDefaultSequenceUndefined: Self = StObject.set(x, "defaultSequence", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[KdbxAutoTypeItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: KdbxAutoTypeItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setObfuscation(value: Double): Self = StObject.set(x, "obfuscation", value.asInstanceOf[js.Any])
    }
  }
  
  trait KdbxEntryEditState extends StObject {
    
    var added: js.Array[Double]
    
    var deleted: js.Array[Double]
  }
  object KdbxEntryEditState {
    
    inline def apply(added: js.Array[Double], deleted: js.Array[Double]): KdbxEntryEditState = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxEntryEditState]
    }
    
    extension [Self <: KdbxEntryEditState](x: Self) {
      
      inline def setAdded(value: js.Array[Double]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: Double*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setDeleted(value: js.Array[Double]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedVarargs(value: Double*): Self = StObject.set(x, "deleted", js.Array(value*))
    }
  }
  
  type KdbxEntryField = String | ProtectedValue
}
