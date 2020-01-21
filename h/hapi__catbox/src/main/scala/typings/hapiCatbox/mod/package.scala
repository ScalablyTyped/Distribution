package typings.hapiCatbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnginePrototypeOrObject = typings.hapiCatbox.mod.EnginePrototype[js.Any] | typings.hapiCatbox.mod.ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[
    /* id */ typings.hapiCatbox.mod.Id, 
    /* flags */ typings.hapiCatbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
  type Id = java.lang.String | typings.hapiCatbox.AnonId
}
