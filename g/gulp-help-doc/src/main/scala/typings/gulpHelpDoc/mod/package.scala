package typings.gulpHelpDoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Usage = js.Function2[
    /* gulp */ typings.gulp.mod.Gulp, 
    /* options */ js.UndefOr[typings.gulpHelpDoc.mod.UsageOptions], 
    js.Promise[js.Any]
  ]
}
