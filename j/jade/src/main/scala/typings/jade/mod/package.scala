package typings.jade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JadeCustomFilterFunction = js.Function2[
    /* text */ java.lang.String, 
    /* options */ org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    java.lang.String
  ]
  
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[typings.jade.mod.TemplateLocals], java.lang.String]
  
  type TemplateLocals = org.scalablytyped.runtime.StringDictionary[js.Any]
}
