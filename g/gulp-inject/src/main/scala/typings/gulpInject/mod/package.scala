package typings.gulpInject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ITagFunction = js.Function2[/* targetExt */ java.lang.String, /* sourceExt */ java.lang.String, java.lang.String]
  
  type ITransformFunction = js.Function5[
    /* filepath */ java.lang.String, 
    /* file */ js.UndefOr[typings.vinyl.mod.File], 
    /* index */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    /* targetFile */ js.UndefOr[typings.vinyl.mod.File], 
    java.lang.String
  ]
}
