package typings.jupyterlabExtensionmanager

import typings.jupyterlabExtensionmanager.anon.Entries
import typings.luminoSignaling.mod.ISignal
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listingsMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/listings", "Lister")
  @js.native
  /**
    * Create a Lister object.
    */
  class Lister () extends StObject {
    
    /* private */ var _listings: js.Any = js.native
    
    /**
      */
    /* private */ var _listingsLoaded: js.Any = js.native
    
    def listingsLoaded: ISignal[this.type, ListResult] = js.native
  }
  
  trait IListEntry extends StObject {
    
    var creation_date: js.UndefOr[String] = js.undefined
    
    var last_update_date: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the extension.
      */
    var name: String
    
    var reason: js.UndefOr[String] = js.undefined
    
    var regexp: js.UndefOr[RegExp] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IListEntry {
    
    inline def apply(name: String): IListEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IListEntry]
    }
    
    extension [Self <: IListEntry](x: Self) {
      
      inline def setCreation_date(value: String): Self = StObject.set(x, "creation_date", value.asInstanceOf[js.Any])
      
      inline def setCreation_dateUndefined: Self = StObject.set(x, "creation_date", js.undefined)
      
      inline def setLast_update_date(value: String): Self = StObject.set(x, "last_update_date", value.asInstanceOf[js.Any])
      
      inline def setLast_update_dateUndefined: Self = StObject.set(x, "last_update_date", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IListingApi extends StObject {
    
    var blacklist: js.Array[IListEntry]
    
    var blacklist_uris: js.Array[String]
    
    var whitelist: js.Array[IListEntry]
    
    var whitelist_uris: js.Array[String]
  }
  object IListingApi {
    
    inline def apply(
      blacklist: js.Array[IListEntry],
      blacklist_uris: js.Array[String],
      whitelist: js.Array[IListEntry],
      whitelist_uris: js.Array[String]
    ): IListingApi = {
      val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], blacklist_uris = blacklist_uris.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], whitelist_uris = whitelist_uris.asInstanceOf[js.Any])
      __obj.asInstanceOf[IListingApi]
    }
    
    extension [Self <: IListingApi](x: Self) {
      
      inline def setBlacklist(value: js.Array[IListEntry]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistVarargs(value: IListEntry*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setBlacklist_uris(value: js.Array[String]): Self = StObject.set(x, "blacklist_uris", value.asInstanceOf[js.Any])
      
      inline def setBlacklist_urisVarargs(value: String*): Self = StObject.set(x, "blacklist_uris", js.Array(value :_*))
      
      inline def setWhitelist(value: js.Array[IListEntry]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistVarargs(value: IListEntry*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
      
      inline def setWhitelist_uris(value: js.Array[String]): Self = StObject.set(x, "whitelist_uris", value.asInstanceOf[js.Any])
      
      inline def setWhitelist_urisVarargs(value: String*): Self = StObject.set(x, "whitelist_uris", js.Array(value :_*))
    }
  }
  
  type ListResult = Null | Entries
}
