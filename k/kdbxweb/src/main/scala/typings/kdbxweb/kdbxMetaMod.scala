package typings.kdbxweb

import typings.kdbxweb.kdbxContextMod.KdbxContext
import typings.kdbxweb.kdbxCustomDataMod.KdbxCustomDataMap
import typings.kdbxweb.kdbxMod.MergeObjectMap
import typings.kdbxweb.kdbxUuidMod.KdbxUuid
import typings.kdbxweb.xmlUtilsMod.global.Node
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kdbxMetaMod {
  
  @JSImport("kdbxweb/dist/types/format/kdbx-meta", "KdbxMeta")
  @js.native
  open class KdbxMeta () extends StObject {
    
    var _color: js.UndefOr[String] = js.native
    
    var _defaultUser: js.UndefOr[String] = js.native
    
    var _desc: js.UndefOr[String] = js.native
    
    var _editState: js.UndefOr[KdbxMetaEditState] = js.native
    
    var _entryTemplatesGroup: js.UndefOr[KdbxUuid] = js.native
    
    var _historyMaxItems: js.UndefOr[Double] = js.native
    
    var _historyMaxSize: js.UndefOr[Double] = js.native
    
    var _keyChangeForce: js.UndefOr[Double] = js.native
    
    var _keyChangeRec: js.UndefOr[Double] = js.native
    
    var _lastSelectedGroup: js.UndefOr[KdbxUuid] = js.native
    
    var _lastTopVisibleGroup: js.UndefOr[KdbxUuid] = js.native
    
    var _memoryProtection: KdbxMemoryProtection = js.native
    
    var _mntncHistoryDays: js.UndefOr[Double] = js.native
    
    var _name: js.UndefOr[String] = js.native
    
    var _recycleBinEnabled: js.UndefOr[Boolean] = js.native
    
    var _recycleBinUuid: js.UndefOr[KdbxUuid] = js.native
    
    def color: js.UndefOr[String] = js.native
    def color_=(value: js.UndefOr[String]): Unit = js.native
    
    var customData: KdbxCustomDataMap = js.native
    
    var customIcons: Map[String, KdbxCustomIcon] = js.native
    
    def defaultUser: js.UndefOr[String] = js.native
    
    var defaultUserChanged: js.UndefOr[js.Date] = js.native
    
    def defaultUser_=(value: js.UndefOr[String]): Unit = js.native
    
    def desc: js.UndefOr[String] = js.native
    
    var descChanged: js.UndefOr[js.Date] = js.native
    
    def desc_=(value: js.UndefOr[String]): Unit = js.native
    
    def editState: js.UndefOr[KdbxMetaEditState] = js.native
    def editState_=(value: js.UndefOr[KdbxMetaEditState]): Unit = js.native
    
    def entryTemplatesGroup: js.UndefOr[KdbxUuid] = js.native
    
    var entryTemplatesGroupChanged: js.UndefOr[js.Date] = js.native
    
    def entryTemplatesGroup_=(value: js.UndefOr[KdbxUuid]): Unit = js.native
    
    var generator: js.UndefOr[String] = js.native
    
    /* private */ var getOrCreateEditState: Any = js.native
    
    var headerHash: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
    
    def historyMaxItems: js.UndefOr[Double] = js.native
    def historyMaxItems_=(value: js.UndefOr[Double]): Unit = js.native
    
    def historyMaxSize: js.UndefOr[Double] = js.native
    def historyMaxSize_=(value: js.UndefOr[Double]): Unit = js.native
    
    def keyChangeForce: js.UndefOr[Double] = js.native
    def keyChangeForce_=(value: js.UndefOr[Double]): Unit = js.native
    
    def keyChangeRec: js.UndefOr[Double] = js.native
    def keyChangeRec_=(value: js.UndefOr[Double]): Unit = js.native
    
    var keyChanged: js.UndefOr[js.Date] = js.native
    
    def lastSelectedGroup: js.UndefOr[KdbxUuid] = js.native
    def lastSelectedGroup_=(value: js.UndefOr[KdbxUuid]): Unit = js.native
    
    def lastTopVisibleGroup: js.UndefOr[KdbxUuid] = js.native
    def lastTopVisibleGroup_=(value: js.UndefOr[KdbxUuid]): Unit = js.native
    
    def memoryProtection: KdbxMemoryProtection = js.native
    def memoryProtection_=(value: KdbxMemoryProtection): Unit = js.native
    
    def merge(remote: KdbxMeta, objectMap: MergeObjectMap): Unit = js.native
    
    /* private */ var mergeMapWithDates: Any = js.native
    
    def mntncHistoryDays: js.UndefOr[Double] = js.native
    def mntncHistoryDays_=(value: js.UndefOr[Double]): Unit = js.native
    
    def name: js.UndefOr[String] = js.native
    
    var nameChanged: js.UndefOr[js.Date] = js.native
    
    def name_=(value: js.UndefOr[String]): Unit = js.native
    
    def needUpdate(): Boolean = js.native
    def needUpdate(remoteDate: js.Date): Boolean = js.native
    def needUpdate(remoteDate: js.Date, localDate: js.Date): Boolean = js.native
    def needUpdate(remoteDate: Unit, localDate: js.Date): Boolean = js.native
    
    /* private */ var readBinaries: Any = js.native
    
    /* private */ var readBinary: Any = js.native
    
    /* private */ var readCustomData: Any = js.native
    
    /* private */ var readCustomIcon: Any = js.native
    
    /* private */ var readCustomIcons: Any = js.native
    
    /* private */ var readMemoryProtection: Any = js.native
    
    /* private */ var readNode: Any = js.native
    
    var recycleBinChanged: js.UndefOr[js.Date] = js.native
    
    def recycleBinEnabled: js.UndefOr[Boolean] = js.native
    def recycleBinEnabled_=(value: js.UndefOr[Boolean]): Unit = js.native
    
    def recycleBinUuid: js.UndefOr[KdbxUuid] = js.native
    def recycleBinUuid_=(value: js.UndefOr[KdbxUuid]): Unit = js.native
    
    var settingsChanged: js.UndefOr[js.Date] = js.native
    
    def write(parentNode: Node, ctx: KdbxContext): Unit = js.native
    
    /* private */ var writeBinaries: Any = js.native
    
    /* private */ var writeCustomData: Any = js.native
    
    /* private */ var writeCustomIcons: Any = js.native
    
    /* private */ var writeMemoryProtection: Any = js.native
  }
  /* static members */
  object KdbxMeta {
    
    @JSImport("kdbxweb/dist/types/format/kdbx-meta", "KdbxMeta")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new meta
      * @returns {KdbxMeta}
      */
    inline def create(): KdbxMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[KdbxMeta]
    
    inline def read(xmlNode: Node, ctx: KdbxContext): KdbxMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xmlNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[KdbxMeta]
  }
  
  trait KdbxCustomIcon extends StObject {
    
    var data: js.typedarray.ArrayBuffer
    
    var lastModified: js.UndefOr[js.Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object KdbxCustomIcon {
    
    inline def apply(data: js.typedarray.ArrayBuffer): KdbxCustomIcon = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[KdbxCustomIcon]
    }
    
    extension [Self <: KdbxCustomIcon](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait KdbxMemoryProtection extends StObject {
    
    var notes: js.UndefOr[Boolean] = js.undefined
    
    var password: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[Boolean] = js.undefined
    
    var userName: js.UndefOr[Boolean] = js.undefined
  }
  object KdbxMemoryProtection {
    
    inline def apply(): KdbxMemoryProtection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdbxMemoryProtection]
    }
    
    extension [Self <: KdbxMemoryProtection](x: Self) {
      
      inline def setNotes(value: Boolean): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUserName(value: Boolean): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
  
  trait KdbxMetaEditState extends StObject {
    
    var colorChanged: js.UndefOr[js.Date] = js.undefined
    
    var historyMaxItemsChanged: js.UndefOr[js.Date] = js.undefined
    
    var historyMaxSizeChanged: js.UndefOr[js.Date] = js.undefined
    
    var keyChangeForceChanged: js.UndefOr[js.Date] = js.undefined
    
    var keyChangeRecChanged: js.UndefOr[js.Date] = js.undefined
    
    var lastSelectedGroupChanged: js.UndefOr[js.Date] = js.undefined
    
    var lastTopVisibleGroupChanged: js.UndefOr[js.Date] = js.undefined
    
    var memoryProtectionChanged: js.UndefOr[js.Date] = js.undefined
    
    var mntncHistoryDaysChanged: js.UndefOr[js.Date] = js.undefined
  }
  object KdbxMetaEditState {
    
    inline def apply(): KdbxMetaEditState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdbxMetaEditState]
    }
    
    extension [Self <: KdbxMetaEditState](x: Self) {
      
      inline def setColorChanged(value: js.Date): Self = StObject.set(x, "colorChanged", value.asInstanceOf[js.Any])
      
      inline def setColorChangedUndefined: Self = StObject.set(x, "colorChanged", js.undefined)
      
      inline def setHistoryMaxItemsChanged(value: js.Date): Self = StObject.set(x, "historyMaxItemsChanged", value.asInstanceOf[js.Any])
      
      inline def setHistoryMaxItemsChangedUndefined: Self = StObject.set(x, "historyMaxItemsChanged", js.undefined)
      
      inline def setHistoryMaxSizeChanged(value: js.Date): Self = StObject.set(x, "historyMaxSizeChanged", value.asInstanceOf[js.Any])
      
      inline def setHistoryMaxSizeChangedUndefined: Self = StObject.set(x, "historyMaxSizeChanged", js.undefined)
      
      inline def setKeyChangeForceChanged(value: js.Date): Self = StObject.set(x, "keyChangeForceChanged", value.asInstanceOf[js.Any])
      
      inline def setKeyChangeForceChangedUndefined: Self = StObject.set(x, "keyChangeForceChanged", js.undefined)
      
      inline def setKeyChangeRecChanged(value: js.Date): Self = StObject.set(x, "keyChangeRecChanged", value.asInstanceOf[js.Any])
      
      inline def setKeyChangeRecChangedUndefined: Self = StObject.set(x, "keyChangeRecChanged", js.undefined)
      
      inline def setLastSelectedGroupChanged(value: js.Date): Self = StObject.set(x, "lastSelectedGroupChanged", value.asInstanceOf[js.Any])
      
      inline def setLastSelectedGroupChangedUndefined: Self = StObject.set(x, "lastSelectedGroupChanged", js.undefined)
      
      inline def setLastTopVisibleGroupChanged(value: js.Date): Self = StObject.set(x, "lastTopVisibleGroupChanged", value.asInstanceOf[js.Any])
      
      inline def setLastTopVisibleGroupChangedUndefined: Self = StObject.set(x, "lastTopVisibleGroupChanged", js.undefined)
      
      inline def setMemoryProtectionChanged(value: js.Date): Self = StObject.set(x, "memoryProtectionChanged", value.asInstanceOf[js.Any])
      
      inline def setMemoryProtectionChangedUndefined: Self = StObject.set(x, "memoryProtectionChanged", js.undefined)
      
      inline def setMntncHistoryDaysChanged(value: js.Date): Self = StObject.set(x, "mntncHistoryDaysChanged", value.asInstanceOf[js.Any])
      
      inline def setMntncHistoryDaysChangedUndefined: Self = StObject.set(x, "mntncHistoryDaysChanged", js.undefined)
    }
  }
}
