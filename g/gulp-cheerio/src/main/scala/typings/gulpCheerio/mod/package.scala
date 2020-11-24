package typings.gulpCheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* $ */ typings.cheerio.cheerio.Root, 
    /* file */ typings.vinyl.mod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
