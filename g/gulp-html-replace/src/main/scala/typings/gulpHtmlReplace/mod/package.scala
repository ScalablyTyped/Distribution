package typings.gulpHtmlReplace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HtmlReplace = js.Function2[
    /* tasks */ typings.gulpHtmlReplace.mod.Tasks, 
    /* options */ js.UndefOr[typings.gulpHtmlReplace.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
  type Tasks = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typings.gulpHtmlReplace.mod.AdvancedTask
  ]
}
