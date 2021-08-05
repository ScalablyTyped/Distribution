package typings.ionicUtilsObject

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.ProxyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-object", "AliasedMap")
  @js.native
  class AliasedMap[K, V] ()
    extends StObject
       with Map[AliasedMapKey | K, AliasedMapKey | V] {
    
    def getAliases(): Map[AliasedMapKey, js.Array[AliasedMapKey]] = js.native
    
    def keysWithoutAliases(): js.Array[K] = js.native
    
    def resolveAlias(key: AliasedMapKey | K): js.UndefOr[V] = js.native
  }
  
  @JSImport("@ionic/utils-object", "CaseInsensitiveProxyHandler")
  @js.native
  val CaseInsensitiveProxyHandler: ProxyHandler[js.Any] = js.native
  
  inline def createCaseInsensitiveObject[T](): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCaseInsensitiveObject")().asInstanceOf[StringDictionary[T]]
  
  type AliasedMapKey = String | js.Symbol
}
