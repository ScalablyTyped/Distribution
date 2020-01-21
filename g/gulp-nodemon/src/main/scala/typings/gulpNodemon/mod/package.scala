package typings.gulpNodemon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Nodemon = js.Function1[
    /* option */ js.UndefOr[typings.gulpNodemon.mod.Option], 
    typings.gulpNodemon.mod.EventEmitter
  ]
}
