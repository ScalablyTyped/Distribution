package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.googleapisStrings.ADDED
import typings.googleapis.googleapisStrings.CHANGED
import typings.googleapis.googleapisStrings.DELETED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod {
  
  @JSImport("googleapis/build/src/generator/download", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/generator/download", "DISCOVERY_URL")
  @js.native
  val DISCOVERY_URL: /* "https://www.googleapis.com/discovery/v1/apis/" */ String = js.native
  
  inline def downloadDiscoveryDocs(options: DownloadOptions): js.Promise[js.Array[ChangeSet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadDiscoveryDocs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ChangeSet]]]
  
  inline def flattenObject(doc: Schema): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(doc.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def flattenObject(doc: Schema, flat: Unit, prefix: String): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(doc.asInstanceOf[js.Any], flat.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Schema]
  inline def flattenObject(doc: Schema, flat: Schema): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(doc.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[Schema]
  inline def flattenObject(doc: Schema, flat: Schema, prefix: String): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(doc.asInstanceOf[js.Any], flat.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def getDiffs(oldDoc: Schema, newDoc: Schema): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDiffs")(oldDoc.asInstanceOf[js.Any], newDoc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  object gfs {
    
    @JSImport("googleapis/build/src/generator/download", "gfs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mkdir(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    inline def readFile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def writeFile(path: String, obj: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def shouldUpdate(newDoc: js.Object, oldDoc: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdate")(newDoc.asInstanceOf[js.Any], oldDoc.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sortKeys(obj: Schema): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("sortKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  trait Change extends StObject {
    
    var action: ADDED | DELETED | CHANGED
    
    var keyName: String
  }
  object Change {
    
    inline def apply(action: ADDED | DELETED | CHANGED, keyName: String): Change = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    extension [Self <: Change](x: Self) {
      
      inline def setAction(value: ADDED | DELETED | CHANGED): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangeSet extends StObject {
    
    var api: typings.googleapisCommon.schemaMod.Schema
    
    var changes: js.Array[Change]
  }
  object ChangeSet {
    
    inline def apply(api: typings.googleapisCommon.schemaMod.Schema, changes: js.Array[Change]): ChangeSet = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeSet]
    }
    
    extension [Self <: ChangeSet](x: Self) {
      
      inline def setApi(value: typings.googleapisCommon.schemaMod.Schema): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait DownloadOptions extends StObject {
    
    var discoveryUrl: String
    
    var downloadPath: String
    
    var includePrivate: js.UndefOr[Boolean] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(discoveryUrl: String, downloadPath: String): DownloadOptions = {
      val __obj = js.Dynamic.literal(discoveryUrl = discoveryUrl.asInstanceOf[js.Any], downloadPath = downloadPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setDiscoveryUrl(value: String): Self = StObject.set(x, "discoveryUrl", value.asInstanceOf[js.Any])
      
      inline def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
      
      inline def setIncludePrivate(value: Boolean): Self = StObject.set(x, "includePrivate", value.asInstanceOf[js.Any])
      
      inline def setIncludePrivateUndefined: Self = StObject.set(x, "includePrivate", js.undefined)
    }
  }
  
  type Schema = StringDictionary[js.Object]
}
