package typings.linkifyIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Rule = java.lang.String | typings.linkifyIt.mod.FullRule
  
  type SchemaRules = org.scalablytyped.runtime.StringDictionary[typings.linkifyIt.mod.Rule]
  
  type Validate = js.Function3[
    /* text */ java.lang.String, 
    /* pos */ scala.Double, 
    /* self */ typings.linkifyIt.mod.LinkifyIt, 
    scala.Double | scala.Boolean
  ]
}
