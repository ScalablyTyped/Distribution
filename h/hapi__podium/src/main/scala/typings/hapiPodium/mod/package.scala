package typings.hapiPodium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Criteria = java.lang.String | typings.hapiPodium.mod.CriteriaObject
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.hapiPodium.mod.EventOptionsObject
    - typings.hapiPodium.mod.Podium
  */
  type Events = typings.hapiPodium.mod._Events | java.lang.String
  
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[typings.hapiPodium.mod.Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
