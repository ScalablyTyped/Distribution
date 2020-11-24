package typings.insertModuleGlobals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type InsertFunction = js.Function2[
    /* file */ java.lang.String, 
    /* basedir */ java.lang.String, 
    typings.insertModuleGlobals.mod.VariableConfig | java.lang.String
  ]
  
  type VarsOption = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.insertModuleGlobals.mod.InsertFunction]]
}
