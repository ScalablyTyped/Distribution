package typings.graphviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Edge = typings.graphviz.mod.HasAttributes
  
  type ErrorCallback = js.Function3[
    /* code */ scala.Double, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    scala.Unit
  ]
  
  type Options = org.scalablytyped.runtime.StringDictionary[typings.graphviz.mod.PossibleValue]
  
  type OutputCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  
  type ParseCallback = js.Function1[/* graph */ typings.graphviz.mod.Graph_, scala.Unit]
  
  type PossibleValue = java.lang.String | scala.Double | scala.Boolean
  
  type RenderType = java.lang.String
}
