package typings.jointjs.mod.linkTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Button {
  type ActionCallback = js.Function2[
    /* evt */ typings.jointjs.mod.dia.Event, 
    /* view */ typings.jointjs.mod.dia.LinkView, 
    scala.Unit
  ]
}
