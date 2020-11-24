package typings.markdownMagic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* output */ js.Array[typings.markdownMagic.mod.ProcessedConfig], 
    scala.Unit
  ]
  
  /**
    *  transform function
    */
  type TransformFunction = js.Function2[/* content */ java.lang.String, /* options */ js.Any, java.lang.String]
}
