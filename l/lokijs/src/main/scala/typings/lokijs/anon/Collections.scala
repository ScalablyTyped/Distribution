package typings.lokijs.anon

import typings.lokijs.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collections extends StObject {
  
  var collections: js.Array[Collection[Any]]
  
  var databaseVersion: Double
  
  var name: js.UndefOr[String] = js.undefined
  
  var throttledSaves: Boolean
}
object Collections {
  
  inline def apply(collections: js.Array[Collection[Any]], databaseVersion: Double, throttledSaves: Boolean): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], databaseVersion = databaseVersion.asInstanceOf[js.Any], throttledSaves = throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  
  extension [Self <: Collections](x: Self) {
    
    inline def setCollections(value: js.Array[Collection[Any]]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: Collection[Any]*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setDatabaseVersion(value: Double): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
  }
}
