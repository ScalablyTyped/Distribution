package typings.graphqlDeduplicator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphql-deduplicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deflate(response: js.Object): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(response.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  
  inline def inflate(response: js.Object): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(response.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
}
