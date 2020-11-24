package typings.inlineStylePrefixer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Plugin = js.Function4[
    /* property */ java.lang.String, 
    /* value */ scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) | js.Any, 
    /* style */ js.Any, 
    /* prefixMap */ js.UndefOr[typings.std.Record[java.lang.String, js.Array[java.lang.String]]], 
    js.UndefOr[
      scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) | js.Any
    ]
  ]
  
  type Prefix_ = js.Function1[/* style */ js.Any, js.Any]
}
